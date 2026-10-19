public class KrestikiNoliki {
}

public static void main(String[] args){
    //двумерный массив
    char [][] ticTac = new char[3][3];

    for (int i = 0; i<3; i++)
        for (int j = 0; j<3; j++)
        {
            ticTac [i][j] = '-';
        }

    System.out.println("Играем в крестики-нолики!");

    /*
    for (int i = 0; i<3; i++)
        {
            System.out.println(Arrays.toString(ticTac [i]));
        }
     */

    int a;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ты играешь за крестики! Если хочешь ходить первым нажми 1, если хочешь ходить вторым нажми 0!");
    do {
        a = scanner.nextInt();
        if ((a != 0)&&(a != 1)) {
            System.out.println("1 или 0? ");
        }
    }
    while ((a != 0)&&(a != 1));

    int count = 0;

    int b;
    int [] chisla = new int [10];
    for (int i=1;i<10;i++) {
        chisla [i] = i;}

    char z = '-';

    Random random = new Random();

    do {

    if (a==1){
    System.out.println("Введи цифру от 1 до 9!");
        do{
        b = scanner.nextInt();
        if ((b>9)||(b<1)){System.out.println("Введи цифру от 1 до 9!");b = scanner.nextInt();}
        if (chisla[b]==0) {System.out.println("Ячейка уже занята! Пора выбрать другую!");}
        }
        while (chisla[b]==0);

    switch (b){
        case 1:
            ticTac [0][0] = 'X';
            break;

        case 2:
            ticTac [0][1] = 'X';
            break;

        case 3:
            ticTac [0][2] = 'X';
            break;

        case 4:
            ticTac [1][0] = 'X';
            break;

        case 5:
            ticTac [1][1] = 'X';
            break;

        case 6:
            ticTac [1][2] = 'X';
            break;

        case 7:
            ticTac [2][0] = 'X';
            break;

        case 8:
            ticTac [2][1] = 'X';
            break;

        case 9:
            ticTac [2][2] = 'X';
            break;
    }
    chisla [b] = 0;
    }

    for (int i = 0; i<3; i++)
    {
        System.out.println(Arrays.toString(ticTac [i]));
    }
        count ++;

        if ((ticTac [0][0] == ticTac [0][1] && ticTac [0][0] == ticTac [0][2] && ticTac [0][0] != '-')||
                (ticTac [0][0] == ticTac [1][0] && ticTac [0][0] == ticTac [2][0] && ticTac [0][0] != '-')||
                (ticTac [0][0] == ticTac [1][1] && ticTac [0][0] == ticTac [2][2] && ticTac [0][0] != '-')||
                (ticTac [2][0] == ticTac [1][1] && ticTac [2][0] == ticTac [0][2] && ticTac [0][2] != '-')||
                (ticTac [0][1] == ticTac [1][1] && ticTac [0][1] == ticTac [2][1] && ticTac [0][1] != '-')||
                (ticTac [1][0] == ticTac [1][1] && ticTac [1][0] == ticTac [1][2] && ticTac [1][0] != '-')||
                (ticTac [0][2] == ticTac [1][2] && ticTac [0][2] == ticTac [2][2] && ticTac [0][2] != '-'))
            {z='X'; break;}

    if (count == 5) break;
    a=0;

    System.out.println();

    if (a==0){
        do{
        b = random.nextInt(10)+1;}
            while (chisla[b]==0);

        switch (b){
            case 1:
                ticTac [0][0] = 'O';
                break;

            case 2:
                ticTac [0][1] = 'O';
                break;

            case 3:
                ticTac [0][2] = 'O';
                break;

            case 4:
                ticTac [1][0] = 'O';
                break;

            case 5:
                ticTac [1][1] = 'O';
                break;

            case 6:
                ticTac [1][2] = 'O';
                break;

            case 7:
                ticTac [2][0] = 'O';
                break;

            case 8:
                ticTac [2][1] = 'O';
                break;

            case 9:
                ticTac [2][2] = 'O';
                break;


        }

        chisla [b] = 0;

        for (int i = 0; i<3; i++)
        {
            System.out.println(Arrays.toString(ticTac [i]));
        }
    }
    a=1;

    if ((ticTac [0][0] == ticTac [0][1] && ticTac [0][0] == ticTac [0][2] && ticTac [0][0] != '-')||
        (ticTac [0][0] == ticTac [1][0] && ticTac [0][0] == ticTac [2][0] && ticTac [0][0] != '-')||
        (ticTac [0][0] == ticTac [1][1] && ticTac [0][0] == ticTac [2][2] && ticTac [0][0] != '-')||
        (ticTac [2][0] == ticTac [1][1] && ticTac [2][0] == ticTac [0][2] && ticTac [0][2] != '-')||
        (ticTac [0][1] == ticTac [1][1] && ticTac [0][1] == ticTac [2][1] && ticTac [0][1] != '-')||
        (ticTac [1][0] == ticTac [1][1] && ticTac [1][0] == ticTac [1][2] && ticTac [1][0] != '-')||
        (ticTac [0][2] == ticTac [1][2] && ticTac [0][2] == ticTac [2][2] && ticTac [0][2] != '-'))
    {z = 'O'; break;}

    }
    while (count != 5);

    /*
    (ticTac [0][0] == ticTac [0][1] && ticTac [0][0] == ticTac [0][2])
    (ticTac [0][0] == ticTac [1][0] && ticTac [0][0] == ticTac [2][0])
    (ticTac [0][0] == ticTac [1][1] && ticTac [0][0] == ticTac [2][2])
    (ticTac [2][0] == ticTac [1][1] && ticTac [0][0] == ticTac [2][0])
    (ticTac [0][1] == ticTac [1][1] && ticTac [0][0] == ticTac [2][1])
    (ticTac [1][0] == ticTac [1][1] && ticTac [0][0] == ticTac [1][2])
    (ticTac [0][2] == ticTac [1][2] && ticTac [0][0] == ticTac [2][2])
    */

    if (count == 5){
        System.out.println("Ничья! Попробуй снова!");
    }
    else if (z == 'X')
    {
        System.out.println("Ты выйграл!");
    }
    else System.out.println("Ты проиграл!");
}