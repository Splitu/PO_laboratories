import java.util.Random;
import java.util.Scanner;
public class Zadanie4 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Podaj n: ");
        int n = read.nextInt();
        int t[] = new int[n];
        int out = 0;
        for (int i = 0; i < n; i++) {
            t[i] = rand.nextInt(56)-10;
            if (t[i]%2==0)
                out = out + t[i];
        }
        System.out.println("Suma liczb parzystych wynosi: " + out);

    }
}