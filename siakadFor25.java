import java.util.Scanner;
/**
 * nilaiMahasiswa25
 */
public class siakadFor25 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai,Tertinggi = -0,terendah =100;
        int lulus = 0, tidakLulus = 0;

        for (int i =1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();

            if (nilai > Tertinggi) {
                Tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
        }
        System.out.println("nilai tertinggi: " + Tertinggi);
        System.out.println("nilai terendah: " + terendah);
        sc.close();
    }
}