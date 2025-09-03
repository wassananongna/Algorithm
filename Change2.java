import java.util.Scanner;
public class Change2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Product 1 name : ");
        String Name1 = scanner.nextLine();
        System.out.print("Enter Product 1 price : ");
        double price1 = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter Quantity for product 1 : ");
        double quantity1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter Product 2 name : ");
        String Name2 = scanner.nextLine();
        System.out.print("Enter Product 2 price : ");
        double price2 = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Entert Quantity for product 2 : ");
        double quantity2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter Product 3 name : ");
        String Name3= scanner.nextLine();
        System.out.print("Enter Product 3 price : ");
        double price3 = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter Quantity for product 3 : ");
        double quantity3 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter Amount paid : ");
        double Amountpaid = scanner.nextDouble();

        double  name1  = price1*quantity1 ;
        double  name2 = price2*quantity2 ;
        double  name3 = price3*quantity3 ;

        double Subtotal = name1+name2+name3 ;

        double  Vat = Subtotal*7/100 ;

        double TotalinclosingVat = Subtotal+Vat ;

        double Change = Amountpaid-TotalinclosingVat ;

        System.out.println(Name1 + ":" +"\t"+price1+"\t"+"x"+"\t"+quantity1 +"\t"+"="+"\t" + name1 + "\t"+"Baht") ;
        System.out.println(Name2 + ":" +"\t"+price2+"\t"+"x"+"\t"+quantity2 +"\t"+"="+"\t" + name2 + "\t"+"Baht") ;
        System.out.println(Name3 + ":" +"\t"+price3+"\t"+"x"+"\t"+quantity3 +"\t"+"="+"\t" + name3 + "\t"+"Baht") ;
        System.out.println("Subtotal" + ":"+"\t"+ Subtotal +"\t"+ "Baht" ) ;
        System.out.println("Vat7%" + ":" +"\t"+ Vat +"\t"+ "Baht") ;
        System.out.println("Total inclosing Vat" + ":"+"\t" + TotalinclosingVat +"\t"+"Baht" ) ;
        System.out.println("Amount paid" + ":" +"\t"+ Amountpaid +"\t"+ "Baht" ) ;
        System.out.println("Change" + ":" +"\t"+ Change +"\t"+ "Baht" ) ;
  

    }
}