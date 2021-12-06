package Main.kelas;

import Main.Interface.InterfaceInfoPengumuman;

import java.util.ArrayList;

public class Pengumuman implements InterfaceInfoPengumuman {
    /*1. override method dari interface InterfaceInfoPengumuman*/
    public void infoPengumuman() {
        /*2. instansiasi kelas ArrayList*/
        ArrayList<Integer> nomorPengumuman = new ArrayList<Integer>();
        ArrayList<String> judulPengumuman = new ArrayList<String>();
        ArrayList<String> isi = new ArrayList<String>();
        /*3. mengisi data*/
        nomorPengumuman.add(1);
        judulPengumuman.add("Pergantian Kelas");
        isi.add("Dear Mahasiswa/i FITE Kelas 42 TRPL 2020 mohon maaf ada pergantian ruangan pada matakuliah Matdis di week 13 yang seharusnya GD714 menjadi GD724\n");

        nomorPengumuman.add(2);
        judulPengumuman.add("Pergantian Metode Pembelajaran");
        isi.add("Dear Mahasiswa/i Vokasi Kelas 42 TRPL 2020 mohon maaf ada pembelajaran kita  mulai semester 4 kembali lagi dari rumah atau daring.\n");
        /*4. menampilkan data */
        //inisialisasi nilai awal
        int nilaiAwal = 0;
        System.out.println("|| = = = = = = = = = = = = = = = = = = = = = = ||");
        while (nilaiAwal < nomorPengumuman.size()) {
            System.out.println("Nomor Ruangan    : "+ nomorPengumuman.get(nilaiAwal));
            System.out.println("Judul Pengumuman : "+ judulPengumuman.get(nilaiAwal));
            System.out.println("Isi              : "+ isi.get(nilaiAwal));
            nilaiAwal++;
        }
        System.out.println("|| = = = = = = = = = = = = = = = = = = = = = = ||");


//        System.out.println("= = = = = = = = = = = = = = = = = = = = = = ");
//        System.out.println("Nomor Ruangan    : "+ nomorPengumuman.get(1));
//        System.out.println("Judul Pengumuman : "+ judulPengumuman.get(1));
//        System.out.println("Isi              : "+ isi.get(1));
//        System.out.println("= = = = = = = = = = = = = = = = = = = = = = ");

    }
}
