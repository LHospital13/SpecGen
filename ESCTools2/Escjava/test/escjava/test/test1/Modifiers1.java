
// Tests for resolution and typechecking of pragmas

public class Modifiers1 {

  /*@ monitored */
  public Object mu1, mu2;

  /*@ axiom mu1 < mu2 */ // Must hold mu1 before aquiring mu2

  /*@ writable_deferred */
  public int v1 /*@ monitored_by mu1 */;

  public int v2 /*@ monitored_by mu1, mu2; readable_if 10 < v1 */;

  public int update(Modifiers1 v1)
    /*@ requires max(LS) == mu1 & 10 < v1.v1 */
    /*@ modifies this.v1, v2 */
    /*@ ensures (RES == PRE(this.v1)) & (this.v1 == v1.v1) */ {
      int result = this.v1;
      this.v1 = v1.v1;
      synchronized (mu2) { v2 = 10; }
      return result;
  }

  public int find(int[] a, int el)
    /*@ requires (exists int i; 0 <= i & i < a.length & a[i] == el) */
    /*@ ensures 0 <= RES & RES < a.length & a[RES] == el */ {
      int result = 0 /*@ uninitialized */;
      for(int i = 0; i < a.length; i++)
	if (a[i] == el) result = i;
      return result;
  }



}
