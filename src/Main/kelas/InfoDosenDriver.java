package Main.kelas;

public class InfoDosenDriver {
    /*1. set main method*/
    public void tampilDataDosen() {
        /*2. instansiasi kelas InfoDosen*/
        InfoDosen infoDosenI = new InfoDosen("Tahan HJ Sihombing, S.Pd., M. App Ling (TESOL)", "0102069002");
        InfoDosen infoDosenII = new InfoDosen("Verawaty Situmorang, S.Kom., M.T.I", "0112058504");
        InfoDosen infoDosenIII = new InfoDosen("Yoli Agnesia, S.Pd., M.Si.", "0125089302");
        InfoDosen infoDosenIV = new InfoDosen("Rumondang Miranda Marsaulina, S.P, M.Si.", "0108057601");
        InfoDosen infoDosenV = new InfoDosen("Istas Manalu, S.Si., M.Sc", "0104088902");
        InfoDosen infoDosenVI = new InfoDosen("Roy Deddy Hasiholan Lumban Tobing, S.T., M.ICT", "0121038401");
        InfoDosen infoDosenVII = new InfoDosen("Gerry Italiano Wowiling, S.Tr.Kom., M.T.", "0125059003");
        InfoDosen infoDosenVIII = new InfoDosen("Dr. Arnaldo Marulitua Sinaga, ST., M.InfoTech.", "0115017701");

        try {
            /*3. Tampilkan data dosen*/
            System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =");
            System.out.println("|               Nama  \t\t\t\t\t\t\t|       NIDN        |");
            System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =");
            System.out.println("|" + infoDosenI.getNama() + " | "+ infoDosenI.getNidn()+" \t\t|");
            System.out.println("|" + infoDosenII.getNama() + " \t\t\t| "+ infoDosenII.getNidn()+" \t\t|");
            System.out.println("|" + infoDosenIII.getNama() + " \t\t\t\t\t| "+ infoDosenIII.getNidn()+" \t\t|");
            System.out.println("|" + infoDosenIV.getNama() + " \t\t| "+ infoDosenIV.getNidn()+" \t\t|");
            System.out.println("|" + infoDosenV.getNama() + " \t\t\t\t\t\t| "+ infoDosenV.getNidn()+" \t\t|");
            System.out.println("|" + infoDosenVI.getNama() + " | "+ infoDosenVI.getNidn()+" \t\t|");
            System.out.println("|" + infoDosenVII.getNama() + " \t\t| "+ infoDosenVII.getNidn()+" \t\t|");
            System.out.println("|" + infoDosenVIII.getNama() + " | "+ infoDosenVII.getNidn()+" \t\t|");
            System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =");
        } catch (Exception error) {
            error.getMessage();
        }
    }
}
