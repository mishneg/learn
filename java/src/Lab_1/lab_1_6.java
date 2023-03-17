/* Напишите программу, в которой Пользователь вводит имя и год рождения,
в программа отображает сообщение содержащее имя пользователя и его
возраст..*/
import java.util.Scanner;

class lab_6
{
    public static void main(String[] args) 
    {
        Scanner In = new Scanner (System.in,"Cp866");

        int год = 2022;
        System.out.printf( "Текуший год: %d", год);
        
        System.out.print( "\nВведите Имя: ");
        String Имя = In.nextLine();

        System.out.print( "Введите год рождения: ");
        int месяц = In.nextInt();

        int ответ = год - месяц;

        System.out.printf("%s вам лет %d",Имя ,ответ );
        In.close();
    }
}