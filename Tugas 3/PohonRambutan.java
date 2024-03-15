public class PohonRambutan {
    private int umur;
    private float tinggi;

    public PohonRambutan(int umur, float tinggi) {
        this.umur = umur;
        this.tinggi = tinggi;
    }

    public void tumbuh() {
        umur++;
        tinggi += 0.5f; 
        System.out.println("Pohon rambutan bertambah umur dan tinggi.");
    }

    public void berbuah() {
        System.out.println("Pohon rambutan sedang berbuah.");
    }

    public void setTinggi(float tinggi) {
        this.tinggi = tinggi;
        System.out.println("Tinggi pohon rambutan diatur menjadi: " + tinggi);
    }

    public int getUmur() {
        return umur;
    }

    public float getTinggi() {
        return tinggi;
    }

    public static void main(String[] args) {
    
        PohonRambutan pohon = new PohonRambutan(5, 3.5f);
        System.out.println("Umur pohon rambutan: " + pohon.getUmur());
        System.out.println("Tinggi pohon rambutan: " + pohon.getTinggi());

        pohon.tumbuh();
        System.out.println("Umur pohon rambutan setelah tumbuh: " + pohon.getUmur());
        System.out.println("Tinggi pohon rambutan setelah tumbuh: " + pohon.getTinggi());

        pohon.berbuah();
        
        pohon.setTinggi(4.2f);
        System.out.println("Tinggi pohon rambutan setelah diatur: " + pohon.getTinggi());
    }
}
