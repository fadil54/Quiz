package app;

public class Dokter_3090 extends Penduduk_3090{
    private int jmlPasien_3090, jmlObat_3090;

    public void getInDokter(){
        super.getInPenduduk();
        System.out.print("Jumlah Pasien     : ");
        jmlPasien_3090 = super.cin.nextInt();
        System.out.print("Jumlah Obat       : ");
        jmlObat_3090 = super.cin.nextInt();
    };
    public double totalPendapatanDokter(){
        return  (jmlPasien_3090 * 50000) + (jmlObat_3090 * 10000);
    }
    public void tampilDataDokter(){
        super.tampilDataPenduduk();
        System.out.println("Jumlah Pasien      : " + jmlPasien_3090);
        System.out.println("Jumlah Obat        : " + jmlObat_3090);
        System.out.println("Total Pendapatan   : " + (int) totalPendapatanDokter());
    }
}
