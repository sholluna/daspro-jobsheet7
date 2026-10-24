import java.util.Scanner;
/**
 * Tugas125
 */
public class Tugas125 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargaTiket = 50000;
        int totalTiket = 0, jumlah;
        double totalPenjualan = 0;

        while (true) {
            System.out.println("masukkan jumlah tiket: ");
            jumlah = sc.nextInt();

            if (jumlah <0) {
                System.out.println("jumlah tiket tidak valid. masukkan lagi: ");
                continue;
            }
            if (jumlah == 0 ) {
                break;
            }
            double harga = jumlah * hargaTiket;
            double diskon = 0;
            if(jumlah >4 ) {
                diskon = 0.10;
            if (jumlah >10) {
                diskon = 0.15;
            }
            double bayar = harga - (harga * diskon);
            System.out.println("diskon: " + (diskon * 100) + "%");
            System.out.println("total bayar : Rp " + bayar);
            totalTiket = totalTiket + jumlah;
            totalPenjualan = totalPenjualan + bayar;
            }
            System.out.println("total tiket yang terjual: " + totalTiket );
            System.out.println("total harga penjualan: " + totalPenjualan);
        }
    }
}