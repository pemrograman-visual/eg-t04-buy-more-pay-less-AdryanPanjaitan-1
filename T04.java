// 12S24008 - ROSPIKA SARAH YOSEFIN SIREGAR
// 12S24013 - ADRYAN JULIANTO PANJAITAN


import java.util.*;
import java.lang.Math;

public class T04 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] arrayISBN = new String[3];
        double[] arrayPrice = new double[3];
        int[] arrayQuantity = new int[3];
        int h, i;

        h = 3;
        for (i = 0; i <= h - 1; i++) {
            arrayISBN[i] = "";
            arrayPrice[i] = 0;
            arrayQuantity[i] = 0;
        }
        double totalharga;
        boolean var_continue;

        totalharga = 0;
        var_continue = true;
        while (var_continue == true) {
            String isbn;
            double price;
            int quantity;

            isbn = input.nextLine();
            if (isbn.equals("---")) {
                var_continue = false;
            } else {
                price = input.nextDouble();
                quantity = input.nextInt();
                boolean exist;

                exist = false;
                i = 0;
                do {
                    if (arrayISBN[i].equals(isbn)) {
                        arrayQuantity[i] = arrayQuantity[i] + quantity;
                        exist = true;
                    } else {
                        i = i + 1;
                    }
                } while (!exist && i < h);
                if (!exist) {
                    boolean tepat;

                    tepat = false;
                    int j;

                    j = 0;
                    do {
                        if (arrayQuantity[j] == 0) {
                            tepat = true;
                        } else {
                            j = j + 1;
                        }
                    } while (!tepat && j < h);
                    arrayISBN[j] = isbn;
                    arrayPrice[j] = price;
                    arrayQuantity[j] = quantity;
                    j = j + 1;
                }
            }
        }
        for (i = 0; i <= h - 1; i++) {
            double hargaproduk;

            hargaproduk = arrayPrice[i];
            if (arrayQuantity[i] >= 20) {
                hargaproduk = arrayPrice[i] - 12 / 100 * arrayPrice[i];
            } else {
                if (arrayQuantity[i] >= 10) {
                    hargaproduk = arrayPrice[i] - 10 / 100 * arrayPrice[i];
                } else {
                    if (arrayQuantity[i] >= 5) {
                        hargaproduk = arrayPrice[i] - 2 / 100 * arrayPrice[i];
                    }
                }
                totalharga = totalharga + hargaproduk * arrayQuantity[i];
            }
        }
        System.out.println(toFixed(totalharga,2));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}

