package Gaji;

public class Karyawan {
    protected String nama;
    protected String nip;
    protected int gajiPokok;

    public Karyawan(){
    }
    
    public Karyawan(String nama, String nip){
        this.nama = nama;
        this.nip = nip;
        this.gajiPokok = 2000000;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNip(String nip){
        this.nip = nip;
    }

    public String getNip() {
        return nip;
    }

    public void setGajiPokok(int gajiPokok){
        this.gajiPokok = gajiPokok;
    }
    
    public int getGajiPokok() {
        return gajiPokok;
    }

    public int hitungGajiTotal() {
        return gajiPokok;
    }

    public void input() {

    }

}
