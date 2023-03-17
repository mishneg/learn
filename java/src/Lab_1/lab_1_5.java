/* Напишите программу, в которой по году рождения определяется возраст
пользователя.*/
import java.util.Scanner;

class lab_5
{
    public static void main(String[] args) 
    {
        Scanner In = new Scanner (System.in,"Cp866");

        int год = 2022;
        System.out.printf( "Текуший год: %d", год);

        System.out.print( "\nВведите год рождения: ");
        int месяц = In.nextInt();

        int ответ = год - месяц;

        System.out.printf("Вам лет: %d", ответ);
        In.close();
    }
}