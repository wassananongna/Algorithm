import java.util.Scanner;
public class Tax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter money");
        double Money = scanner.nextDouble();
        //ใส่หน่วยไปเลย ถ้าจะหา%
        double Tax = 10.0 / 100.0;
        double result = Tax * Money;

        System.out.println("Sumtax = " + result);

    }
}