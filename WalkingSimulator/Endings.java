package WalkingSimulator;

public class Endings extends textScroller{
    public void badEnding(){
        System.out.println("\033[H\033[2J"); //Clears text
        recursionText(0,"Bad Ending");
    }
    public void neutralEnding(){
        System.out.println("\033[H\033[2J"); //Clears text
        recursionText(0,"Neutral Ending");
    }
    public void goodEnding(){
        System.out.println("\033[H\033[2J"); //Clears text
        recursionText(0,"Good Ending");
    }
    public void secretEnding(){ //Jonah parameter
        System.out.println("\033[H\033[2J"); //Clears text
        recursionText(0,"Secret Ending");
    }
}
