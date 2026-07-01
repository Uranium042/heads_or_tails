import java.util.Random;
import java.util.Scanner;

public class HeadsOrTails {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int heads = 0;
        int tails = 0;

        System.out.println("Who are you?");
        System.out.print("> ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        System.out.println("Tossing a coin...");
        for (int i = 1; i <= 3; i++) {
            boolean isHeads = random.nextBoolean();
            String result = isHeads ? "Heads" : "Tails";
            if (isHeads) {
                heads++;
            } else {
                tails++;
            }
            System.out.println("Round " + i + ": " + result);
        }

        System.out.println("Heads: " + heads + ", Tails: " + tails);
    }
}
