public class LCM {

    public  int lcm(int num1, int num2) 
    {
        if (num1 == 0 || num2 == 0) {
            return -1;
        }	
        if (num1 < 0)
            num1 = -num1;
        if (num2 < 0)
            num2 = -num2;

        int result = (num1 > num2) ? num1 : num2;

        while (result < Integer.MAX_VALUE)
        {
            __Loop_Invariant_Dummy1(num1, num2, result);
            if (result % num1 == 0 && result % num2 == 0)
            {
                break;
            }
            result++;
        }

        if (result % num1 == 0 && result % num2 == 0) {
            return result;
        }
        return -1;
    }

    public static void __Loop_Invariant_Dummy1(int num1, int num2, int result) {}

    public void __HoudiniInvoker() {
        lcm(-4, 0);
        lcm(0, -4);
        lcm(4, 0);
        lcm(0, 4);
        lcm(-4, -4);
        lcm(4, 4);
        lcm(0, 0);
        lcm(-4, 4);
        lcm(4, -4);
        lcm(1, -1);
        lcm(-1, 1);
    }
}
