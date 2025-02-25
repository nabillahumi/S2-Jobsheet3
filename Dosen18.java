public class Dosen18 {
    String kode;
    String nama;
    String jenisKelamin;
    int usia;

    // konstruktor untuk menginisialisasi atribut dosen
    public Dosen18(String kode, String nama, String jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    // Method untuk mencetak informasi dosen
    public void cetakInfo(int index) {
        System.out.println("Data Dosen ke-" + index);
        System.out.println("Kode   : " + kode);
        System.out.println("Nama   : " + nama);
        System.out.println("Jenis Kelamin : " + jenisKelamin);
        System.out.println("Usia   : " + usia);
        System.out.println("----------------------------");
    }
}
