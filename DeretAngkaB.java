public class DeretAngkaB {
    public static void main(String[] args) {
        int angka_a = 1;
        int angka_b = 2;
        int angka_c = 3;

        int angka_d;

        for (int i = 0; i < 10; i++) {

            if (i == 0) {
                System.out.print(angka_a + " ");
            } else if (i == 1) {
                System.out.print(angka_b + " ");
            } else if (i == 2) {
                System.out.print(angka_c + " ");
            } else {
                angka_d = angka_a + angka_b + angka_c;
                System.out.print(angka_d + " ");

                angka_a = angka_b;
                angka_b = angka_c;
                angka_c = angka_d;
            }
        }
    }
}
