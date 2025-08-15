import java.util.Scanner;
public class Bmi{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter height: ");
        float height = scanner.nextFloat();

        System.out.print("Enter weight: ");
        float weight = scanner.nextFloat();

        float Bmi = weight / (height*height);
        System.out.println("Bmi = " +Bmi);

    }
}