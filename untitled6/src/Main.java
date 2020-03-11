import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        int t;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите S=");
        int s = in.nextInt();
        System.out.print("Введите V=");
        int v = in.nextInt();
        t=s/v;
        System.out.println("t=" + t);
        if (s<=100) {
            for (int i = 0; i<=400; i++){
                System.out.print(".");
            }
            }
        else if (s>100){
            System.out.println("Извините, но данное расстояние превышает допустимое значение для его рациональной отрисовки в консоли =)");

        }
        }



    }



