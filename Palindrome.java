import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        while (true){

            Scanner inputan = new Scanner(System.in);
            System.out.print("Masukkan kata: ");
            String kata = inputan.nextLine();

            kata = kata.toLowerCase();
            int panjang = kata.length();
            boolean Palindrome = true;

            for (int i = 0; i < panjang / 2; i++) {
                if (kata.charAt(i) != kata.charAt(panjang - 1 - i)) {
                    Palindrome = false;
                    break;
                }
            }

            if (Palindrome) {
                System.out.println(kata + " adalah palindrom");
            } else {
                System.out.println(kata + " bukan palindrom");
            }
        }
    }
}
