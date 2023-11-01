package Gaji;

import java.util.Scanner;

public class KaryawanKontrak extends Karyawan{
    private int jumlahAnak; 
    
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

    public void input() {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("---- Data Karyawan ----");
        System.out.print("Nama  : ");
        nama = inputScanner.next();
        System.out.print("Nip   : ");
        nip = inputScanner.next();
        System.out.println("Gaji pokok  : " + getGajiPokok());
        System.out.println("Tipe Karyawan   : " + getTipeKaryawan());
        System.out.print("Jumlah Anak : ");
        jumlahAnak = inputScanner.nextInt();
        System.out.println("Total Gaji: " + hitungGajiTotal());
    }
}
