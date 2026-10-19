import java.util.Scanner;

public class Text
{
    public static void main (String args [])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите слово: ");
        String word = scanner.nextLine().toLowerCase();

        boolean isPalindrome = true;
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Слово является палиндромом.");
        } else {
            System.out.println("Слово не является палиндромом.");
        }


    }
}
