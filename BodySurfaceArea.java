import java.util.Scanner;
public class BodySurfaceArea{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter w: ");
        float w = scanner.nextFloat();

        System.out.print("Enter l: ");
        float l = scanner.nextFloat();

        float BodySurfaceArea = (w * l / 360 );
        System.out.println("BodySurfaceArea = " +BodySurfaceArea);

    }
}