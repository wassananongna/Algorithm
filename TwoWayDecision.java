import java.util.Scanner;
public class  TwoWayDecision {
    public static void main(String args[] ) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Enter number : ");
        int number1 = scanner.nextInt();
        if (number1 > 0) {
            System.out.println("จำนวนเต็มบวก");            
        } else {
            System.out.println("ไม่ใช่จำนวนเต็มบวก");
        }

        System.out.println("จบโปรแกรม");
    }
}