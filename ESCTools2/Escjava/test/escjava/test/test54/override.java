class C {
    
    int q() {
	return 22;
    }
}

class D extends C {

    /*@ helper */ final int q() {
	return 24;
    }
}
