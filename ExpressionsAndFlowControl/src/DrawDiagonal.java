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

    public static void draw(int size) {                 //prvni for urcuje pocet radku, druhe a dalsi fur urcuje pocet sloupcu
                                                         //je to pohyb po ose "y" a po ose "x"

        for (int i = 1; i <= size; i++) {             //pocet radku definuji pomoci i
                                                    //chci mit pocet radku od 1 az do velikosti size (kterou zadavam)

            if (i == 1 || i == size) {               //definuji, ze prvni a posledni radek budou plne znaku "%"
                for (int j = 1; j <= size; j++) {   //rikam ze od prvniho sloupce az do posledniho sloupce chci tisknout "%"
                    System.out.print("%");
                }

            } else {                               // pro pripad ze nejsem na prvnim ani poslednim radku
                for (int k = 1; k <= 1 ; k++) {     //tak chci vzdy na prvnim miste (sloupci) dat znak "%"
                    System.out.print("%");

                }
                for (int l = 2; l < i ; l++) {      //v pripade ze jsem ve sloupci (alespon druhem) a ten sloupec je mensi nez "i"
                    System.out.print(" ");          // (pokud je radek a sloupec roven jsem na diagonale), tak chci vytisknout mezeru

                }
                for (int m = i; m <= i ; m++) {     //pokud jsem na diagonale tak chci vytisknou znak "%"
                    System.out.print("%");

                }
                for (int n = i + 1; n > i && n < size ; n++) {      //pokud jsem za diagonalou tak chci tisknout mezeru ale jen do delky
                    System.out.print(" ");                          //ktera je mensi nez velikost (size) celeho ctverce

                }
                for (int o = size; o == size ; o++) {               //na kraji chci vzdy vytisknout znak "%"
                    System.out.print("%");

                }

            }
            System.out.println();                               //jakmile probehne cely radek chci ho odsadit pomoci funkce println na dalsi radek
        }
    }
}