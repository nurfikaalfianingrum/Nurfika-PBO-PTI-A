import java.time.LocalDate;

public class Pekerja extends Manusia {
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    public Pekerja(String nama, boolean jenisKelamin, String nik, boolean menikah, double gaji, LocalDate tahunMasuk, int jumlahAnak) {
        super(nama, jenisKelamin, nik, menikah);
        this.gaji = gaji;
        this.tahunMasuk = tahunMasuk;
        this.jumlahAnak = jumlahAnak;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public double getGaji() {
        return gaji;
    }

    public void setTahunMasuk(LocalDate tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }

    public LocalDate getTahunMasuk() {
        return tahunMasuk;
    }

    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    public int getJumlahAnak() {
        return jumlahAnak;
    }

    public double getBonus() {
        LocalDate today = LocalDate.now();
        int lamaKerja = today.getYear() - tahunMasuk.getYear();

        if (lamaKerja >= 0 && lamaKerja <= 5) {
            return 0.05 * gaji;
        } else if (lamaKerja > 5 && lamaKerja <= 10) {
            return 0.10 * gaji;
        } else {
            return 0.15 * gaji;
        }
    }

    public double getTotalGaji() {
        return gaji + getBonus() + (jumlahAnak * 20);
    }

    public String toString() {
        return super.toString() + "\nTahun Masuk: " + tahunMasuk.getYear() + "\nJumlah Anak: " + jumlahAnak + "\nGaji: $" + gaji;
    }
}
