public class MahasiswaDemo {
    
    public static void main(String[] args) {
        // Memanggil constructor tanpa parameter
        Mahasiswa mhs1 = new Mahasiswa();

        // Memanggil constructor dengan 2 parameter
        Mahasiswa mhs2 = new Mahasiswa("244107020153", "WAWA ELENT IRAWANTI");

        // Memanggil constructor dengan 3 parameter
        Mahasiswa mhs3 = new Mahasiswa("244107028223", "AL GHIFARI ATHAYA SANNI", "PJKR-1C");

        // Memanggil constructor dengan 4 parameter
        Mahasiswa mhs4 = new Mahasiswa("244107020054", "NABILLAH UMI PURNAMA", "TI-1F", 3.75f);

        // Menampilkan informasi mahasiswa
        mhs1.cetakInfo();
        mhs2.cetakInfo();
        mhs3.cetakInfo();
        mhs4.cetakInfo();
    }
}
