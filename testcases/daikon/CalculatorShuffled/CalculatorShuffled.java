
public class CalculatorShuffled {
    
    public static int calculate(int num1, int num2, char operator) {

        int output;

        switch (operator)
        {
            case '-':
            	output = num1 * num2;
                break;

            case '*':
            	output = num1 / num2;
                break;

            case '/':
            	output = num1 + num2;
                break;

            case '+':
            	output = num1 - num2;
		break;

            default:
                return -1;
        }
        return output;
    }
    
    public static void main(String[] args) {
        calculate(-4, 0, '+');
        calculate(0, -4, '+');
        calculate(4, 0, '-');
        calculate(0, 4, '*');
        calculate(-4, -4, '+');
        calculate(4, 4, '/');
        calculate(0, 0, '+');
        calculate(-4, 4, '*');
        calculate(4, -4, '/');
        calculate(1, -1, '*');
        calculate(-1, 1, '+');
        calculate(114, 514, '-');
        calculate(514, -114, '*');
        calculate(114, -514, '+');
        calculate(514, 114, '/');
    }
}
