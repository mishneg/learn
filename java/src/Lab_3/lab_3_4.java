/*
Напишите программу, в которой пользователем вводится два целых числа. 
Программа выводит все целые числа — начиная с наименьшего (из двух введенных чисел) и заканчивая наибольшим (из двух введенных чисел). 
Предложите разные версии программы (с использованием разных операторов цикла).
*/

import java.util.Scanner;

class lab3_4
{
    public static void main(String[] args) 
    {
        try (Scanner In = new Scanner (System.in,"Cp866")) {
            System.out.print("Введите первое число: ");
            int число =In.nextInt();

            System.out.print("Введите второе число: ");
            int число2 =In.nextInt();

            System.out.print("Ряд чисел");
            
            while (число2+1!=число)
            {
                System.out.printf(" %d ",число);
                число++;
            }
            
            for (;число2+1!=число;число++)
            {
                System.out.printf(" %d ",число);
            }
            In.close();
        }
    }
}