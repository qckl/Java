import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) throws InterruptedException {

        int t;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите S=");
        int s = in.nextInt();
        System.out.print("Введите V=");
        int v = in.nextInt();
        t=s/v;
        System.out.println("t=" + t);
        String q = ".";


        if (s<=100) {
            for (int i = 0; i<=s; i++){
                Thread.sleep (2000);
                System.out.print("\b");
                System.out.print(" "+ q);
            }
            }
        else if (s>100){
            System.out.println("Извините, но данное расстояние превышает допустимое значение для его рациональной отрисовки в консоли =)");

        }
        }



    }



