package Main.Abstract;

public abstract class Laporan {

    /*set atribut atau variable*/
    private String namaDosen;
    private String mataKuliah;
    private String jamKuliah;
    private String deskripsi;

    public Laporan(){}
    /*set constructor*/
    public Laporan(String namaDosen, String mataKuliah, String jamKuliah, String deskripsi) {
        this.namaDosen = namaDosen;
        this.mataKuliah = mataKuliah;
        this.jamKuliah = jamKuliah;
        this.deskripsi = deskripsi;
    }

    /*buat method prototype dengan tipe abstract*/
    abstract void tampilLaporan();
}
