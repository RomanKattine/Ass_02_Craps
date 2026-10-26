
import java.util.Scanner;
import java.util.Random;

public class craps {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rnd = new Random();

        String again = "yes";

        System.out.println("Welcome to Craps!");

        while (again.equalsIgnoreCase("yes") || again.equalsIgnoreCase("y")) {

            int die1 = rnd.nextInt(6) + 1;
            int die2 = rnd.nextInt(6) + 1;
            int total = die1 + die2;

            System.out.println(" ");
            System.out.println("Die 1: " + die1);
            System.out.println("Die 2: " + die2);
            System.out.println("Total: " + total);

            if (total == 2 || total == 3 || total == 12) {
                System.out.println("Craps! You lose.");
            }
            else if (total == 7 || total == 11) {
                System.out.println("Natural! You win!");
            }
            else {

                int point = total;
                System.out.println("The point is " + point);

                boolean done = false;

                while (done == false) {

                    die1 = rnd.nextInt(6) + 1;
                    die2 = rnd.nextInt(6) + 1;
                    total = die1 + die2;

                    System.out.println(" ");
                    System.out.println("Die 1: " + die1);
                    System.out.println("Die 2: " + die2);
                    System.out.println("Total: " + total);

                    if (total == point) {
                        System.out.println("Made point and won!");
                        done = true;
                    }
                    else if (total == 7) {
                        System.out.println("Got a seven and lost.");
                        done = true;
                    }
                    else {
                        System.out.println("Trying for point");
                    }
                }
            }

            System.out.println("Do you want to play again? yes or no");
            again = input.nextLine();
        }