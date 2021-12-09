package Main.Abstract;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

public class LaporanDriver extends Laporan{
    private String namaDosen;
    private String mataKuliah;
    private String jamKuliah;
    private String deskripsi;

    /*instansiasi kelas Scanner*/
    Scanner scanner = new Scanner(System.in);

    /*set constructor*/
    public LaporanDriver(){}
    public LaporanDriver(String namaDosen, String mataKuliah, String jamKuliah, String deskripsi) {
        super(namaDosen, mataKuliah, jamKuliah, deskripsi);
    }

    @Override
    public void tampilLaporan() {
        try {
            System.out.println("Nama Dosen      :");
            namaDosen = scanner.nextLine(); //membaca inputan user
            System.out.println("Mata Kuliah     :");
            mataKuliah = scanner.nextLine();
            System.out.println("Jam Kuliah      :");
            jamKuliah = scanner.nextLine();
            System.out.println("Deskripsi       :");
            deskripsi = scanner.nextLine();

            /*INSTANSIASI KELAS lAPORANG*/
            LaporanDriver laporan = new LaporanDriver(namaDosen, mataKuliah, jamKuliah, deskripsi);

            System.out.println("Nama Dosen : "+ namaDosen);
            System.out.println("Mata Kuliah : " + mataKuliah);
            System.out.println("Jam kuliah : " + jamKuliah);
            System.out.println("Deskripsi : "+ deskripsi);

            String laporanDosen = namaDosen+" "+mataKuliah+" "+jamKuliah+" "+ deskripsi;
            /*membuat file writer menggunakan FileWriter*/
            Writer writer = new FileWriter("laporan.txt", true);
            BufferedWriter output = new BufferedWriter(writer);
            /*mengirim data ke file */
            output.write(laporanDosen+"\n");
            System.out.println("Berhasil menambahkan data ke file");
            /*menutup writer*/
            output.close();

        } catch (Exception err) {
            err.getMessage();
        }
    }
}
