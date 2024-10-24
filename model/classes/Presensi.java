package modul4.model.classes;

import java.util.Date;

import modul4.model.enums.*;


public class Presensi {
    private Date tanggal;
    private Status status;

    public Presensi(Date tanggal, Status status) {
        this.tanggal = tanggal;
        this.status = status;
    }
    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }
    public Date getTanggal() {
        return tanggal;
    }
    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    @Override
    public String toString() {
        return "Presensi{" +
                "tanggal=" + tanggal +
                ", status=" + status +
                '}';
    }
}
