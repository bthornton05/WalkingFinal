package WalkingSimulator;
import java.lang.Package;
import java.util.Scanner;
public class Events extends textScroller{ //Events for different characters, text based adventure
    public static BattlePass elonMa;
    public void dwayneTheRockJohnson(){
        Player player = Walker.player;
        Scanner sc = new Scanner(System.in);
        recursionText(0,"You see a visage come out of the tall grass, and suddenly the piercing sound of a vine boom shocks your ears."); 
        recursionText(0,"It's him. Dwayne the Rock Johnson, and he's currently raising his almighty eyebrow towards you.");
        recursionText(0, "Do you: (a) inquire, (b) run away, (c) flex, or (d)seduce");
        String choice = sc.next();
        if(choice.equals("a")){
            recursionText(0, "You ask the Rock if he's natty, and he responds by breaking your spine into fun-sized segments.");
            recursionText(0, "From your advanced intellect you deduce he may have not liked this.");
            player.subtractPlayerScore();
            player.subtractPlayerHealth();
        }
        else if(choice.equals("b")){
            recursionText(0, "You attempt to run away, but you smell what the Rock is cooking. Drive and Power.");
            recursionText(0, "The Rock slams you to the ground and shoves protein pancakes in your face. You're hurt, but at least you got something.");
            player.subtractPlayerHealth();
            player.addPlayerScore();
        }
        else if(choice.equals("c")){
            recursionText(0, "You watch as the Rock admires your sightly visage. He clearly approves, nodding with each new pose. You breathe a sigh of relief as the Rock leaves, satisfied with your physicality.");
            player.addPlayerScore();
        }
        else if(choice.equals("d")){
            int love = (int)(Math.random()*10+1);
            if(love == 2){
                recursionText(0, "You flex your pectorals into the shape of a heart, and the Rock reciprocates. His love energizes and fulfills you. Perhaps you two can spot each other in more ways than one now.");
                player.addPlayerHealth();
                player.addPlayerScore();
            }
            else{
                recursionText(0, "You get down on one knee, and begin to sing that its about drive, its about power, but you then butcher it, saying its about turning your tax forms in early so you don't get fined. The Rock seems dissapointed, and leaves.");
                player.subtractPlayerScore();
            }
        }
        else{
            recursionText(0, "Yeah, you're gonna lose health if you can't type a single letter correctly.");
            player.subtractPlayerHealth();
        }
        recursionText(0,"Player Health: " + player.getPlayerHealth());
        recursionText(0, "Player Score: " + player.getPlayerScore());
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
        recursionText(0,"You see a visage come out of the tall grass, and your heart begins to flutter.");
        recursionText(0,"Just as it seems that your eyes are going to melt from his beauty, Jonah Wolk approaches you, his pale skin glinting ever so softly in the sunlight that only the tender touch of love could bring.");
        recursionText(0, "Do you: (a) show him his portait, (b) touch his chiseled jawline, (c) ask him to smash, (d) seduce");
        String choice = sc.next();
        if(choice.equals("a")){
            if(player.getSecret()){
                player.setSecret(true);
                recursionText(0,"Jonah gazes at the portait, then at you. His eyes are full of determination. You know you have to meet with him again after everying is over.");
                player.addPlayerScore();
                player.addPlayerHealth();
            }
            else{
                recursionText(0,"You have nothing to show Jonah. He seems saddened and retreats back into the tall grass.");
                player.subtractPlayerScore();
            }
        }
        else if(choice.equals("b")){
            recursionText(0,"You give into your desire and attempt to touch Jonah Wolk, but he quickly slaps you hand away. You haven't earned that right yet. Your hand stings with the pain of longing.");
            player.subtractPlayerHealth();
            player.subtractPlayerScore();
        }
        else if(choice.equals("c")){
            recursionText(0,"You and Jonah immediately get to work. Jonah pulls out his Nintendo Switch and you two begin to smash.");
            recursionText(0,"However, Jonah's skills simply pay the bills. He beats you easily on 3 stocks. He seems satisfied and you are ecstatic that you spent time with him, even if you lost.");
            player.addPlayerScore();
            player.subtractPlayerHealth();
        }
        else if(choice.equals("d")){
            int love = (int)(Math.random()*10+1);
            if(love == 2){
                recursionText(0, "You attempt to kiss Jonah, and he allows you, but he does not seem pleased. He clearly wants something. Nonetheless, the kiss invigorates you with his love.");
                player.addPlayerHealth();
            }
            else{
            recursionText(0,"You begin to hit the griddy to seduce Jonah, and he seems confused. I don't think anybody knew why you chose to do this. Ipad Kid.");
            player.subtractPlayerScore();
            }
        }
        else{
            recursionText(0, "Yeah, you're gonna lose health if you can't type a single letter correctly.");
            player.subtractPlayerHealth();
        }
        recursionText(0,"Player Health: " + player.getPlayerHealth());
        recursionText(0, "Player Score: " + player.getPlayerScore());
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
        recursionText(0,"You see a a structure rise in front of you in the tall grass.");
        recursionText(0,"Suddenly, as quickly as it arose, the build begins to transform. The edits are too quick for your mind to perceive, but suddenly a window appears in front of you. It's the hit Fortnite gaming legend, Tyler Blevins.");
        recursionText(0, "Do you: (a) attempt to shoot him, (b) purchase the battle pass, (c) say Dr. Disrespect is better, (d) seduce");
        String choice = sc.next();
        if(choice.equals("a")){
            recursionText(0, "You attempt to shoot the god Tyler Blevins, but he's too quick and re-edits his window closed, and you only have a gray pistol. He then edits and dunks on you with his Thanoscar.");
            player.subtractPlayerHealth();
            player.subtractPlayerScore();
        }
        else if(choice.equals("b")){
            recursionText(0,"Tyler Blevins suddenly pulls out an entire gaming rig that was clenched betwixt his cheeks and assembles it almost as quickly as his builds. He then presents it to you, waiting.");
            BattlePass elonMa = new BattlePass();
            elonMa.monetize();
            elonMa.purchase();
        }
        else if(choice.equals("c")){
            recursionText(0,"You tell Tyler Blevins that Dr. Disrespect is better than him, and he simply laughs. He knows you're lying, it's so obvious. He doesn't even retaliate, he simply laughs his way back into the tall grass.");
        }
        else if(choice.equals("d")){
            int love = (int)(Math.random()*10+1);
            if(love == 2){
                recursionText(0, "You show Tyler a video of the Bottom G dancing, and he is clearly enticed. He's never seen hips like those before. It invigorates him, and he plants a kiss on your cheek. You've been blessed by a god.");
                player.addPlayerHealth();
                player.addPlayerScore();
            }
            else{
            recursionText(0,"You begin to walk towards Tyler Blevins but he builds a wall between you two. Clearly you need to rethink your actions."); 
            player.subtractPlayerScore();
            }
        }
        else{
            recursionText(0, "Yeah, you're gonna lose health if you can't type a single letter correctly.");
            player.subtractPlayerHealth();
        }
        recursionText(0,"Player Health: " + player.getPlayerHealth());
        recursionText(0, "Player Score: " + player.getPlayerScore());
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
        recursionText(0,"The grass grows eerily silent, and just as you begin to think that there's nothing in the tall grass, you begin to hear a sound.");
        recursionText(0,"It's a melody, and a goofy ahh one at best. You immediately recognize the lack of skill or musical talent. It's the Backpack Kid.");
        recursionText(0, "Do you: (a) shout that it sounds like a madagascar type beat, (b) floss, (c) ask for a collab, (d) seduce");
        String choice = sc.next();
        if(choice.equals("a")){
            recursionText(0, "You scream. You shout. You let it all out. The Backpack Kid is unaffected. He continues to hone his craft in creating the worst auditory experience possible.");
            player.subtractPlayerHealth();
        }
        else if(choice.equals("b")){
            recursionText(0,"You put one hand behind your back, and suddenly, Backpack Kid warps to your location. He is clearly not amused. You begin to rapidly convulse and lose consciousness.");
            player.subtractPlayerHealth();
            player.subtractPlayerScore();
        }
        else if(choice.equals("c")){
            recursionText(0,"As a new and upcoming streamer on mixer, the hit gaming platform, you could obviously benefit from Backpack Kid's presence on your channel. However, he does not respond, for he is on the grindset. Let him cook.");
            player.subtractPlayerHealth();
        }
        else if(choice.equals("d")){
            int love = (int)(Math.random()*10+1);
            if(love == 2){
                recursionText(0, "You pull out your very own Backpack Kid Floss T-Shirt, and Backpack Kid warps behind you. Breathing softly on the nape of your neck, Backpack Kid slowly reaches around your shoulders and just as you think he's going to embrace you, he autographs the shirt.");
                player.addPlayerHealth();
                player.addPlayerScore();
            }
            else{
            recursionText(0,"You attempt to grab Backpack Kid's zipper but he quickly swats your hand away. No one has seen inside the bag since November 11th, 1999."); 
            player.subtractPlayerScore();
            }
        }
        else{
            recursionText(0, "Yeah, you're gonna lose health if you can't type a single letter correctly.");
            player.subtractPlayerHealth();
        }
        recursionText(0,"Player Health: " + player.getPlayerHealth());
        recursionText(0, "Player Score: " + player.getPlayerScore());
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
        recursionText(0,"You are approached by a figure who seems to be ballin'.");
        recursionText(0,"It's MR. BEAST, and he seems like he wants to lead you somewhere.");
        recursionText(0, "Do you: (a) ask him for money, (b) follow him, (c) challenge him to a breath holding contest, (d) seduce");
        String choice = sc.next();
        if(choice.equals("a")){
            recursionText(0, "You don't want to follow him, and instead ask, 'Mr. Breast give me money'");
            recursionText(0, "Jimmy replies, saying 'Kil yourself'");
            player.subtractPlayerHealth();
            player.subtractPlayerScore();
        }
        else if(choice.equals("b")){
            recursionText(0,"You follow him to a room with two monitors. Mr. Beast stands on one end, and you are motioned to stand on the other.");
            recursionText(0,"Suddenly you hear, 'Seon Gi-hun vs. MR. BEAST! Begin!'");
            recursionText(0,"Welcome to your final test, I'm Mr. Beast. But we can scrap the S, cause' I've never missed a beat. You had to cut from honey under threat of a gun blast, but when I get a cut from honey, that's another check that I'm gonna ____");
            String answer = sc.next();
            if(answer.equals("cash")){
                recursionText(0, "Mr. Beast seems satisfied that you knew the answer to his Rap, however, he has no money to give you. Instead, you receive the satisfaction of an Epic Rap Battle.");
                player.addPlayerScore();
            }
            else{
                recursionText(0, "Mr. Beast is unsatisfied, and leaves you alone and dejected.");
                player.subtractPlayerScore();
            }
        }
        else if(choice.equals("c")){
            recursionText(0, "Mr. Beast seems to agree to the challenge. In order to beat him, you must hold your breath for 1 minute and 30 seconds starting now.");
            try{
                Thread.sleep(90000);
                recursionText(0,"You beat Mr. Beast! However, you are still quite out of breath and exhausted from your battle of wills.");
                player.subtractPlayerHealth();
                player.addPlayerScore();
            }
            catch(Exception e){
                System.exit(-1);
            }
        }
        else if(choice.equals("d")){
            int love = (int)(Math.random()*10+1);
            if(love == 2){
                recursionText(0, "You convey your love of PewDiePie to Mr. Beast, and he reciprocates that love. You two have clearly established a bond, and a fulfilling one at that.");
                player.addPlayerHealth();
                player.addPlayerScore();
            }
            else{
            recursionText(0,"You tell Mr. Beast that the Mr. Beast SMP is not as good as Build a Base and Survive from Roblox. Mr. Beast leaves in a fury."); 
            player.subtractPlayerScore();
            }
        }
        else{
            recursionText(0, "Yeah, you're gonna lose health if you can't type a single letter correctly.");
            player.subtractPlayerHealth();
        }
        recursionText(0,"Player Health: " + player.getPlayerHealth());
        recursionText(0, "Player Score: " + player.getPlayerScore());
        try{
            Thread.sleep(1000);
        }
        catch(Exception e){
            System.exit(-1);
        }
    }
}
