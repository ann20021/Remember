import java.util.Random;
import java.util.Scanner;

public class Massiv {
    public static void main (String[] args)
    {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество элементов массива");

        int n = scanner.nextInt();

        int [] array = new int [n];

        int maxArray = array[0];
        for (int i=0;i<n;i++) {
            array [i] = random.nextInt(100)+1;
            System.out.println(i+1 + "й элемент: " + array[i]);
        }

        for (int i=0;i<array.length;i++)
        {
            if (array[i]> maxArray)
                maxArray = array[i];
        }

        System.out.println("Максимальный элемент в массиве: " + maxArray);
    }
}
