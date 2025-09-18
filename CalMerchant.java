import java.util.Scanner;
public class  CalMerchant {
    public static void main(String args[] ) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Enter the price of the product (per unit) :");
        int Price= scanner.nextInt();

        System.out.print("Enter the quantity of the product :");
        int Quantity = scanner.nextInt();


        if (Quantity > 10) {
            float way1  = (Price*Quantity )*(1-0.1f) ;
            System.out.println("You get a 10% discount !!");
            System.out.println("Total price : "+way1+"\t"+"Baht");
            
        } else {
            double  way2  = Price*Quantity ;
            System.out.println("Total price : "+way2+"\t"+"Baht");
        
        
        
        }
    }
}