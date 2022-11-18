//public class DrawTriangle {
//    public static void main(String[] args) {
//        // Write a program that reads a number from the standard input and
//        // then draws a triangle of the specified height
//        //
//        // Example:
//        //
//        // Please enter the triangle height: 4
//        // *
//        // **
//        // ***
//        // ****
//    }
//
//    public static void draw(int height){
//        // Write your code to draw the triangle here
//    }
//}
import java.util.Scanner;
public class DrawTriangle {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the triangle height: ");
        int heightOfTriangle = scanner.nextInt();
        draw(heightOfTriangle);
    }

    public static void draw(int height){
        for (int i = 1; i <= height ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}