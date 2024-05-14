public class Main {
    public static void main(String[] args) {

        Mahasiswa mahasiswa = new Mahasiswa("Andriyan Maulana", 20, true, "19112004", 3.5, 2);
        mahasiswa.ngerjainTugas();
        mahasiswa.pasrah();
        mahasiswa.mengikutiOrganisasi("HIMAPRODI");

        Resepsionis resepsionis = new Resepsionis("Bambang", 21, true, 108, "Manager", 201);
        resepsionis.melayani();
        resepsionis.melapor();
        resepsionis.presentasi();

        Asprak asprak = new Asprak("Fika", 19, false, "03082004", 3.9, 1);
        asprak.ngasihKomenDIGCR();
        asprak.mengajar("Sistem Operasi Komputer");
        asprak.mengasihTugas();
        asprak.menilaiTugas();

        Dosen dosen = new Dosen("Pak Joy", 45, true, "17831649", 9000000);
        dosen.ikutPenelitian();
        dosen.mengajar("Matematika Komputasi");
        dosen.mengasihTugas();
        dosen.menilaiTugas();

        Civitas mahasiswaUpcast = new Mahasiswa("Dhea", 19, false, "26122004", 3.7, 3);
        mahasiswaUpcast.makanDiKantin("Kantin Ceria");
        mahasiswaUpcast.mainGameComer();
        mahasiswaUpcast.naikLift();

        Civitas resepsionisUpcast = new Resepsionis("Yanto", 40, true, 102, "Penjaga", 3500);
        resepsionisUpcast.makanDiKantin("Kantin Enak");
        resepsionisUpcast.mainGameComer();
        resepsionisUpcast.naikLift();

        Pengajar asprakUpcast = new Asprak("Rendy", 20, true, "1976754290", 3.6, 1);
        asprakUpcast.mengajar("PBO");
        asprakUpcast.mengasihTugas();
        asprakUpcast.menilaiTugas();

        Pengajar dosenUpcast = new Dosen("Bu Prima", 30, false, "987653098", 7900000);
        dosenUpcast.mengajar("Bahasa Indonesia");
        dosenUpcast.mengasihTugas();
        dosenUpcast.menilaiTugas();
    }
}
