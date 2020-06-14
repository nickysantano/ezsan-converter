/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package democurrency;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class ProjectKursUrl {
        public static String ambilData(String THISurl)
    {
        String jsondata = "";
        try {
            URL url = new URL(THISurl);
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
        return jsondata;
    }
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String ulang = "Y";
        
        while (ulang.equalsIgnoreCase("Y")) {
            System.out.println("");
            System.out.println(" EZSAN Rupiah Currency Converter");
            System.out.println("======================================");
            System.out.println("Pilih:");
            System.out.println("1. Rupiah to other...");
            System.out.println("2. Other to Rupiah...");
            System.out.println("");
            System.out.print("Pilihan: ");
            double pilih = x.nextInt();
            

            if (pilih == 1) {
                System.out.println("======================================");
                System.out.println("Rupiah to other...");
                System.out.println("1. USD (United States Dollar)");
                System.out.println("2. CNH (Chinese Yuan)");
                System.out.println("3. EUR (Euro)");
                System.out.println("4. DKK (Danish Krone)");
                System.out.println("5. GBP (Pound sterling)");
                System.out.println("6. JPY (Japanese Yen)");
                System.out.println("7. SGD (Singapore Dollar)");
                System.out.println("8. AUD (Australian Dollar)");
                System.out.println("");
                System.out.print("Pilihan: ");
                int pilihan2 = x.nextInt();
                
                if (pilihan2 == 1){
                    String usd = ambilData("http://www.adisurya.net/kurs-bca/get?MataUang=USD");
                    System.out.println(usd);
                    String uang = usd.substring(75,80);
                    System.out.println(uang);
                    Double sayang = Double.parseDouble(uang);
                    
                    System.out.println("");
                    System.out.println("Rupiah to USD");
                    System.out.print("Input Uang: Rp");
                    double rp = x.nextDouble();
                    double rumusrp = rp / sayang;
                    System.out.println("Hasil: $" + (float) rumusrp);
                }
                else if (pilihan2 == 2){
                    String usd = ambilData("http://www.adisurya.net/kurs-bca/get?MataUang=cnh");
                    System.out.println(usd);
                    String uang = usd.substring(75,81);
                    System.out.println(uang);
                    Double sayang = Double.parseDouble(uang);
                    
                    System.out.println("");
                    System.out.println("Rupiah to Chinese Yuan");
                    System.out.print("Input Uang: Rp");
                    double rp = x.nextDouble();
                    double rumusrp = rp / sayang;
                    System.out.println("Hasil: " + (float) rumusrp);
                }
                else if (pilihan2 == 3){
                    String usd = ambilData("http://www.adisurya.net/kurs-bca/get?MataUang=eur");
                    System.out.println(usd);
                    String uang = usd.substring(75,82);
                    System.out.println(uang);
                    Double sayang = Double.parseDouble(uang);
                    
                    System.out.println("");
                    System.out.println("Rupiah to Euro");
                    System.out.print("Input Uang: Rp");
                    double rp = x.nextDouble();
                    double rumusrp = rp / sayang;
                    System.out.println("Hasil: " + (float) rumusrp);
                }
                else if (pilihan2 == 4){
                    String usd = ambilData("http://www.adisurya.net/kurs-bca/get?MataUang=dkk");
                    System.out.println(usd);
                    String uang = usd.substring(75,81);
                    System.out.println(uang);
                    Double sayang = Double.parseDouble(uang);
                    
                    System.out.println("");
                    System.out.println("Rupiah to Danish Krone");
                    System.out.print("Input Uang: Rp");
                    double rp = x.nextDouble();
                    double rumusrp = rp / sayang;
                    System.out.println("Hasil: " + (float) rumusrp);
                }
                else if (pilihan2 == 5){
                    String usd = ambilData("http://www.adisurya.net/kurs-bca/get?MataUang=gbp");
                    System.out.println(usd);
                    String uang = usd.substring(75,82);
                    System.out.println(uang);
                    Double sayang = Double.parseDouble(uang);
                    
                    System.out.println("");
                    System.out.println("Rupiah to Pound sterling");
                    System.out.print("Input Uang: Rp");
                    double rp = x.nextDouble();
                    double rumusrp = rp / sayang;
                    System.out.println("Hasil: " + (float) rumusrp);
                }
                else if (pilihan2 == 6){
                    String usd = ambilData("http://www.adisurya.net/kurs-bca/get?MataUang=jpy");
                    System.out.println(usd);
                    String uang = usd.substring(75,80);
                    System.out.println(uang);
                    Double sayang = Double.parseDouble(uang);
                    
                    System.out.println("");
                    System.out.println("Rupiah to Japanese Yen");
                    System.out.print("Input Uang: Rp");
                    double rp = x.nextDouble();
                    double rumusrp = rp / sayang;
                    System.out.println("Hasil: " + (float) rumusrp);
                }
                else if (pilihan2 == 7){
                    String usd = ambilData("http://www.adisurya.net/kurs-bca/get?MataUang=sgd");
                    System.out.println(usd);
                    String uang = usd.substring(75,82);
                    System.out.println(uang);
                    Double sayang = Double.parseDouble(uang);
                    
                    System.out.println("");
                    System.out.println("Rupiah to Singapore Dollar");
                    System.out.print("Input Uang: Rp");
                    double rp = x.nextDouble();
                    double rumusrp = rp / sayang;
                    System.out.println("Hasil: " + (float) rumusrp);
                }
                else if (pilihan2 == 8){
                    String usd = ambilData("http://www.adisurya.net/kurs-bca/get?MataUang=aud");
                    System.out.println(usd);
                    String uang = usd.substring(75,81);
                    System.out.println(uang);
                    Double sayang = Double.parseDouble(uang);
                    
                    System.out.println("");
                    System.out.println("Rupiah to Australian Dollar");
                    System.out.print("Input Uang: Rp");
                    double rp = x.nextDouble();
                    double rumusrp = rp / sayang;
                    System.out.println("Hasil: " + (float) rumusrp);
                }
                else{
                    System.out.println("INPUT SALAH SATU NOMOR DIATAS!");
                }
                
            }
            else if (pilih == 2) {
                System.out.println("======================================");
                System.out.println("... to Rupiah?");
                System.out.println("1. USD (United States Dollar)");
                System.out.println("2. CNH (Chinese Yuan)");
                System.out.println("3. EUR (Euro)");
                System.out.println("4. DKK (Danish Krone)");
                System.out.println("5. GBP (Pound sterling)");
                System.out.println("6. JPY (Japanese Yen)");
                System.out.println("7. SGD (Singapore Dollar)");
                System.out.println("8. AUD (Australian Dollar)");
                System.out.println("");
                System.out.print("Pilihan: ");
                int pilihan3 = x.nextInt();
                
                if(pilihan3 == 1){
                String usd = ambilData("http://www.adisurya.net/kurs-bca/get?MataUang=USD");
                    System.out.println(usd);
                    String uang = usd.substring(90,95);
                    System.out.println(uang);
                    Double sayang2 = Double.parseDouble(uang);
                    
                    System.out.println("");
                    System.out.println("USD to Rupiah");
                    System.out.print("Input Uang: $");
                    double rp2 = x.nextDouble();
                    double rumusrp = rp2 * sayang2;
                    System.out.println("Hasil: $" + (float) rumusrp);
            }
                else if(pilihan3 == 2){
                String usd = ambilData("http://www.adisurya.net/kurs-bca/get?MataUang=cnh");
                    System.out.println(usd);
                    String uang = usd.substring(92,98);
                    System.out.println(uang);
                    Double sayang2 = Double.parseDouble(uang);
                    
                    System.out.println("");
                    System.out.println("Chinese Yuan to Rupiah");
                    System.out.print("Input Uang: ");
                    double rp2 = x.nextDouble();
                    double rumusrp = rp2 * sayang2;
                    System.out.println("Hasil: " + (float) rumusrp);
            }
                else if(pilihan3 == 3){
                String usd = ambilData("http://www.adisurya.net/kurs-bca/get?MataUang=eur");
                    System.out.println(usd);
                    String uang = usd.substring(93,100);
                    System.out.println(uang);
                    Double sayang2 = Double.parseDouble(uang);
                    
                    System.out.println("");
                    System.out.println("Euro to Rupiah");
                    System.out.print("Input Uang: ");
                    double rp2 = x.nextDouble();
                    double rumusrp = rp2 * sayang2;
                    System.out.println("Hasil: " + (float) rumusrp);
            }
                else if(pilihan3 == 4){
                String usd = ambilData("http://www.adisurya.net/kurs-bca/get?MataUang=dkk");
                    System.out.println(usd);
                    String uang = usd.substring(92,98);
                    System.out.println(uang);
                    Double sayang2 = Double.parseDouble(uang);
                    
                    System.out.println("");
                    System.out.println("Danish Krone to Rupiah");
                    System.out.print("Input Uang: ");
                    double rp2 = x.nextDouble();
                    double rumusrp = rp2 * sayang2;
                    System.out.println("Hasil: " + (float) rumusrp);
            }
                else if(pilihan3 == 5){
                String usd = ambilData("http://www.adisurya.net/kurs-bca/get?MataUang=gbp");
                    System.out.println(usd);
                    String uang = usd.substring(93,100);
                    System.out.println(uang);
                    Double sayang2 = Double.parseDouble(uang);
                    
                    System.out.println("");
                    System.out.println("Pound sterling to Rupiah");
                    System.out.print("Input Uang: ");
                    double rp2 = x.nextDouble();
                    double rumusrp = rp2 * sayang2;
                    System.out.println("Hasil: " + (float) rumusrp);
            }
                else if(pilihan3 == 6){
                String usd = ambilData("http://www.adisurya.net/kurs-bca/get?MataUang=jpy");
                    System.out.println(usd);
                    String uang = usd.substring(91,96);
                    System.out.println(uang);
                    Double sayang2 = Double.parseDouble(uang);
                    
                    System.out.println("");
                    System.out.println("Japanese Yen to Rupiah");
                    System.out.print("Input Uang: ");
                    double rp2 = x.nextDouble();
                    double rumusrp = rp2 * sayang2;
                    System.out.println("Hasil: " + (float) rumusrp);
            }
                else if(pilihan3 == 7){
                String usd = ambilData("http://www.adisurya.net/kurs-bca/get?MataUang=sgd");
                    System.out.println(usd);
                    String uang = usd.substring(93,100);
                    System.out.println(uang);
                    Double sayang2 = Double.parseDouble(uang);
                    
                    System.out.println("");
                    System.out.println("Singapore Dollar to Rupiah");
                    System.out.print("Input Uang: ");
                    double rp2 = x.nextDouble();
                    double rumusrp = rp2 * sayang2;
                    System.out.println("Hasil: " + (float) rumusrp);
            }
                else if(pilihan3 == 8){
                String usd = ambilData("http://www.adisurya.net/kurs-bca/get?MataUang=aud");
                    System.out.println(usd);
                    String uang = usd.substring(92,98);
                    System.out.println(uang);
                    Double sayang2 = Double.parseDouble(uang);
                    
                    System.out.println("");
                    System.out.println("Australian Dollar to Rupiah");
                    System.out.print("Input Uang: ");
                    double rp2 = x.nextDouble();
                    double rumusrp = rp2 * sayang2;
                    System.out.println("Hasil: " + (float) rumusrp);
            }

//            else{
//                System.out.print("Input yang benar goblok!");
//            }
        }
            System.out.print("Again? (Y/N): ");
            ulang = x.next();

    }

}
}
