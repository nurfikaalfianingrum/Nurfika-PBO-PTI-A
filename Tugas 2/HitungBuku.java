import java.util.Scanner;

public class HitungBuku {
    private int JumlahLembarBuku;
    private int KataTiapHari;

    public HitungBuku(int jumlahLembarBuku, int kataTiapHari) {
        this.JumlahLembarBuku = jumlahLembarBuku;
        this.KataTiapHari = kataTiapHari;
    }

    public int jmlHariYangDihabiskan() {
        int totalKata = JumlahLembarBuku * 100 * 2; 
        int hari = totalKata / KataTiapHari; 
        return hari;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Jumlah Lembar Buku : ");
        int JumlahLembar = input.nextInt();
        System.out.println("Kata Tiap Hari : ");
        int KataTiapHari = input.nextInt();
        int HasilKataTiapHari = KataTiapHari / 2; 
        
        HitungBuku buku = new HitungBuku(JumlahLembar, HasilKataTiapHari);
        int hariMenghabiskan = buku.jmlHariYangDihabiskan();
        
        System.out.println("Mahasiswa A akan menghabiskan buku tulis tersebut dalam waktu " + hariMenghabiskan + " hari");
    }
}
