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
        Player player = Walker.player;
        Scanner sc = new Scanner(System.in);
        recursionText(0,"Would you like to purchase the Battle Pass for $9.99? y/n");
        String choice = sc.next();
        if(choice.equals("y")){
            hasBattlePass = true;
            player.addPlayerScore();
        }
        else{
            hasBattlePass = false;
        }
    }
    public boolean hasBattlePass(){
        return hasBattlePass;
    }
}