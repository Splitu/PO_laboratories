import java.util.Scanner;

public class Zadanie1 {
    public static double avg(int n, int pkt[]) {
        double out = 0;

        int i = 0;
        while (i < n) {
            out = out + pkt[i];
            i++;
        }
        return (out / n);
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n;

        System.out.print("Z ilu osob sklada sie laboratorium?: ");
        n = read.nextInt();

        int pkt[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ilosc punktow dla osoby o indeksie " + i + ": ");
            pkt[i] = read.nextInt();
        }
        System.out.println("Srednia liczba punktow wynosi " + avg(n, pkt));
    }
}