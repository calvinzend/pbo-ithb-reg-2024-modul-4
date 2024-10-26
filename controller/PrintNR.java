package modul4.controller;

import modul4.model.classes.*;
import modul4.view.*;
import modul4.main.dummyUser;
import java.util.ArrayList;
import java.util.HashMap;

public class PrintNR {
    private HashMap<Integer, Sarjana> sarjanaList;
    private HashMap<Integer, Magister> magisterList;
    private PrintNRView printNRView;

    public PrintNR(PrintNRView printNRView) {
        this.sarjanaList = dummyUser.getSarjanaList(dummyUser.getMatkulAmbilSarjana(dummyUser.getMataKuliahList1()));
        this.magisterList = dummyUser.getMagisterList(dummyUser.getMatkulAmbilMagister(dummyUser.getMataKuliahList2()));
        this.printNRView = printNRView;
    }

    public void nilaiNR(){
        String kode = printNRView.inputKodeMK();
        double hasil = 0;
        int i = -1;

        for (Sarjana sarjana : sarjanaList.values()) {
            ArrayList<MatkulAmbil> mk = sarjana.getMatkulAmbilList();
            i = cariMataKuliah(mk, kode);
            if (i == -1) {
                hasil = nilaiMagister(kode);
                break;
            }
            hasil += hitungRataRata(mk.get(i).getN1(), mk.get(i).getN2(), mk.get(i).getN3());
        }

        if (i != -1) {
            hasil /= sarjanaList.size();
        }
            printNRView.tamplikanNilaiNR(hasil, kode);
    }

    public double nilaiMagister(String kode){
        double hasil = 0;
        
        for (Magister sarjana : magisterList.values()) {
            ArrayList<MatkulAmbil> mk = sarjana.getList();
            int i = cariMataKuliah(mk, kode);
            if (i == -1) {
               printNRView.tampilkanError();
                break;
            }
            hasil += hitungRataRata(mk.get(i).getN1(), mk.get(i).getN2(), mk.get(i).getN3());
        }

        hasil /= magisterList.size();

        return hasil;
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