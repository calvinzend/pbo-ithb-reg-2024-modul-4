package modul4.model.classes;

import java.util.Date;
import modul4.model.enums.Status;
import java.time.LocalTime;

public class PresensiStaff extends Presensi {
    private LocalTime jam;

    public PresensiStaff(Date tanggal, Status status, LocalTime jam) {
        super(tanggal, status);
        this.jam = jam;
    }

    public LocalTime getJam() {
        return jam;
    }

    public void setJam(LocalTime jam) {
        this.jam = jam;
    }

    @Override
    public String toString() {
        return "PresensiStaff{" +
                "tanggal=" + getTanggal() +
                ", status=" + getStatus() +
                ", jam=" + jam +
                '}';
    }
}
