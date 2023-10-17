// typecasting adalahp proses pemeranan (casting) tipe data dari satu tipe ke tipe data lainnya
// Konversi otomatis Dalam java dengan syarat sebagai berikut :
// 1. kedua tipe data tersebut kompatibel (type data asal dan tipe data tujuan).
// 2. Tipe data tujuan memliki rentang lebih besar dari tipe data asal
// contoh byte b = 2;
//        int c = b; 

public class DemoKonversi {
    public static void main(String[] args) {
        int a = 257; // var lokal
        double d = 274.5678;
        // typecasting dari tipe int ke tipe byte
        byte b;
        b = (byte) a;
        System.out.println("Typecasting dari tipe int " + "ke tipe byte");
        System.out.println("int :" + a);
        System.out.println("byte :" + b);
        // typecasting dari tipe double ke tipe int
        int x;
        x = (int) d;
        System.out.println("\nTypecasting dari tipe double" + " ke tipe int");
        System.out.println("double :" + d);
        System.out.println("int :" + x);
        // typecasting dari tipe double ketipe byte
        b = (byte) d;
        System.out.println("\n Typecasting dari tipe double" + " ke tipe byte");
        System.out.println("double :" + d);
        System.out.println("byte :" + b);
    }
}
