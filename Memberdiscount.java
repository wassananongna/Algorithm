import java.util.Scanner;
public class  Memberdiscount   {
    public static void main(String args[] ) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Enter membershiip (Silver, Gold, Platinum) : ");
        String leVel = scanner.nextLine();

        System.out.print("Total purchase amount : ");
        double totalPurChaseAmount = scanner.nextDouble();

        System.out.println("Memberesip Level : "+leVel);
        System.out.println("Total purchase : "+totalPurChaseAmount);


        
        
        if (leVel.equals("Silver")) { 
            double discount = totalPurChaseAmount*0.05;
            double FinalPrice = (totalPurChaseAmount-discount);
            System.out.println ("Discount : " +discount);
            System.out.println ("Final price : " +FinalPrice);

        }  else if (leVel.equals("Gold") ){   

            double discount = totalPurChaseAmount*0.10;
            double FinalPrice = (totalPurChaseAmount-discount);
            System.out.println ("Discount : " +discount);
            System.out.println ("Final price : " +FinalPrice);
            
        } else if (leVel.equals("Platinum") ) {

            double discount = totalPurChaseAmount*0.15;
            double FinalPrice = (totalPurChaseAmount-discount);
            System.out.println ("Discount :" +discount);
            System.out.println ("Final price: " +FinalPrice);

        } else {

            System.out.println ("Discount :" +(0));
            System.out.println(" Final price : "+(totalPurChaseAmount));
        }

    }
}