import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        System.out.println("Podaj a, b i c:");
        double a = InDouble();
        double b = InDouble();
        double c = InDouble();
        if(a!=0) RozKw(a,b,c);
        else System.out.println("To nie jest równanie kwadratowe");
    }
    public static double InDouble() {
        Scanner input = new Scanner(System.in);
        double liczba = input.nextDouble();
        return liczba;
    }
    public static void RozKw(double a, double b, double c) {
        double delta = Math.pow(b,2) - (4*a*c);
        if(delta<0) System.out.println("Brak rozwiązań");
        else if (delta == 0) System.out.println("Jedno rozwiązanie: "+ (-b/(2*a)));
        else System.out.println("Dwa rozwiązania x1 = " + (-b - Math.sqrt(delta))/(2*a) + "x2 = " + (-b + Math.sqrt(delta))/(2*a));
    }
}