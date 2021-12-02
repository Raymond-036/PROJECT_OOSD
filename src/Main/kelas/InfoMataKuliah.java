package Main.kelas;

public class InfoMataKuliah {
    /*1. set atribut*/
    private String nama;
    private int jumlahSKS;

    /*2. set constructor no parameter*/
    InfoMataKuliah() {}
    /*3. set constructor dengan parameter*/
    public InfoMataKuliah(String nama, int jumlahSKS) {
        this.nama = nama;
        this.jumlahSKS = jumlahSKS;
    }
    /*4. set method setter dan getter*/
    public String getNama() {
        return nama;
    }
    public int getJumlahSKS() {
        return jumlahSKS;
    }
}
