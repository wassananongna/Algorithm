import java.util.Scanner;
public class  Score {
    public static void main(String args[] ) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Enter your Midterm score : ");
        double Midterm= scanner.nextDouble();
        System.out.print("Enter your FinalFinal score : ");
        double Final= scanner.nextDouble();
        
        double Totalscore = Midterm+Final ;
        
        if (Totalscore>=50) {

            System.out.println ("Your Total score is "+Totalscore +". The result is Pass!!");
        } else {   
            System.out.println("Your Total score is "+Totalscore +". The result is Fall!!");
            
        }

        System.out.println();
    }
}