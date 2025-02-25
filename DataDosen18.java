public class DataDosen18 {
    
        // a. Mnampilkan data dosen
        public static void dataSemuaDosen(Dosen18[] arrayOfDosen) {
            System.out.println("\n== Data Semua Dosen ==");
            for (int i = 0; i < arrayOfDosen.length; i++) {
                arrayOfDosen[i].cetakInfo(i + 1);
            }
        }
    
        // b. Menampilkan jumlah dosen per jenis kelamin
        public static void jumlahDosenPerJenisKelamin(Dosen18[] arrayOfDosen) {
            int jumlahPria = 0, jumlahWanita = 0;
            for (Dosen18 dsn : arrayOfDosen) {
                if (dsn.jenisKelamin.equalsIgnoreCase("Pria")) {
                    jumlahPria++;
                } else if (dsn.jenisKelamin.equalsIgnoreCase("Wanita")) {
                    jumlahWanita++;
                }
            }
            System.out.println("\n== Jumlah Dosen Berdasarkan Jenis Kelamin ==");
            System.out.println("Pria   : " + jumlahPria);
            System.out.println("Wanita : " + jumlahWanita);
        }
    
        // c. Rata-rata usia dosen per jenis kelamin
        public static void rerataUsiaDosenPerJenisKelamin(Dosen18[] arrayOfDosen) {
            int totalUsiaPria = 0, totalUsiaWanita = 0;
            int jumlahPria = 0, jumlahWanita = 0;
    
            for (Dosen18 dsn : arrayOfDosen) {
                if (dsn.jenisKelamin.equalsIgnoreCase("Pria")) {
                    totalUsiaPria += dsn.usia;
                    jumlahPria++;
                } else if (dsn.jenisKelamin.equalsIgnoreCase("Wanita")) {
                    totalUsiaWanita += dsn.usia;
                    jumlahWanita++;
                }
            }
    
            System.out.println("\n== Rata-rata Usia Dosen Berdasarkan Jenis Kelamin ==");
            System.out.println("Pria   : " + (jumlahPria > 0 ? (double) totalUsiaPria / jumlahPria : 0));
            System.out.println("Wanita : " + (jumlahWanita > 0 ? (double) totalUsiaWanita / jumlahWanita : 0));
            System.out.println("-----------------------------");
        }
    
        // d. Tampil dosen paling tua
        public static void infoDosenPalingTua(Dosen18[] arrayOfDosen) {
            Dosen18 palingTua = arrayOfDosen[0];
    
            for (Dosen18 dsn : arrayOfDosen) {
                if (dsn.usia > palingTua.usia) {
                    palingTua = dsn;
                }
            }
    
            System.out.println("Dosen Paling Tua : " + palingTua.nama);
            palingTua.cetakInfo(1);
        }
    
        // e. Tampil dosen paling muda
        public static void infoDosenPalingMuda(Dosen18[] arrayOfDosen) {
            Dosen18 palingMuda = arrayOfDosen[0];
    
            for (Dosen18 dsn : arrayOfDosen) {
                if (dsn.usia < palingMuda.usia) {
                    palingMuda = dsn;
                }
            }
            System.out.println("Dosen Paling Muda : " + palingMuda.nama);
            //System.out.println("\n== Dosen Paling Muda ==");
            palingMuda.cetakInfo(1);
        }
}
