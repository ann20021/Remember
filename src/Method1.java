public class Method1 {

}

public static void main (String[] args)
{
    int [] array1 = {10, 20, 30};
    int [] array2 = {40, 5, -10};

    int sum1 = arraySum(array1);
    int sum2 = arraySum(array2);

    if (sum1>sum2)
    {
        System.out.println("Первый массив больше второго, сумма его элементов = " + sum1);
    }
    else
    {System.out.println("Второй массив больше первого, сумма его элементов = " + sum2);}

}

static int arraySum (int [] array)
{
    int sum = 0;
    for (int i = 0; i<array.length; i++)
    {
        sum = sum + array[i];
    }

    return sum;
}