package modul4.model.classes;

import java.util.ArrayList;

public  class Karyawan extends Staff{
    private int salary;
    private ArrayList<PresensiStaff> presensi = new ArrayList<>();

    public Karyawan(String nama, String alamat, String TTL, String telepon, String NIK, int salary, ArrayList<PresensiStaff> presensi) {
        super(nama, alamat, TTL, telepon, NIK);
        this.salary = salary;
        this.presensi = presensi;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public ArrayList<PresensiStaff> getPresensi() {
        return presensi;
    }

    public void setPresensi(ArrayList<PresensiStaff> presensi) {
        this.presensi = presensi;
    }

    @Override
    public String toString() {
        StringBuilder presensiStr = new StringBuilder();
        for (PresensiStaff p : presensi) {
            presensiStr.append(p.toString()).append("\n");
        }

        return "\nNama      = '" + getNama() + '\'' +
                "\nAlamat    = '" + getAlamat() + '\'' +
                "\nTTL       = '" + getTTL() + '\'' +
                "\nTelepon   = '" + getTelepon() + '\'' +
                "\nNIK       = '" + getNIK() + '\'' +
                "\nSalary    = " + salary +
                "\nPresensi  = \n" + presensiStr.toString();
    }
}
