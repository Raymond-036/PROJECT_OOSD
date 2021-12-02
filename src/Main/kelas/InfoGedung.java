package Main.kelas;

import Main.Enum.Ruangan;

import java.util.HashMap;
import java.util.Map;

public class InfoGedung {
    /*1. set method tampilInfoGedung()*/
//    public void tampilInfoGedung() {
//
//    }

    /*main method*/
    public void tampilInfoGedung() {
        /*2. set instansiasi kelas HashMap*/
        HashMap<String, Integer> infoGedung = new HashMap<>();
        /*3. mengisi data ke objek infoGedung*/
        /*infoGedung.put(nama_ruangan, jumlah_ruangan)*/
        infoGedung.put(Ruangan.GD7.toString(), 8);
        infoGedung.put(Ruangan.GD5.toString(), 8);

        //System.out.println(infoGedung);
        /*4. menampilkan data ke console*/
        System.out.println("= = = = = = = = = = = = = = = = = = =");
        System.out.println("|Nama Gedung     |    Jumlah Ruangan|");
        System.out.println("= = = = = = = = = = = = = = = = = = =");
        for (Map.Entry map : infoGedung.entrySet()) {
//            System.out.println("Nama Gedung      "+map.getKey()+"Jumlah Ruangan  " + map.getValue());
            System.out.println("|"+map.getKey() +"  \t\t |     "+ map.getValue()+"\t\t\t|");
        }
        System.out.println("= = = = = = = = = = = = = = = = = = =");

    }
}
