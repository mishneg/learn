/* Напишите программу, в которой пользователю предлагается ввести
название месяца и количество дней в этом месяце. Программа выводит
сообщение о том, что соответствующий месяц содержит указанное количество
дней.*/
import java.util.Scanner;

class lab_4
{
    public static void main(String[] args) 
    {
        Scanner In = new Scanner (System.in,"Cp866");

        System.out.print( "Введите название месяца: ");
        String месяц = In.nextLine();

        System.out.print( "Введите количество дней: ");
        String дня = In.nextLine();

        System.out.print("Месяц " + месяц + " содержит дней " + дня);
        In.close();
    }
}