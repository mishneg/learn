/* 
Используйте новый метод для расчета гипотенузы. Сделайте вариант метода hyp() с параметрами.
*/
import java.util.Scanner;

class lab_12
{
    
    public static void main(String[] args) 
    {
        Scanner In = new Scanner (System.in,"Cp866");
        System.out.print( "Введите a: ");
        int a = In.nextInt();

        System.out.print( "Введите b: ");
        int b = In.nextInt();
        
        System.out.printf("hypotenuse с= %g",hyp(a, b));
        In.close();
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