import java.util.Scanner;

public class Zadanie4 {
    public static void menu() {
        System.out.println("Wybierz opcje wyswietlania: ");
        System.out.println("1. oblicz sumę elementów tablicy");
        System.out.println("2. oblicz iloczyn elementów tablicy");
        System.out.println("3. wyznacz wartość średnią");
        System.out.println("4. wyznacz wartość minimalną");
        System.out.println("5. wyznacz wartość maksymalną");
    }

    public static void operation(double[] t, int x, int n) {
        switch (x) {
            case 1 -> {
                double s = 0;
                for (int i = 0; i < n; i++)
                    s = s + t[i];
                System.out.println("Suma elementów tablicy wynosi: " + s);
            }
            case 2 -> {
                double il = t[0];
                for (int i = 1; i < n; i++)
                    il = il * t[i];
                System.out.println("Iloczyn elementów tablicy wynosi: " + il);
            }
            case 3 -> {
                double sum = 0;
                for (int i = 0; i < n; i++)
                    sum = sum + t[i];
                System.out.println("Srednia wartosc elementów tablicy wynosi: " + (sum / n));
            }
            case 4 -> {
                double min = t[0];
                for (int i = 1; i < n; i++)
                    if (t[i] < min)
                        min = t[i];
                System.out.println("Wartosc minimalna to: " + min);
            }
            case 5 -> {
                double max = t[0];
                for (int i = 1; i < n; i++)
                    if (t[i] > max)
                        max = t[i];
                System.out.println("Wartosc maksymalna to: " + max);
            }
            default -> {
            }
        }
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = 10;
        double[] t = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("t[" + i + "] = ");
            t[i] = read.nextDouble();
        }
        menu();
        int x = read.nextInt();
        operation(t, x, n);
    }
}