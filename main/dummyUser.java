package modul4.main;

import modul4.model.classes.*;
import modul4.model.enums.Status;
import java.util.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class dummyUser {
    static Random random = new Random();

    public static ArrayList<MataKuliah> getMataKuliahList1(){
        // MATA KULIAH
        MataKuliah mk1 = new MataKuliah("IF101", "Algoritma", 4);
        MataKuliah mk2 = new MataKuliah("IF102", "Web Desain", 2);
        MataKuliah mk3 = new MataKuliah("IF103", "PTI", 3);

         // MATA KULIAH PILIHAN
        MataKuliah mp1 = new MatkulPilihan("IF501", "Meaching Learning", 2, 10);
        MataKuliah mp2 = new MatkulPilihan("IF503", "IMK", 2, 10);
        MataKuliah mp3 = new MatkulPilihan("IF701", "Deep Learnig", 2, 10);

        // ARRAY LIST
        ArrayList<MataKuliah> mataKuliahs = new ArrayList<>();
        mataKuliahs.add(mk1);
        mataKuliahs.add(mk2);
        mataKuliahs.add(mk3);
        mataKuliahs.add(mp1);
        mataKuliahs.add(mp2);
        mataKuliahs.add(mp3);

        return mataKuliahs;
    }

    public static ArrayList<MataKuliah> getMataKuliahList2() {
        // MATA KULIAH
        MataKuliah mk4 = new MataKuliah("IF201", "Struktur Data", 4);
        MataKuliah mk5 = new MataKuliah("IF202", "Web Pro", 2);
        MataKuliah mk6 = new MataKuliah("IF301", "PBO", 3);
        MataKuliah mk7 = new MataKuliah("IF302", "BasDat", 4);

        // MATA KULIAH PILIHAN       
        MataKuliah mp4 = new MatkulPilihan("IF501", "STBI", 2, 10);
        MataKuliah mp5 = new MatkulPilihan("IF501", "Game Dev", 2, 10);
        MataKuliah mp6 = new MatkulPilihan("IF501", "Game Desain", 2, 10);

        // ARRAY LIST
        ArrayList<MataKuliah> mataKuliahs = new ArrayList<>();
        mataKuliahs.add(mk4);
        mataKuliahs.add(mk5);
        mataKuliahs.add(mk6);
        mataKuliahs.add(mk7);

        mataKuliahs.add(mp4);
        mataKuliahs.add(mp5);
        mataKuliahs.add(mp6);

        return mataKuliahs;
    }

    public static ArrayList<Presensi> getPresensiList() {
        ArrayList<Presensi> presensiList = new ArrayList<>();
        presensiList.add(new Presensi(new Date(), Status.HADIR));
        presensiList.add(new Presensi(new Date(), Status.ALPHA));

        System.out.println(presensiList.get(0).toString());

        return presensiList;
    }

    public static ArrayList<MatkulAmbil> getMatkulAmbilSarjana(ArrayList<MataKuliah> mataKuliahs) {
        ArrayList<MatkulAmbil> matkulAmbilList = new ArrayList<>();
        matkulAmbilList.add(new MatkulAmbil( random.nextInt(80,101), random.nextInt(80,101), random.nextInt(80,101), getPresensiList(), mataKuliahs.get(0)));
        matkulAmbilList.add(new MatkulAmbil(random.nextInt(80,101), random.nextInt(80,101), random.nextInt(80,101), getPresensiList(), mataKuliahs.get(1)));
        matkulAmbilList.add(new MatkulAmbil(random.nextInt(80,101), random.nextInt(80,101), random.nextInt(80,101), getPresensiList(), mataKuliahs.get(2)));
        matkulAmbilList.add(new MatkulAmbil(random.nextInt(80,101), random.nextInt(80,101), random.nextInt(80,101), getPresensiList(), mataKuliahs.get(3)));
        matkulAmbilList.add(new MatkulAmbil(random.nextInt(80,101), random.nextInt(80,101), random.nextInt(80,101), getPresensiList(), mataKuliahs.get(4)));
        matkulAmbilList.add(new MatkulAmbil(random.nextInt(80,101), random.nextInt(80,101), random.nextInt(80,101), getPresensiList(), mataKuliahs.get(5)));
        return matkulAmbilList;
    }
    public static ArrayList<MatkulAmbil> getMatkulAmbilMagister(ArrayList<MataKuliah> mataKuliahs) {
        ArrayList<MatkulAmbil> matkulAmbilList = new ArrayList<>();
        matkulAmbilList.add(new MatkulAmbil(random.nextInt(80,101), random.nextInt(80,101), random.nextInt(80,101), getPresensiList(), mataKuliahs.get(0)));
        matkulAmbilList.add(new MatkulAmbil(random.nextInt(80,101), random.nextInt(80,101), random.nextInt(80,101), getPresensiList(), mataKuliahs.get(1)));
       
        return matkulAmbilList;
    }

    public static HashMap<Integer, Sarjana> getSarjanaList(ArrayList<MatkulAmbil> matkulAmbilList) {
        HashMap<Integer, Sarjana> mhsSarjana = new HashMap<>();

        mhsSarjana.put(0, new Sarjana("Joseph", "Jalan Cijerah nomer 90", "29/8/2004",
                "085703845949", "1123021", "Informatika", matkulAmbilList));
        mhsSarjana.put(1, new Sarjana("Alexas", "Jalan TKI V", "2/2/2004",
                "085703845949", "1123038", "Informatika", matkulAmbilList));
        mhsSarjana.put(2, new Sarjana("Tythan", "Jalan DU V", "2/6/2004",
                "085703845949", "1123038", "Informatika", matkulAmbilList));
        mhsSarjana.put(3, new Sarjana("Adhyo", "Jalan DU V", "2/8/2004",
                "085703845949", "1123038", "Informatika", matkulAmbilList));

        return mhsSarjana;
    }

    public static HashMap<Integer, Magister> getMagisterList(ArrayList<MatkulAmbil> matkulAmbilList) {
        HashMap<Integer, Magister> mhsMagister = new HashMap<>();

        mhsMagister.put(0, new Magister("Boston E. Manalu", "Jalan Cileunyi nomer 80",
                "14/12/2004", "085703845949", "1123039", "Informatika",
                matkulAmbilList, "Kenapa BFS Menggunakan Queue"));
        mhsMagister.put(1, new Magister("Felix", "Jalan Peta nomer 10", "17/9/2004",
                "085703845949", "1123042", "Informatika",
                matkulAmbilList, "Algoritma DFS apakah bisa digunakan dalam kehidupan."));
        mhsMagister.put(2, new Magister("Jonathan Paul", "Jalan Peta nomer 10",
                "17/6/2005", "085703845949", "1123015", "Informatika",
                matkulAmbilList, "Apakah AI jahat?"));

        return mhsMagister;
    }

    public static HashMap<Integer, Doktor> getDoktorList() {
        HashMap<Integer, Doktor> mhsDoktor = new HashMap<>();

        mhsDoktor.put(0, new Doktor("Calvin Estanto Zendrato",
                "Jalan Bojong Malaka Indah nomer 50", "15/9/2004", "085703845949",
                "1123040", "Informatika", "Mengapa ChatGPT sangat menyeramkan",
                90, 80, 92));
        mhsDoktor.put(1, new Doktor("Juan", "Jalan TKI nomer 50", "21/8/2004",
                "085703845949", "1123048", "Informatika", "Mengapa ChatGPT sangat pintar",
                90, 80, 92));

        return mhsDoktor;
    }

    public static void main(String[] args) {
        // Print Matkul Ambil
        System.out.println("Matkul Ambil:");
        ArrayList<MatkulAmbil> matkulAmbilListSarjana = getMatkulAmbilSarjana(getMataKuliahList1());
        ArrayList<MatkulAmbil> matkulAmbilListMagister = getMatkulAmbilMagister(getMataKuliahList2());
        for (MatkulAmbil matkulAmbil : matkulAmbilListSarjana) {
            System.out.println(matkulAmbil.toString());
        }
        System.out.println();

        // Print Sarjana
        System.out.println("Data Sarjana:");
        HashMap<Integer, Sarjana> sarjanaList = getSarjanaList(matkulAmbilListSarjana);
        for (Sarjana sarjana : sarjanaList.values()) {
            System.out.println(sarjana.toString());
        }

        // Print Magister
        System.out.println("\nData Magister:");
        HashMap<Integer, Magister> magisterList = getMagisterList(matkulAmbilListMagister);
        for (Magister magister : magisterList.values()) {
            System.out.println(magister.toString());
        }

        // Print Doktor
        System.out.println("\nData Doktor:");
        HashMap<Integer, Doktor> doktorList = getDoktorList();
        for (Doktor doktor : doktorList.values()) {
            System.out.println(doktor.toString());
        }
    }
}
