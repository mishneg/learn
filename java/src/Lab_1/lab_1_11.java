/*Добавьте в пример расчета гипотенузы (см. раздел 2) метод, вычисляющий a^b (а в степини b)
Используйте для этого функции расчета натурального логарифма и экспоненты (y=exp(b*log(a));
*/
import java.util.Scanner;

class lab_11
{
    
    public static void main(String[] args) 
    {
        
        double a =10.0, b=4.0;
        System.out.printf("hypotenuse с= %g",hyp(a, b));
    }

    public static double hyp(double x, double y) {
        // С использование логарифма
        return Math.sqrt(exponent(x, 2)) + Math.sqrt(exponent(y, 2));
        // Обчыный рассчет
        //return Math.sqrt(pow(x, 2)) + Math.sqrt(pow(y, 2));
    }

    private static double exponent(double x, double y) {
        return Math.exp(y*Math.log(x));
    }
    private static double pow(double x, double y) {
        return Math.pow(x, y);
    }
}