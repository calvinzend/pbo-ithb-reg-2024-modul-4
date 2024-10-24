package modul4.model.classes;

import java.util.ArrayList;

public class Magister extends Mahasiswa{
    private ArrayList<MatkulAmbil> list = new ArrayList<>();
    private String judul_Penelitian_Tesis;

    public Magister(String nama, String alamat, String TTL, String telepon, String NIM, String jurusan, ArrayList<MatkulAmbil> list, String judul_Penelitian_Tesis) {
        super(nama, alamat, TTL, telepon, NIM, jurusan);
        this.list = list;
        this.judul_Penelitian_Tesis = judul_Penelitian_Tesis;
    }

    public ArrayList<MatkulAmbil> getList() {
        return list;
    }

    public void setList(ArrayList<MatkulAmbil> list) {
        this.list = list;
    }

    public String getJudul_Penelitian_Tesis() {
        return judul_Penelitian_Tesis;
    }

    public void setJudul_Penelitian_Tesis(String judul_Penelitian_Tesis) {
        this.judul_Penelitian_Tesis = judul_Penelitian_Tesis;
    }


    @Override
    public String toString() {
        StringBuilder mataKuliahStr = new StringBuilder("Mata Kuliah:\n");

        for (MatkulAmbil mk : getList()) {
            mataKuliahStr.append(mk).append("\n");
        }
        return "Nama : " + getNama() + ", "
                + "Alamat : " + getAlamat() + ", "
                + "TTL : " + getTTL() + "\n"
                + "Telepon : " + getTelepon() + ", "
                + "NIM : " + getNIM() + ", "
                + "Jurusan : " + getJurusan() + ", "
                + "Judul Penelitian Tesis : " + getJudul_Penelitian_Tesis() + "\n"
                + mataKuliahStr.toString();
    }
    
}
