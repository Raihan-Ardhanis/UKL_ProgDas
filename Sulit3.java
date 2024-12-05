package UKL;

import java.util.Scanner;

public class Sulit3 {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Elemen Array: ");
        int jumlahElemen = c.nextInt();

        int[] array = new int[jumlahElemen];

        System.out.println("Masukkan Elemen Array: ");
        for (int i = 0; i < jumlahElemen; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            array[i] = c.nextInt();
        }

        int elemenSeringMuncul = array[0];
        int jumlahSebanyak = 0;

        boolean semuaSama = true;

        for (int i = 0; i < jumlahElemen; i++) {
            int hitung = 0;

            for (int j = 0; j < jumlahElemen; j++) {
                if (array[i] == array[j]) {
                    hitung++;
                }
            }

            if (hitung > jumlahSebanyak) {
                jumlahSebanyak = hitung;
                elemenSeringMuncul = array[i];
            }

            if (i > 0 && hitung != jumlahSebanyak) {
                semuaSama = false;
            }
        }

        System.out.println("\nArray: " + java.util.Arrays.toString(array));

        if (semuaSama) {
            System.out.println("\nSemua elemen memiliki frekuensi yang sama");
        } else {
            System.out.println("\nElemen yang paling sering muncul adalah " + elemenSeringMuncul + " sebanyak "
                    + jumlahSebanyak + " kali");
        }

        c.close();
    }
}
