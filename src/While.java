public class While {


}

public static void main (String[] args)
{
  System.out.println("Купи слона!");

  Scanner scanner = new Scanner(System.in);
  String otvet = scanner.nextLine();
  String soglasie = "Хорошо";
  int count = 1;

  while (otvet.equalsIgnoreCase(soglasie) == false)
  {
      System.out.println("Все говорят " + otvet + " а ты купи!");
      otvet = scanner.nextLine();
      count ++;
  }

  if (count!=1){System.out.println("Вот так бы сразу!");}
  System.out.println("С меня слон, с тебя деньги!");

}