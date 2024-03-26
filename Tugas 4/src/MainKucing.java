public class MainKucing {
    public static void main(String[] args) {
        Kucing kucing1 = new Kucing("Millo", 4);

        Kucing kucing2 = new Kucing("Bambang", 3);

        Kucing kucing3 = new Kucing("Molly");

        System.out.println("Informasi awal kucing1:");
        System.out.println("Nama: " + kucing1.getNama());
        System.out.println("Umur: " + kucing1.getUmur());
        System.out.println();

        kucing1.setNama("Millo"); 

        kucing1.makan(); 

        System.out.println("Informasi kucing1 setelah perubahan:");
        System.out.println("Nama: " + kucing1.getNama());
        System.out.println("Umur: " + kucing1.getUmur());
        System.out.println();

        System.out.println("Informasi awal kucing2:");
        System.out.println("Nama: " + kucing2.getNama());
        System.out.println("Umur: " + kucing2.getUmur());
        System.out.println();

        kucing2.makan("Ikan"); 

        System.out.println("Informasi kucing2 setelah memberi makan:");
        System.out.println("Nama: " + kucing2.getNama());
        System.out.println("Umur: " + kucing2.getUmur());
    }
}
