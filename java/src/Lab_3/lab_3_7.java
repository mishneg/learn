/*
Напишите программу, в которой создается одномерный
символьный массив из 10 элементов. Массив заполняется буквами «через одну», начиная с буквы ' а ': 
то есть массив заполняется буквами ' а ' , ' с ' , ' е ' ,' д ' и так далее. 
Отобразите массив в консольном окне в прямом и обратном порядке. 
Размер массива задается переменной.
*/

import java.util.Scanner;
import java.util.Arrays;

class lab3_7
{
    public static void main(String[] args) 
    {
        Scanner In = new Scanner (System.in,"Cp866");
        System.out.print("Введите размер массива: ");
        int число =In.nextInt();
       
        String[] массива = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".split("");
        String[] ответпрям= new String[число];
        String[] ответобратный= new String[число];

        
        for (int i = 0, j = 0; i < число; i++, j=j+2) {
            ответпрям[i] = массива[j];
            ответобратный[число-1-i] = массива[j];
        }


        System.out.println("Массив в прямом порядке = " + Arrays.toString(ответпрям));

        System.out.println("Массив в обратном порядке " + Arrays.toString(ответобратный));
        In.close();
    }
}