/*

 */
import java.util.Scanner;

public class TicTacToe {
    private final int boardSize = 3;
    private final int win = 1, draw = 2, cont = 3;
    private int board[][];
    private boolean firstPlayer, gameOver;
    
    public TicTacToe()
    {
    board = new int[boardSize][boardSize];
    firstPlayer = true;
    gameOver = false;
    }
    
    public void makeMove()
    {
        Scanner myRowColumn = new Scanner(System.in);
        int row = 0, column = 0;
        
        while (!gameOver) {
            //First player's turn
            if (firstPlayer) {
                System.out.printf("Player 1: Enter a row (0 <= row < 3): ", row);
                row = myRowColumn.nextInt();
                System.out.printf("Player 1: Enter a colum (0 <= column < 3): ", column);
                column = myRowColumn.nextInt();
                
                while(!validMove(row, column)) {
                    System.out.printf("Player 1: Enter a row (0 <= row < 3): ", row);
                    row = myRowColumn.nextInt();
                    System.out.printf("Player 1: Enter a colum (0 <= column < 3): ", column);
                    column = myRowColumn.nextInt();
                }
                
                firstPlayer = false;
                board[row][column] = 1;
                printBoard();
                
                printStatus(1);
            }//End of first players turn
            
            //Second players turn
            else {
                System.out.printf("Player 2: Enter a row (0 <= row < 3: ", row);
                row = myRowColumn.nextInt();
                System.out.printf("Player 2: Enter a colum (0 <= column < 3: ", column);
                column = myRowColumn.nextInt();
                
                while(!validMove(row, column)) {
                    System.out.printf("Player 2: Enter a row (0 <= row < 3: ", row);
                    row = myRowColumn.nextInt();
                    System.out.printf("Player 2: Enter a colum (0 <= column < 3: ", column);
                    column = myRowColumn.nextInt();
                }
                
                firstPlayer = true;
                board[row][column] = 2;
                printBoard();
                
                printStatus(2);
            }//End second players turn
        }//End while
    }//End makeMove
    
    //Show game status
    public void printStatus(int player)
    {
        int status = gameStatus();
        
        //Check game status
        switch (status) {
            case win:
                System.out.println("Player " + player + " wins.");
                gameOver = true;
                break;
            case draw:
                System.out.println("Player " + player + " wins.");
                gameOver = true;
                break;
            case cont:
                if(player == 1)
                    System.out.println("Player 2's turn.");
                else
                    System.out.println("Player 1's turn.");
                break;
        }//End switch
    }//End printStatus
    
    //Game status
    public int gameStatus()
    {
        int a;
        //Check for a win on diagonals
        if ( board[ 0 ][ 0 ] != 0 && board[ 0 ][ 0 ] == board[ 1 ][ 1 ] && 
            board[ 0 ][ 0 ] == board[ 2 ][ 2 ] )
            return win;
        else if ( board[ 2 ][ 0 ] != 0 && board[ 2 ][ 0 ] == 
            board[ 1 ][ 1 ] && board[ 2 ][ 0 ] == board[ 0 ][ 2 ] )
            return win;
        //Check for win in rows
        for ( a = 0; a < 3; ++a )
            if ( board[ a ][ 0 ] != 0 && board[ a ][ 0 ] ==
                board[ a ][ 1 ] && board[ a ][ 0 ] == board[ a ][ 2 ] )
                return win;
        //Check for win in columns
        for ( a = 0; a < 3; ++a )
            if ( board[ 0 ][ a ] != 0 && board[ 0 ][ a ] ==
                board[ 1 ][ a ] && board[ 0 ][ a ] == board[ 2 ][ a ] )
                return win;
        //Check for a completed game
        for ( int r = 0; r < 3; ++r )
            for ( int c = 0; c < 3; ++c )
                if ( board[ r ][ c ] == 0 )
                    return cont;//Game is not finished
        return draw; //Game is a draw
    }//End gameStatus
    
    //Display board
    public void printBoard()
    {
        System.out.println("_________________________");
        
        for(int row = 0; row < boardSize; ++row){
            System.out.println("|       |       |       |");
            
            for(int column = 0; column < boardSize; ++column)
                printSymbol(column, board[row][column]);
            
            System.out.println("|_______|_______|_______|");
        }
    }//End printBoard
    
    public void printSymbol(int column, int player)
    {
        String output = "";
        
        if(column != 2) {//First two columns
            switch(player){
                case 0:
                    output = "|       ";
                    break;
                case 1:
                    output = "|   X   ";
                    break;
                case 2:
                    output = "|   O   ";
                    break;
            }
        }
        else{//Last column
            switch(player){
                case 0:
                    output = "|       |\n";
                    break;
                case 1:
                    output = "|   X   |\n";
                    break;
                case 2:
                    output = "|   O   |\n";
                    break;
            }
        }
        System.out.print(output);
    }//End printSymbol
    
    //Validate move
    public boolean validMove(int row, int column)
    {
        return row >= 0 && row < 3 && column >= 0 && column < 3 &&
            board[row][column] == 0;
    }
}
