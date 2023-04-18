import java.util.Scanner;

public class Zadanie2 {
    public static int countPlus(double t[]) {
        int out = 0;
        for (int i = 0; i < t.length; i++)
            if (t[i] > 0)
                out++;
        return out;
    }

    public static int countMinus(double t[]) {
        int out = 0;
        for (int i = 0; i < t.length; i++)
            if (t[i] < 0)
                out++;
        return out;
    }

    public static double sumPlus(double t[]) {
        double out = 0;
        for (int i = 0; i < t.length; i++)
            if (t[i] > 0)
                out = out + t[i];
        return out;
    }

    public static double sumMinus(double t[]) {
        double out = 0;
        for (int i = 0; i < t.length; i++)
            if (t[i] < 0)
                out = out + t[i];
        return out;
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double t[] = new double[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("t[" + i + "] = ");
            t[i] = read.nextDouble();
        }
        System.out.println("Ilosc liczb dodatnich: " + countPlus(t));
        System.out.println("Ilosc liczb ujemnych: " + countMinus(t));
        System.out.println("Suma liczb dodatnich: " + sumPlus(t));
        System.out.println("Suma liczb ujemnych: " + sumMinus(t));
    }
}