public class SwitchCase {

}

public static void main(String[] args){
    System.out.println("Введите день недели");

    Scanner scanner = new Scanner(System.in);
    String dayRU = scanner.nextLine().toLowerCase();
    // Приводим к одному (нижнему) регистру буквы
    String dayENG;
    boolean weekend = false;

    switch (dayRU) {
        case "понедельник":
            dayENG = "Monday";
            break;

        case "вторник":
            dayENG = "Tuesday";
            break;

        case "среда":
            dayENG = "Wednesday";
            break;

        case "четверг":
            dayENG = "Thursday";
            break;

        case "пятница":
            dayENG = "Friday";
            break;

        case "суббота":
            dayENG = "Saturday";
            weekend = true;
            break;

        case "воскресенье":
            dayENG = "Sunday";
            weekend = true;
            break;

        default:
            dayENG = "";
    }

        System.out.println("На английском " + dayRU + " звучит как " + dayENG);
        if (weekend)
            {System.out.println("И это выходной день!");}
            else {System.out.println("И это будний день!");}

}
