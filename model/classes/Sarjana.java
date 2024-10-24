package modul4.model.classes;

import java.util.ArrayList;

public class Sarjana extends Mahasiswa {
    private ArrayList<MatkulAmbil> matkulAmbilList;

    public Sarjana(String nama, String alamat, String TTL, String telepon, String NIM,
                   String jurusan, ArrayList<MatkulAmbil> matkulAmbilList) {
        super(nama, alamat, TTL, telepon, NIM, jurusan);
        this.matkulAmbilList = matkulAmbilList;
    }

    public ArrayList<MatkulAmbil> getMatkulAmbilList() {
        return matkulAmbilList;
    }

    public void setMatkulAmbilList(ArrayList<MatkulAmbil> matkulAmbilList) {
        this.matkulAmbilList = matkulAmbilList;
    }

    @Override
    public String toString() {
        StringBuilder mataKuliahStr = new StringBuilder("Mata Kuliah Ambil:\n");

        for (MatkulAmbil mk : matkulAmbilList) {
            mataKuliahStr.append(mk).append("\n");
        }

        return "Nama: " + getNama() + "\n"
                + "Alamat: " + getAlamat() + "\n"
                + "TTL: " + getTTL() + "\n"
                + "Telepon: " + getTelepon() + "\n"
                + "NIM: " + getNIM() + "\n"
                + "Jurusan: " + getJurusan() + "\n"
                + mataKuliahStr.toString();
    }
}
