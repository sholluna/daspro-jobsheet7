import java.util.Scanner;
public class Tugas125 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargaTiket=50000;
        int jumlah,totalTiket = 0;
        double totalPenjualan;

        while (true) {
            System.out.print("masukkan jumlah tiket (0 untuk selasa): ");
            jumlah = sc.nextInt();

            if (jumlah <0);
            System.out.print("jumlah tiket tidak valid.masukkan lagi: ");
            continue;
        }
        if (jumlah == 0) {
            break;
        }
        harga = jumlah * hargaTiket;
        diskon = 0;
        if (jumlah >10) {
            diskon = 0.15;
        }else if (jumlah >4) {
            diskon = 0.10;
        }
        bayar = harga - (harga * diskon);
        System.out.println("diskon: " + (int) (diskon * 100) + "%");
        System.out.println("total bayar : Rp " + bayar);
        totalTiket = totalTiket + jumlah;
        totalPenjualan = totalPenjualan + bayar;
        }
         System.out.println("total tiket terjual: " + totalTiket);
         System.out.println("total penjualan: Rp " + totalPenjualan);
    }
}
