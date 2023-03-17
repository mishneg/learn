/*
Напишите программу, в которой создается символьный массив из 10 элементов.  
Массив заполнить большими (прописными) буквами английского алфавита. 
Буквы берутся подряд, но только согласные (то есть гласные буквы ’ А ' ,  Е ' и ' I ' 
при присваивании значений элементам массива нужно пропустить). 
Отобразите содержимое созданного массива в консольном окне.
*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class lab3_8
{
    public static void main(String[] args) 
    {
        int число = 10; 
       

                String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
                str = str.toUpperCase();
        
                Pattern шаблон = Pattern.compile("[AEIOU]");
                Matcher сопоставитель = шаблон.matcher(str);
                String ряд = сопоставитель.replaceAll("");
                String[] массив = ряд.split("");
        
                for (int i = 0; i != число; i ++) {
                    System.out.print(массив[i]+" ");
                }
                
            
        
        
    }
}