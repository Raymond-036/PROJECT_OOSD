package Main.kelas;

public class InfoDosen {
    /*1. set atribut*/
    private String nama;
    private String nidn;

    /*2. set constructor no parameter*/
    InfoDosen() {}
    /*3. set constructor with parameter*/
    public InfoDosen(String nama, String nidn) {
        this.nama = nama;
        this.nidn = nidn;
    }
    /*4. set method setter dan getter*/
    public String getNama() {
        return nama;
    }
    public String getNidn() {
        return nidn;
    }

}
