/*Напишите программу, в которой Пользователь вводит два числа, а  
программой вычисляется и отображается сумма и разность этих чисел.*/
import java.util.Scanner;

class lab_10
{
    public static void main(String[] args) 
    {
        Scanner In = new Scanner (System.in,"Cp866");

        System.out.print( "Введите a: ");
        int a = In.nextInt();

        System.out.print( "Введите b: ");
        int b = In.nextInt();


        System.out.printf("Сумма %d \nРазность %d",a+b,a-b);
        In.close();
    }
    

}