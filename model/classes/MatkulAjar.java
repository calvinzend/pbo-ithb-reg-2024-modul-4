package modul4.model.classes;
import java.util.ArrayList;;

public class MatkulAjar {
    private ArrayList<PresensiStaff> presensi = new ArrayList<>();
    private MataKuliah matkul;

    public MatkulAjar(ArrayList<PresensiStaff> presensi, MataKuliah matkul) {
        this.presensi = presensi;
        this.matkul = matkul;
    }

    public ArrayList<PresensiStaff> getPresensi() {
        return presensi;
    }

    public void setPresensi(ArrayList<PresensiStaff> presensi) {
        this.presensi = presensi;
    }

    public MataKuliah getMatkul() {
        return matkul;
    }

    public void setMatkul(MataKuliah matkul) {
        this.matkul = matkul;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MatkulAjar {\n");
        sb.append(" ").append(matkul).append("\n");
        sb.append("  Presensi:\n");
        for (PresensiStaff p : presensi) {
            sb.append("    ").append(p.getJam()).append(",\n");
            sb.append("    ").append(p.getTanggal()).append(",\n");
        }
        sb.append("\n");
        sb.append("}");
        return sb.toString();
    }

   
}
