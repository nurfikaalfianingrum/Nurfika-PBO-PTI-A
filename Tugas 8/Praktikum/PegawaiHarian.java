public class PegawaiHarian extends Pegawai {
    private double upahPerJam;
    private int totalJam;
    
    public PegawaiHarian(String nama, String noKTP, double upahPerJam, int totalJam) {
        super(nama, noKTP);
        this.upahPerJam = upahPerJam;
        this.totalJam = totalJam;
    }

    public double getUpahPerJam() {
        return upahPerJam;
    }
    
    public int getTotalJam() {
        return totalJam;
    }
    
    public void setUpahPerJam(double upahPerJam) {
        this.upahPerJam = upahPerJam;
    }
    
    public void setTotalJam(int totalJam) {
        this.totalJam = totalJam;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Upah Per Jam: " + upahPerJam + ", Total Jam: " + totalJam;
    }
    
    @Override
    public double gaji() {
        return upahPerJam * totalJam;
    }
}
