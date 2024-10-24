package modul4.model.classes;

import java.util.ArrayList;
import modul4.model.interfaces.*;

public abstract class Dosen extends Staff implements Interface{
    private String departemen;
    private ArrayList<MatkulAjar> list = new ArrayList<>();

    public Dosen(String nama, String alamat, String TTL, String telepon, String NIK, String departemen, ArrayList<MatkulAjar> list) {
        super(nama, alamat, TTL, telepon, NIK);
        this.departemen = departemen;
        this.list = list;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public ArrayList<MatkulAjar> getList() {
        return list;
    }

    public void setList(ArrayList<MatkulAjar> list) {
        this.list = list;
    }

    //    public abstract String toString();

}
