package Gaji;

import java.util.Scanner;

public class Karyawan {
    protected String nama;
    protected String nip;
    protected int gajiPokok = 2000000;
    
    public Karyawan(){

    }
    
    public Karyawan(String nama, String nip){
        this.nama = nama;
        this.nip = nip;
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

    public void tampilkanData(){
        System.out.println("---- Data Karyawan ----");
        System.out.println("Nama  : " + this.nama);
        System.out.println("Nip   : " + this.nip);
        System.out.println("Gaji pokok  : " + getGajiPokok());
        System.out.println();

    }
    public void input() {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("---- Data Karyawan ----");
        System.out.print("Nama  : ");
        this.nama = inputScanner.next();
        System.out.print("Nip   : ");
        this.nip = inputScanner.next();
        System.out.println("Gaji pokok  : " + getGajiPokok());
        System.out.println();
    }

}
