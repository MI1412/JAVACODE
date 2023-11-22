import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner grade = new Scanner(System.in);
        System.out.println("\tPROGRAM MENILAI GRADE SISWA");
        System.out.println("\nmasukkan nilai ujian : ");
        int nilai1 = grade.nextInt();

        if (nilai1 <= 40 || nilai1 <= 65) {
            System.out.println("Grade : D");
            System.out.println("Silahkan Belajar Lagi");
        } else if (nilai1 <= 75) {
            System.out.println("Grade : C");
            System.out.println("Tingkatkan Lagi");
        } else if (nilai1 <= 89) {
            System.out.println("Grade : B");
            System.out.println("Bagus");
        } else {
            System.out.println("Grade : A");
            System.out.println("Selamat ");
        } 
        

    }
}
