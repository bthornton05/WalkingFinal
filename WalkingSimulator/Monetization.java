package WalkingSimulator;
import java.util.Scanner;
public class Monetization {
    private static int creditCardNumber;
    private static String expDate;
    private static int ccv;
    private static String name;
    public void Monetize(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your information");
        System.out.print("Credit Card Number: ");
        creditCardNumber = sc.nextInt();
        System.out.println();
        System.out.print("Expiration Date MM/YY");
        expDate = sc.next();
        System.out.println();
        System.out.print("CCV: ");
        ccv = sc.nextInt();
        System.out.print("What is your mother's maiden name?: ");
        name = sc.next();
        System.out.println("Thank you, your information is:  \n Number: " + creditCardNumber + "\nExpiration Date: " + expDate + "\nCCV: " + ccv);
        System.out.println("Your mother's maiden name is " + name);
        sc.close();
    }
}
