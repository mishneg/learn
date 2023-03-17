/* 
Напишите программу, которая проверяет, попадает ли введение
пользователем число в диапазон от 5 до 10 включительно.
*/
import java.util.Scanner;

class lab2_4
{
    public static void main(String[] args) 
    {
        Scanner In = new Scanner (System.in,"Cp866");

        System.out.print( "Введите число: ");
        int число = In.nextInt();

        String ответ = "не подходит под условия";
        if (число >= 5 && число <= 10)
        {
        ответ = "число в диапазон от 5 до 10";
        }

        System.out.printf("Число %d %s", число, ответ);
        In.close();
    }
}