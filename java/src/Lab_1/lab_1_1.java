import java.util.Scanner;

class lab_1
{
    public static void main(String[] args) 
    {
        Scanner In = new Scanner (System.in,"Cp866");

        System.out.print( "Введите фамилию :");
        String Фамилия = In.nextLine();

        System.out.print( "Введите Имя :");
        String Имя = In.nextLine();

        System.out.print( "Введите Отчество :");
        String Отчество = In.nextLine();

        System.out.print("Hallo " + Фамилия +" "+ Имя +" "+ Отчество);
        In.close();
    }
}