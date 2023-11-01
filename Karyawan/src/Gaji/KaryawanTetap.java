package Gaji;

import java.util.Scanner;

public class KaryawanTetap extends Karyawan {
    private int jumlahAnak; 

    public KaryawanTetap(String nama, String nip, int jumlahAnak){
        super(nama, nip);
        this.jumlahAnak = jumlahAnak;
    }

    public String getTipeKaryawan(){
        return "Karyawan Tetap";
    }
    
    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    public int getJumlahAnak() {
        return jumlahAnak;
    }
    
    public int getGajiTambahan(){
        return 1000000;
    }

    public int hitungGajiTotal() {
        int gajiTotal = super.hitungGajiTotal();
        gajiTotal += getGajiTambahan();
        if (jumlahAnak >= 1 && jumlahAnak <= 2) {
            gajiTotal += 200000;
        } else if (jumlahAnak > 2) {
            gajiTotal += 300000;
        }
        return gajiTotal;
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
        System.out.println("Gaji tambahan   : " + getGajiTambahan());
        System.out.println("Total Gaji: " + hitungGajiTotal());
    }
}
