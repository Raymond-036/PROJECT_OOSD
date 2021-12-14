package Main.kelas;

/*1. set kelas tipe generic*/
public class Silabus<T> {
    /* 1. Instansiasi kelas Array List*/
    /*Silabus
    .Jumlah Minggu : 16 Minggu

    .KomponenPenilaian :
    Quis
    Tugas
    Praktikum
    UTS
    UAS

    .Persentasi Penilaian
    Quis : 15 %
    Tugas : 15 %
    Praktikum : 10%
    UTS : 30 %
    UAS : 30 %
    .SesiPembelajaran :
    2 Sesi :
    Sesi Praktikum
    Sesi Teori
    */

    /*2. set atribute tipe generic*/
    private T jumlahMinggu;
    private T komponenPenilaian;
    private T persentasePenilaian;
    private T sesiPembelajaran;

    /*3. set constructor*/
    public Silabus() {}
    public Silabus(T jumlahMinggu, T komponenPenilaian, T persentasePenilaian, T sesiPembelajaran) {
        this.jumlahMinggu = jumlahMinggu;
        this.komponenPenilaian = komponenPenilaian;
        this.persentasePenilaian = persentasePenilaian;
        this.sesiPembelajaran = sesiPembelajaran;
    }

    /*4. set setter dan getter*/

    public T getJumlahMinggu() {
        return jumlahMinggu;
    }

    public void setJumlahMinggu(T jumlahMinggu) {
        this.jumlahMinggu = jumlahMinggu;
    }

    public T getKomponenPenilaian() {
        return komponenPenilaian;
    }

    public void setKomponenPenilaian(T komponenPenilaian) {
        this.komponenPenilaian = komponenPenilaian;
    }

    public T getPersentasePenilaian() {
        return persentasePenilaian;
    }

    public void setPersentasePenilaian(T persentasePenilaian) {
        this.persentasePenilaian = persentasePenilaian;
    }

    public T getSesiPembelajaran() {
        return sesiPembelajaran;
    }

    public void setSesiPembelajaran(T sesiPembelajaran) {
        this.sesiPembelajaran = sesiPembelajaran;
    }
}
