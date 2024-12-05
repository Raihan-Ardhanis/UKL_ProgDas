package UKL;

import java.util.Scanner;

public class Sedang2 {
    public class LuasBola{
        // Fungsi untuk menghitung volume tabung
        public static double hitungLuasPermukaan(double jariJari) {
            double phi = 3.14;
            return 4 *phi * jariJari*jariJari;
        }

        public static void main(String[] args) {
            Scanner p = new Scanner(System.in);
            System.out.println("Masukkan JariJari :");
            double jariJari = p.nextDouble();
            double luasPermukaan = hitungLuasPermukaan(jariJari);

            System.out.println("Luas Permukaan Bola Adalah : "+luasPermukaan);


            p.close();

        }
    }

}
