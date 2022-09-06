package trofimova.java1.lesson4;

import java.util.Random;
import java.util.Scanner;

public class HomeWorkApp4 {
    Random random;
    Scanner scanner;
    char[][] table;

    HomeWorkApp4(){
        random = new Random();
        scanner = new Scanner(System.in);
        table = new char[3][3];
    }

    public static void main(String[] args){
        new HomeWorkApp4().game();
    }

    void game(){
        initTable();
        printTable();
        while(true){
            turnHuman();
            if(checkWin('x')){
                System.out.println("You WON!");
                break;
            }
            if(isTableFull()){
                System.out.println("Sorry, DRAW!");
                break;
            }
            turnAI();
            printTable();
            if(checkWin('o')){
                System.out.println("AI WON!");
                break;
            }
            if(isTableFull()){
                System.out.println("Sorry, DRAW!");
                break;
            }
        }
        printTable();
        System.out.println("Game Over!");
    }

    private void initTable() {
        for(int i = 0; i < table.length; i++){
            for(int j = 0; j < table.length; j++){
                table[i][j] = '_';
            }
        }
    }

    private void printTable() {
        for(int i = 0; i < table.length; i++){
            for(int j = 0; j < table.length; j++){
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }

    private void turnHuman() {
        int x,y;
        do {
            System.out.println("Enter x and y, from 1 to 3:");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
            if(!isCellValid(x,y)){
                System.out.println("Your input is not valid,try again.");
            }
        }
        while(!isCellValid(x,y));
        table[x][y] = 'x';
    }

    private boolean checkWin(char symbol) {
        for(int i = 0; i < table.length; i++) {
            boolean foundRows = true;
            boolean foundCols = true;
            for (int j = 0; j < table.length; j++) {
                if (table[i][j] != symbol) {
                    foundRows = false;
                }
                if (table[j][i] != symbol) {
                    foundCols = false;
                }
            }
            if (foundRows || foundCols) {
                return true;
            }
        }
        boolean foundDiag = true;
        boolean foundDiag2 = true;
        for (int i = 0; i < table.length; i++) {
            if (table[i][i] != symbol) {
                foundDiag = false;
            }
            if (table[i][table.length - 1 - i] != symbol) {
                foundDiag2 = false;
            }
        }
        return (foundDiag || foundDiag2);
    }

    private boolean isTableFull() {
        for(int i = 0; i < table.length; i++){
            for(int j = 0; j < table.length; j++){
                if(table[i][j] == '_'){
                    return false;
                }
            }
        }
        return true;
    }

    private void turnAI() {
        int x,y;
        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        }
        while(!isCellValid(x,y));
        table[x][y] = 'o';
    }

    private boolean isCellValid(int x, int y) {
        if(x < 0 || y < 0 || x > 2 || y > 2){
            return false;
        }
        return table[x][y] == '_';
    }
}
