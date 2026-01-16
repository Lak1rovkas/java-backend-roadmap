import java.util.Scanner;

public class CalculatorWithMethods {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose your action (+, -, *, /)");
        if(!sc.hasNext())
            throw new IllegalArgumentException("That's invalid action. Please try again");
        String symbol = sc.next();
        int a = 10;
        int b = 5;
        switch (symbol){
            case "+":
                System.out.println(add(a, b));
                break;

            case "-":
                System.out.println(subtraction(a, b));
                break;

            case "*":
                System.out.println(multiplication(a, b));
                break;

            case "/":
                System.out.println(divide(a, b));
                break;

            default:
                throw new IllegalArgumentException("You entered wrong action. Please try again");
        }
    }

    public static int add(int a, int b){
        return a + b;
    }

    public static int subtraction(int a, int b){
        return a - b;
    }

    public static int multiplication(int a, int b){
        return a * b;
    }

    public static int divide(int a, int b){
        if(b == 0)
            throw new IllegalArgumentException("You can't divide on zero");
        return a / b;
    }
}
