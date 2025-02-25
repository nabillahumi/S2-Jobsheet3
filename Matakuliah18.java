public class Matakuliah18 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    //method konstruktor
    public Matakuliah18(){

    }

    public Matakuliah18(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
     // Method untuk mengisi data matakuliah (tambahData)
    public void tambahData(String kde, String n, int sk, int jj) {
        kode = kde;
        nama = n;
        sks = sk;
        jumlahJam = jj;
    }
    //method cetak info
    public void cetakInfo() {
        System.out.println("Kode\t : " + kode);
        System.out.println("Nama\t : " + nama);
        System.out.println("SKS\t : " + sks);
        System.out.println("Jam\t : " + jumlahJam);
        System.out.println("------------------------------------");
    }
}
