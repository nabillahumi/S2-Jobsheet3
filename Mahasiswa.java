public class Mahasiswa {
    // Class Mahasiswa dengan Overloading Constructor
    String nim;
    String nama;
    String kelas;
    float ipk;

    // Constructor 1: Tanpa parameter (default constructor)
    public Mahasiswa() {
        this.nim = "Tidak diketahui";
        this.nama = "Tidak diketahui";
        this.kelas = "Tidak diketahui";
        this.ipk = 0.0f;
    }

    // Constructor 2: Dengan dua parameter
    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = "Tidak diketahui";
        this.ipk = 0.0f;
    }

    // Constructor 3: Dengan tiga parameter
    public Mahasiswa(String nim, String nama, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = 0.0f;
    }

    // Constructor 4: Dengan empat parameter
    public Mahasiswa(String nim, String nama, String kelas, float ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    // Method untuk menampilkan informasi mahasiswa
    public void cetakInfo() {
        System.out.println("NIM     : " + nim);
        System.out.println("Nama    : " + nama);
        System.out.println("Kelas   : " + kelas);
        System.out.println("IPK     : " + ipk);
        System.out.println("-----------------------------");
    }
}

