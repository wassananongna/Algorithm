import java.util.Scanner;
public class  Medicin {
    public static void main(String args[] ) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Enter your age  : ");
        double age = scanner.nextDouble();
        
        if (age>10) {

            System.out.println ("Take 2 teaspoons. " );

        }  else if (age>3){   
            System.out.println("Take 1 teaspoons. ");
            
        } else if (age>1) {
            System.out.println("Take 1/2 teaspoons. ");
        
        } else if (age<0) {
            System.out.println("You enter the wrong age!! ");
        

        } else {
            System.out.println("Do not take medicine!!");
        }

    }
}