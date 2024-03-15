public class Kucing {
    private String nama;
    private int umur;

    public void makan() {
        System.out.println("Kucing " + nama + " sedang makan.");
    }

    public void tidur() {
        System.out.println("Kucing " + nama + " sedang tidur.");
    }

    public void setNama(String newNama) {
        nama = newNama;
    }


    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }


    public Kucing(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public static void main(String[] args) {
        Kucing kucing1 = new Kucing("Bambang", 3);
        kucing1.makan();
        kucing1.tidur(); 
        kucing1.setNama("Molly");
        kucing1.makan();
    }
}
