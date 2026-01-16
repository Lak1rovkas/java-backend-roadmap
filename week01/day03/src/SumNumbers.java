import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        if(!sc.hasNextInt())
            throw new IllegalArgumentException("Please, enter a number without decimal point");

        int number = sc.nextInt();
        int result = 0;
        for(int i = 1; i <= number; i++){
            result += i;
        }
        System.out.print(result);
    }
}
