package modul4.controller;


import modul4.model.classes.*;
import modul4.model.enums.Status;
import modul4.main.dummyStaff;
import modul4.view.*;

import java.util.ArrayList;

public class PrintGaji {
    private ArrayList<Dosen> dosenTetapList;
    private ArrayList<Dosen> dosenHonorerList;
    private ArrayList<Karyawan> karyawanList;
    private PrintGajiView printGajiView;

    public PrintGaji(PrintGajiView printGajiView) {
        this.dosenTetapList = dummyStaff.getDosenTetaps();
        this.dosenHonorerList = dummyStaff.getDosenHonorer();
        this.karyawanList = dummyStaff.getKaryawans();  
        this.printGajiView = printGajiView;
    }

    public void gajiDosenTetap(){
        String nik = printGajiView.inputNIK();
        double gaji = 0;

        ArrayList<DosenTetap> dosenTetapFiltered = new ArrayList<>();
        for (Dosen dosen : dosenTetapList) {
            if (dosen instanceof DosenTetap) {
                dosenTetapFiltered.add((DosenTetap) dosen); 
            }
        }
        for (DosenTetap dosen : dosenTetapFiltered) {
            if (dosen.getNIK().equalsIgnoreCase(nik)) {
                int unit = 0;
                for (MatkulAjar matkulAjar : dosen.getList()) {
                    for (Presensi presensi : matkulAjar.getPresensi()) {
                        if (presensi.getStatus() == Status.HADIR) {
                            unit++;
                        }
                    }
                }
                gaji = dosen.getSalary()+(unit * 25000);
                printGajiView.tampilkanGaji(gaji,dosen.getNama());
                break;
            }
        }
        if (gaji == 0) {
            printGajiView.tampilkanError();
        }
    }
    public void gajiDosenHonorer(){
        String nik = printGajiView.inputNIK();
        double gaji = 0;

        ArrayList<DosenHonorer> dosenFiltered = new ArrayList<>();
        for (Dosen dosen : dosenHonorerList) {
            if (dosen instanceof DosenHonorer) {
                dosenFiltered.add((DosenHonorer) dosen); 
            }
        }
        for (DosenHonorer dosen : dosenFiltered) {
            if (dosen.getNIK().equalsIgnoreCase(nik)) {
                int unit = 0;
                for (MatkulAjar matkulAjar : dosen.getList()) {
                    for (Presensi presensi : matkulAjar.getPresensi()) {
                        if (presensi.getStatus() == Status.HADIR) {
                            unit++;
                        }
                    }
                }
                gaji = unit*dosen.getHonorPerSKS();
                printGajiView.tampilkanGaji(gaji,dosen.getNama());
                break;
            }
        }
        if (gaji == 0) {
            printGajiView.tampilkanError();
        }
    }

    public void gajiKaryawan(){
        String nik = printGajiView.inputNIK();
        double gaji = 0;

        for (Karyawan karyawan : karyawanList) {
            if (karyawan.getNIK().equalsIgnoreCase(nik)) {
                int unit = 0;
                for (Presensi presensi : karyawan.getPresensi()) {
                    if (presensi.getStatus() == Status.HADIR) {
                        unit++;
                    }
                }
                gaji = (unit / 22.0) * karyawan.getSalary() ;
                printGajiView.tampilkanGaji(gaji,karyawan.getNama());
                break;
            }
        }
        if (gaji == 0) {
            printGajiView.tampilkanError();
        }
    }


    
}
