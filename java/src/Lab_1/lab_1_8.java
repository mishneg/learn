/*   Напишите программу для вычисления суммы двух чисел. Оба числа
вводятся пользователем. Для вычисления суммы используйте оператор +.*/
import java.util.Scanner;

class lab_8
{
    public static void main(String[] args) 
    {
        Scanner In = new Scanner (System.in,"Cp866");

        System.out.print( "Введите a: ");
        int a = In.nextInt();

        System.out.print( "Введите b: ");
        int b = In.nextInt();

        int ответ = a+b;

        System.out.printf("Сумма a+b=%d", ответ );
        In.close();
    }
}