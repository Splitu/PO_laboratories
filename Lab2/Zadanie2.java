import java.awt.*;
import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Run();
    }
    public static void Menu() {
        System.out.println("\n\t\t\t====================");
        System.out.println("\t\t\t==== Kalkulator ====");
        System.out.println("\t\t\t====================");
        System.out.println("\t\t\t1. Suma" +
                "\n\t\t\t2. Różnica" +
                "\n\t\t\t3. Iloczyn" +
                "\n\t\t\t4. Iloraz" +
                "\n\t\t\t5. Potęga" +
                "\n\t\t\t6. Pierwiastek" +
                "\n\t\t\t7. Funkcje trygonometryczne (sin, cos, tg, ctg)" +
                "\n\t\t\t8. Wyjście");
        System.out.println("\t\t\t-----------------------------------------------");
        System.out.println("\t\t\tWybierz operację:");
    }

    public static void Run() {
        int wybor;
        while(true) {
            Menu();
            wybor=InputInt();
            switch (wybor) {
                case 1:
                    Suma();
                    break;
                case 2:
                    Roznica();
                    break;
                case 3:
                    Iloczyn();
                    break;
                case 4:
                    Iloraz();
                    break;
                case 5:
                    Potega();
                    break;
                case 6:
                    Pierwiastek();
                    break;
                case 7:
                    FunTryg();
                    break;
                case 8:
                    Close();
                    break;
                default:
                    Error();
                    break;
            }
        }//koniec while
    }
    public static void Error() {
        System.out.println("Błędne dane, koniec programu");
        System.exit(0);
    }
    public static int InputInt() {
        Scanner input = new Scanner(System.in);
        int liczba = input.nextInt();
        return liczba;
    }
    public static void Close() {
        System.out.println("\t\t\tCzy na pewno chcesz wyjść t || T");
        String znak = InputString();
        String st1 = "t";
        String st2 = "T";
        if(znak.equals(st1) || znak.equals(st2)) System.exit(0);
    }

    public static String InputString() {
        Scanner input = new Scanner(System.in);
        String znak = input.nextLine();
        return znak;
    }
    public static void Suma() {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj a: ");
        double a = input.nextDouble();
        System.out.println("Podaj b: ");
        double b = input.nextDouble();
        System.out.println(a + " + " + b + " = " + (a+b));
    }
    public static void Roznica() {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj a: ");
        double a = input.nextDouble();
        System.out.println("Podaj b: ");
        double b = input.nextDouble();
        System.out.println(a + " - " + b + " = " + (a-b));
    }
    public static void Iloczyn() {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj a: ");
        double a = input.nextDouble();
        System.out.println("Podaj b: ");
        double b = input.nextDouble();
        System.out.println(a + " * " + b + " = " + (a*b));
    }
    public static void Iloraz() {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj a: ");
        double a = input.nextDouble();
        System.out.println("Podaj b: ");
        double b = input.nextDouble();
        System.out.println(a + " / " + b + " = " + (a/b));
    }
    public static void Potega() {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        double a = input.nextDouble();
        System.out.println("Podaj potęgę: ");
        double b = input.nextDouble();
        System.out.println(a + " ^ " + b + " = " + Math.pow(a,b));
    }
    public static void Pierwiastek() {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        double a = input.nextDouble();
        System.out.println("Pierwiastek z " + a + " = " + Math.sqrt(a));
    }
    public static void FunTryg() {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        double a = input.nextDouble();
        System.out.println("sin(a) = " + Math.sin(a));
        System.out.println("cos(a) = " + Math.cos(a));
        System.out.println("tg(a) = " + Math.tan(a));
    }
}
