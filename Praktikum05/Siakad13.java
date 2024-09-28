import java.util.Scanner;
public class Siakad13 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String nama, nim;
        char kelas;
        byte absen;
        double nilaiTugas, nilaiKuis, nilaiUjian, nilaiAkhir;
        String nilaiAkhirHuruf = null;
        String kualifikasi = null;
        System.out.println("Masukan nama: ");
        nama = sc.nextLine();
        System.out.println("Masukan NIM: ");
        nim = sc.nextLine();
        System.out.println("Masukan kelas: ");
        kelas = sc.nextLine().charAt(0);
        System.out.println("Masukan nomer absen: ");
        absen = sc.nextByte();
        System.out.println("Masukan nilai kuis :");
        nilaiKuis = sc.nextDouble();
        System.out.println("Masukan nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.println("Masukan nilai ujian: ");
        nilaiUjian = sc.nextDouble();
        nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;
        System.out.println("Nama: " + nama + " NIM: " + nim);
        System.out.println("Kelas: " + kelas + " Absen: " + absen);
        System.out.println("Nilai akhir: " + nilaiAkhir);
    
        if (nilaiAkhir >= 0 && nilaiAkhir <= 39) {
            nilaiAkhirHuruf = "E";
        } else if (nilaiAkhir >= 39 && nilaiAkhir <= 50) {
            nilaiAkhirHuruf = "D";
        } else if (nilaiAkhir >= 50 && nilaiAkhir <= 60) {
            nilaiAkhirHuruf = "C";
        } else if (nilaiAkhir >= 60 && nilaiAkhir <= 65) {
            nilaiAkhirHuruf = "C+";
        } else if (nilaiAkhir >= 65 && nilaiAkhir <= 73) {
            nilaiAkhirHuruf = "B";
        } else if (nilaiAkhir >= 73 && nilaiAkhir <= 80) {
            nilaiAkhirHuruf = "B+";
        } else if (nilaiAkhir >= 80 && nilaiAkhir <= 100) {
            nilaiAkhirHuruf = "A";
        }

        System.out.println("Nilai akhir huruf: " + nilaiAkhirHuruf);

        if (nilaiAkhir >= 0 && nilaiAkhir <= 39) {
            kualifikasi = "Gagal";
        } else if (nilaiAkhir >= 39 && nilaiAkhir <= 50) {
            kualifikasi = "Kurang";
        } else if (nilaiAkhir >= 50 && nilaiAkhir <= 60) {
            kualifikasi = "Cukup";
        } else if (nilaiAkhir >= 60 && nilaiAkhir <= 65) {
            kualifikasi = "Lebih dari cukup";
        } else if (nilaiAkhir >= 65 && nilaiAkhir <= 73) {
            kualifikasi = "Baik";
        } else if (nilaiAkhir >= 73 && nilaiAkhir <= 80) {
            nilaiAkhirHuruf = "Lebih dari cukup";
        } else if (nilaiAkhir >= 80 && nilaiAkhir <= 100) {
            kualifikasi = "Sangat baik";
        }

        System.out.println("Kualifikasi: " + kualifikasi);




    }
}