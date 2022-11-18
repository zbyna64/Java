//public class DrawDiamond {
//    public static void main(String[] args) {
//        // Write a program that reads a number from the standard input and
//        // then draws a diamond of the specified height
//        //
//        // Example:
//        //
//        // Please enter the diamond height: 4
//        //    *
//        //   ***
//        //  *****
//        // *******
//        //  *****
//        //   ***
//        //    *
//        //
//        // Note: the height of the diamond is taken from its base
//        // (where it is the widest) to the top.
//        // The total number of lines produced is 2*height-1
//    }
//
//    public static void draw(int size){
//        // Write your code to draw the diamond here
//    }
//}

import java.util.Scanner;
    public class DrawDiamond {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter the diamond height: ");
            int diamondHeight = scanner.nextInt();
            draw(diamondHeight);
        }



        public static void draw(int size){

            int count = 1;
            for (int i = 1; i <= (2 * size) - 1; i++) {     // number of lines, total of 9 = 4 up / 4 down / 1 base;

                for (int j = 1; j <= size - count; j++) {   // number of spaces,
                    System.out.print(" ");
                }
                for (int k = 1; k <= 2 * count - 1; k++) {  // number of " * "
                    System.out.print("*");
                }
                System.out.println();
                if (i < size) {
                    count++;
                } else {
                    count--;
                }
            }
        }
    }

