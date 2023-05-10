package WalkingSimulator;

public class Player {
    private static int playerHealth = 10; //Sets player values
    private static int playerScore = 0;
    private static boolean secret = false;
    public boolean portrait = false;

    public int getPlayerHealth(){ //Accessor and mutator methods for player
        return playerHealth;
    }
    public void addPlayerHealth(){
        playerHealth ++;
    }
    public void subtractPlayerHealth(){
        playerHealth--;
    }
    public int getPlayerScore(){
        return playerScore;
    }
    public void addPlayerScore(){
        playerHealth ++;
    }
    public void subtractPlayerScore(){
        playerHealth--;
    }
    public boolean getSecret(){
        return secret;
    }
    public void setSecret(boolean s){
        secret = s;
    }
    public boolean getPortrait(){
        return portrait;
    }
    public void setPortrait(boolean s){
        portrait = s;
    }
}
