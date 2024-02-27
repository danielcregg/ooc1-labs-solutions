package ie.atu.arrays;

import java.util.Scanner;

public class TicTacToe {

    // Declare a 2D array to represent the Tic Tac Toe board
    private String[][] ticTacToeBoard;

    // Constructor
    public TicTacToe() {
        ticTacToeBoard = new String[3][3];
        for (int i = 0; i < ticTacToeBoard.length; i++) {
            for (int j = 0; j < ticTacToeBoard[i].length; j++) {
                ticTacToeBoard[i][j] = "empty";
            }
        }
    }

    // Method to print the Tic Tac Toe board
    public void printBoard() {
        for (String[] innerArray : ticTacToeBoard) {
            for (int i = 0; i < innerArray.length; i++) {
                System.out.print(innerArray[i] + "\t");
            }
            System.out.println("\n");
        }
    }

    // Method to allow the user to make a move
    public void userMove() {
        Scanner keyboardInput = new Scanner(System.in);

        System.out.println("Enter 'x' or 'o': ");
        String userLetter = keyboardInput.nextLine();

        System.out.println("Enter the row (0-2) where you want to place your '" + userLetter + "': ");
        int row = keyboardInput.nextInt();

        System.out.println("Enter the column (0-2) where you want to place your '" + userLetter + "': ");
        int column = keyboardInput.nextInt();

        ticTacToeBoard[row][column] = userLetter;

        keyboardInput.close();
    }

    // Method to populate the Tic Tac Toe board
    public void emptyBoard() {
        for (int i = 0; i < ticTacToeBoard.length; i++) {
            for (int j = 0; j < ticTacToeBoard[i].length; j++) {
                ticTacToeBoard[i][j] = "empty";
            }
        }
    }

}