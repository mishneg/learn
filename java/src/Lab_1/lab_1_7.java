/*  Напишите программу, в которой по возрасту определяется год рождения.*/
import java.util.Scanner;

class lab_7
{
    public static void main(String[] args) 
    {
        Scanner In = new Scanner (System.in,"Cp866");

        int год = 2022;
        System.out.printf( "Текуший год: %d", год);
        

        System.out.print( "\nВведите вам возраст: ");
        int месяц = In.nextInt();

        int ответ = год - месяц;

        System.out.printf("Вы родились в %d",ответ );
        In.close();
    }
}