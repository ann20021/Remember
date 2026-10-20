import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class KrestikiNolikiModern
{

    private static char[][] ticTac = new char[3][3];
    private static int[] chisla = new int[10];
    private static Random random = new Random();

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++)
        {
            Arrays.fill(ticTac[i], '-');
        }
        for (int i = 1; i < 10; i++)
        {
            chisla[i] = i;
        }

        System.out.println("Играем в крестики-нолики!");
        System.out.println("Ты играешь за крестики! Хочешь ходить первым? (1 - да, 0 - нет):");

        int turn;
        do
        {
            turn = scanner.nextInt();
            if (turn != 0 && turn != 1) System.out.println("Введите 1 или 0: ");
        }
        while (turn != 0 && turn != 1);

        int totalMoves = 0;
        char winner = '-';

        // Главный игровой цикл
        while (totalMoves < 9) {
            printBoard();

            if (turn == 1) {
                // Ход игрока
                System.out.println("Введи цифру от 1 до 9:");
                int b;
                while (true)
                {
                    b = scanner.nextInt();
                    if (b < 1 || b > 9)
                    {
                        System.out.println("Неверно! Введи цифру от 1 до 9:");
                        continue;
                    }
                    if (chisla[b] == 0)
                    {
                        System.out.println("Ячейка уже занята! Выбери другую:");
                        continue;
                    }
                    break;
                }
                makeMove(b, 'X');

                if (checkWin('X')) { winner = 'X'; break; }
                turn = 0; // Передаем ход компьютеру
            }
            else {
                // Ход компьютера
                System.out.println("\nХод компьютера:");
                int b = getComputerSmartMove();
                makeMove(b, 'O');
                if (checkWin('O')) { winner = 'O'; break; }
                turn = 1; // Передаем ход игроку
            }

            totalMoves++;
        }

        printBoard(); // Финальный показ поля

        // Результаты игры
        if (winner == 'X')
        {
            System.out.println("Ты выиграл!");
        }
        else if (winner == 'O')
        {
            System.out.println("Ты проиграл!");
        }
        else
        {
            System.out.println("Ничья! Попробуй снова!");
        }
    }

    // Вывод поля в консоль
    private static void printBoard() {
        for (int i = 0; i < 3; i++)
        {
            System.out.println(Arrays.toString(ticTac[i]));
        }
    }

    // Умный выбор хода для компьютера
    private static int getComputerSmartMove()
    {
        // 1. Пытаемся выиграть сами за этот ход
        for (int i = 1; i <= 9; i++)
        {
            if (chisla[i] != 0)
            {
                makeMove(i, 'O');
                if (checkWin('O'))
                {
                    undoMove(i);
                    return i;
                }
                undoMove(i);
            }
        }

        // 2. Блокируем игрока, если он может выиграть следующим ходом
        for (int i = 1; i <= 9; i++)
        {
            if (chisla[i] != 0)
            {
                makeMove(i, 'X');
                if (checkWin('X'))
                {
                    undoMove(i);
                    return i;
                }
                undoMove(i);
            }
        }

        // 3. Занимаем центр (клетка 5), если он свободен
        if (chisla[5] != 0) return 5;

        // 4. Если ничего не подошло — ходим случайно
        int b;
        do
        {
            b = random.nextInt(9) + 1; // Числа строго от 1 до 9
        }
        while (chisla[b] == 0);
        return b;
    }

    // замена громоздкого switch
    private static void makeMove(int cell, char symbol)
    {
        int row = (cell - 1) / 3;
        int col = (cell - 1) % 3;
        ticTac[row][col] = symbol;
        chisla[cell] = 0;
    }

    // Отмена хода (нужна ИИ для просчета вариантов)
    private static void undoMove(int cell)
    {
        int row = (cell - 1) / 3;
        int col = (cell - 1) % 3;
        ticTac[row][col] = '-';
        chisla[cell] = cell;
    }

    // Полная и чистая проверка победы (все 8 линий)
    private static boolean checkWin(char symbol)
    {
        // Горизонтали и вертикали
        for (int i = 0; i < 3; i++)
        {
            if (ticTac[i][0] == symbol && ticTac[i][1] == symbol && ticTac[i][2] == symbol) return true;
            if (ticTac[0][i] == symbol && ticTac[1][i] == symbol && ticTac[2][i] == symbol) return true;
        }
        // Диагонали
        if (ticTac[0][0] == symbol && ticTac[1][1] == symbol && ticTac[2][2] == symbol) return true;
        if (ticTac[2][0] == symbol && ticTac[1][1] == symbol && ticTac[0][2] == symbol) return true;

        return false;
    }
}
