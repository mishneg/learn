/* 
Напишите программу, в которой пользователь вводит целое число
в диапазоне от 1 до 7, а программа определяет по этому числу день недели.
Если введенное пользователем число выходит за допустимый диапазон,
выводится сообщение о том, что введено некорректное значение. Используйте
оператор выбора switch.
*/
import java.util.Scanner;

class lab2_1
{
    public static void main(String[] args) 
    {
        Scanner In = new Scanner (System.in,"Cp866");

        System.out.print( "Введите число: ");
        int число = In.nextInt();

        String ответ=new String();
        switch(число)
        {
        case 1:
        ответ="Понедельник";
        break;
        case 2:
        ответ="Вторник";
        break;
        case 3:
        ответ="Среда";
        break;
        case 4:
        ответ="Четверг";
        break;
        case 5:
        ответ="Пятница";
        break;
        case 6:
        ответ="Суббота";
        break;
        case 7:
        ответ="Воскресенье";
        break;
        default:
        System.out.print("Некорректное значение ");
        }

        System.out.printf("Число %d %s", число, ответ);
        In.close();
    }
}