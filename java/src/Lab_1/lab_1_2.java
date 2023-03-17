/* Напишите программу, в которой Пользователь вводит имя и возраст.
Программа отображает сообщение об имени и возрасте пользователя. */
import java.util.Scanner;

class lab_2
{
    public static void main(String[] args) 
    {
        Scanner In = new Scanner (System.in,"Cp866");

        System.out.print( "Введите Имя: ");
        String Имя = In.nextLine();

        System.out.print( "Введите Возраст: ");
        int Возраст = In.nextInt();

        System.out.print("Имя " + Имя + "\n"+ "Возраст " + Возраст);
        In.close();
    }
}