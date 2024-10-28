package modul4.controller;

import modul4.model.classes.*;
import modul4.main.dummyUser;
import modul4.view.*;

import java.util.ArrayList;
import java.util.HashMap;

public class PrintJumlahMhs {
    private HashMap<Integer, Sarjana> sarjanaList;
    private HashMap<Integer, Magister> magisterList;
    private PrintJumlahMhsView printJumlahMhsView;

    public PrintJumlahMhs(PrintJumlahMhsView printJumlahMhsView) {
        this.printJumlahMhsView = printJumlahMhsView;
        this.sarjanaList = dummyUser.getSarjanaList(
            dummyUser.getMatkulAmbilSarjana(dummyUser.getMataKuliahList1()));
        this.magisterList = dummyUser.getMagisterList(
            dummyUser.getMatkulAmbilMagister(dummyUser.getMataKuliahList2()));
    }

    public void kelulusan(){
        String kodeMK = printJumlahMhsView.inputMK();
        int count=0;
        Boolean masuk = false;

        for (Sarjana sarjana : sarjanaList.values()) {
            int index = cariMataKuliah(sarjana.getMatkulAmbilList(), kodeMK);
            
            if (index != -1) {
                MatkulAmbil matkul = sarjana.getMatkulAmbilList().get(index);
                double nilaiAkhir   = hitungRataRata(matkul.getN1(), matkul.getN2(), matkul.getN3());
                if (nilaiAkhir < 56) {
                    count++;
                }
            } 
        }
        for (Magister magister : magisterList.values()) {
            int index = cariMataKuliah(magister.getList(), kodeMK);
            if (index != -1) {
                MatkulAmbil mk = magister.getList().get(index);
                double nilaiAkhir   = hitungRataRata(mk.getN1(), mk.getN2(), mk.getN3());
                if (nilaiAkhir < 56) {
                    count++;
                }
            }
        }
        if (count==0) {
            printJumlahMhsView.tampilkanError();
        }else{
            printJumlahMhsView.tampilkanOutput(count,(magisterList.size()+sarjanaList.size()), kodeMK);
        }


    }

    public int cariMataKuliah(ArrayList<MatkulAmbil> matkulList, String kodeMK) {
        for (int i = 0; i < matkulList.size(); i++) {
            if (matkulList.get(i).getMatkul().getKode().equalsIgnoreCase(kodeMK)) {
                return i;
            }
        }
        return -1;
    }

    private double hitungRataRata(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }

}
