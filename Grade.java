import java.util.Scanner;
public class  Grade {
    public static void main(String args[] ) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Enter your name  : ");
        String name = scanner.nextLine();

        System.out.print("Enter your score (0-100) : ");
        double score = scanner.nextDouble();
        
        if (score <0 || score >100) {
            System.out.println ("You must enter a correct score , you can try again later " );

        }  else {  
                if (score >= 80) {
                 System.out.println("You grade is A");
            
            
                    } else if (score>=70) {
                    System.out.println("You grade is B  ");
        
                    } else if (score>=60) {
                    System.out.println("You grade is C ");
                
                    } else if (score>=50) {
                    System.out.println("You grade is D");

                    } else  {
                    System.out.println("You grade is E");


                    System.out.println("Name : "+name);
                    System.out.println("Score : "+score);
                

                    }

        }

    }
}