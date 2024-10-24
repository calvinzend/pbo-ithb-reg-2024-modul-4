package modul4.model.classes;
import java.util.ArrayList;

public class MatkulAmbil {
    private int n1, n2, n3;
    private ArrayList<Presensi> presensi = new ArrayList<>();
    private MataKuliah matkul;

    public MatkulAmbil(int n1, int n2, int n3, ArrayList<Presensi> presensi, MataKuliah matkul) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.presensi = presensi;
        this.matkul = matkul;
    }

    public int getN1() {
        return n1;
    }
    public void setN1(int n1) {
        this.n1 = n1;
    }
    public int getN2() {
        return n2;
    }
    public void setN2(int n2) {
        this.n2 = n2;
    }
    public int getN3() {
        return n3;
    }
    public void setN3(int n3) {
        this.n3 = n3;
    }
    public ArrayList<Presensi> getPresensi() {
        return presensi;
    }
    public MataKuliah getMatkul() {
        return matkul;
    }
    public void setMatkul(MataKuliah matkul) {
        this.matkul = matkul;
    }
    public void setPresensi(ArrayList<Presensi> presensi) {
        this.presensi = presensi;
    }
    
    @Override
    public String toString() {
        StringBuilder presensiStr = new StringBuilder("Kehadiran:\n");
        for (Presensi p : getPresensi()) {
            presensiStr.append(p.getTanggal()+ " : ").append(p.getStatus()).append(", ");
        }
    
        return "Nilai 1: " + getN1() + ", " 
             + "Nilai 2: " + getN2() + ", " 
             + "Nilai 3: " + getN3() + " " 
             + presensiStr
             + "Mata Kuliah: " + getMatkul();
    }
    

   
}
