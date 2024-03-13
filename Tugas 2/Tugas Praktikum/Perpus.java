import java.util.*;

class Buku {
    String judul;
    List<String> penulis;

    Buku(String judul, List<String> penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }
}

public class Perpus {
    public static void main(String[] args) {
        Map<String, List<Buku>> koleksiBuku = new HashMap<>();
        koleksiBuku.put("Filsafat", Arrays.asList(
            new Buku("Loving The Wounded Soul", Arrays.asList("Regis Machdy")),
            new Buku("Filosofi Teras", Arrays.asList("Henry Manampiring")),
            new Buku("Rahasia Leluhur Jawa", Arrays.asList("Setyo Hajar Dewantoro")),
            new Buku("Hasrat Jiwa", Arrays.asList("Rene Descartes")),
            new Buku("Politics", Arrays.asList("Aristoteles"))
        ));

        koleksiBuku.put("Fiksi", Arrays.asList(
            new Buku("Bumi Manusia", Arrays.asList("Pramoedya Ananta Toer")),
            new Buku("Laskar Pelangi", Arrays.asList("Andrea Hirata")),
            new Buku("Koala Kumal", Arrays.asList("Raditya Dika")),
            new Buku("Tentang Kamu", Arrays.asList("Tere Liye")),
            new Buku("Ayat-Ayat Cinta", Arrays.asList("Habiburahman"))
        ));

        for (String kategori : koleksiBuku.keySet()) {
            System.out.println("Kategori: " + kategori);
            for (Buku buku : koleksiBuku.get(kategori)) {
                System.out.println("Judul: " + buku.judul);
                System.out.println("Penulis: " + String.join(", ", buku.penulis));
                System.out.println();
            }
            System.out.println();
        }
    }
}
