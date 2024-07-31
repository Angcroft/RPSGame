import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    // Main Menu options
    private static final int PLAY_GAME = 1;
    private static final int EXIT_GAME = 2;
    private static final String[] options = {"Rock", "Paper", "Scissors"};

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            Interfacer.mainMenu();
            int choice = in.nextInt();

            switch (choice) {
                case PLAY_GAME:
                    startGame(in);
                    break;
                case EXIT_GAME:
                    System.out.println("Exiting program...");
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please enter a correct number.");
                    break;
            }
        }
    }

    public static int getRandom() {
        return new Random().nextInt(options.length);
    }

    private static void startGame(Scanner in) {
        Interfacer.selectRPS();

        while (true) {
            int userChoice = in.nextInt();

            if (userChoice < 0 || userChoice > 2) {
                System.out.println("Thanks for playing!");
                break;
            }

            // Generating the selections of computer
            int computerChoice = getRandom();

            // Showing the elections
            System.out.println("You chose: " + options[userChoice]);
            System.out.println("The computer chose: " + options[computerChoice]);

            // Determining the results
            if (userChoice == computerChoice) {
                System.out.println("It's a draw!");
            } else if ((userChoice == 0 && computerChoice == 2) ||
                       (userChoice == 1 && computerChoice == 0) ||
                       (userChoice == 2 && computerChoice == 1)) {
                System.out.println("You won!");
            } else {
                System.out.println("You lost!");
            }
        }
    }
}