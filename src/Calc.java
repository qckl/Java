
import java.util.Scanner;
import java.lang.String;




public class Calc {
    public static void main (String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите два числа");
        System.out.print("Первое число=");
        double a = in.nextDouble();
        System.out.print("Второе число=");
        double b = in.nextDouble ();
        double result = 0;
        System.out.println ("Summa:");
        System.out.println(result=a+b);

        System.out.println ("Vichitanie:");
        System.out.println(result=a-b);

        System.out.println ("Umnojenie:");
        System.out.println(result=a*b);

        System.out.println ("Delenie:");
        System.out.println(result=a/b);

    }
}
