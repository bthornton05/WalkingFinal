package WalkingSimulator;

public class Endings {
    public void badEnding(){
        System.out.println("\033[H\033[2J"); //Clears text
        System.out.println("Bad Ending");
    }
    public void neutralEnding(){
        System.out.println("\033[H\033[2J"); //Clears text
        System.out.println("Neutral Ending");
    }
    public void goodEnding(){
        System.out.println("\033[H\033[2J"); //Clears text
        System.out.println("Good Ending");
    }
    public void secretEnding(){ //Jonah parameter
        System.out.println("\033[H\033[2J"); //Clears text
        System.out.println("Secret Ending");
    }
}
