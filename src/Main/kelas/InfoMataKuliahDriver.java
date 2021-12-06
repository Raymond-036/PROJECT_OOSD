package Main.kelas;

import Main.Enum.MataKuliah;

public class InfoMataKuliahDriver {
    /*1. set main method*/
    public void tampilInfoMataKuliah() {
        /*2. instansiasi kelas InfoMataKuliah*/
        /*MENGIRIM ARGUMEN DENGAN VALUE DARI TIPE DATA ENUM*/
        InfoMataKuliah infoMataKuliahI = new InfoMataKuliah(MataKuliah.PEMBENTUKAN_KARAKTER_DEL.toString(), 2);
        InfoMataKuliah infoMataKuliahII = new InfoMataKuliah(MataKuliah.ENGLISHIII.toString(), 2);

        /*MENGIRIM ARGUMEN DENGAN TIPE STRING */
        InfoMataKuliah infoMataKuliahIII = new InfoMataKuliah("Inovasi Digital", 2);
        InfoMataKuliah infoMataKuliahIV = new InfoMataKuliah("Dasar Pemrograman", 2);
        InfoMataKuliah infoMataKuliahV = new InfoMataKuliah("Matematika Diskrit", 2);
        InfoMataKuliah infoMataKuliahVI = new InfoMataKuliah("Arsitektur dan Organisasi Komputer", 2);
        InfoMataKuliah infoMataKuliahVII = new InfoMataKuliah("Pengembangan Situs Web I", 2);
        InfoMataKuliah infoMataKuliahVIII = new InfoMataKuliah("Pengenalan Rekayasa Perangkat Lunak", 2);

        /*3. Tampilkan data dosen*/
        System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =");
        System.out.println("|          Nama Mata Kuliah        \t |       Jumlah SKS         |");
        System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =");
        System.out.println("|" + infoMataKuliahI.getNama() + "    \t\t | "+ infoMataKuliahI.getJumlahSKS()+"\t\t\t\t\t\t|");
        System.out.println("|" + infoMataKuliahII.getNama()+ "   \t\t\t\t\t\t | "+ infoMataKuliahII.getJumlahSKS()+"\t\t\t\t\t\t|");
        System.out.println("|" + infoMataKuliahIII.getNama() + " \t\t\t\t\t | "+ infoMataKuliahIII.getJumlahSKS()+"\t\t\t\t\t\t|");
        System.out.println("|" + infoMataKuliahIV.getNama() + " \t\t\t\t\t | "+ infoMataKuliahIII.getJumlahSKS()+"\t\t\t\t\t\t|");
        System.out.println("|" + infoMataKuliahV.getNama() + " \t\t\t\t | "+ infoMataKuliahIII.getJumlahSKS()+"\t\t\t\t\t\t|");
        System.out.println("|" + infoMataKuliahVI.getNama() + "  | "+ infoMataKuliahIII.getJumlahSKS()+"\t\t\t\t\t\t|");
        System.out.println("|" + infoMataKuliahVII.getNama() + " \t\t\t | "+ infoMataKuliahIII.getJumlahSKS()+"\t\t\t\t\t\t|");
        System.out.println("|" + infoMataKuliahVIII.getNama() + " | "+ infoMataKuliahIII.getJumlahSKS()+"\t\t\t\t\t\t|");
        System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =");
    }
}
