package tictactoe.bll;
import java.util.ArrayList;
import java.util.Random;
import tictactoe.gui.model.ScoreModel;

/**
 * The GameBoardSinglePlayer class is the optional and advanced implementation for the TicTacToe assignment.
 * It is used for games where there are one human player vs. a computer player.
 */
public class GameBoardSinglePlayer implements IGameModel {
    private ScoreModel scoreModel = new ScoreModel();
    int counterGameOver = 0;
    int playerTurn = 1; //makeing a int variable that defines the players turn
    int[][] grid = new int[3][3]; //Makeing an 2d array variable called grid
    int winner; //makeing a winner variable

    @Override
    public int getScoreSinglePlayer1() {
        return scoreSinglePlayer1;
    }

    public int getLevelSinglePlayer1() {
        return levelSinglePlayer1;
    }
    public int levelSinglePlayer1 = 0;
    public int scoreSinglePlayer1 = 0;
    protected GameBoardSinglePlayer() {

    }


    /**
     * Returns 0 for player 0, 1 for player 1.
     *
     * @return int Id of the next player.
     */
    @Override
    public int getNextPlayer() {
        //TODO Implement this method
        playerTurn = (1 == playerTurn) ? 2 : 1; //choseing between player 1 and player 2
        return playerTurn; //returning the playerTurn
    }

    /**
     * Attempts to let the current player play at the given coordinates. If the
     * attempt is successful the current player has ended his turn and it is the
     * next players turn.
     *
     * @param col column to place a marker in.
     * @param row row to place a marker in.
     * @return true if the move is accepted, otherwise false. If gameOver ==
     * true this method will always return false.
     */
    @Override
    public boolean play(int col, int row) {
        //TODO Implement this method
        int AICol, AIRow;
        boolean whileCondition = true;
        boolean canPlay;
        if (grid[col][row] == 0 && !isGameOver()) {
            grid[col][row] = 1;
            counterGameOver++;
            getNextPlayer();
            canPlay = true;
        } else {
            getNextPlayer();
            canPlay = false;

        }
        while (whileCondition && canPlay && !isGameOver() ) {
            Random randInt = new Random();
            AICol = randInt.nextInt(3);
            AIRow = randInt.nextInt(3);
            if (grid[AICol][AIRow] == 0) {
                grid[AICol][AIRow] = 2;
                counterGameOver++;
                whileCondition = false;
            } else{
                getNextPlayer();
                getWinner();
            }
        }
        return canPlay;
    }

    /**
     * Tells us if the game has ended either by draw or by meeting the winning
     * condition.
     *
     * @return true if the game is over, else it will return false.
     */
    @Override
    public boolean isGameOver() {
        //TODO Implement this method
        if (grid[0][0] == playerTurn && grid[1][1] == playerTurn && grid[2][2] == playerTurn ) {
            winner = playerTurn;
            if (playerTurn == 1){
                scoreSinglePlayer1 ++;
                levelSinglePlayer1 ++;
            }
            return true;
        }
        if (grid[0][0] == playerTurn && grid[0][1] == playerTurn && grid[0][2] == playerTurn ) {
            winner = playerTurn;
            if (playerTurn == 1){
                scoreSinglePlayer1 ++;
                levelSinglePlayer1 ++;
            }
            return true;
        }
        if (grid[0][2] == playerTurn && grid[1][1] == playerTurn && grid[2][0] == playerTurn ) {
            winner = playerTurn;
            if (playerTurn == 1){
                scoreSinglePlayer1 ++;
                levelSinglePlayer1 ++;
            }
            return true;
        }
        if (grid[0][0] == playerTurn && grid[1][0] == playerTurn && grid[2][0] == playerTurn ) {
            winner = playerTurn;
            if (playerTurn == 1){
                scoreSinglePlayer1 ++;
                levelSinglePlayer1 ++;
            }
            return true;
        }
        if (grid[1][0] == playerTurn && grid[1][1] == playerTurn && grid[1][2] == playerTurn) {
            winner = playerTurn;
            if (playerTurn == 1){
                scoreSinglePlayer1 ++;
                levelSinglePlayer1 ++;
            }
            return true;
        }
        if (grid[2][0] == playerTurn && grid[2][1] == playerTurn && grid[2][2] == playerTurn) {
            winner = playerTurn;
            if (playerTurn == 1){
                scoreSinglePlayer1 ++;
                levelSinglePlayer1 ++;
            }
            return true;
        }
        if (grid[0][1] == playerTurn && grid[1][1] == playerTurn && grid[2][1] == playerTurn) {
            winner = playerTurn;
            if (playerTurn == 1){
                scoreSinglePlayer1 ++;
                levelSinglePlayer1 ++;
            }
            return true;
        }
        if (grid[0][2] == playerTurn && grid[1][2] == playerTurn && grid[2][2] == playerTurn) {
            winner = playerTurn;
            if (playerTurn == 1){
                scoreSinglePlayer1 ++;
                levelSinglePlayer1 ++;
            }
            return true;
        }
        if (counterGameOver == 9){
            return true;
        }
        return false;
    }

    /**
     * Gets the id of the winner, -1 if its a draw or if the game is still running.
     *
     * @return int id of winner, or -1 if draw or if gameOver() == false.
     */
    @Override
    public int getWinner() {
        //TODO Implement this method
        if(winner == playerTurn){
        }

        return winner;

    }

    /**
     * Resets the game to a new game state.
     */
    @Override
    public void newGame() {
        //TODO Implement this method
        playerTurn = 1;
        winner = 0;
        counterGameOver = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                grid[i][j] = 0;
            }
        }
        System.out.println(grid[0][0]);
    }

    /**
     * Returns the value representing which players has played the given field.
     *
     * @param col The column to look at.
     * @param row The row to look at.
     * @return Will return 0 if player 0 has played the field, 1 for player one, and -1 if no player has played the field.
     */
    @Override
    public int getPlayerAt(int col, int row) {
        //TODO Implement this method
        return grid[col][row]; //return my 2d variable
    }

    @Override
    public void choicePlayMode() {
        playerTurn = 1;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++)
            {
                grid[i][j] = 0;
            }
        }
        System.out.println(grid);
    }
}
