//public class DrawSquare {
//    public static void main(String[] args) {
//        // Write a program that reads a number from the standard input and
//        // then draws a square of the specified size
//        //
//        // Example:
//        //
//        // Please enter the square size: 6
//        // %%%%%%
//        // %    %
//        // %    %
//        // %    %
//        // %    %
//        // %%%%%%
//        //
//    }
//
//    public static void draw(int size){
//        // Write your code to draw the square here
//    }
//}

import java.util.Scanner;
public class DrawSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the square size: ");
        int squareSize = scanner.nextInt();
        draw(squareSize);
    }



    public static void draw(int size){

        for (int i = 1; i <= size; i++) {                // number of lines, total of 6

            if (i == 1 || i == size) {

                for (int j = 1; j <= size; j++) {
                    System.out.print("%");
                }
                System.out.println();

            } else {


                for (int k = 1; k <= 1; k++) {
                    System.out.print("%");
                }
                for (int l = 2; l > 1 && l < size; l++) {
                    System.out.print(" ");
                }
                for (int m = size; m == size ; m++) {
                    System.out.print("%");
                }
                System.out.println();
            }
        }
    }
}
