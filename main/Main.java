package modul4.main;

import modul4.view.*;
import modul4.controller.*;

public class Main {
    public static void main(String[] args) {
        UserDataView view = new UserDataView();
        UserData userData = new UserData(view);

        PrintNAView view2 = new PrintNAView();
        PrintNA nilaiNA = new PrintNA(view2);

        PrintNRView view3 = new PrintNRView();
        PrintNR nilaiNR = new PrintNR(view3); 

        PrintMatkulAmbilView view4 = new PrintMatkulAmbilView();
        PrintMatkulAmbil matkulAmbil = new PrintMatkulAmbil(view4);

        PrintGajiView printGajiView = new PrintGajiView();
        PrintGaji printGaji = new PrintGaji(printGajiView);

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
        
    }
}
