package Gaji;

import java.util.Scanner;

public class KaryawanKontrak extends Karyawan{
    private int jumlahAnak; 
    
    public KaryawanKontrak(){

    }
    
    public KaryawanKontrak(String nama, String nip, int jumlahAnak){
        super(nama, nip);
        this.jumlahAnak = jumlahAnak;
    }


    public String getTipeKaryawan(){
        return "Karyawan Kontrak";
    }
    
    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    public int getJumlahAnak() {
        return jumlahAnak;
    }

    public int hitungGajiTotal() {
        if (jumlahAnak >= 1 && jumlahAnak <= 2) {
            return super.getGajiPokok() + 50000;
        } else if (jumlahAnak > 2) {
            return super.getGajiPokok() + 100000;
        }
        return getGajiPokok();
    }

    public void tampilkanData(){
        System.out.println("---- Data Karyawan ----");
        System.out.println("Nama  : " + this.nama);
        System.out.println("Nip   : " + this.nip);
        System.out.println("Gaji pokok  : " + getGajiPokok());
        System.out.println("Tipe Karyawan   : " + getTipeKaryawan());
        System.out.println("Jumlah Anak : " + this.jumlahAnak);
        System.out.println("Total Gaji: " + hitungGajiTotal());
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
        System.out.println("Tipe Karyawan   : " + getTipeKaryawan());
        System.out.print("Jumlah Anak : ");
        this.jumlahAnak = inputScanner.nextInt();
        System.out.println("Total Gaji: " + hitungGajiTotal());
        System.out.println();

    }
}
