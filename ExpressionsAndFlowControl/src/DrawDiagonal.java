//public class DrawDiagonal {
//    public static void main(String[] args) {
//        // Write a program that reads a number from the standard input and
//        // then draws a square with the main diagonal of the specified size
//        //
//        // Example:
//        //
//        // Please enter the square size: 6
//        // %%%%%%
//        // %%   %
//        // % %  %
//        // %  % %
//        // %   %%
//        // %%%%%%
//        //
//    }
//
//    public static void draw(int size){
//        // Write your code to draw a square with the main diagonal here
//    }
//}

import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the square size: ");
        int squareSize = scanner.nextInt();
        draw(squareSize);
    }

    public static void draw(int size) {

        for (int i = 1; i <= size; i++) {

            if (i == 1 || i == size) {
                for (int j = 1; j <= size; j++) {
                    System.out.print("%");
                }

            } else {
                for (int k = 1; k <= 1 ; k++) {
                    System.out.print("%");
                }
                for (int l = 2; l < i ; l++) {
                    System.out.print(" ");
                }
                for (int m = i; m <= i ; m++) {
                    System.out.print("%");
                }
                for (int n = i + 1; n > i && n < size ; n++) {
                    System.out.print(" ");
                }
                for (int o = size; o == size ; o++) {
                    System.out.print("%");
                }
            }
            System.out.println();
        }
    }
}