import java.util.Scanner;

public class Zadanie7 {
    public static void menu(){
        System.out.println("Wybierz rodzaj sortowania:");
        System.out.println("1. Sortowanie bąbelkowe.");
        System.out.println("2. Sortowanie przez wstawianie.");
    }
    public static void b_sort(int[] tab, int n) {
        int temp;
        int zmiana = 1;
        while (zmiana > 0) {
            zmiana = 0;
            for (int i = 0; i < n - 1; i++) {
                if (tab[i] > tab[i + 1]) {
                    temp = tab[i + 1];
                    tab[i + 1] = tab[i];
                    tab[i] = temp;
                    zmiana++;
                }
            }
        }
        for (int i = 0; i < n; i++)
            System.out.println("t[" + i + "] = " + tab[i]);
    }

    public static void insertionsort(int[] tablica, int ile_liczb) {
        int i, j, v;

        for (i = 1; i < ile_liczb; i++) {
            j = i;
            v = tablica[i];
            while ((j > 0) && (tablica[j - 1] > v)) {
                tablica[j] = tablica[j - 1];
                j--;
            }
            tablica[j] = v;
        }
        for (int k = 0; k < tablica.length; k++)
            System.out.println("t[" + k + "] = " + tablica[k]);

    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Podaj ile liczb chcesz wprowadzic: ");
        int n = read.nextInt();
        int[] t = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("t[" + i + "] = ");
            t[i] = read.nextInt();
        }

        menu();
        int x = read.nextInt();
        if (x == 1) b_sort(t, n);
        else if (x == 2) insertionsort(t, n);
    }
}