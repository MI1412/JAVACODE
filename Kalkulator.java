import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner imron = new Scanner(System.in);

        System.out.println("PROGRAM JAVA KALKULATOR SEDERHANA\n");
        System.out.println("1. Perkalian");
        System.out.println("2. Pembagian");
        System.out.println("3. Penjumlahan");
        System.out.println("4. Pengurangan\n");

        System.out.print("Bilangan 1 : ");
        double bilangan1 = imron.nextDouble();

        System.out.print("Bilangan 2 : ");
        double bilangan2 = imron.nextDouble();

        System.out.print("Pilih Operasi matematika : ");
        int pilihan = imron.nextInt();

        double hasil = 0;

        switch (pilihan) {
            case 1:
                hasil = bilangan1 * bilangan2;
                break;
            case 2:
                if (bilangan2 != 0) {
                    hasil = bilangan1 / bilangan2;
                } else {
                    System.out.println("Pembagian oleh nol tidak diizinkan.");
                    System.exit(0);
                }
                break;
            case 3:
                hasil = bilangan1 + bilangan2;
                break;
            case 4:
                hasil = bilangan1 - bilangan2;
                break;
            default:
                System.out.println("Pilihan operasi tidak valid.");
                System.exit(0);

        }

        System.out.println("Hasil : " + hasil);

        System.out.println("\n Berhasil");
    }
}