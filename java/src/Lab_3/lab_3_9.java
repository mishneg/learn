/*
Напишите программу, в которой создается массив п заполняется
случайными числами. Массив отображается в консольном окне. В этом
массиве необходимо определить элемент с минимальным значением. В
частности, программа должна вывести значение элемента с минимальным
значением и индекс этого элемента. Если элементов с минимальным
значением несколько, должны быть выведены индексы всех этих элементов.
*/

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

class lab3_9
{
    public static void main(String[] args) 
    {
        Scanner In = new Scanner (System.in,"Cp866");
        System.out.print("Введите размер массива: ");
        int число =In.nextInt();

        Integer[] массив = new Integer[число];
        Random рандом = new Random();
        Integer[][] массив_полный = new Integer[число][2];
        
        System.out.println("Размер массива = "+число);
        
        
    }
}