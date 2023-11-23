import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a year:");

        int givenYear = Integer.valueOf(scan.nextLine());
        if (givenYear % 4 == 0) {
            System.out.println("Year " + givenYear + " is a leap year!");
        } else if (givenYear % 100 == 0 || givenYear % 400 != 0) {
            System.out.println("Year " + givenYear + " is not leap year!");
        }
        scan.close();
    }
}
