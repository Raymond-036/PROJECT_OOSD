package Main.kelas;

public class JadwalKuliah {
    /*1. set method jadwalHariSenin()*/
    public void jadwalHariSenin() {
        System.out.println("= = = = = = = = = = = = = = = = = ");
        System.out.println("Mata Kuliah     |   Alokasi Jam  ");
        System.out.println("= = = = = = = = = = = = = = = = = ");
        System.out.println("  -             |   08.00 - 08.50");
        System.out.println("  AOK           |   09.00 - 09.50");
        System.out.println("  -             |   10.00 - 10.50");
        System.out.println("  ENGLISH I     |   11.00 - 11.50");
        System.out.println("  -             |   13.00 - 13.50");
        System.out.println("  -             |   14.00 - 14.50");
        System.out.println("  MATDIS        |   15.00 - 15.50");
        System.out.println("  MATDIS        |   16.00 - 16.50");
    }
    /*2. set method jadwalHariSelasa()*/
    public void jadwalHariSelasa() {
        System.out.println("= = = = = = = = = = = = = = = = = =");
        System.out.println("  Alokasi Jam     |   Mata Kuliah  ");
        System.out.println("= = = = = = = = = = = = = = = = = =");
        System.out.println("  08.00 - 08.50   |   ENGLISH 1   ");
        System.out.println("  09.00 - 09.50   |   ENGLISH 1   ");
        System.out.println("  10.00 - 10.50   |   DELCHA      ");
        System.out.println("  11.00 - 11.50   |   DELCHA      ");
        System.out.println("  13.00 - 13.50   |   DASPRO      ");
        System.out.println("  14.00 - 14.50   |   -           ");
        System.out.println("  15.00 - 15.50   |   INDIG       ");
        System.out.println("  16.00 - 16.50   |   INDIG       ");
    }

    /*3. set method jadwalHariRabu()*/
    public void jadwalHariRabu() {
        System.out.println("= = = = = = = = = = = = = = = = = ");
        System.out.println("Mata Kuliah     |   Alokasi Jam  ");
        System.out.println("= = = = = = = = = = = = = = = = = ");
        System.out.println("  PSW 1         |   08.00 - 08.50");
        System.out.println("  PRPL          |   09.00 - 09.50");
        System.out.println("  PRPL          |   10.00 - 10.50");
        System.out.println("  PRPL          |   11.00 - 11.50");
        System.out.println("  -             |   13.00 - 13.50");
        System.out.println("  -             |   14.00 - 14.50");
        System.out.println("  -             |   15.00 - 15.50");
        System.out.println("  -             |   16.00 - 16.50");
    }

    /*4. set method jadwalHariKamis()*/
    public void jadwalHariKamis() {
        System.out.println("= = = = = = = = = = = = = = = = = ");
        System.out.println("Mata Kuliah     |   Alokasi Jam  ");
        System.out.println("= = = = = = = = = = = = = = = = = ");
        System.out.println("  AOK           |   08.00 - 08.50");
        System.out.println("  AOK           |   09.00 - 09.50");
        System.out.println("  PRPL          |   10.00 - 10.50");
        System.out.println("  PRPL          |   11.00 - 11.50");
        System.out.println("  DASPRO        |   13.00 - 13.50");
        System.out.println("  DASPRO        |   14.00 - 14.50");
        System.out.println("  PSW 1         |   15.00 - 15.50");
        System.out.println("  PSW 1         |   16.00 - 16.50");
    }

    /*5. set method jadwalHariJumat()*/
    public void jadwalHariJumat() {
        System.out.println("= = = = = = = = = = = = = = = = = ");
        System.out.println("Mata Kuliah     |   Alokasi Jam  ");
        System.out.println("= = = = = = = = = = = = = = = = = ");
        System.out.println("  PSW 1         |   08.00 - 08.50");
        System.out.println("  PSW 1         |   09.00 - 09.50");
        System.out.println("  DASPRO        |   10.00 - 10.50");
        System.out.println("  DASPRO        |   11.00 - 11.50");
        System.out.println("  MATDIS        |   13.00 - 13.50");
        System.out.println("  MATDIS        |   14.00 - 14.50");
        System.out.println("  -             |   15.00 - 15.50");
        System.out.println("  -             |   16.00 - 16.50");
    }

    /*set main method*/
    public void tampilJadwalKuliah() {
        /*instansiasi kelas JadwalKuliah*/
        JadwalKuliah jadwalKuliah = new JadwalKuliah();
        System.out.println("\nJADWAL HARI SENIN");
        jadwalKuliah.jadwalHariSenin();
        System.out.println("\nJADWAL HARI SELASA");
        jadwalKuliah.jadwalHariSelasa();
        System.out.println("\nJADWAL HARI RABU");
        jadwalKuliah.jadwalHariRabu();
        System.out.println("\nJADWAL HARI KAMIS");
        jadwalKuliah.jadwalHariKamis();
        System.out.println("\nJADWAL HARI JUMAT");
        jadwalKuliah.jadwalHariJumat();

    }
}

