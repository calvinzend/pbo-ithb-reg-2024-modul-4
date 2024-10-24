package modul4.model.classes;

import java.util.ArrayList;


public class DosenHonorer extends Dosen {
    private int honorPerSKS;

    public DosenHonorer(String nama, String alamat, String TTL, String telepon, String NIK, String departemen, ArrayList<MatkulAjar> list, int honorPerSKS) {
        super(nama, alamat, TTL, telepon, NIK, departemen, list);
        this.honorPerSKS = honorPerSKS;
    }

    public int getHonorPerSKS() {
        return honorPerSKS;
    }

    public void setHonorPerSKS(int honorPerSKS) {
        this.honorPerSKS = honorPerSKS;
    }

    @Override
    public String toString() {
        StringBuilder mataKuliahStr = new StringBuilder("Mata Kuliah:\n");
        for (MatkulAjar mk : getList()) {
            mataKuliahStr.append("- ").append(mk).append("\n");
        }

        return "Nama: " + getNama() + "\n"
                + "Alamat: " + getAlamat() + "\n"
                + "Tanggal Lahir: " + getTTL() + "\n"
                + "Telepon: " + getTelepon() + "\n"
                + "NIDN: " + getNIK() + "\n"
                + "Departemen: " + getDepartemen() + "\n"
                + "Honor per SKS: " + getHonorPerSKS() + "\n"
                + mataKuliahStr;
    }
}
