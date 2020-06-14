/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package democurrency;

/**
 *
 * @author HP
 */


import java.util.Scanner;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class Project_KursURL {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String ulang = "Y";
        String jsondata = "";

        //url
        try {                       //ngambil error yang ada dlm code
        URL url = new URL("https://kurs.web.id/api/v1/bca");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();    //buka koneksi URL
        connection.setRequestMethod("GET");                                         //untuk direct access URL tersebut
        connection.connect();                                                       //untuk connect, duh...
        Scanner urldata = new Scanner(url.openStream());
        
        while(urldata.hasNext())
                {
                    jsondata += urldata.nextLine();
                }
                urldata.close();
            }
        
        catch (Exception e) {       //catch untuk ngambil semua code error pada fungsi, Exception e untuk semua error yang terjadi ditampung pada variabel "e" untuk dapat di print
           e.printStackTrace();     //print error
        }
        System.out.print("(");
        System.out.print(jsondata.substring(17, 30) + jsondata.substring(47,jsondata.length()-1));
        System.out.print(")");
        System.out.println("");
        
        String jual = jsondata.substring(55,60);    //ngambil huruf ke 55 sampai 60, bagian json data
        String beli = jsondata.substring(70,75);    //ngambil huruf ke 70 sampai 75, bagian json data
        Double djual = Double.parseDouble(jual);
        Double dbeli = Double.parseDouble(beli);

        
        while (ulang.equalsIgnoreCase("Y")) {
            System.out.println("");
            System.out.println(" Konversi Kurs Mata Uang USD - Rupiah");
            System.out.println("======================================");
            System.out.println("Pilih:");
            System.out.println("1. USD ke Rupiah");
            System.out.println("2. Rupiah ke USD");
            System.out.println("");
            System.out.print("Pilihan: ");
            double pilih = x.nextInt();
            

            if (pilih == 1) {
                System.out.println("======================================");
                System.out.println("USD ke Rupiah");
                System.out.print("Input USD: ");
                double usd = x.nextDouble();
                double rumus = usd * djual;
                System.out.println("Hasil: Rp " + rumus);
            }
            else if (pilih == 2) {
                System.out.println("======================================");
                System.out.println("Rupiah ke USD");
                System.out.print("Input Rupiah: ");
                long rp = x.nextLong();
                double rumus2 = rp / dbeli;
                System.out.println("Hasil: $" + (float)rumus2);
            }

//            else{
//                System.out.print("Input yang benar goblok!");
//            }

            System.out.print("Again? (Y/N): ");
            ulang = x.next();
        }
    }

}


