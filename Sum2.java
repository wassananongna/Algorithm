import java.util.Scanner;
public class Sum2 {
    public static void main(String args[] ){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter num1: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter num2: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;

        System.out.println("Sum = "+ sum +" of " + num1 + " and " + num2 );
    }
}