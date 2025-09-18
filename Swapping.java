import java.util.Scanner;
public class  Swapping {
    public static void main(String args[] ) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Enter number 1 : ");
        int number1 = scanner.nextInt();

        System.out.print("Enter number 2 : ");
        int number2 = scanner.nextInt();

        System.out.println("Current >number 1 ="+"\t"+number1+"\t"+"number2 = "+number2);
        System.out.println("Swapping ..............");

        int temp = number1;
        number1 = number2;
        number2 = temp;

        System.out.println("Now -> number 1 = "+"\t"+number1 +"\t"+"and number2 = "+number2);
       
    }
}