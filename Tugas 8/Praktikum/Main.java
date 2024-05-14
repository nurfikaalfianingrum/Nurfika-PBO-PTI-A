public class Main {
    public static void main(String[] args) {
        // Membuat objek PegawaiHarian
        PegawaiHarian harian1 = new PegawaiHarian("Fika", "123456789", 15000, 40);
        PegawaiHarian harian2 = new PegawaiHarian("Bambang", "987654321", 18000, 35);
        PegawaiHarian harian3 = new PegawaiHarian("Andriyan", "555555555", 16000, 50);
        
        // Membuat objek PegawaiTetap
        PegawaiTetap tetap1 = new PegawaiTetap("Maulana", "111111111", 5000000);
        PegawaiTetap tetap2 = new PegawaiTetap("Zeze", "222222222", 6000000);
        PegawaiTetap tetap3 = new PegawaiTetap("Siti", "333333333", 5500000);
        
        // Membuat objek Sales
        Sales sales1 = new Sales("Zahra", "444444444", 100, 50000);
        Sales sales2 = new Sales("Nur", "555555555", 200, 45000);
        Sales sales3 = new Sales("Nina", "666666666", 150, 48000);
        
        // Menampilkan informasi dan gaji masing-masing pegawai
        Pegawai[] pegawaiList = {harian1, harian2, harian3, tetap1, tetap2, tetap3, sales1, sales2, sales3};
        
        for (Pegawai pegawai : pegawaiList) {
            System.out.println("===================");
            System.out.println(pegawai);
            System.out.println();
        }
        
        // Demonstrasi upcasting dan downcasting
        Pegawai upcastedPegawai = new Sales("Eko", "777777777", 300, 40000);  // Upcasting
        System.out.println("Upcasted Pegawai:\n" + upcastedPegawai);
        System.out.println();

        if (upcastedPegawai instanceof Sales) {
            Sales downcastedSales = (Sales) upcastedPegawai;  // Downcasting
            System.out.println("Downcasted Sales:\n" + downcastedSales);
            System.out.println("Penjualan: " + downcastedSales.getPenjualan());
            System.out.println("Komisi: " + downcastedSales.getKomisi());
            System.out.println("Gaji: " + downcastedSales.gaji());
            System.out.println();
        }
    }
}
