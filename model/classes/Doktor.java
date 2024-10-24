package modul4.model.classes;


public class Doktor extends Mahasiswa{
    private String judul_Penelitian_Tesis;
    private int sidang1, sidang2, sidang3;

    public Doktor(String nama, String alamat, String TTL, String telepon, String NIM, String jurusan, String judul_Penelitian_Tesis, int sidang1, int sidang2, int sidang3) {
        super(nama, alamat, TTL, telepon, NIM, jurusan);
        this.judul_Penelitian_Tesis = judul_Penelitian_Tesis;
        this.sidang1 = sidang1;
        this.sidang2 = sidang2;
        this.sidang3 = sidang3;
    }

    public String getJudul_Penelitian_Tesis() {
        return judul_Penelitian_Tesis;
    }
    public void setJudul_Penelitian_Tesis(String judul_Penelitian_Tesis) {
        this.judul_Penelitian_Tesis = judul_Penelitian_Tesis;
    }
    public int getSidang1() {
        return sidang1;
    }
    public void setSidang1(int sidang1) {
        this.sidang1 = sidang1;
    }
    public int getSidang2() {
        return sidang2;
    }
    public void setSidang2(int sidang2) {
        this.sidang2 = sidang2;
    }
    public int getSidang3() {
        return sidang3;
    }
    public void setSidang3(int sidang3) {
        this.sidang3 = sidang3;
    }

    @Override
    public String toString() {

        return "Nama : "+getNama()+"\n"
                +"Alamat : "+getAlamat()+"\n"
                +"TTL : "+getTTL()+"\n"+
                "Telepon : "+getTelepon()+"\n"
                +"NIM : "+getNIM()+"\n"
                +"Jurusan : "+getJurusan()+"\n"
                +"Judul Penelitian Tesis : "+getJudul_Penelitian_Tesis()+"\n"
                +"Sidang1 : "+getSidang1()+"\n"
                +"Sidang2 : "+getSidang2()+"\n"
                +"Sidang3 : "+getSidang3()+"\n";
    }
}
