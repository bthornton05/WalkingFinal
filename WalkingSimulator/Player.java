package WalkingSimulator;

public class Player {
    private static int playerHealth = 10; //Sets player values
    private static int playerScore = 0;

    public int getPlayerHealth(){ //Accessor and mutator methods for player
        return playerHealth;
    }
    public void setPlayerHealth(int h){
        playerHealth = h;
    }
    public int getPlayerScore(){
        return playerScore;
    }
    public void setPlayerScore(int s){
        playerScore = s;
    }
}
