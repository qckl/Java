import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

         double d;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите a=");
        double a = in.nextDouble();
        System.out.print("Введите b=");
        double b = in.nextDouble();
        System.out.print("Введите c=");
        double c = in.nextDouble();
        d = Math.pow(b,2) - 4 * a * c;
        if (d < 0) {
            System.out.println("Корней нет");
        }
         else if (d==0){
            System.out.println( d=-b/2*a);
        }
         else {
             double x1,x2;

             x1=(-b- Math.sqrt(d))/(2*a);
             x2=(-b + Math.sqrt(d))/(2*a);
            System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);

        }


        }
    }

