import java.util.Scanner;

public class PlayerRoster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] jerseyNumbers = new int[5];
        int[] ratings = new int[5];

        for (int i = 0; i < 5; i += 1) {
            System.out.printf("Enter player %d's jersey number:%n", (i + 1));
            jerseyNumbers[i] = scanner.nextInt();

            System.out.printf("Enter player %d's rating:%n", (i + 1));
            ratings[i] = scanner.nextInt();
            System.out.println();
        }

        // Output the roster initially
        outputRoster(jerseyNumbers, ratings);

        //Menu
        char option = ' ';
        while (option != 'q') {
            System.out.println("MENU\nu - Update player rating\na - Output players above a rating\nr - Replace player\no - Output roster\nq - Quit\n\nChoose an option:"); //nearly illegible - refactor
            option = scanner.next().charAt(0);

            switch (option) {
                case 'u':
                    updatePlayerRating(scanner, jerseyNumbers, ratings);
                    break;
                case 'a':
                    outputPlayersAboveRating(scanner, jerseyNumbers, ratings);
                    break;
                case 'r':
                    replacePlayer(scanner, jerseyNumbers, ratings);
                    break;
                case 'o':
                    outputRoster(jerseyNumbers, ratings);
                    break;
                default:
                    break;
            }
        }
    }

    private static void outputRoster(int[] jerseyNumbers, int[] ratings) {
        System.out.println("ROSTER");
        for (int i = 0; i < 5; i += 1) {
            System.out.printf("Player %d -- Jersey number: %d, Rating: %d\n", (i + 1), jerseyNumbers[i], ratings[i]);
        }
        System.out.println();
    }

    private static void updatePlayerRating(Scanner scanner, int[] jerseyNumbers, int[] ratings) {
        System.out.println("Enter a jersey number:");
        int jerseyNumber = scanner.nextInt();
        System.out.println("Enter a new rating for player:");
        int newRating = scanner.nextInt();

        for (int i = 0; i < 5; i += 1) {
            if (jerseyNumbers[i] == jerseyNumber) {
                ratings[i] = newRating;
                System.out.println("Rating updated successfully!");
                return;
            }
        }
        System.out.println("Player not found.");
    }

    private static void outputPlayersAboveRating(Scanner scanner, int[] jerseyNumbers, int[] ratings) {
        System.out.println("Enter a rating:");
        int rating = scanner.nextInt();

        System.out.println("ABOVE " + rating);
        for (int i = 0; i < 5; i += 1) {
            if (ratings[i] > rating) {
                System.out.printf("Player %d -- Jersey number: %d, Rating: %d\n", (i + 1), jerseyNumbers[i], ratings[i]);
            }
        }
        System.out.println();
    }

    private static void replacePlayer(Scanner scanner, int[] jerseyNumbers, int[] ratings) {
        System.out.println("Enter a jersey number:");
        int jerseyNumber = scanner.nextInt();

        for (int i = 0; i < 5; i += 1) {
            if (jerseyNumbers[i] == jerseyNumber) {
                System.out.println("Enter a new jersey number:");
                jerseyNumbers[i] = scanner.nextInt();
                System.out.println("Enter a rating for the new player:");
                ratings[i] = scanner.nextInt();
                return;
            }
        }
        System.out.println("Player not found.");
    }
}