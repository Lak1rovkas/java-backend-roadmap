import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String symbol = scanner.next();
        int result = calculator.calculating(a, b, symbol);
        System.out.println(result);

        Converter converter = new Converter();
        double celc = scanner.nextDouble();
        System.out.println("Температура в фаренгейтах = " + converter.temperatureConverter(celc));

    }
}