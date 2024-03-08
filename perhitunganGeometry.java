import javax.swing.JOptionPane; public 

class perhitunganGeometry {
    public static void main(String[] args) 
    {
        menuUtama();
    }
    static void menuUtama() { String[] 
        options = {"Luas Segitiga", 
        "Volume Balok", "Volume Kubus", 
        "Keluar"}; int choice = 
        JOptionPane.showOptionDialog(
                null, "Pilih operasi:", 
                "Kalkulator Geometri", 
                JOptionPane.DEFAULT_OPTION, 
                JOptionPane.PLAIN_MESSAGE, 
                null, options, 
                options[0]);
        switch (choice) { case 0: 
                hitungLuasSegitiga(); 
                break;
            case 1: hitungVolumeBalok(); 
                break;
            case 2: hitungVolumeKubus(); 
                break;
            default: 
                JOptionPane.showMessageDialog(null, 
                "Terima kasih!"); 
                System.exit(0);
        }
    }
    static void hitungLuasSegitiga() { 
        double alas = 
        Double.parseDouble(JOptionPane.showInputDialog("Masukkan panjang alas segitiga:"));
        double tinggi = 
        Double.parseDouble(JOptionPane.showInputDialog("Masukkan tinggi segitiga:"));
        
        double luasSegitiga = 0.5 * alas * tinggi; 
        JOptionPane.showMessageDialog(null, 
        "Luas segitiga adalah: " + 
        luasSegitiga); menuUtama();
    }
    static void hitungVolumeBalok() { 
        double panjang = 
        Double.parseDouble(JOptionPane.showInputDialog("Masukkan panjang balok:"));
        
        double lebar = 
        Double.parseDouble(JOptionPane.showInputDialog("Masukkan lebar balok:"));
        
        double tinggi = 
        Double.parseDouble(JOptionPane.showInputDialog("Masukkan tinggi balok:"));
        
        double volumeBalok = panjang * lebar * 
        tinggi; 
         
        JOptionPane.showMessageDialog(null, 
        "Volume balok adalah: " + 
        volumeBalok); menuUtama();
    }
    static void hitungVolumeKubus() { 
        double sisi = 
        Double.parseDouble(JOptionPane.showInputDialog("Masukkan panjang sisi kubus:"));
        
            double volumeKubus = Math.pow(sisi, 3); 
        JOptionPane.showMessageDialog(null, 
        "Volume kubus adalah: " + 
        volumeKubus); menuUtama();
    }
}
