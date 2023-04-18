import java.util.Scanner;
public class Zadanie3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Podaj n: ");
        int n = read.nextInt();
        n--;
        int t[] = new int[n];
        int out = 0;
        for (int i = 0; i < n; i++) {
            t[i] = i + 1;
            if (t[i] % 2 == 0)
                out = out + t[i];
        }
        System.out.println("Suma liczb parzystych wynosi: " + out);
    }
}
