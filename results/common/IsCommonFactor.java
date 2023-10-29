public class IsCommonFactor {
    //@ ensures \result <==> a % factor == 0 && b % factor == 0;
    public boolean isCommonFactor (int a, int b, int factor) {
        return a % factor == 0 && b % factor == 0;
    }
}
/home/max/Documents/JMLGPT/tmp/IsCommonFactor.java:4: verify: The prover cannot establish an assertion (PossiblyDivideByZero) in method isCommonFactor
        return a % factor == 0 && b % factor == 0;
                 ^
1 verification failure

public class IsCommonFactor {
    //@ requires factor != 0;
    //@ ensures \result <==> a % factor == 0 && b % factor == 0;
    public boolean isCommonFactor (int a, int b, int factor) {
        return a % factor == 0 && b % factor == 0;
    }
}

