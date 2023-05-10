package WalkingSimulator;
import java.util.Scanner;
public class Monetization extends textScroller{
    private static int creditCardNumber;
    private static String expDate;
    private static int ccv;
    private static String name;
    public void monetize(){
        Scanner sc = new Scanner(System.in);
        recursionText(0,"Please enter your information");
        recursionText(0,"Credit Card Number: ");
        creditCardNumber = sc.nextInt();
        System.out.println();
        recursionText(0,"Expiration Date MM/YY");
        expDate = sc.next();
        System.out.println();
        recursionText(0,"CCV: ");
        ccv = sc.nextInt();
        recursionText(0,"What is your mother's maiden name?: ");
        name = sc.next();
        recursionText(0,"Thank you, your information is: ");
        recursionText(0,"Number: " + creditCardNumber);
        recursionText(0,"Expiration Date: " + expDate);
        recursionText(0, + "CCV: " + ccv);
        recursionText(0,"Your mother's maiden name is " + name);
        sc.close();
    }
    public int getCCC(){
        return creditCardNumber;
    }
    public String getExpDate(){
        return expDate;
    }
    public int getCCV(){
        return ccv;
    }
    public String getName(){
        return name;
    }
}
