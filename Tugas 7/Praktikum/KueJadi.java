class KueJadi extends Kue {
    private int jumlah;

    public KueJadi(String nama, double harga, int jumlah) {
        super(nama, harga);
        this.jumlah = jumlah;
    }

    public int getJumlah() {
        return jumlah;
    }

    @Override
    public double hitungHarga() {
        // Harga kue jadi dihitung berdasarkan jumlah
        return harga * jumlah * 2;
    }

    @Override
    public String toString() {
        return super.toString() + ", Jumlah: " + jumlah;
    }
}
