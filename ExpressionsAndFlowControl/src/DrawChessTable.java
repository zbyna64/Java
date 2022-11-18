//public class DrawChessTable {
//    public static void main(String[] args) {
//        // Write a program that reads a number from the standard input and
//        // then draws a chess table of the specified size
//        //
//        // Example:
//        //
//        // Please enter the chess table size: 8
//        // % % % %
//        //  % % % %
//        // % % % %
//        //  % % % %
//        // % % % %
//        //  % % % %
//        // % % % %
//        //  % % % %
//    }
//
//    public static void draw(int size){
//        // Write your code to draw the chess table here
//    }
//}

import java.util.Scanner;

public class DrawChessTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the chess table size: ");
        int tableSize = scanner.nextInt();
        draw(tableSize);
    }

    public static void draw(int size) {
        for (int i = 1; i <= size; i++) {
            if (i % 2 != 0) {
                for (int j = 1; j <= (size/2); j++) {
                    System.out.print("% ");
                }
                if ((size % 2) != 0) {
                    System.out.print("%");
                }
            } else {
                for (int k = 1; k <= (size/2); k++) {
                    System.out.print(" %");
                }
                if ((size % 2) != 0) {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}