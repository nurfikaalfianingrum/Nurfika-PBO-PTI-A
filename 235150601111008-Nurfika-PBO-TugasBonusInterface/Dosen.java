public class Dosen extends Civitas implements Pengajar {
    private String nip;
    private double gaji;

    public Dosen(String nama, int umur, boolean jenisKelamin, String nip, double gaji) {
        super(nama, umur, jenisKelamin);
        this.nip = nip;
        this.gaji = gaji;
    }

    public void ikutPenelitian() {
        System.out.println(nama + " ikut penelitian.");
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
