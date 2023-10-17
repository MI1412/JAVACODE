public class LingkupVar {
    public static void main(String[] args) { // awalblok
        int a = 10; //A sama dengan variabel global
        if (a > 5) {
            int b = 15; //B sama dengan variabel lokal
            System.out.println("Nilai a didalam blok if : \t" + a);
            System.out.println("Nilai b didalam blok if : \t" + b);
        } //akhir blok

        System.out.println("Nilai a Diluar blok if : \t" +a);
        int b= 1000; // Variabel Lokal
        System.out.println("Nilai b Diluar blok if : \t" +b);
        // salah
    }
}