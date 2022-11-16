package app;

public class Nelayan_3090 extends Penduduk_3090{
    private int jmlBeratIkan_3090;
    private int jmlSolar_3090;
    
    public void getInNelayan(){
        super.getInPenduduk();
        System.out.print("Jumlah Berat Ikan : ");
        jmlBeratIkan_3090 = super.cin.nextInt();
        System.out.print("Jumlah Solar      : ");
        jmlSolar_3090 = super.cin.nextInt();
    };
    public double totalPendapatanNelayan(){
        return  (jmlBeratIkan_3090 * 8000) -  (jmlSolar_3090 * 10000);
    }
    public void tampilDataNelayan(){
        // System.out.println("=========== DATA NELAYAN ===========");
        super.tampilDataPenduduk();
        System.out.println("Jumlah berat Ikan  : " + jmlBeratIkan_3090);
        System.out.println("Jumlah Pakai Solar : " + jmlSolar_3090);
        System.out.println("Total Pendapatan   : " + (int) totalPendapatanNelayan());
    }

}
