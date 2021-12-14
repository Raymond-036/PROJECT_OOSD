package Main.kelas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SilabusDriver {
    /*1. set main method / main program*/
    public void tampilSilabusDriver() {
        try {
            /*2. set instansiasi kelas Silabus*/
            Silabus<String> silabus = new Silabus<>();
            /*3. set instansiasi kelas Silabus dengan tipe generic ArrayList*/
            Silabus<ArrayList<String>> silabus2 = new Silabus<>();
            /*4. set instansiasi kelas Silabus dengan tipe generic HashMap*/
            Silabus<HashMap<String, String>> silabus3 = new Silabus<>();
            /*5. set instansiasi kelas Silabus dengan tipe generic ArrayList*/
            Silabus<ArrayList<String>> silabus4 = new Silabus<>();

            /*6. mengisi data atribut jumlahMinggu*/
            silabus.setJumlahMinggu("16 Minggu");
            /*7. mengisi data atribut komponenPenilaian*/
            ArrayList<String> data1 = new ArrayList<>();
            data1.add("Quiz");
            data1.add("Tugas");
            data1.add("Praktikum");
            data1.add("UTS");
            data1.add("UAS");
            /*8. mengisi data atribut persentasePenilaian*/
            HashMap<String, String> data2 = new HashMap<>();
            data2.put("Quis", "15 %");
            data2.put("Tugas ", "15 %");
            data2.put("Praktikum ", "10%");
            data2.put("UTS ", "30 %");
            data2.put("UAS ", "30 %");
            /*9. mengisi data atribut sesiPembelajaran*/
            ArrayList<String> data3 = new ArrayList<>();
            data3.add("Sesi Praktikum");
            data3.add("Sesi Teori");
            /*10. mengirim data ke atribut komponenePenilaian*/
            silabus2.setKomponenPenilaian(data1);
            /*11. mengisi data ke atribut persentasePenilaian*/
            silabus3.setPersentasePenilaian(data2);
            /*12. mengirim data ke atribut sesiPembelajaran*/
            silabus4.setSesiPembelajaran(data3);
            //menampilkan data jumlahMinggu
            System.out.println("Jumlah Minggu : ");
            System.out.println(silabus.getJumlahMinggu());
            System.out.println();

            //menampilkan data komponenPenilaian
            System.out.println("Komponen penilaian : ");
//        System.out.println(silabus2.getKomponenPenilaian() + "Ini objek"); //ini objek
            for (String komponen : silabus2.getKomponenPenilaian()) {
                System.out.println(komponen );
            }
            System.out.println();
            //menampilkan data persentasePenilaian

//        System.out.println("Key : "+ silabus3.getPersentasePenilaian().keySet());
//        System.out.println("Value : " + silabus3.getPersentasePenilaian().values());
//
//        System.out.println(data2+ " masih dalam bentuk objek");

            System.out.println("Persentase penilaian : ");
            //mengambil data 1 per 1
            for (Map.Entry mapAll : silabus3.getPersentasePenilaian().entrySet()) {
                System.out.println(mapAll.getKey() + " \t\t: " + mapAll.getValue());
            }
            System.out.println();

            /*menampilkan data sesiPembelajaran*/
            System.out.println("Sesi Pembelajaran : ");
            System.out.println("Terdapat 2 sesi");
            for (String sesiPembelajaran : silabus4.getSesiPembelajaran()) {
                System.out.println(sesiPembelajaran);
            }
        } catch (Exception error) {
            error.getMessage();
        }
    }
}
