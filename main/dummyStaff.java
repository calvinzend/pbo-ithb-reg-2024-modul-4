package modul4.main;

import modul4.model.classes.*;
import modul4.model.enums.Status;
import modul4.main.dummyUser;
import java.util.Date;
import java.time.LocalTime;

import java.util.ArrayList;


public class dummyStaff {
    public static ArrayList<PresensiStaff> getPresensiStaff() {
        ArrayList<PresensiStaff> staff = new ArrayList<>();
        staff.add(new PresensiStaff(new Date(), Status.HADIR, LocalTime.now()));
        staff.add(new PresensiStaff(new Date(), Status.HADIR, LocalTime.now()));

        return staff;
    }

    public static ArrayList<MatkulAjar> getMatkulAjar1(){
        ArrayList<MatkulAjar> matkulAjar = new ArrayList<>();
        ArrayList<PresensiStaff> staff = getPresensiStaff();
        matkulAjar.add(new MatkulAjar(staff,new MataKuliah("IF101", "Algoritma", 4)));
        matkulAjar.add(new MatkulAjar(staff,new MataKuliah("IF201", "Struktur Data", 4)));

        return matkulAjar;
    }
    public static ArrayList<MatkulAjar> getMatkulAjar2(){
        ArrayList<MatkulAjar> matkulAjar = new ArrayList<>();
        ArrayList<PresensiStaff> staff = getPresensiStaff();
        matkulAjar.add(new MatkulAjar(staff,new MataKuliah("IF202", "Web Pro", 2)));
        matkulAjar.add(new MatkulAjar(staff,new MataKuliah("IF102", "Web Desain", 2)));

        return matkulAjar;
    }
    public static ArrayList<MatkulAjar> getMatkulAjar3(){
        ArrayList<MatkulAjar> matkulAjar = new ArrayList<>();
        ArrayList<PresensiStaff> staff = getPresensiStaff();
        matkulAjar.add(new MatkulAjar(staff,new MataKuliah("IF103", "PTI", 3)));
        matkulAjar.add(new MatkulAjar(staff,new MatkulPilihan("IF503", "IMK", 2, 10)));

        return matkulAjar;
    }
    public static ArrayList<MatkulAjar> getMatkulAjar4(){
        ArrayList<MatkulAjar> matkulAjar = new ArrayList<>();
        ArrayList<PresensiStaff> staff = getPresensiStaff();
        matkulAjar.add(new MatkulAjar(staff,new MataKuliah("IF301", "PBO", 3)));
        matkulAjar.add(new MatkulAjar(staff,new MataKuliah("IF302", "BasDat", 4)));
        matkulAjar.add(new MatkulAjar(staff,new MatkulPilihan("IF501", "Meaching Learning", 2, 10)));

        return matkulAjar;
    }
    public static ArrayList<MatkulAjar> getMatkulAjar5(){
        ArrayList<MatkulAjar> matkulAjar = new ArrayList<>();
        ArrayList<PresensiStaff> staff = getPresensiStaff();
        matkulAjar.add(new MatkulAjar(staff,new MatkulPilihan("IF701", "Deep Learnig", 2, 10)));
        matkulAjar.add(new MatkulAjar(staff, new MatkulPilihan("IF501", "STBI", 2, 10)));

        return matkulAjar;
    }
    public static ArrayList<MatkulAjar> getMatkulAjar6(){
        ArrayList<MatkulAjar> matkulAjar = new ArrayList<>();
        ArrayList<PresensiStaff> staff = getPresensiStaff();
        matkulAjar.add(new MatkulAjar(staff,new MatkulPilihan("IF501", "Game Dev", 2, 10)));
        matkulAjar.add(new MatkulAjar(staff,new MatkulPilihan("IF501", "Game Desain", 2, 10)));

        return matkulAjar;
    }

    public static ArrayList<Karyawan> getKaryawans(){
        ArrayList<Karyawan> karyawans = new ArrayList<>();
        ArrayList<PresensiStaff> staff = getPresensiStaff();

        karyawans.add(new Karyawan("Danang","Jalan peta","12/4/2000","0832432234","K001",100000,staff));
        karyawans.add(new Karyawan("Maman","Jalan peta","12/4/2000","0832432234","K002",100000,staff));

        return karyawans;
    }

    public static ArrayList<Dosen> getDosenTetaps(){
        ArrayList<Dosen> dosenTetap = new ArrayList<>();
        Dosen dosenT1 = new DosenTetap("Dr. Andi Budiman","Jalan Setiabudi 10", "12/05/1975", "081234567890", "D001", "Informatika", getMatkulAjar1(),3000000);
        Dosen dosenT2 = new DosenTetap("Dr. Hans, S.Kom, M.Kom","Jalan Ujung Berung 10", "12/05/2000", "081234567890", "D002", "Informatika", getMatkulAjar2(),3000000);
        // Dosen dosenT3 = new DosenTetap("Dr. Stefan, S.Kom, M.T","Jalan Cijerah 10", "12/05/1985", "081234567890", "D004", "Informatika", getMatkulAjar3(),3000000);
        dosenTetap.add(dosenT1);
        dosenTetap.add(dosenT2);
        // dosenTetap.add(dosenT3);

        return dosenTetap;
    }

    public static ArrayList<Dosen> getDosenHonorer(){
        ArrayList<Dosen> dosenHonorer = new ArrayList<>();
        Dosen dosenH1 = new DosenHonorer("Juvi S.Kom, M.Kom", "Jalan antapani","8/8/2004","084545445452","H001","Informatika", getMatkulAjar4(),15000);
        Dosen dosenH2 = new DosenHonorer("Mattwew S.Kom, M.Kom", "Jalan antapani","8/8/2004","084545445452","H002","Informatika",getMatkulAjar5(),15000);
        Dosen dosenH3 = new DosenHonorer("Jojo S.Kom, M.Kom", "Jalan antapani","8/8/2004","084545445452","H003","Informatika",getMatkulAjar6(),15000);
        
        dosenHonorer.add(dosenH1);
        dosenHonorer.add(dosenH2);
        dosenHonorer.add(dosenH3);

        return dosenHonorer;
    }

    public static void main(String[] args) {

        //DATA DUMMY DOSEN TETAP
        ArrayList<Dosen> dosenTetap = getDosenTetaps();

        System.out.println("Daftar Dosen Tetap:");
        for (Dosen dosen : dosenTetap) {
            System.out.println(dosen.toString());
        }

        
        ArrayList<Dosen> dosenHonorer = getDosenHonorer();

        System.out.println("Daftar Dosen Honorer:");
        for (Dosen dosen : dosenHonorer) {
            System.out.println(dosen.toString());
        }

        System.out.println("Daftar Karyawan:");
        System.out.println(getKaryawans().toString());



    }
}