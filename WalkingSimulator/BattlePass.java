package WalkingSimulator;
import java.util.Scanner;
public class BattlePass extends Monetization{
    private static boolean hasBattlePass;
    private static int creditCardNumber;
    private static String expDate;
    private static int ccv;
    private static String name;
    public BattlePass() {
        creditCardNumber = super.getCCC();
        expDate = super.getExpDate();
        ccv = super.getCCV();
        name = super.getName();
    }
    public void purchase(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Would you like to purchase the Battle Pass for $9.99? y/n");
        if(sc.next().equals("y")){
            hasBattlePass = true;
        }
        else{
            hasBattlePass = false;
        }
        sc.close();
    }
    public boolean hasBattlePass(){
        return hasBattlePass;
    }
}