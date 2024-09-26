
import java.util.Scanner;

public class SIAKAD03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nama, nim, kualifikasi = "";
        String kelas, nilaiHuruf = "";
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;

        System.out.print("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = sc.nextLine();
        System.out.print("Masukkan Kelas: ");
        kelas = sc.nextLine();
        System.out.print("Masukkan Nomor Absen: ");
        absen = sc.nextByte();
        System.out.print("Masukkan Nilai Kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan Nilai Tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan Nilai Ujian: ");
        nilaiUjian = sc.nextDouble();

        nilaiAkhir = (nilaiKuis+ nilaiTugas + nilaiUjian )/3;

        if (nilaiAkhir<=100 && nilaiAkhir>20){
            nilaiHuruf="A";
            kualifikasi="Sangat baik";
        }
        else if (nilaiAkhir>73 && nilaiAkhir<=80) {
            nilaiHuruf = "B+";
            kualifikasi = "Lebih dari Baik";
        }
            
        
        else if (nilaiAkhir>65 && nilaiAkhir<=73) {
            nilaiHuruf=  "B";
            kualifikasi = "Baik";
        }
        else if (nilaiAkhir>60 && nilaiAkhir<=65) {
            nilaiHuruf = "C+";
            kualifikasi="Lebih dari cukup";
        }
        else if (nilaiAkhir>50 && nilaiAkhir<=60){
            nilaiHuruf="c";
            kualifikasi="Cukup";
        }
        else if (nilaiAkhir>39 && nilaiAkhir<=50) {
            nilaiHuruf="D";
            kualifikasi="Kurang";
        }
        else if (nilaiAkhir<=39) {
            nilaiHuruf="E";
            kualifikasi="gagal";
            
        }
        System.out.println("Nama: "+ nama );
        System.out.println("NIM: "+ nim);
        System.out.println("Kelas: "+ kelas );
        System.out.println("Absen: "+ absen );
        System.out.println("Nilai Kuis: "+ nilaiKuis );
        System.out.println("Nilai Tugas: "+ nilaiTugas );
        System.out.println("Nilai Ujian: "+ nilaiUjian );
        System.out.println("Mahasiswa dengan nama " + nama+ "(NIM "+nim+")"+" kelas "+kelas+" nomor absen "+absen);
        System.out.println(" Nilai Akhir: " + nilaiAkhir);
        System.out.println("Nilai akhir huruf: "+ nilaiHuruf);
        System.out.println("Kualifikasi: "+ kualifikasi);
    }
    
}
