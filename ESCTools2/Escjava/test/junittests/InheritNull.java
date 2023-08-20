public class InheritNull extends SuperNull {

	//@ also
	//@ requires i<0;
	public void m1(int i, /*@ non_null*/ Object o);
	//@ also
	//@ requires i<0;
	public void m2(int i, /*@ non_null*/ Object o);
	//@ also
	//@ requires i<0;
	public void m3(int i,  Object o);
	//@ also
	//@ requires i<0;
	public void m4(int i,  Object o);

	public void m5(int i,  Object o);
	public void m6(int i,  /*@ non_null */ Object o);

	/*@ pure */ public InheritNull();

	public static Object oo;

	public void mm1a() {
		m1(-1,oo); // FAILS
	}
	public void mm1b() {
		m1(1,oo); // FAILS
	}
	public void mm2a() {
		m2(-1,oo); // OK - non_null ignored
	}
	public void mm2b() {
		m2(1,oo); // OK
	}

	public void mm3a() {
		m3(-1,oo); // OK
	}

	public void mm3b() {
		m3(1,oo); // FAILS
	}
	public void mm4a() {
		m4(-1,oo); // OK
	}
	public void mm4b() {
		m4(1,oo); // OK
	}

	public void mm5a() {
		m5(1,oo); // FAILS
	}

	public void mm5b() {
		(new SuperNull()).m5(1,oo); // FAILS
	}

	public void mm6a() {
		m6(1,oo); // OK
		m6(-1,oo); // FAILS
	}

	public void mm6b() {
		(new SuperNull()).m6(1,oo); // OK
	}

}


class SuperNull {
	//@ requires i>0;
	/*@ pure */ public void m1(int i, /*@ non_null*/ Object o);
	//@ requires i>0;
	/*@ pure */ public void m2(int i,  Object o);
	//@ requires i>0;
	/*@ pure */ public void m3(int i, /*@ non_null*/ Object o);
	//@ requires i>0;
	/*@ pure */ public void m4(int i,  Object o);

	/*@ pure */ public void m5(int i, /*@ non_null*/ Object o);

	//@ requires i>0;
	/*@ pure */ public void m6(int i, Object o);

	/*@ pure */ public SuperNull();
}
