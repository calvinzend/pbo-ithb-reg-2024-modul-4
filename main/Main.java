package modul4.main;

import modul4.view.*;
import modul4.controller.*;

public class Main {
    public static void main(String[] args) {
        UserDataView view = new UserDataView();
        UserData userData = new UserData(view);

        PrintNAView view2 = new PrintNAView();
        PrintNA nilaiNA = new PrintNA(view2);

        //Tampilkan DATA USER
        // userData.tampilkanDataDosenTetap();
        // userData.tampilkanDataDosenHonorer();
        // userData.tampilkanDataKaryawan();
        // userData.tampilkanDataDoktor();
        // userData.tampilkanDataMagister();

        nilaiNA.cariNIMdanMK();


        
    }
}
