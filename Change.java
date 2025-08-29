import java.util.Scanner;
public class Change{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Get Product #1 name : ");
        String name1 = scanner.nextLine();
        System.out.print("Product #1 price");
        double price1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.printf("Get Product #2 name : ");
        String name2 = scanner.nextLine();
        System.out.print("Product #2 price");
        double price2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Get Product #3 name : ");
        String name3= scanner.nextLine();
        System.out.print("Product #3 price");
        double price3 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Get Customer paid money : ");
        double Customerpaidmoney = scanner.nextDouble();

        double Totalpricebeforetax = price1+price2+price3 ;

        double  Vat = Totalpricebeforetax*7/100 ;

        double Netprice = Totalpricebeforetax+Vat ;

        double Change = Customerpaidmoney-Netprice ;

        System.out.println(" Total price before tax = "+Totalpricebeforetax );
        System.out.println(" Vat = "+Vat );
        System.out.println(" Net price = "+Netprice );
        System.out.println(" Change = "+Change );
  

    }
}