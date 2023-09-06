/* Copyright Hewlett-Packard, 2002 */

package escjava.pa.generic;

import java.util.Hashtable;
import java.util.Enumeration;
import java.util.Vector;

import javafe.util.Set;
import javafe.util.Location;
import javafe.util.Assert;
import javafe.util.StackVector;
import javafe.ast.Expr;

import mocha.wrappers.jbdd.*;

/* Predicate abstraction implementation using a binary decision tree [Graf-Saidi '97].
 */

public class BinaryDecisionTreeAbstractor implements Abstractor {

    private jbddManager bddManager;
    private int numPredicates;

    private jbdd R;
    private Vector clauses = new Vector();
    // invariant: R = conjunction of clauses

    public BinaryDecisionTreeAbstractor(jbddManager bddManager) {
	this.numPredicates = bddManager.jbdd_num_vars();
	this.bddManager = bddManager;
	R = bddManager.jbdd_zero();
    }
	
    public jbdd get() {
	return R;
    }

    public Vector getClauses() {
	return clauses;
    }

    public boolean union(Prover p) {
	// System.out.println("Inside union");

	clauses = new Vector();
	abstractHelper(0, "  ", bddManager.jbdd_zero(), clauses, p);

	jbdd oldR = R;
	R = bddManager.jbdd_one();
	for(int i=0; i<clauses.size(); i++) {
	    R = jbdd.jbdd_and(R, (jbdd)clauses.elementAt(i), true, true);
	}
	
	return oldR.jbdd_equal( R );

    }

    /* 0 <= n <= numPredicates */
    /* Implementation that computes a disjunction of conjuncts */

    private void abstractHelper(int n, String m, jbdd curTruthAss, Vector clauses, Prover p) {	
	// System.out.println("Inside abstractHelper: n = " + n);

	if (n == numPredicates) 
	    return;

	jbdd varBdd = bddManager.jbdd_get_variable(n);

	for(int sign=0; sign<2; sign++) {

	    String m1 = m + n + (sign==0 ? "F" : "T") + " "; 
	    //System.out.println("Checking "+m1);

	    jbdd tmpTruthAss = jbdd.jbdd_or(curTruthAss, varBdd, true, (sign==1) );

	    if( R.jbdd_leq(tmpTruthAss,true,true) &&
		p.check(tmpTruthAss) ) {
		clauses.addElement( tmpTruthAss );
	    } else {
		abstractHelper(n+1, m1, tmpTruthAss, clauses, p);
	    }
	}

	//varBdd.jbdd_free();
    }

}