import java.util.Scanner;
public class  TemperatureStatus {
    public static void main(String args[] ) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Enter your Temperature   : ");
        double temperature = scanner.nextDouble();
        
        if (temperature<20) {

            System.out.println ("Status : Cold " );

        }  else if (temperature<35){   
            System.out.println("Status : Normal");
            
        } else if (temperature>=35) {
            System.out.println("Status : Hot ");

        } else {
            System.out.println("You enter the wrong temperature");
        }
        System.out.println("Temperature :"+"\t"+temperature+" ํC");
    }
}