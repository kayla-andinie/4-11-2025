import java.util.Scanner;

public class BiayaPengiriman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //input data
        System.out.println("Masukkan berat paket (kg):");
        double berat = input.nextDouble();

        System.out.println("Masukkan jarak pengumuman (km):");
        double jarak = input.nextDouble();

        System.out.println("Masukkan panjang paket (cm):");
        double panjang = input.nextDouble();

        System.out.println("Masukkan lebar paket (cm):");
        double lebar = input.nextDouble();

        System.out.println("Masukkan tinggi paket (cm):");
        double tinggi = input.nextDouble();

        //menghitung volume
        double volume = panjang*lebar*tinggi

        //menentukan biaya berdasarkan jarak
        double biayaPerKg;
        if (jarak <= 10){
            biayaPerKg = 4250;
        } else {
            biayaPerKg = 6000;
        }

        //hitung berdasarkan berat
        double BiayaPengiriman = berat * biayaPerKg;

        //Menambahkan biaya volume jika > 100 cm^3
        if (volume <= 100){
            BiayaPengiriman += 50000;
        }

        //output hasil
        System.out.println("\n==== RINCIAN BIAYA PENGIRIMAN =====");
        System.out.println("Volume paket      :" + volume +"cm^3");
        System.out.println("Biaya pengiriman  : Rp" + biayaPengiriman);
    }
}