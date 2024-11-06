// 12S24008 - ROSPIKA SARAH YOSEFIN SIREGAR
// 12S24013 - ADRYAN JULIANTO PANJAITAN


import java.util.*;
import java.lang.Math;

public class T04 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] iSBN = new String[3];
        int[] jumlahbuku = new int[3];

        jumlahbuku[0] = 0;
        jumlahbuku[1] = 0;
        jumlahbuku[2] = 0;
        double[] harga = new double[3];

        harga[0] = 0;
        harga[1] = 0;
        harga[2] = 0;
        double[] totalharga = new double[3];

        totalharga[0] = 0;
        totalharga[1] = 0;
        totalharga[2] = 0;
        double totalakhir1;
        int i;
        int jumlahbuku0;
        int jumlahbuku1;
        int jumlahbuku2;

        i = 0;
        jumlahbuku0 = 0;
        jumlahbuku1 = 0;
        jumlahbuku2 = 0;
        String buku0;
        String buku1;
        String buku2;

        buku0 = "Buku";
        buku1 = "Buku";
        buku2 = "Buku";
        int nol;
        int satu;
        int dua;

        nol = 0;
        satu = 1;
        dua = 2;
        do {
            iSBN[i] = input.nextLine();
            if (iSBN[i].equals("---")) {
                i = 3;
            } else {
                if (iSBN[i].equals(iSBN[0])) {
                    if (nol == 0) {
                        buku0 = iSBN[i];
                    }
                    if (iSBN[0].equals(buku0)) {
                        i = 0;
                        harga[i] = Double.parseDouble(input.nextLine());
                        jumlahbuku[i] = Integer.parseInt(input.nextLine());
                        jumlahbuku0 = jumlahbuku0 + jumlahbuku[i];
                        nol = 3;
                        i = i + 1;
                    } else {
                        if (satu == 1) {
                            buku1 = iSBN[i];
                        }
                        if (iSBN[0].equals(buku1)) {
                            i = 1;
                            harga[i] = Double.parseDouble(input.nextLine());
                            jumlahbuku[i] = Integer.parseInt(input.nextLine());
                            jumlahbuku1 = jumlahbuku1 + jumlahbuku[i];
                            nol = 3;
                            i = i + 1;
                        } else {
                            i = 2;
                            harga[i] = Double.parseDouble(input.nextLine());
                            jumlahbuku[i] = Integer.parseInt(input.nextLine());
                            jumlahbuku2 = jumlahbuku2 + jumlahbuku[i];
                            nol = 3;
                            i = 0;
                        }
                    }
                } else {
                    if (iSBN[i].equals(iSBN[1])) {
                        if (satu == 1) {
                            buku1 = iSBN[i];
                        }
                        if (iSBN[1].equals(buku1)) {
                            i = 1;
                            harga[i] = Double.parseDouble(input.nextLine());
                            jumlahbuku[i] = Integer.parseInt(input.nextLine());
                            jumlahbuku1 = jumlahbuku1 + jumlahbuku[i];
                            satu = 3;
                            i = i + 1;
                        } else {
                            i = 2;
                            harga[i] = Double.parseDouble(input.nextLine());
                            jumlahbuku[i] = Integer.parseInt(input.nextLine());
                            jumlahbuku2 = jumlahbuku2 + jumlahbuku[i];
                            satu = 3;
                            i = 0;
                        }
                    } else {
                        if (iSBN[i].equals(iSBN[2])) {
                            if (dua == 2) {
                                buku2 = iSBN[i];
                            }
                            if (iSBN[2].equals(buku2)) {
                                i = 2;
                                harga[i] = Double.parseDouble(input.nextLine());
                                jumlahbuku[i] = Integer.parseInt(input.nextLine());
                                jumlahbuku2 = jumlahbuku2 + jumlahbuku[i];
                                dua = 3;
                                i = 0;
                            }
                        }
                    }
                }
            }
        } while (i < 3);
        if (jumlahbuku0 >= 20) {
            harga[0] = harga[0] - harga[0] * 12 / 100;
        } else {
            if (jumlahbuku0 >= 10) {
                harga[0] = harga[0] - harga[0] * 5 / 100;
            } else {
                if (jumlahbuku0 >= 5) {
                    harga[0] = harga[0] - harga[0] * 2 / 100;
                }
            }
        }
        totalharga[0] = harga[0] * jumlahbuku0;
        if (jumlahbuku1 >= 20) {
            harga[1] = harga[1] - harga[1] * 12 / 100;
        } else {
            if (jumlahbuku1 >= 10) {
                harga[1] = harga[1] - harga[1] * 5 / 100;
            } else {
                if (jumlahbuku1 >= 5) {
                    harga[1] = harga[1] - harga[1] * 2 / 100;
                }
            }
        }
        totalharga[1] = harga[1] * jumlahbuku1;
        if (jumlahbuku2 >= 20) {
            harga[2] = harga[2] - harga[2] * 12 / 100;
        } else {
            if (jumlahbuku2 >= 10) {
                harga[2] = harga[2] - harga[2] * 5 / 100;
            } else {
                if (jumlahbuku2 >= 5) {
                    harga[2] = harga[2] - harga[2] * 2 / 100;
                }
            }
        }
        totalharga[2] = harga[2] * jumlahbuku2;
        totalakhir1 = totalharga[0] + totalharga[1] + totalharga[2];
        System.out.println(toFixed(totalakhir1,2));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
