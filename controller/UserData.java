package modul4.controller;


import modul4.model.classes.*;
import modul4.main.dummyUser;
import modul4.main.dummyStaff;
import modul4.view.UserDataView;

import java.util.ArrayList;
import java.util.HashMap;


public class UserData {
    private HashMap<Integer, Sarjana> sarjanaList;
    private HashMap<Integer, Magister> magisterList;
    private HashMap<Integer, Doktor> doktorList;
    private ArrayList<Dosen> dosenTetapList;
    private ArrayList<Dosen> dosenHonorerList;
    private UserDataView userDataView;

    public UserData(UserDataView userDataView) {
        this.userDataView = userDataView;
        this.sarjanaList = dummyUser.getSarjanaList(dummyUser.getMatkulAmbilSarjana(dummyUser.getMataKuliahList1()));
        this.magisterList = dummyUser.getMagisterList(dummyUser.getMatkulAmbilMagister(dummyUser.getMataKuliahList2()));
        this.doktorList = dummyUser.getDoktorList();
        this.dosenTetapList = dummyStaff.getDosenTetaps();
        this.dosenHonorerList = dummyStaff.getDosenHonorer();
    }

    public void tampilkanDataSarjana() {
        StringBuilder data = new StringBuilder();

        data.append("--- Data Sarjana ---\n");
        for (Sarjana sarjana : sarjanaList.values()) {
            data.append(sarjana.toString()).append("\n\n");
        }

        userDataView.tampilkanPesan(data);
    }
    public void tampilkanDataMagister() {
        StringBuilder data = new StringBuilder();

        data.append("--- Data Magister ---\n");
        for (Magister magister : magisterList.values()) {
            data.append(magister.toString()).append("\n\n");
        }

        userDataView.tampilkanPesan(data);
    }
    public void tampilkanDataDoktor() {
        StringBuilder data = new StringBuilder();

        data.append("--- Data Doktor ---\n");
        for (Doktor doktor : doktorList.values()) {
            data.append(doktor.toString()).append("\n\n");
        }
        userDataView.tampilkanPesan(data);
    }

    public void tampilkanDataDosenTetap() {
        StringBuilder data = new StringBuilder();

        data.append("--- Data Dosen Tetap ---\n");
        for (Dosen dosen : dosenTetapList) {
            data.append(dosen.toString()).append("\n\n");
        }
        userDataView.tampilkanPesan(data);
    }

    public void tampilkanDataDosenHonorer() {
        StringBuilder data = new StringBuilder();

        data.append("--- Data Dosen Tetap ---\n");
        for (Dosen dosen : dosenHonorerList) {
            data.append(dosen.toString()).append("\n\n");
        }
        userDataView.tampilkanPesan(data);
    }




}