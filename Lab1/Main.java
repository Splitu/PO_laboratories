import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Zad.1:");
        ja();
        System.out.println("Zad.2:");
        obliczenia();
        System.out.println("Zad.3:");
        parzystosc();
        System.out.println("Zad.4:");
        podzielna();
        System.out.println("Zad.5:");
        potega();
        System.out.println("Zad.6:");
        kwadrat();
        System.out.println("Zad.7:");
        System.out.print("Wprowadz 1. bok: ");
        double a = in.nextDouble();
        System.out.print("Wprowadz 2. bok: ");
        double b = in.nextDouble();
        System.out.print("Wprowadz 3. bok: ");
        double c = in.nextDouble();
        System.out.println("Czy z bokow " + a + ", " + b + " oraz " + c + " mozna zbudowac trojkat prostokatny?");
        System.out.println(trojkat(a,b,c));
    }

    public static void ja() {
        String imie = "Bartosz";
        int wiek = 22;

        System.out.println(imie);
        System.out.println(wiek);
    }
    public static void obliczenia() {
        Scanner in = new Scanner(System.in);
        System.out.print("Podaj a: ");
        int a = in.nextInt();
        System.out.print("Podaj b: ");
        int b = in.nextInt();
        System.out.println("a+b=" + (a + b));
        System.out.println("a-b=" + (a - b));
        System.out.println("a*b=" + (a * b));
    }
    public static void parzystosc() {
        Scanner in = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int number = in.nextInt();
        if (number % 2 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
    public static void podzielna() {
        Scanner in = new Scanner(System.in);
        System.out.print("Podaj liczbe: ");
        int number2 = in.nextInt();
        if (number2 % 3 == 0 && number2 % 5 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
    public static void potega() {
        Scanner in = new Scanner(System.in);
        System.out.print("Podaj liczbe: ");
        int number3 = in.nextInt();
        System.out.println(Math.pow(number3,3));
    }
    public static void kwadrat() {
        Scanner in = new Scanner(System.in);
        System.out.print("Podaj liczbe: ");
        int number4 = in.nextInt();
        System.out.println(Math.sqrt(number4));
    }
    public static boolean trojkat(double a, double b, double c) {
        double max, a1, b1;
        if (a > b) {
            if (a > c) {
                a1 = b; b1 = c; max = a;
            } else {
                a1 = a; b1 = b; max = c;
            }
        } else {
            if (b > c) {
                a1 = a; b1 = c; max = b;
            } else {
                a1 = a; b1 = b; max = c;
            }
        }

        return (Math.pow(a1,2) + Math.pow(b1,2) == Math.pow(max,2));
}
}

