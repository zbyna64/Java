import java.util.Scanner;
class MileToKmConverter {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please enter the distance in miles: ");
        double distanceInput = myScanner.nextDouble();
        double milesToKm = 1.609344;
        double distanceInputInKm = distanceInput * milesToKm;

        System.out.println("The distance in km: " + distanceInputInKm);

    }
}