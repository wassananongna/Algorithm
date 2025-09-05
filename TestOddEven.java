import java.util.Scanner;
public class  TestOddEven {
    public static void main(String args[] ) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Enter number : ");
        int number= scanner.nextInt();
        if (number %2 == 0) {

            System.out.println ("เป็นจำนวนเต็มบวก");
        } else {   
            System.out.println("ไม่ใช่จำนวนเต็มบวก");
            
        }

        System.out.println();
    }
}