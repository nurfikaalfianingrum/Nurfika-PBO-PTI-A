public class Resepsionis extends Civitas {
    private int AdResepsionis;
    private String Jabatan;
    private double gaji;

    public Resepsionis(String nama, int umur, boolean jenisKelamin, int AdResepsionis, String Jabatan, double gaji) {
        super(nama, umur, jenisKelamin);
        this.AdResepsionis = AdResepsionis;
        this.Jabatan = Jabatan;
        this.gaji = gaji;
    }

    public void melayani() {
        System.out.println(nama + " melayani.");
    }

    public void melapor() {
        System.out.println(nama + " melapor.");
    }

    public void presentasi() {
    }
    
}
