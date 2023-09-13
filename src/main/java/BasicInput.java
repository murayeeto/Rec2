import java.util.Scanner;

public class BasicInput {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userInt = 0;
        double userDouble = 0.0;
        char userChar = 0;
        String userString = "";

        System.out.println("Enter integer:");
        userInt = scnr.nextInt();

        System.out.println("Enter Double:");
        userDouble = scnr.nextDouble();

        System.out.println("Enter Character:");
        userChar = scnr.next().charAt(0);

        System.out.println("Enter String:");
        userString = scnr.next();

        System.out.println(userInt + " " + userDouble + " " + userChar + " " + userString);
        System.out.println(userString + " " + userChar + " " + userDouble + " " + userInt);
        System.out.println((int)(userDouble)+" is userDouble as an integer");

        // TODO (1): Finish reading other items into variables, then output the four values on a single line separated by a space

        // TODO (2): Output the four values in reverse

        // TODO (3): Cast the double to an integer, and output that integer

    }
}