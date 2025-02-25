import java.util.Scanner;
public class MatakuliahDemo18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matakuliah18[] arrayOfMatakuliah = new Matakuliah18[3];  // Array untuk menyimpan data
        String kode, nama;
        int sks, jumlahJam;

        // Loop untuk input data matakuliah
        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            System.out.print("Kode       : ");
            kode = sc.nextLine();
            System.out.print("Nama       : ");
            nama = sc.nextLine();
            System.out.print("Sks        : ");
            sks = Integer.parseInt(sc.nextLine());  // Langsung parsing tanpa variabel dummy
            System.out.print("Jumlah Jam : ");
            jumlahJam = Integer.parseInt(sc.nextLine());
            System.out.println("---------------------------------------");

            // Inisialisasi objek dalam array
            arrayOfMatakuliah[i] = new Matakuliah18(kode, nama, sks, jumlahJam);
        }
        // Loop untuk menampilkan data matakuliah yang telah diinput
        System.out.println("\n=== Data Matakuliah yang Telah Diinput ===");
        for (int i = 0; i < 3; i++) { 
            System.out.println("Data Matakuliah ke-" + (i + 1));
            System.out.println("Kode        : " + arrayOfMatakuliah[i].kode);
            System.out.println("Nama        : " + arrayOfMatakuliah[i].nama);
            System.out.println("Sks         : " + arrayOfMatakuliah[i].sks);
            System.out.println("Jumlah Jam  : " + arrayOfMatakuliah[i].jumlahJam);
            System.out.println("---------------------------------");
        }
    }
}

