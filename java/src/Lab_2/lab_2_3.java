/* 
Напишите программу, которая проверяет, удовлетворяет ли введенное
пользователем число следующим критериям: число делится на 4, и при
этом оно не меньше 10.
*/
import java.util.Scanner;

class lab2_3
{
    public static void main(String[] args) 
    {
        Scanner In = new Scanner (System.in,"Cp866");

        System.out.print( "Введите число: ");
        int число = In.nextInt();

        String ответ = "не подходит под условия";
        if (число % 4 == 0 && число < 10)
        {
        ответ = "число делится на 4, при этом оно не меньше 10";
        }

        System.out.printf("Число %d %s", число, ответ);
        In.close();
    }
}