package Gaji;

public class UjiKaryawan {
    public static void main(String[] args) {
        KaryawanTetap karyawan1 = new KaryawanTetap(null, null, 0);
        KaryawanKontrak karyawan2 = new KaryawanKontrak(null, null, 0);
        KaryawanTetap karyawan3 = new KaryawanTetap(null, null, 0);

        karyawan1.input();
        karyawan2.input();
        karyawan3.input();
    }
}
