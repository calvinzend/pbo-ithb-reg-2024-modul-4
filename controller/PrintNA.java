package modul4.controller;

import modul4.model.classes.*;
import modul4.view.PrintNAView;
import modul4.main.dummyUser;
import java.util.ArrayList;
import java.util.HashMap;

public class PrintNA {
    private HashMap<Integer, Sarjana> sarjanaList;
    private HashMap<Integer, Magister> magisterList;
    private HashMap<Integer, Doktor> doktorList;
    private PrintNAView printNAView;

    public PrintNA(PrintNAView printNAView) {
        this.sarjanaList = dummyUser.getSarjanaList(dummyUser.getMatkulAmbilSarjana(dummyUser.getMataKuliahList1()));
        this.magisterList = dummyUser.getMagisterList(dummyUser.getMatkulAmbilMagister(dummyUser.getMataKuliahList2()));
        this.doktorList = dummyUser.getDoktorList();
        this.printNAView = printNAView;
    }

    public void cariNIMdanMK() {
        String nim = printNAView.inputNIM();
        String kodeMK = printNAView.inputKodeMK();
        int nimInt = Integer.parseInt(nim);

        if (sarjanaList.containsKey(nimInt)) {
            Sarjana sarjana = sarjanaList.get(nimInt);
            int index = cariMataKuliah(sarjana.getMatkulAmbilList(), kodeMK);
            if (index != -1) {
                MatkulAmbil mk = sarjana.getMatkulAmbilList().get(index);
                double nilaiAkhir   = hitungRataRata(mk.getN1(), mk.getN2(), mk.getN3());
                printNAView.tampilkanNilaiAkhir(nim, kodeMK, nilaiAkhir, sarjana.getNama());
            } else {
                printNAView.tampilkanError("Mata Kuliah tidak ditemukan.");
            }
        }else if (magisterList.containsKey(nimInt)) {
           Magister magister = magisterList.get(nimInt);
           int index = cariMataKuliah(magister.getList(), kodeMK);
           if (index != -1) {
            MatkulAmbil mk = magister.getList().get(index);
            double nilaiAkhir   = hitungRataRata(mk.getN1(), mk.getN2(), mk.getN3());
            printNAView.tampilkanNilaiAkhir(nim, kodeMK, nilaiAkhir, magister.getNama());
        } else {
            printNAView.tampilkanError("Mata Kuliah tidak ditemukan.");
        }
       } else if (doktorList.containsKey(nimInt)) {
           Doktor doktor = doktorList.get(nimInt);
           double nilaiAkhir = hitungRataRata(doktor.getSidang1(), doktor.getSidang2(), doktor.getSidang3());
           printNAView.tampilkanNilaiAkhir(nim, kodeMK, nilaiAkhir, doktor.getNama());
       } else {
           printNAView.tampilkanError("NIM tidak ditemukan.");
       }
    }

    public int cariMataKuliah(ArrayList<MatkulAmbil> matkulList, String kodeMK) {
        for (int i = 0; i < matkulList.size(); i++) {
            if (matkulList.get(i).getMatkul().getKode().equals(kodeMK)) {
                return i; 
            }
        }
        return -1; 
    }

    private double hitungRataRata(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }
}
