package modul4.controller;

import modul4.model.classes.*;
import modul4.view.*;
import modul4.main.dummyUser;
import java.util.ArrayList;
import java.util.HashMap;


public class PrintMatkulAmbil {
    private HashMap<Integer, Sarjana> sarjanaList;
    private HashMap<Integer, Magister> magisterList;
    private PrintMatkulAmbilView printMatkulAmbilView;

    public PrintMatkulAmbil(PrintMatkulAmbilView printMatkulAmbilView) {
        this.sarjanaList = dummyUser.getSarjanaList(dummyUser.getMatkulAmbilSarjana(dummyUser.getMataKuliahList1()));
        this.magisterList = dummyUser.getMagisterList(dummyUser.getMatkulAmbilMagister(dummyUser.getMataKuliahList2()));
        this.printMatkulAmbilView = printMatkulAmbilView;
    }

    public void PrintMK(){
        String nimStr = printMatkulAmbilView.inputNIM();

        int nim = Integer.parseInt(nimStr);

        if (sarjanaList.containsKey(nim)) {
            Sarjana sarjana = sarjanaList.get(nim);
            printMatkulAmbilView.tampilkan(sarjana.toString());
        } else if (magisterList.containsKey(nim)) {
            Magister magister = magisterList.get(nim);
            printMatkulAmbilView.tampilkan(magister.toString());
        } else {
            printMatkulAmbilView.tampilkan("NIM tidak ditemukan.");
        }
    }

}
