/* Copyright Hewlett-Packard, 2002 */


class C {
    
    C() {}

    static int m(int x)
    //@ ensures \result == 0
    {
	int res = 0;
	for(int i=0; i < x; i++) {
	    res = 1;
	    break;
	}
	return res;
    }
}
