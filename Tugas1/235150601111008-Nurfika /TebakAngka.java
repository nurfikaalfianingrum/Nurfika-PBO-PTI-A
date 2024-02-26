import java.util.Random;
import java.util.Scanner;

public class TebakAngka {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("=== Game Tebak Angka ===");

        int maksimalAngka = 50;
        int angkaTertebak = random.nextInt(maksimalAngka) + 1;
        int tebakanPemain = 3;
        int jumlahTebakan = 0;

        while (tebakanPemain != angkaTertebak) {
            System.out.print("Masukkan tebakan Anda (1-" + maksimalAngka + "): ");
            tebakanPemain = scanner.nextInt();
            jumlahTebakan++;

            if (tebakanPemain < angkaTertebak) {
                System.out.println("Tebakan terlalu rendah. Coba lagi!");
            } else if (tebakanPemain > angkaTertebak) {
                System.out.println("Tebakan terlalu tinggi. Coba lagi!");
            } else {
                System.out.println("Selamat! Anda berhasil menebak angka " + angkaTertebak +
                                   " dalam " + jumlahTebakan + " tebakan.");
            }
        }

        scanner.close();
    }
    // Metode untuk mengambil tebakan dari pengguna
    private static int ambilTebakan(Scanner scanner, int maksimalAngka) {
        int tebakan;
        do {
            System.out.print("Masukkan tebakan Anda (1-" + maksimalAngka + "): ");
            tebakan = scanner.nextInt();
        } while (tebakan < 1 || tebakan > maksimalAngka);
        return tebakan;
    }
}
