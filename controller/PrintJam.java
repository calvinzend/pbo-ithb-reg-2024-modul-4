package modul4.controller;


import modul4.model.classes.*;
import modul4.model.enums.Status;
import modul4.main.dummyStaff;
import modul4.view.*;

import java.util.ArrayList;

public class PrintJam {
    private ArrayList<Dosen> dosenTetapList;
    private ArrayList<Dosen> dosenHonorerList;
    private PrintJamView printJamView;


    public PrintJam(PrintJamView printJamView) {
        this.dosenTetapList = dummyStaff.getDosenTetaps();
        this.dosenHonorerList = dummyStaff.getDosenHonorer();  
        this.printJamView = printJamView;
    }

    public void totalJam(){
        String nik = printJamView.inputNIK();
        int jam = 0;

        for (Dosen dosen : dosenTetapList) {
            if (dosen.getNIK().equalsIgnoreCase(nik)) {
                for (MatkulAjar matkulAjar : dosen.getList()) {
                    for (PresensiStaff staff : matkulAjar.getPresensi()) {
                        if (staff.getStatus() == Status.HADIR) {
                            jam += 1 * matkulAjar.getMatkul().getSks();
                        }
                    }
                }
                printJamView.tampilkanJam(jam, dosen.getNama());
            }
        }
        for (Dosen dosen : dosenHonorerList) {
            if (dosen.getNIK().equalsIgnoreCase(nik)) {
                for (MatkulAjar matkulAjar : dosen.getList()) {
                    for (PresensiStaff staff : matkulAjar.getPresensi()) {
                        if (staff.getStatus() == Status.HADIR) {
                            jam += 1 * matkulAjar.getMatkul().getSks();
                        }
                    }
                }
                printJamView.tampilkanJam(jam, dosen.getNama());
            }
        }

        if (jam == 0) {
            printJamView.tampilkanError();
        }

    }
    
}
