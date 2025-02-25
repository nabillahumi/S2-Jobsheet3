import java.util.Scanner;
public class MatakuliahDemo18 {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       //deklarasi array
       Matakuliah18[] arrayOfMatkuliah = new Matakuliah18[3];

       //looping untuk masukkan data matkul
       for (int i = 0; i < arrayOfMatkuliah.length; i++) {
           //buat object baru
           arrayOfMatkuliah[i] = new Matakuliah18();

           System.out.println("Masukkan nama mata kuliah ke-" + (i+1));
           System.out.print("Kode\t : ");
           String kode = sc.nextLine();
           System.out.print("Nama\t : ");
           String nama = sc.nextLine();
           System.out.print("SKS\t : ");
           int sks = sc.nextInt();
           System.out.print("Jam\t : ");
           int jam = sc.nextInt();
           sc.nextLine();
           System.out.println("------------------------------------");

           arrayOfMatkuliah[i].tambahData(kode, nama, sks, jam);
         }
        //looping untuk menampilkan output
        for (int i = 0; i < arrayOfMatkuliah.length; i++) {
            System.out.println("Data Mata Kuliah ke-" + (i+1));
            arrayOfMatkuliah[i].cetakInfo();
        }
    }
}



