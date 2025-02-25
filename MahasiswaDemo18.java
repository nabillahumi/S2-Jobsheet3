import java.util.Scanner;

public class MahasiswaDemo18 {
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa18 [] arrayOfMahasiswa18 = new Mahasiswa18[3];
        String dummy;

        for (int i = 0; i < 3; i++) {
            arrayOfMahasiswa18[i] = new Mahasiswa18();

            System.out.println("Masukkan data Mahasiswa ke- " + (i + 1));
            System.out.print("NIM    : ");
            arrayOfMahasiswa18[i].nim = sc.nextLine();
            System.out.print("Nama   : ");
            arrayOfMahasiswa18[i].nama = sc.nextLine();
            System.out.print("Kelas  : ");
            arrayOfMahasiswa18[i].kelas = sc.nextLine();
            System.out.print("IPK    : ");
            dummy = sc.nextLine();
            arrayOfMahasiswa18[i].ipk = Float.parseFloat(dummy);
            System.out.println("-----------------------------");
        } 
        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke- " + (i + 1));
            System.out.println("NIM     : " + arrayOfMahasiswa18[i].nim);
            System.out.println("Nama    : " + arrayOfMahasiswa18[i].nama);
            System.out.println("Kelas   : " + arrayOfMahasiswa18[i].kelas);
            System.out.println("IPK     : " + arrayOfMahasiswa18[i].ipk);
            System.out.println("---------------------------------");
        }
    }
}
