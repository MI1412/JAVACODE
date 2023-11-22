import java.util.Scanner;

public class kabisat {
    public static void main(String[] args) {
        Scanner y = new Scanner(System.in);
        System.out.println("Masukkan Tahun : ");
        int tahun = y.nextInt();

        int hitung = tahun ;

        if (hitung % 4 == 0) {
            System.out.println("\n"+hitung+" adalah tahun kabisat");
        }else{
            System.out.println("\n"+hitung+" Bukan Tahun Kabisat");
        }
        System.out.println("\nEND PROGRAM");
    }
}
