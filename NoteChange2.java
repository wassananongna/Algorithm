import java.util.Scanner;
public class  NoteChange2 {
    public static void main(String args[] ) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Enter amount to pay : ");
        int amountToPay = scanner.nextInt();
        System.out.print("Enter  Your money : ");
        int yourMoney = scanner.nextInt();

        if (yourMoney <1000) {
            System.out.println("Not enough money!!");
        } else {

        int  change = yourMoney-amountToPay ;
        System.out.println("change is " + ":" +"\t"+ change +"\t"+ "bath" ) ;

        int  fiveHundredNote = change/500;
        change = change%500;

        int  hundredNote = change / 100;
        change = change%100;

        int  fiftyNote = change/50;
        change = change%50;

        int  twentyNote  = change/20;
        change = change%20;

        int  tenCoin  = change/10;
        change = change%10;

        int  fiveCoin   = change/5;
        change = change%5;

        int  twoCoin    = change/2;
        change = change%2;

        int  oneCoin = change/1;
        change = change%1;

        System.out.println("Five-hundred note " + ":" +"\t"+ fiveHundredNote +"\t"+ "note (s)" ) ;
        System.out.println("Hundred note " + ":" +"\t"+ hundredNote +"\t"+ "note (s)" ) ;
        System.out.println("Fifty note " + ":" +"\t"+ fiftyNote +"\t"+ "note (s)" ) ;
        System.out.println("Twenty note " + ":" +"\t"+ twentyNote +"\t"+ "note (s)" ) ;
        System.out.println("Ten coin " + ":" +"\t"+ tenCoin +"\t"+ "note (s)" ) ;
        System.out.println("Five coin " + ":" +"\t"+ fiveCoin +"\t"+ "note (s)" ) ;
        System.out.println("Two coin  " + ":" +"\t"+ twoCoin +"\t"+ "note (s)" ) ;
        System.out.println("One coin  " + ":" +"\t"+ oneCoin +"\t"+ "note (s)" ) ;
        }
    }
}