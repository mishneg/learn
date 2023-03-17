/* Напишите программу, в которой Пользователь последовательно вводит
название текущего дня недели, название месяца и дату (номер дня в месяце).
Программа выводит сообщение о сегодняшней дате (день недели, дата, месяц). */
import java.util.Scanner;

class lab_3
{
    public static void main(String[] args) 
    {
        Scanner In = new Scanner (System.in,"Cp866");

        System.out.print( "Введите название текущего дня недели: ");
        String дня = In.nextLine();

        System.out.print( "Введите название месяца: ");
        String месяц = In.nextLine();

        System.out.print( "Введите дату (номер дня в месяце): ");
        int дата = In.nextInt();

        System.out.print("День недели " + дня + ", "+ "Дата " + дата  + ", "+ "Месяц " + месяц);
        In.close();
    }
}