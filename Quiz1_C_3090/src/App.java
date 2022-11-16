/*
    Fadil Hijayat Rumasoreng
    21103090
    S1SI05C    
*/
import java.util.*;
import app.Dokter_3090;
import app.Nelayan_3090;
public class App {
    public static void main(String[] args) throws Exception {
        Nelayan_3090 a_3090[] = new Nelayan_3090[2];
        Dokter_3090 b_3090[] = new Dokter_3090[2];

        // Input Data Nelayan
        for(int i = 0; i < a_3090.length; i++){
            System.out.println("Masukan Data Nelayan " + (i + 1));
            a_3090[i] = new Nelayan_3090();
            a_3090[i].getInNelayan();
            System.out.println();
        }

        // Print Data Nelayan
        for(int i = 0; i < a_3090.length; i++){
            if(i == 0) System.out.println("=========== DATA NELAYAN ===========");
            System.out.println("Data Nelayan " + (i + 1));
            a_3090[i].tampilDataNelayan();
            System.out.println();
        }

        // Input Data Dokter
        for(int i = 0; i < b_3090.length; i++){
            System.out.println("Masukan Data Dokter " + (i + 1));
            b_3090[i] = new Dokter_3090();
            b_3090[i].getInDokter();
            System.out.println();
        }

        // Print Data Dokter
        for(int i = 0; i < b_3090.length; i++){
            if(i == 0) System.out.println("=========== DATA DOKTER ===========");
            System.out.println("Data Dokter " + (i + 1));
            b_3090[i].tampilDataDokter();
            System.out.println();
        }

    }
}
