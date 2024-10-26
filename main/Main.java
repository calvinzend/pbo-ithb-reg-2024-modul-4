package modul4.main;

import modul4.view.*;
import modul4.controller.UserData;

public class Main {
    public static void main(String[] args) {
        UserDataView view = new UserDataView();
        UserData controller = new UserData(view);

        //Tampilkan DATA USER
        // controller.tampilkanDataDosenTetap();
        // controller.tampilkanDataDosenHonorer();
        // controller.tampilkanDataKaryawan();
        // controller.tampilkanDataDoktor();
        // controller.tampilkanDataMagister();


        
    }
}
