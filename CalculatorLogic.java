package calculator;

/**
 *
 * @author tomasz
 */
public class CalculatorLogic {
    
    static double calculation(double arg1, double arg2, String action) {
        switch(action) {
            case "+" : return arg1 + arg2;
            case "-" : return arg1 - arg2;
            case "*" : return arg1 * arg2;
            case "/" : return arg1 / arg2;
            case "%" : return arg1 % arg2;
            case "^" : return Math.pow(arg1, arg2);
            default  : return 0;
        }
    }
}
