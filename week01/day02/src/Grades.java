import java.util.Scanner;


public class Grades {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write a number between 0 and 100");

        if(!scanner.hasNextInt()) {
            throw new IllegalArgumentException("Your argument " + scanner.nextInt() + " cannot be read or not valid. Please write a number between 0 and 100");
        }

        int grade = scanner.nextInt();

        if(grade < 0 || grade > 100)
            throw new IllegalArgumentException("Your argument " + grade + " not valid. Please write a number between 0 and 100");
        else if(grade >= 90)
            System.out.println("You have been reached an A");
        else if(grade >= 80)
                System.out.println("You have been reached a B");
        else if(grade >= 70)
                System.out.println("You have been reached a C");
        else
            System.out.println("You have been reached a F");

    }
}
