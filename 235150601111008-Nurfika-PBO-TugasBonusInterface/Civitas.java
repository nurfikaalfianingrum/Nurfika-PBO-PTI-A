public abstract class Civitas {
    protected String nama;
    protected int umur;
    protected boolean jenisKelamin;

    public Civitas(String nama, int umur, boolean jenisKelamin) {
        this.nama = nama;
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;
    }

    public void makanDiKantin(String kantin) {
        System.out.println(nama + " makan di kantin " + kantin);
    }

    public void mainGameComer() {
        System.out.println(nama + " main game di Comer");
    }

    public void naikLift() {
        System.out.println(nama + " naik lift");
    }
}
