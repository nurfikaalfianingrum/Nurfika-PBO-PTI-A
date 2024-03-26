public class Kucing {
    private String nama;
    private int umur;

    public Kucing() {
    }

    public Kucing(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public Kucing(String nama) {
        this.nama = nama;
    }

    public Kucing(int umur) {
        this.umur = umur;
    }

    public void makan() {

    }

    public void makan(String makanan) {
    }

    public void tidur() {
    }

    public void tidur(int durasi) {
    }

    public void setNama(String newNama) {
        this.nama = newNama;
    }

    public void setNama(String newNama, String pesan) {
        this.nama = newNama;
        System.out.println(pesan);
    }
    
    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }
    public Class<Kucing> getClassType() {
        return Kucing.class;
    }
}
