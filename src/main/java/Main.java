package main.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Game game = new Game(scanner);

    int[][] values = new int[9][9];
    boolean[][] fixed = new boolean[9][9];

    // Preenchimento parcial baseado no tabuleiro anterior
    values[0][0] = 4; fixed[0][0] = false;
    values[0][1] = 7; fixed[0][1] = false;
    values[0][3] = 5; fixed[0][3] = false;
    values[0][5] = 6; fixed[0][5] = true;
    values[0][6] = 2; fixed[0][6] = true;
    values[0][8] = 1; fixed[0][8] = false;

    values[1][1] = 3; fixed[1][1] = true;
    values[1][2] = 5; fixed[1][2] = false;
    values[1][4] = 7; fixed[1][4] = true;
    values[1][5] = 2; fixed[1][5] = false;
    values[1][6] = 8; fixed[1][6] = false;
    values[1][8] = 6; fixed[1][8] = true;

    values[2][0] = 2; fixed[2][0] = false;
    values[2][2] = 8; fixed[2][2] = false;
    values[2][3] = 9; fixed[2][3] = false;
    values[2][4] = 1; fixed[2][4] = true;
    values[2][5] = 3; fixed[2][5] = false;
    values[2][7] = 4; fixed[2][7] = false;

    values[3][0] = 5; fixed[3][0] = true;
    values[3][2] = 3; fixed[3][2] = true;
    values[3][4] = 6; fixed[3][4] = false;
    values[3][6] = 9; fixed[3][6] = false;
    values[3][7] = 8; fixed[3][7] = true;

    values[4][0] = 8; fixed[4][0] = false;
    values[4][1] = 9; fixed[4][1] = true;
    values[4][2] = 7; fixed[4][2] = false;
    values[4][4] = 2; fixed[4][4] = true;
    values[4][6] = 3; fixed[4][6] = false;
    values[4][8] = 4; fixed[4][8] = false;

    values[5][1] = 4; fixed[5][1] = true;
    values[5][3] = 3; fixed[5][3] = false;
    values[5][6] = 1; fixed[5][6] = true;
    values[5][7] = 5; fixed[5][7] = false;
    values[5][8] = 7; fixed[5][8] = true;

    values[6][0] = 7; fixed[6][0] = true;
    values[6][3] = 2; fixed[6][3] = false;
    values[6][4] = 3; fixed[6][4] = true;
    values[6][6] = 6; fixed[6][6] = false;
    values[6][8] = 8; fixed[6][8] = false;

    values[7][1] = 8; fixed[7][1] = true;
    values[7][4] = 4; fixed[7][4] = true;
    values[7][5] = 7; fixed[7][5] = false;
    values[7][7] = 2; fixed[7][7] = true;

    values[8][0] = 3; fixed[8][0] = false;
    values[8][1] = 2; fixed[8][1] = false;
    values[8][2] = 6; fixed[8][2] = true;
    values[8][5] = 1; fixed[8][5] = false;
    values[8][6] = 4; fixed[8][6] = true;
    values[8][8] = 9; fixed[8][8] = false;

    game.startWithMatrix(values, fixed); // inicia com os dados fixos
    game.showMenu();
    scanner.close();
}

}