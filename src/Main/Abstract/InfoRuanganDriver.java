package Main.Abstract;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class InfoRuanganDriver extends InfoRuangan {
    /*1. implements method from parent class*/
    public void tampilInfoRuangan() {
        /*2. isntansiasi kelas ArrayList*/
        HashMap<Integer, Integer> infoRuangan = new HashMap<>();
        infoRuangan.put(513, 30);
        infoRuangan.put(514, 31);
        infoRuangan.put(515, 32);
        infoRuangan.put(516, 33);
        infoRuangan.put(523, 30);
        infoRuangan.put(524, 30);
        infoRuangan.put(525, 30);
        infoRuangan.put(526, 30);

//        System.out.println(infoRuangan.size());

//        for(Map.Entry map : unpi.entrySet()){
//            System.out.println("Key: "+map.get Key()+ " Valuenya = "+map.getValue());
//        }

        try {
            System.out.println("= = = = = = = = = = = = = = = = = = = = = = =");
            System.out.println("Nomor Ruangan       |       Kapasitas       |");
            System.out.println("= = = = = = = = = = = = = = = = = = = = = = =");
            for (Map.Entry map : infoRuangan.entrySet()) {

                System.out.println("||"+map.getKey() + " \t\t\t\t| " + map.getValue() +"\t\t\t\t\t|");
            }
            System.out.println("= = = = = = = = = = = = = = = = = = = = = = =");
        } catch (Exception error) {
            error.getMessage();
        }



//        G711	G513
//        G712	G514
//        G713	G515
//        G714	G516
//        G721	G523
//        G722	G524
//        G723	G525
//        G724	G526
    }

}
