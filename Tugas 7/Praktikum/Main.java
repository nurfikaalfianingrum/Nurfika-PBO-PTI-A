public class Main {
    public static void main(String[] args) {
        Kue[] kueArray = new Kue[20];

        // Mengisi array dengan berbagai jenis kue
        for (int i = 0; i < 10; i++) {
            kueArray[i] = new KuePesanan("Brownies Pesanan " + (i + 1), 10.0, (i + 1) * 0.5);
        }
        for (int i = 10; i < 20; i++) {
            kueArray[i] = new KueJadi("Donat Jadi " + (i - 9), 15.0, (i - 9) * 2);
        }

        // a. Tampilkan semua kue dan jenis kuenya
        System.out.println("Daftar Kue:");
        for (Kue kue : kueArray) {
            if (kue instanceof KuePesanan) {
                System.out.println("Jenis: Kue Pesanan, " + kue);
            } else if (kue instanceof KueJadi) {
                System.out.println("Jenis: Kue Jadi, " + kue);
            }
        }

        // b. Hitung total harga semua jenis kue
        double totalHargaSemua = 0;
        for (Kue kue : kueArray) {
            totalHargaSemua += kue.hitungHarga();
        }
        System.out.println("\nTotal Harga Semua Kue: " + totalHargaSemua);

        // c. Hitung total harga dan total berat dari KuePesanan
        double totalHargaKuePesanan = 0;
        double totalBeratKuePesanan = 0;
        for (Kue kue : kueArray) {
            if (kue instanceof KuePesanan) {
                totalHargaKuePesanan += kue.hitungHarga();
                totalBeratKuePesanan += ((KuePesanan) kue).getBerat();
            }
        }
        System.out.println("Total Harga Kue Pesanan: " + totalHargaKuePesanan);
        System.out.println("Total Berat Kue Pesanan: " + totalBeratKuePesanan);

        // d. Hitung total harga dan total jumlah dari KueJadi
        double totalHargaKueJadi = 0;
        double totalJumlahKueJadi = 0;
        for (Kue kue : kueArray) {
            if (kue instanceof KueJadi) {
                totalHargaKueJadi += kue.hitungHarga();
                totalJumlahKueJadi += ((KueJadi) kue).getJumlah();
            }
        }
        System.out.println("Total Harga Kue Jadi: " + totalHargaKueJadi);
        System.out.println("Total Jumlah Kue Jadi: " + totalJumlahKueJadi);

        // e. Tampilkan informasi kue dengan harga terbesar
        double hargaTerbesar = Double.MIN_VALUE;
        Kue kueTerbesar = null;
        for (Kue kue : kueArray) {
            if (kue.hitungHarga() > hargaTerbesar) {
                hargaTerbesar = kue.hitungHarga();
                kueTerbesar = kue;
            }
        }
        System.out.println("Informasi Kue dengan Harga Terbesar: " + kueTerbesar);
    }
}
