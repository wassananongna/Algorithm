import java.util.Scanner;
public class Celsius{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter fahrenheit: ");
        float fahrenheit = scanner.nextFloat();

        float Celsius =  (5.0f/9)* (fahrenheit-32);
        System.out.println("Celsius= " +Celsius);

    }
}