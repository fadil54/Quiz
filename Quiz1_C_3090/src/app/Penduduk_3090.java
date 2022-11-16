package app;

import java.util.Scanner;

public class Penduduk_3090 {
    protected String nama_3090,nik_3090,alamat_3090;
    protected int umur_3090;
    Scanner cin = new Scanner(System.in);
    
    protected void getInPenduduk(){
        System.out.print("Nik               : ");
        nik_3090 = cin.nextLine();
        System.out.print("Nama              : ");
        nama_3090 = cin.nextLine();
        System.out.print("Alamat            : ");
        alamat_3090 = cin.nextLine();
        System.out.print("umur              : ");
        umur_3090 = cin.nextInt();
    };
    public void tampilDataPenduduk(){
        System.out.println("NIK                : " + nik_3090);
        System.out.println("Nama               : " + nama_3090);
        System.out.println("Umur               : " + umur_3090);
        System.out.println("Alamat             : " + alamat_3090);
    }
}
