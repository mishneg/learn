/*
Сделайте вариант вычисление ab с помощью встроенного метода (искать в Math).
*/
import java.util.Scanner;

class lab_13
{
    
    public static void main(String[] args) 
    {
        
        double a =10.0, b=4.0;
        System.out.printf("hypotenuse с= %g",hyp(a, b));
    }

    public static double hyp(double x, double y) {
        // С использование логарифма
        //return Math.sqrt(exponent(x, 2)) + Math.sqrt(exponent(y, 2));
        // Обчыный рассчет
        return Math.sqrt(Math.pow(x, 2)) + Math.sqrt(Math.pow(y, 2));
    }

    private static double exponent(double x, double y) {
        return Math.exp(y*Math.log(x));
    }

}