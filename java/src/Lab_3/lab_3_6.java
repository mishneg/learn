/*
Напишите программу, в которой создается одномерный числовой
массив и заполняется числами, которые при делении на 5 дают в остатке 2
(числа 2, 7,12,17 и так далее). Размер массива вводится пользователем.
Предусмотреть обработку ошибки, связанной с вводом некорректного
значения.
*/

import java.util.Scanner;

class lab3_6
{
    public static void main(String[] args) 
    {
        Scanner In = new Scanner (System.in,"Cp866");
        System.out.print("Введите число: ");
        int число =In.nextInt();
        if (число % 1 != 0)
        {
        System.out.println("Число не целое");
        extracted();
        };
        int[] массив= new int[число];
        int ответ=0;

        int j=0;
        for (int i = 1;i < число*3;i=i+3)
        {
            int сумма= i*5+2;
            System.out.printf("Число %d \n", сумма);
            массив[j]=сумма;
            j+=1;
            ответ+=сумма;
        }
        
        System.out.printf("Ответ %d \n", ответ);
        In.close();

    }

    private static void extracted() {
    }
}