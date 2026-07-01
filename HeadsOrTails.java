import java.util.Random;

public class HeadsOrTails {

    public static void main(String[] args) {
        Random random = new Random();
        int heads = 0;
        int tails = 0;

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

        if (heads > tails) {
            System.out.println("You won");
        } else {
            System.out.println("You lost");
        }
    }
}
