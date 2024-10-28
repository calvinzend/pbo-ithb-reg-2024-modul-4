package modul4.main;

import modul4.view.*;
import modul4.controller.*;
import java.time.LocalTime;
import javax.swing.JOptionPane;

public class Main {

    static UserDataView view = new UserDataView();
    static UserData userData = new UserData(view);

    static PrintNAView view2 = new PrintNAView();
    static PrintNA nilaiNA = new PrintNA(view2);

    static PrintNRView view3 = new PrintNRView();
    static PrintNR nilaiNR = new PrintNR(view3); 

    static PrintMatkulAmbilView view4 = new PrintMatkulAmbilView();
    static PrintMatkulAmbil matkulAmbil = new PrintMatkulAmbil(view4);

    static PrintGajiView printGajiView = new PrintGajiView();
    static PrintGaji printGaji = new PrintGaji(printGajiView);

    static PrintJamView printJamView = new PrintJamView();
    static PrintJam printJam = new PrintJam(printJamView);

    static  PrintJumlahMhsView printJumlahMhsView = new PrintJumlahMhsView();
    static PrintJumlahMhs printJumlahMhs = new PrintJumlahMhs(printJumlahMhsView);

    public static void menu(){
        int menu = Integer.parseInt(JOptionPane.showInputDialog(
            "Pilih Operasi:\n" +
            "1. Tampilkan Data Dosen Tetap\n" +
            "2. Tampilkan Data Dosen Honorer\n" +
            "3. Tampilkan Data Karyawan\n" +
            "4. Tampilkan Data Doktor\n" +
            "5. Tampilkan Data Magister\n" +
            "6. Tampilkan Data Sarjana\n" +
            "7. Cari NIM dan MK\n" +
            "8. Tampilkan Nilai NR\n" +
            "9. Tampilkan Mata Kuliah Diambil\n" +
            "10. Gaji Karyawan\n" +
            "11. Gaji Dosen Tetap\n" +
            "12. Gaji Dosen Honorer\n" +
            "13. Total Jam Dosen Mengajar\n" +
            "14. Kelulusan Mahasiswa\n" +
            "0. Keluar"
            ));

        switch (menu) {
            case 1:
                userData.tampilkanDataDosenTetap();
                break;
            case 2:
                userData.tampilkanDataDosenHonorer();
                break;
            case 3:
                userData.tampilkanDataKaryawan();
                break;
            case 4:
                userData.tampilkanDataDoktor();
                break;
            case 5:
                userData.tampilkanDataMagister();
                break;
            case 6:
                userData.tampilkanDataSarjana();
                break;
            case 7:
                nilaiNA.cariNIMdanMK();
                break;
            case 8:
                nilaiNR.nilaiNR();
                break;
            case 9:
                matkulAmbil.PrintMK();
                break;
            case 10:
                printGaji.gajiKaryawan();
                break;
            case 11:
                printGaji.gajiDosenTetap();
                break;
            case 12:
                printGaji.gajiDosenHonorer();
                break;
            case 13:
                printJam.totalJam();
                break;
            case 14:
                printJumlahMhs.kelulusan();
                break;
            case 0:
                JOptionPane.showMessageDialog(null, "Program Berhenti.");
                break;
            default:
                menu();
                JOptionPane.showMessageDialog(null, "Pilihan tidak valid! Coba lagi.");
            }
            menu();

    }
    public static void main(String[] args) {
        menu();
       
        //Tampilkan DATA USER
        // userData.tampilkanDataDosenTetap();
        // userData.tampilkanDataDosenHonorer();
        // userData.tampilkanDataKaryawan();
        // userData.tampilkanDataDoktor();
        // userData.tampilkanDataMagister();
        // userData.tampilkanDataSarjana();

        // nilaiNA.cariNIMdanMK();

        // nilaiNR.nilaiNR();

        // matkulAmbil.PrintMK();

        // printGaji.gajiKaryawan();
        // printGaji.gajiDosenTetap();
        // printGaji.gajiDosenHonorer();
        
        // printJam.totalJam();

        // printJumlahMhs.kelulusan();
    }
}
