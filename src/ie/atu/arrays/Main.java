package ie.atu.arrays;

public class Main {
    public static void main(String[] args) {

        // Create a tic tac toe object
        TicTacToe ticTacToe = new TicTacToe();

        // Print the empty board
        ticTacToe.printBoard();

        // Allow the user to make a move
        ticTacToe.userMove();

        // Print the board after the user has made a move
        ticTacToe.printBoard();

        // Populate the board
        ticTacToe.emptyBoard();

        // Print the populated board
        ticTacToe.printBoard();

    } // End of main method

} // End of Main class
