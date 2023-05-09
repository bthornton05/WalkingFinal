package WalkingSimulator;
import java.util.Scanner;
public class Walk {
private static int playerRow = 4;
private static int playerCol = 4;
private static int enemy1Col = 0;
private static int enemy1Row = 0;
private static int enemy2Col = 0;
private static int enemy2Row = 8;
private static int enemy3Col = 8;
private static int enemy3Row = 0;
private static int enemy4Col = 8;
private static int enemy4Row= 8;
private static String bufferText = "";
private static char[][] board = new char[9][9]; //Creates board for which to game in
private boolean secret = false;
    public void walk(){
        bufferText = "";
        Player player = Walker.player; //Sets player from main class
        for (int row = 0; row < board.length; row++){
            System.out.println();
            for (int col = 0; col < board[0].length; col++){
                board[row][col] = 'W'; //Sets all spaces to W, which kind of looks like grass
            }
        }
        
        board [playerRow][playerCol] = 'O'; //Sets player icon
        board [enemy1Row][enemy1Col] = 'P'; //Sets enemy icon
        board [enemy2Row][enemy2Col] = 'P'; //Sets enemy icon
        board [enemy3Row][enemy3Col] = 'P'; //Sets enemy icon
        board [enemy4Row][enemy4Col] = 'P'; //Sets enemy icon
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
            if((playerRow - 1) < 0){
                System.out.println("Nothing happens");
            }
            else{
                playerRow --;
                if((playerRow == enemy1Row && playerCol == enemy1Col) || (playerRow == enemy2Row && playerCol == enemy2Col) || (playerRow == enemy3Row && playerCol == enemy3Col) || (playerRow == enemy4Row && playerCol == enemy4Col)){
                    playerRow ++;
                    //bufferText += "erm";
                    randomEvent();
                }
                else{
                    board[playerRow][playerCol] = 'O';
                    board[playerRow + 1][playerCol] = 'W'; //Need to check if enemy is present, then afterwards start encounter or move enemies closer
                }
                printBoard();
            }
        }
        else if(move.equals("a")){
            if((playerCol - 1) < 0){
                System.out.println("Nothing happens");
            }
            else{
                playerCol --;
                if((playerRow == enemy1Row && playerCol == enemy1Col) || (playerRow == enemy2Row && playerCol == enemy2Col) || (playerRow == enemy3Row && playerCol == enemy3Col) || (playerRow == enemy4Row && playerCol == enemy4Col)){
                    playerCol ++;
                    //bufferText += "erm";
                    randomEvent();
                }
                else{
                    board[playerRow][playerCol] = 'O';
                    board[playerRow][playerCol + 1] = 'W';
                }
                printBoard();
            }
        }
        else if(move.equals("s")){
            if((playerRow + 1) > board.length - 1){
                System.out.println("Nothing happens");
            }
            else{
                playerRow ++;
                if((playerRow == enemy1Row && playerCol == enemy1Col) || (playerRow == enemy2Row && playerCol == enemy2Col) || (playerRow == enemy3Row && playerCol == enemy3Col) || (playerRow == enemy4Row && playerCol == enemy4Col)){
                    playerRow--;
                    //bufferText += "erm";
                    randomEvent();
                }
                else{
                    board[playerRow][playerCol] = 'O';
                    board[playerRow - 1][playerCol] = 'W';
                }
                printBoard();
        }
    }
        else if(move.equals("d")){
            if((playerCol + 1) > board[0].length - 1){
                System.out.println("Nothing happens");
            }
            else{
                playerCol ++;
                if((playerRow == enemy1Row && playerCol == enemy1Col) || (playerRow == enemy2Row && playerCol == enemy2Col) || (playerRow == enemy3Row && playerCol == enemy3Col) || (playerRow == enemy4Row && playerCol == enemy4Col)){
                    playerCol--;
                    //bufferText += "erm";
                    randomEvent();
                }
                else{
                    board[playerRow][playerCol] = 'O';
                    board[playerRow][playerCol - 1] = 'W';
                }
                printBoard();
            }
        }
        else{
            System.out.println("Error");
            System.exit(-1);
        }
        System.out.println("\033[H\033[2J" + bufferText); //Clears text
        printBoard(); //Prints board after move


        //Need make enemy move
       
        }
        Endings end = new Endings(); //Goes to proper ending once health is 0
        if(player.getPlayerScore() < 0){
            end.badEnding();
        }
        else if(0 <= player.getPlayerScore() && player.getPlayerHealth() < 5){
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
    public void randomEvent(){
        Events event = new Events(); //Creates instance of events to be accessed in the code
        int randomEvent = (int) (Math.random()*10 + 1);
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
}