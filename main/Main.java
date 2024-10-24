package modul4.main;

import modul4.view.*;
import modul4.controller.UserData;

public class Main {
    public static void main(String[] args) {
        UserDataView view = new UserDataView();
        UserData controller = new UserData(view);

        // controller.tampilkanDataDosenTetap();
        // controller.tampilkanDataDosenHonorer();
        // controller.tampilkanDataDoktor();
        // controller.tampilkanDataMagister();
    }
}
