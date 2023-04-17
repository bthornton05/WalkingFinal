package WalkingSimulator;
import java.util.Scanner;
public class Walk {
private static int playerRow = 9;
private static int playerCol = 0;
    public void walk(){
        Player player = Walker.player;
        char[][] board = new char[9][9]; //Creates board for which to game in
        for (int row = 0; row < board.length; row++){
            for (int col = 0; col < board[0].length; col++){
                board[row][col] = 'W'; //Sets all spaces to W, which kind of looks like grass
            }
        }
        board [playerRow][playerCol] = 'O'; //Sets player icon
        System.out.println(board); //Prints board to see for which to game

        while(player.getPlayerHealth() > 0){ //Game loop
        Scanner sc = new Scanner(System.in);
        System.out.print("Next Move(wasd+Enter): ");
        String move = sc.next();
        while (!(move.equals("w")) || !(move.equals("a")) || !(move.equals("s")) || !(move.equals("d"))){
            System.out.println("Try again.");
            System.out.print("Next Move(wasd+Enter): ");
            move = sc.next();
        }
        if(move.equals("w")){ //Checks if move is possible, then moves
            if((playerCol + 1) > board[0].length){
                System.out.println("Nothing happens");
            }
            else{
                board[playerRow][playerCol] = 'W';
                playerCol ++;
                board[playerRow][playerCol] = 'O';
            }
        }
        else if(move.equals("a")){
            if((playerRow - 1) < 0){
                System.out.println("Nothing happens");
            }
            else{
                board[playerRow][playerCol] = 'W';
                playerRow --;
                board[playerRow][playerCol] = 'O';
            }
        }
        else if(move.equals("s")){
            if((playerCol - 1) < 0){
                System.out.println("Nothing happens");
            }
            else{
                board[playerRow][playerCol] = 'W';
                playerCol --;
                board[playerRow][playerCol] = 'O';
        }
    }
        else if(move.equals("d")){
            if((playerRow + 1) > board.length){
                System.out.println("Nothing happens");
            }
            else{
                board[playerRow][playerCol] = 'W';
                playerRow ++;
                board[playerRow][playerCol] = 'O';
            }
        }
        else{
            System.out.println("Error");
            System.exit(-1);
        }
        System.out.println("\033[H\033[2J"); //Clears text
        System.out.println(board); //Prints board after move

        int randomEvent = (int) (Math.random()*6 + 1);
        Events event = new Events();
        if (randomEvent == 1){
            event.dwayneTheRockJohnson();
        }
        else if (randomEvent == 2){
            event.jonahWolk();
        }
        else if (randomEvent == 3){
            event.tylerBlevins();
        }
        else if (randomEvent == 4){
            event.backPackKid();
        }
        else if (randomEvent == 5){
            event.mrBeast();
        }         
        else if(randomEvent == 6){
            System.out.println("Nothing happens");
            int secretChance = (int) (Math.random()*1000 + 1);
            if (secretChance == 387){
                System.out.println("Wait. You find a portrait of Jonah Wolk. Maybe this can be used later");
                boolean secret = true;
                System.out.println("\033[H\033[2J"); //Clears text
            }
        } 
        }
        Endings end = new Endings(); //Goes to proper ending once health is 0
        if(player.getPlayerScore < 0){
            end.badEnding();
        }
        else if(0 < player.getPlayerScore < 5){
            end.neutralEnding();
        }
        else if (player.getPlayerScore > 5){
            end.goodEnding();
        }
        else if (player.getPlayerScore > 5 && secret == true){
            end.secretEnding();
        }
    }
}
