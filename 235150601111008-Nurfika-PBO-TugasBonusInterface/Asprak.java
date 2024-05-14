public class Asprak extends Mahasiswa implements Pengajar {
    public Asprak(String nama, int umur, boolean jenisKelamin, String nim, double ipk, int golUkt) {
        super(nama, umur, jenisKelamin, nim, ipk, golUkt);
    }

    public void ngasihKomenDIGCR() {
        System.out.println(nama + " ngasih komen di GCR.");
    }

    @Override
    public void mengajar(String matkul) {
        System.out.println(nama + " mengajar " + matkul);
    }

    @Override
    public void mengasihTugas() {
        System.out.println(nama + " mengasih tugas.");
    }

    @Override
    public void menilaiTugas() {
        System.out.println(nama + " menilai tugas.");
    }
}
