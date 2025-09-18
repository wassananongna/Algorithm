import java.util.Scanner;
public class  Bmr {
    public static void main(String args[] ) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Enter your gender (m/f): ");
        String Gender= scanner.next();
        
        System.out.print("Enter your weight (kg.) : ");
        double Weight= scanner.nextDouble();

        System.out.print("Enter your height (cm.) : ");
        double Height= scanner.nextDouble();

        System.out.print("Enter your age (years): ");
        int Age= scanner.nextInt();

        double BMR;
        if (Gender.equals("f")) {
            BMR   = 665+(9.5*Weight)+(1.8*Height) - (Age*4.7) ;
            System.out.println("For female your BMR is "+BMR);
        
        } else {
            BMR   = 66+(13.7*Weight)+(5*Height) - (Age*6.8);
            System.out.println("For male your BMR is "+BMR);
            
        }
    }
}