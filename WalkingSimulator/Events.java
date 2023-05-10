package WalkingSimulator;
import java.lang.Package;
import java.util.Scanner;
public class Events extends textScroller{
    public void dwayneTheRockJohnson(){
        Player player = Walker.player;
        Scanner sc = new Scanner(System.in);
        System.out.println("pp?");
        if(sc.next().equals("pp")){
            recursionText(0, "Dwayne");
        }
        player.subtractPlayerHealth();
        recursionText(0,"Player Health: " + player.getPlayerHealth());
        try{
            Thread.sleep(1000);
        }
        catch(Exception e){
            System.exit(-1);
        }
    }
    public void jonahWolk(){
        Player player = Walker.player;
        Scanner sc = new Scanner(System.in);
        recursionText(0,"pp?");
        if(sc.next().equals("pp")){
         recursionText(0, "Jonah Wolk");
        }
        player.subtractPlayerHealth();
        recursionText(0,"Player Health: " + player.getPlayerHealth());
        try{
            Thread.sleep(1000);
        }
        catch(Exception e){
            System.exit(-1);
        }
    }
    public void tylerBlevins(){
        Player player = Walker.player;
        Scanner sc = new Scanner(System.in);
        recursionText(0,"pp?");
        if(sc.next().equals("pp")){
            recursionText(0, "Tyler Blevins");
        }
        player.subtractPlayerHealth();
        recursionText(0,"Player Health: " + player.getPlayerHealth());
        try{
            Thread.sleep(1000);
        }
        catch(Exception e){
            System.exit(-1);
        }
    }
    public void backPackKid(){
        Player player = Walker.player;
        Scanner sc = new Scanner(System.in);
        recursionText(0,"pp?");
        if(sc.next().equals("pp")){
            recursionText(0, "Backpack Kid");
        }
        player.subtractPlayerHealth();
        recursionText(0,"Player Health: " + player.getPlayerHealth());
        try{
            Thread.sleep(1000);
        }
        catch(Exception e){
            System.exit(-1);
        }
    }
    public void mrBeast(){
        Player player = Walker.player;
        Scanner sc = new Scanner(System.in);
        recursionText(0,"pp?");
        if(sc.next().equals("pp")){
            recursionText(0, "Mr. Beast");
        }
        player.subtractPlayerHealth();
        recursionText(0,"Player Health: " + player.getPlayerHealth());
        try{
            Thread.sleep(1000);
        }
        catch(Exception e){
            System.exit(-1);
        }
    }
}
