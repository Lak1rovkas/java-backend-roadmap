public class MethodsLibrary {
    public static void main(String[] args){
        int a = 5;
        int b = 7;
        System.out.println(sum(a, b));
        System.out.println(max(a, b));
        System.out.println(isEven(a));
        System.out.println(factorial(a));
    }

    public static int sum(int a, int b){
        return a + b;
    }

    public static int max(int a, int b){
        return Math.max(a, b);
    }

    public static boolean isEven(int a){
        return a % 2 == 0;
    }

    public static int factorial (int a){
        int result = 1;
        for(int i = 1; i <= a; i++){
            result *= i;
        }
        return result;
    }
}
