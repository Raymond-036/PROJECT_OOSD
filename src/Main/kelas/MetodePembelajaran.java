package Main.kelas;

import java.util.ArrayList;

public class MetodePembelajaran {
    /*1. set main method*/
    public void metodeTatapMuka() {
        /*instansiasi kelas ArrayList*/
        ArrayList<String> metode1 = new ArrayList<>();
        /*mengisi data ke objek metode1*/
        metode1.add("WA");
        metode1.add("E-COURSE");
        metode1.add("CIS");

        /*MENAMPILKAN DATA DARI OBJEK METODE1*/
        int nilai = 0;
        while (nilai < metode1.size()) {
            System.out.println(nilai + 1+". "+ metode1.get(nilai));
            nilai++;
        }
    }

    /*2. set method metodeJarakJauh*/
    public void metodeJarakJauh() {
        /*instansiasi kelas ArrayList*/
        ArrayList<String> metode2 = new ArrayList<>();
        /*mengisi data ke objek metode2*/
        metode2.add("WA");
        metode2.add("SIGNAL");
        metode2.add("ZOOM");
        metode2.add("G-MEET");
        metode2.add("CIS");
        metode2.add("E-COURSE");
        /*MENAMPILKAN DATA DENGAN PERULANGAN*/
        int nilai = 0;
        while (nilai < metode2.size()) {
            System.out.println(nilai + 1+". "+ metode2.get(nilai));
            nilai++;
        }
    }
}
