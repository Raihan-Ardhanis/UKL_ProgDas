package UKL;

import java.util.Scanner;

public class Mudah1 {
    public static void main(String[] args) {
        Scanner g = new Scanner(System.in);
        int totalBayar;
        System.out.print("Masukkan Total Belanja Anda: ");
        int totalBelanja = g.nextInt();

        if (totalBelanja <= 100000) {
            System.out.println("Total Harga Yang Harus Anda Bayar Adalah :"+totalBelanja);
        }

        if (totalBelanja > 100000 && totalBelanja <= 200000) {
            totalBayar = totalBelanja - (totalBelanja*10)/100;         
            System.out.println("Karena Total belanja anda "+ totalBelanja + " Anda Mendapatkan Diskon Sebesar 10%");
            System.out.println("Jumlah Harga yang harus anda bayar adalah : "+ totalBayar);
        }

        if (totalBelanja > 200000) {
            totalBayar =totalBelanja - (totalBelanja*20)/100;
            System.out.println("Karena Total Belanja Anda "+ totalBelanja + " Anda Mendapatkan Diskon Sebesar 20%");
            System.out.println("Jumlah Harga Yang Harus Anda Bayar Adalah :" + totalBayar);
            
            
            
        }
        if (totalBelanja > 40000 && totalBelanja <= 50000) {
            totalBayar = totalBelanja - (totalBelanja*50)/100;
            System.out.println("Total harga yang perlu dibayar adalah : "+ totalBayar);
        }
        g.close();
        

    }
}
