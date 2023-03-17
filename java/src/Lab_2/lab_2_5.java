/* 
Напишите программу, которая проверяет, сколько тысяч во введенном
пользователем числе (определяется четвертая цифра справа в десятичном
представлении числа).
*/
import java.util.Scanner;

class lab2_5
{
    public static void main(String[] args) 
    {
        Scanner In = new Scanner (System.in,"Cp866");

        System.out.print( "Введите число: ");
        int число = In.nextInt();

  
        int ответ = число / 1000;
        if (ответ >= 1)
        {
        System.out.printf("Число %d содержит %d тысяч", число, ответ);
        In.close();
        return;
        }

        System.out.printf("Вы ввели %s, число не меньше тысячи", число);
        In.close();
    }
}