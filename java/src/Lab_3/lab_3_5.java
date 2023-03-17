/*
Напишите программу, в которой вычисляется сумма чисел, удовлетворяющих таким критериям:
при делении числа на 5 в остатке получается 2, 
или при делении на 3 в остатке получается 1. 
Количество чисел в сумме вводится пользователем. Программа отображает числа, которые суммируются, и значение суммы. 
Предложите версии программы, использующие разные операторы цикла.
*/

import java.util.Scanner;

class lab3_5
{
    public static void main(String[] args) 
    {
        Scanner In = new Scanner (System.in,"Cp866");
        System.out.print("Введите число: ");
        int число =In.nextInt();

        int ответ=0;

        System.out.println("Цикл for");
        
        for (int i = 1;i < число*3;i=i+3)
        
        {
            int сумма= i*5+2;
            System.out.printf("Число %d \n", сумма);
            ответ+=сумма;
        }
        System.out.printf("Ответ %d \n", ответ);

        ответ=0;
        int i=1;
        System.out.println("Цикл while");
        while (число!=0)
        {
            int сумма=i*5+2;
            System.out.printf("Число %d \n", сумма);
            ответ+=сумма;
            i+=3;
            число--; 
        }
        System.out.printf("Ответ %d \n", ответ);
        In.close();
    }
}