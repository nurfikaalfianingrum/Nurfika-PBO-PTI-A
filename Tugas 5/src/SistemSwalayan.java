import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Pelanggan {
    private String nomorPelanggan;
    private String nama;
    private double saldo;
    private int pin;
    private int percobaanAutentikasi;

    public Pelanggan(String nomorPelanggan, String nama, double saldo, int pin) {
        this.nomorPelanggan = nomorPelanggan;
        this.nama = nama;
        this.saldo = saldo;
        this.pin = pin;
        this.percobaanAutentikasi = 0;
    }

    public String getNomorPelanggan() {
        return nomorPelanggan;
    }

    public String getNama() {
        return nama;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean autentikasi(int pinDimasukkan) {
        if (pin == pinDimasukkan) {
            percobaanAutentikasi = 0;
            return true;
        } else {
            percobaanAutentikasi++;
            if (percobaanAutentikasi >= 3) {
                System.out.println("Akun diblokir karena terlalu banyak kesalahan autentikasi.");
                return false;
            } else {
                System.out.println("PIN salah. Silakan coba lagi.");
                return false;
            }
        }
    }

    public void beli(double jumlah) {
        if (saldo - jumlah >= 10000) {
            saldo -= jumlah;
            System.out.println("Pembelian berhasil. Saldo tersisa: " + saldo);
        } else {
            System.out.println("Saldo tidak mencukupi untuk transaksi ini.");
        }
    }

    public void topUp(double jumlah) {
        saldo += jumlah;
        System.out.println("Top-up berhasil. Saldo baru: " + saldo);
    }
}

public class SistemSwalayan {
    private static Map<String, Pelanggan> daftarPelanggan = new HashMap<>();

    public static void main(String[] args) {
        daftarPelanggan.put("3812345678", new Pelanggan("3812345678", "Pika maniezz abiszz", 50000, 1234));
        daftarPelanggan.put("5612345678", new Pelanggan("5612345678", "Dhea cantikkk", 200000, 5678));
        daftarPelanggan.put("7412345678", new Pelanggan("7412345678", "Andriyan ganteng banget", 1000000, 9012));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di Sistem Swalayan!");

        while (true) {
            System.out.print("Masukkan nomor pelanggan Anda: ");
            String nomorPelanggan = scanner.nextLine();
            if (!daftarPelanggan.containsKey(nomorPelanggan)) {
                System.out.println("Nomor pelanggan tidak valid. Silakan coba lagi.");
                continue;
            }

            Pelanggan pelanggan = daftarPelanggan.get(nomorPelanggan);

            System.out.print("Masukkan PIN Anda: ");
            int pinDimasukkan = scanner.nextInt();
            scanner.nextLine(); 

            if (pelanggan.autentikasi(pinDimasukkan)) {
                System.out.println("Autentikasi berhasil. Selamat datang, " + pelanggan.getNama() + "!");
                while (true) {
                    System.out.println("1. Beli");
                    System.out.println("2. Top-up");
                    System.out.println("3. Keluar");
                    System.out.print("Pilih opsi: ");
                    int opsi = scanner.nextInt();
                    scanner.nextLine(); 
                    if (opsi == 1) {
                        System.out.print("Masukkan jumlah pembelian: ");
                        double jumlahPembelian = scanner.nextDouble();
                        scanner.nextLine(); 
                        pelanggan.beli(jumlahPembelian);
                    } else if (opsi == 2) {
                        System.out.print("Masukkan jumlah top-up: ");
                        double jumlahTopUp = scanner.nextDouble();
                        scanner.nextLine(); 
                        pelanggan.topUp(jumlahTopUp);
                    } else if (opsi == 3) {
                        System.out.println("Terima kasih ya sudah menggunakan Sistem Swalayan. Selamat tinggal dan Selamat datang kembali!");
                        break;
                    } else {
                        System.out.println("Opsi tidak valid. Silakan coba lagi.");
                    }
                }
                break;
            } else {
                System.out.println("Autentikasi gagal. Silakan coba lagi.");
            }
        }

        scanner.close();
    }
}
