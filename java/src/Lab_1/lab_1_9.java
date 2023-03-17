/*Напишите программу, в которой пользователь вводит число, а программой
отображается последовательность из четырех чисел: число, на единицу
меньше введённого, введенное число и число, на единицу больше введенного.
Четвертое число должно быть квадратом суммы первых трех чисел.*/
import java.util.Scanner;

class lab_9
{
    public static void main(String[] args) 
    {
        Scanner In = new Scanner (System.in,"Cp866");

        System.out.println( "Введите число");
        int a = In.nextInt();

        System.out.printf("Ряд чисел %d, %d, %d, %.0f", a-1, a, a+1, Math.pow(a-1, 2 )+Math.pow(a, 2 )+Math.pow(a+1, 2 ));
        In.close();
    }
}