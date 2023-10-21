public class LoopingDiDalamLooping {
    public static void main(String[] args) {
        int baris = 3;
        int kolom = 4;
        int awal = 1;

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print((awal + i + j) + " ");
            }
            System.out.println();
        }
    }
}
