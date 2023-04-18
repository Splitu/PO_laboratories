import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 10;
        double[] tab = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.println("t[" + i + "] = ");
            tab[i] = input.nextDouble();
        }
        System.out.println("Wybierz opcje wyswietlania: ");
        System.out.println("1. Wyświetlanie tablicy od pierwszego do ostatniego indeksu.");
        System.out.println("2. Wyświetlanie tablicy od ostatniego do pierwszego indeksu.");
        System.out.println("3. Wyświetlanie elementów o nieparzystych indeksach.");
        System.out.println("4. Wyświetlanie elementów o parzystych indeksach.");
        int x = input.nextInt();

        if(x == 1) {
            for(int i = 0; i < n; i++) {
                System.out.println("tab[" + i + "] = " + tab[i]);
            }
        } else if(x == 2) {
            for (int i = 9; i <= n; i--) {
                System.out.println("tab[" + i + "] = " + tab[i]);
            }
        }
    }
}
