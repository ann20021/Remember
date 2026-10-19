import java.util.Random;
import java.util.Scanner;

public class Ugadaika {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(100) + 1;
        int guess;
        int attemps = 0;

        do {
            System.out.println("Угадываем число от 1 до 100: ");
            guess = scanner.nextInt();
            attemps++;

            if (secretNumber == guess) {
                System.out.println("Угадала!");
            } else if (secretNumber > guess) {
                System.out.println("Угаданное число БОЛЬШЕ");
            } else System.out.println("Угаданное число МЕНЬШЕ");
        }

        while (secretNumber != guess);
    }
}
