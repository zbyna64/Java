import java.util.Scanner;

public class DrawDiagonal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the square size: ");
        int squareSize = scanner.nextInt();
        draw(squareSize);
    }
    public static void draw(int size) {
        int outerCounter = 0;
        for (int i = 0; i < size; i++) {
            if (i == 0 || i == size -1) {
                int innerCounter = 0;
                while (innerCounter < size){
                    System.out.print("%");
                    innerCounter++;
                }
            } else {
                int innerCounter = 0;
                for (int j = 0; j < size; j++) {
                    if (j == 0) {
                        System.out.print("%");
                    } else if (outerCounter == j) {
                        System.out.print("%");
                    } else if (innerCounter == (size -1)) {
                        System.out.print("%");
                    } else if (innerCounter < size) {
                        System.out.print(" ");
                    }
                    innerCounter++;
                }
            }
            System.out.println();
            outerCounter++;
        }
    }
}