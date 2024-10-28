package modul4.model.classes;

import java.util.ArrayList;

public class DosenTetap extends Dosen{
    private int salary;

    public DosenTetap(String nama, String alamat, String TTL, String telepon, String NIK, String departemen, ArrayList<MatkulAjar> list, int salary) {
        super(nama, alamat, TTL, telepon, NIK, departemen, list);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
    
    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        StringBuilder mataKuliahStr = new StringBuilder("Mata Kuliah:\n");
        for (MatkulAjar mk : getList()) {
            mataKuliahStr.append("- ").append(mk).append("\n");
        }

        return "Nama: " + getNama() + ", "
                + "Alamat: " + getAlamat() + ", "
                + "Tanggal Lahir: " + getTTL() + ", "
                + "Telepon: " + getTelepon() + ", "
                + "NIK: " + getNIK() + ", "
                + "Departemen: " + getDepartemen() + ", "
                + "Gaji: " + getSalary() + ", "
                + mataKuliahStr;
    }
}
