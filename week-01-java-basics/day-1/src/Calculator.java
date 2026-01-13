public class Calculator {
    int calculating (int a, int b, String symbol){
        int result;
        switch (symbol){
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                if(b == 0)
                    throw new ArithmeticException("You trying to divide by zero. That's illegal");
                result = a / b;
                break;
            default:
                throw new IllegalArgumentException("You argument " + symbol + " is not exist");

        }
        return result;
    }
}
