import java.util.Scanner;

public class DosenDemo18 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Dosen18[] daftarDosen = new Dosen18[3];
        
        for (int i = 0; i < 3; i++) {
            System.out.println("\nMasukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            String kode = sc.nextLine();
            System.out.print("Nama          : ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin : ");
            String jenisKelamin = sc.nextLine();
            System.out.print("Usia          : ");
            int usia = sc.nextInt();
            sc.nextLine(); 
            System.out.println("----------------------------");

            daftarDosen[i] = new Dosen18(kode, nama, jenisKelamin, usia);
        }
        // Menampilkan data dosen menggunakan method di DataDosen25
        DataDosen18.dataSemuaDosen(daftarDosen);
        DataDosen18.jumlahDosenPerJenisKelamin(daftarDosen);
        DataDosen18.rerataUsiaDosenPerJenisKelamin(daftarDosen);
        DataDosen18.infoDosenPalingTua(daftarDosen);
        DataDosen18.infoDosenPalingMuda(daftarDosen);

    }
}
