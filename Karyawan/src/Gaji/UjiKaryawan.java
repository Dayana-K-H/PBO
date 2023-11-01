package Gaji;

public class UjiKaryawan {
    public static void main(String[] args) {
        KaryawanTetap karyawan1 = new KaryawanTetap();
        karyawan1.input();

        KaryawanKontrak karyawan2 = new KaryawanKontrak();
        karyawan2.input();

        KaryawanTetap karyawan3 = new KaryawanTetap("Cika", "019", 5);
        karyawan3.tampilkanData();
    }
}
