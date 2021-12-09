package Main.program_utama;

import Main.Abstract.InfoRuanganDriver;
import Main.Abstract.LaporanDriver;
import Main.kelas.*;

import java.util.Scanner;

public class  Main {
    /*1. set main method*/
    public static void main(String[] args) {
        /*2. instansiasi kelas Scanner*/
        Scanner scanner = new Scanner(System.in);
        /*3 set variabel / atribut untuk menampung inputan user*/
        String aksi;

        while(true) {
            System.out.println("= = = = = = = = = = = = ");
            System.out.println("=== SELAMAT DATANG ===");
            System.out.println("= = = = = = = = = = = = ");
            System.out.println("||- -  MENU UTAMA  - -||");
            System.out.println("1. Info Dosen");
            System.out.println("2. Info Mata Kuliah");
            System.out.println("3. Jadwal Kuliah");
            System.out.println("4. Info Ruangan");
            System.out.println("5. Info Gedung");
            System.out.println("6. Laporan");
            System.out.println("7. Melihat Pengumuman");
            System.out.println("8. Silabus");
            System.out.println("9. Metode Pembelajaran");
            System.out.println("10. Keluar");
            System.out.println("= = = = = = = = = = = = = = =");

            System.out.print("Pilih nomor pada daftar menu : "); //1
            /*4. membaca dan menyimpan inputan user ke variable aksi */
            aksi = scanner.nextLine();


            /*5. menggunakan pengkondisian untuk memfilter inputan user*/
            if(aksi.equalsIgnoreCase("1")) {
                /*6. instansiasi kelas InfoDosenDriver*/
                InfoDosenDriver infoDosenDriver = new InfoDosenDriver();
                System.out.println("Pilihan anda adalah : " + aksi);
                System.out.println();
                infoDosenDriver.tampilDataDosen();
                System.out.print("Apakah anda ingin melihat informasi lagi (y/t)? ");

                String ulang;
                ulang = scanner.next();
                if (ulang.equals("t")) {
                    System.exit(0);
                }
            } else if(aksi.equalsIgnoreCase("2")) {
                /*7. instansiasi kelas InfoMataKuliah*/
                InfoMataKuliahDriver infoMataKuliahDriver = new InfoMataKuliahDriver();
                System.out.println("Pilihan anda adalah : " + aksi);
                System.out.println();
                infoMataKuliahDriver.tampilInfoMataKuliah();
                System.out.print("Apakah anda ingin melihat informasi lagi (y/t)? ");

                String ulang;
                ulang = scanner.next();
                if (ulang.equals("t")) {
                    System.exit(0);
                }
            } else if (aksi.equalsIgnoreCase("3")) {
                /*8. instansiasi kelas JadwalKuliah*/
                JadwalKuliah jadwalKuliah = new JadwalKuliah();
                System.out.println("Pilihan anda adalah : " + aksi);
                System.out.println();
                jadwalKuliah.tampilJadwalKuliah();
                System.out.print("Apakah anda ingin melihat informasi lagi (y/t)? ");

                String ulang;
                ulang = scanner.next();
                if (ulang.equals("t")) {
                    System.exit(0);
                }
            } else if (aksi.equalsIgnoreCase("4")) {
                Scanner scanner4 = new Scanner(System.in);
                /*9. instansiasi kelas InfoRuangan*/
                System.out.println("Pilihan Anda adalah : " + aksi);
                System.out.println();
                InfoRuanganDriver infoRuanganDriver = new InfoRuanganDriver();
                infoRuanganDriver.tampilInfoRuangan();
                System.out.print("Apakah anda ingin melihat informasi lagi (y/t)? ");

                String ulang;
                ulang = scanner4.next();
                if (ulang.equals("t")) {
                    System.exit(0);
                }

            } else if (aksi.equalsIgnoreCase("5")) {
                /*10. instansiasi kelas InfoGedung*/
                InfoGedung infoGedung = new InfoGedung();
                System.out.println("Pilihan anda adalah : " + aksi);
                System.out.println();
                infoGedung.tampilInfoGedung();
                System.out.print("Apakah anda ingin melihat informasi lagi (y/t)? ");

                String ulang;
                ulang = scanner.next();
                if (ulang.equals("t")) {
                    System.exit(0);
                }
            } else if (aksi.equalsIgnoreCase("6")) {
                /*11. instansiasi kelas LaporanDriver*/
                LaporanDriver laporanDriver = new LaporanDriver();
                laporanDriver.tampilLaporan();

            } else if (aksi.equalsIgnoreCase("7")) {
                /*11. instansiasi kelas Pengumuman*/
                Pengumuman pengumuman = new Pengumuman();
                System.out.println("Pilihan Anda adalah : " + aksi);
                System.out.println();
                pengumuman.infoPengumuman();
                System.out.print("Apakah anda ingin melihat informasi lagi (y/t)? ");

                String ulang;
                ulang = scanner.next();
                if (ulang.equals("t")) {
                    System.exit(0);
                }
            } else if (aksi.equalsIgnoreCase("8")) {


            } else if (aksi.equalsIgnoreCase("9")) {
                Scanner inputUser = new Scanner(System.in);
                String input;
                System.out.println("1. Tatap Muka");
                System.out.println("2. Pembelajaran Jarak Jauh");
                System.out.print("== MASUKKAN ANGKA : \n");
                input = inputUser.next();
                if (input.equalsIgnoreCase("1")) {
                    System.out.println();
                    /*11. instansiasi kelas MetodePembelajaran*/
                    MetodePembelajaran metodePembelajaran = new MetodePembelajaran();
                    metodePembelajaran.metodeTatapMuka();
                    System.out.print("Apakah anda ingin melihat informasi lagi (y/t)? ");

                    String ulang;
                    ulang = inputUser.next();
                    if (ulang.equals("t")) {
                        System.exit(0);
                    }
                    continue;
                } else {
                    System.out.println();
                    /*12. instansiasi kelas MetodePembelajaran*/
                    MetodePembelajaran metodePembelajaran = new MetodePembelajaran();
                    metodePembelajaran.metodeJarakJauh();
                    System.out.print("Apakah anda ingin melihat informasi lagi (y/t)? ");

                    String ulang;
                    ulang = inputUser.next();
                    if (ulang.equals("t")) {
                        System.exit(0);
                    }
                }
            } else if (aksi.equalsIgnoreCase("10")) {
                String pilihan;
                System.out.print("Apakah Anda ingin keluar ? (y/t) : ");
                pilihan = scanner.next();
                if (pilihan.equals("y")) {
                    System.exit(0);
                }
                System.out.println("=== TERIMAKASIH SUDAH BERKUNJUNG ===");
                break;
            }
        }
    }
}
