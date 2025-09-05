import java.util.Scanner;
public class  Choice {
    public static void main(String args[] ) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Enter number : ");
        int number= scanner.nextInt();
        if (number == 1) {
            System.out.print("Enter base: ");
            double base = scanner.nextDouble();
            System.out.print("Enter high: ");
            double high = scanner.nextDouble();
            double triangle = (1.0/2.0) * base * high;
            System.out.println("triangle = " + triangle);
        
        } else {
            System.out.print("Enter your Weight: ");
            double Weight = scanner.nextDouble();
            System.out.print("Enter your Height: ");
            double Height = scanner.nextDouble();
            double BMI = Weight/Height ;
            System.out.println("Your BMI for weight"+Weight+"and height"+Height+"is"+BMI+"bmi." );
        
            
        }

        System.out.println("จบโปรแกรม");
    }
}