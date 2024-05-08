class KuePesanan extends Kue {
    private double berat;

    public KuePesanan(String nama, double harga, double berat) {
        super(nama, harga);
        this.berat = berat;
    }

    public double getBerat() {
        return berat;
    }

    @Override
    public double hitungHarga() {
        // Harga kue pesanan dihitung berdasarkan berat
        return harga * berat;
    }

    @Override
    public String toString() {
        return super.toString() + ", Berat: " + berat;
    }
}
