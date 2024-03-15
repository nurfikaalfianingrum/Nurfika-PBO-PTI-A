public class Manusia {
    private String nama;
    private int umur;

    public Manusia(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void sapa(String namaOrang) {
        System.out.println("Halo, " + namaOrang + "! Namaku adalah " + nama + ".");
    }

    public static void main(String[] args) {
        Manusia manusia1 = new Manusia("Nurfika", 20);
        
        String namaManusia1 = manusia1.getNama();
        System.out.println("Nama manusia1: " + namaManusia1);

        int umurManusia1 = manusia1.getUmur();
        System.out.println("Umur manusia1: " + umurManusia1);

        manusia1.setUmur(25);
        umurManusia1 = manusia1.getUmur();
        System.out.println("Umur manusia1 setelah diubah: " + umurManusia1);

        manusia1.sapa("Gais");
    }
}
