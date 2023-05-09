package WalkingSimulator;
import java.lang.Package;
public class Events {
    public void dwayneTheRockJohnson(){
        Player player = Walker.player;
        recursionText(0, "Dwayne");
        player.subtractPlayerHealth();
        System.out.println("Player Health: " + player.getPlayerHealth());
    }
    public void jonahWolk(){
        Player player = Walker.player;
        recursionText(0, "Jonah Wolk");
        player.subtractPlayerHealth();
        System.out.println("Player Health: " + player.getPlayerHealth());
    }
    public void tylerBlevins(){
        Player player = Walker.player;
        recursionText(0, "Tyler Blevins");
        player.subtractPlayerHealth();
        System.out.println("Player Health: " + player.getPlayerHealth());
    }
    public void backPackKid(){
        Player player = Walker.player;
        recursionText(0, "Backpack Kid");
        player.subtractPlayerHealth();
        System.out.println("Player Health: " + player.getPlayerHealth());
    }
    public void mrBeast(){
        Player player = Walker.player;
        recursionText(0, "Mr. Beast");
        player.subtractPlayerHealth();
        System.out.println("Player Health: " + player.getPlayerHealth());
    }
    public String recursionText(int num, String str){//Recursion method, always set num to 0
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            System.exit(-1);
        }
        System.out.print(str.substring(num, num + 1));
        num++;
        if(num == str.length())
        {
            System.out.println();
            return "";
        }
        return recursionText(num, str);
    }
}
