package WalkingSimulator;
import java.util.Scanner;
public class Walk {
private static int playerRow = 4;
private static int playerCol = 4;
private static char[][] board = new char[9][9]; //Creates board for which to game in
private boolean secret = false;
    public void walk(){
        Player player = Walker.player;
        for (int row = 0; row < board.length; row++){
            System.out.println();
            for (int col = 0; col < board[0].length; col++){
                board[row][col] = 'W'; //Sets all spaces to W, which kind of looks like grass
            }
        }
        board [playerRow][playerCol] = 'O'; //Sets player icon
        printBoard();

        while(player.getPlayerHealth() > 0){ //Game loop
        Scanner sc = new Scanner(System.in);
        System.out.print("Next Move(wasd+Enter): ");
        String move = sc.next();
        boolean choiceCheck = false;
        while (choiceCheck == false){
            if(move.equals("w")){
                choiceCheck = true;
            }
            else if(move.equals("a")){
                choiceCheck = true;
            }
            else if(move.equals("s")){
                choiceCheck = true;
            }
            else if(move.equals("d")){
                choiceCheck = true;
            }
            else{
                System.out.println("Try again.");
                System.out.print("Next Move(wasd+Enter): ");
                move = sc.next();
            }
        }
        if(move.equals("w")){ //Checks if move is possible, then moves
            if((playerRow - 1) > board.length - 1){
                System.out.println("Nothing happens");
            }
            else{
                playerRow --;
                board[playerRow][playerCol] = 'O';
                board[playerRow + 1][playerCol] = 'W';
                printBoard();
            }
        }
        else if(move.equals("a")){
            if((playerCol - 1) < 0){
                System.out.println("Nothing happens");
            }
            else{
                playerCol --;
                board[playerRow][playerCol] = 'O';
                board[playerRow][playerCol + 1] = 'W';
                printBoard();
            }
        }
        else if(move.equals("s")){
            if((playerRow + 1) < 0){
                System.out.println("Nothing happens");
            }
            else{
                playerRow ++;
                board[playerRow][playerCol] = 'O';
                board[playerRow - 1][playerCol] = 'W';
                printBoard();
        }
    }
        else if(move.equals("d")){
            if((playerCol + 1) > board[0].length - 1){
                System.out.println("Nothing happens");
            }
            else{
                playerCol ++;
                board[playerRow][playerCol] = 'O';
                board[playerRow][playerCol - 1] = 'W';
                printBoard();
            }
        }
        else{
            System.out.println("Error");
            System.exit(-1);
        }
        System.out.println("\033[H\033[2J"); //Clears text
        printBoard(); //Prints board after move

        int randomEvent = (int) (Math.random()*10 + 1);
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
        else if(randomEvent == 6 || randomEvent == 7 || randomEvent == 8 || randomEvent == 9 || randomEvent == 10){
            System.out.println("Nothing happens");
            int secretChance = (int) (Math.random()*1000 + 1);
            if (secretChance == 387){
                System.out.println("Wait. You find a portrait of Jonah Wolk. Maybe this can be used later");
                secret = true;
                System.out.println("\033[H\033[2J"); //Clears text
            }
        } 
        }
        Endings end = new Endings(); //Goes to proper ending once health is 0
        if(player.getPlayerScore() < 0){
            end.badEnding();
        }
        else if(0 < player.getPlayerScore() && player.getPlayerHealth() < 5){
            end.neutralEnding();
        }
        else if (player.getPlayerScore() > 5){
            end.goodEnding();
        }
        else if (player.getPlayerScore() > 5 && secret == true){
            end.secretEnding();
        }
    }
    public void printBoard(){
        for (int row = 0; row < board.length; row++){
            System.out.println();
            for (int col = 0; col < board[0].length; col++){
                System.out.print(board[row][col] + " ");
            }
        }
        System.out.println();
    }
}
