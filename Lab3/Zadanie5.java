public class Zadanie5 {
    public static boolean isPalindrome(String t) {
        int i = 0;
        int j = t.length()-1;
        while (i != j || i < j) {
            if (t.charAt(i) != t.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String txt = "kajak";
        System.out.printf("Czy slowo " + txt + " jest palindromem? " + (isPalindrome(txt) ? "Jest palindromem" : "Nie jest palindromem"));
    }
}