import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        while (true){
            System.out.print("Podaj liczbe calkowita: ");
            int x = read.nextInt();
            if (x <0) break;
        }
    }
}
