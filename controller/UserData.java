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
    private ArrayList<Karyawan> karyawanList;
    private UserDataView userDataView;

    public UserData(UserDataView userDataView) {
        this.userDataView = userDataView;
        this.sarjanaList = dummyUser.getSarjanaList(dummyUser.getMatkulAmbilSarjana(dummyUser.getMataKuliahList1()));
        this.magisterList = dummyUser.getMagisterList(dummyUser.getMatkulAmbilMagister(dummyUser.getMataKuliahList2()));
        this.doktorList = dummyUser.getDoktorList();
        this.dosenTetapList = dummyStaff.getDosenTetaps();
        this.dosenHonorerList = dummyStaff.getDosenHonorer();
        this.karyawanList = dummyStaff.getKaryawans();
    }

    public void tampilkanDataSarjana() {
        StringBuilder data = new StringBuilder();
        String nama = userDataView.inputNama();

        data.append("--- Data Sarjana ---\n");
        for (Sarjana sarjana : sarjanaList.values()) {
            if (nama.equalsIgnoreCase(sarjana.getNama())) {
                data.append(sarjana.toString()).append("\n");
            }
        }

        userDataView.tampilkanPesan(data);
    }
    public void tampilkanDataMagister() {
        StringBuilder data = new StringBuilder();
        String nama = userDataView.inputNama();

        data.append("--- Data Magister ---\n");
        for (Magister magister : magisterList.values()) {
            if (nama.equalsIgnoreCase(magister.getNama())) {
                data.append(magister.toString()).append("\n");
            }
        }

        userDataView.tampilkanPesan(data);
    }
    
    public void tampilkanDataDoktor() {
        StringBuilder data = new StringBuilder();
        String nama = userDataView.inputNama();

        data.append("--- Data Doktor ---\n");
        for (Doktor doktor : doktorList.values()) {
            data.append(doktor.toString()).append("\n");
        }
        userDataView.tampilkanPesan(data);
    }

    public void tampilkanDataDosenTetap() {
        StringBuilder data = new StringBuilder();
        String nama = userDataView.inputNama();

        data.append("--- Data Dosen Tetap ---\n");
        for (Dosen dosen : dosenTetapList) {
            if (nama.equalsIgnoreCase(dosen.getNama())) {
                data.append(dosen.toString()).append("\n");
            }
        }
        userDataView.tampilkanPesan(data);
    }

    public void tampilkanDataDosenHonorer() {
        StringBuilder data = new StringBuilder();
        String nama = userDataView.inputNama();

        data.append("--- Data Dosen Honorer ---\n");
        for (Dosen dosen : dosenHonorerList) {
            if (nama.equalsIgnoreCase(dosen.getNama())) {
                data.append(dosen.toString()).append("\n");
            }
        }
        userDataView.tampilkanPesan(data);
    }

    public void tampilkanDataKaryawan() {
        StringBuilder data = new StringBuilder();
        String nama = userDataView.inputNama();

        data.append("--- Data Karyawan ---\n");
        for (Karyawan karyawan : karyawanList) {
            if (nama.equalsIgnoreCase(karyawan.getNama())) {
                data.append(karyawan.toString()).append("\n");
            }
        }
        userDataView.tampilkanPesan(data);
    }




}