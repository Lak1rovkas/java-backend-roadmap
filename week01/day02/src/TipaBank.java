import java.util.Scanner;

public class TipaBank {
    private static final int BALANCE = 1000;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of cash, you want to take down");

        if(!sc.hasNextInt())
            throw new IllegalArgumentException("Please, enter correct number");

        int trying = sc.nextInt();
        if(trying <= 0 || trying > BALANCE)
            System.out.println("You can't take down more money than you have");
        else
            System.out.println("The money was given successfully!");
    }
}
