import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int happiness;

        System.out.print("Enter happiness level (1 - 10): ");
        happiness = scnr.nextInt();

        if (happiness <= 0) {
            System.out.println("WHAT?!?");
        } else if (happiness <= 5)
            System.out.println("are u ok?");
        if (happiness > 10) {
            System.out.println(":DDDD");
        } else if (happiness > 5)
            System.out.println("OH BABY! :D");
    }
}