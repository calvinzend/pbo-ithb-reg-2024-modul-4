package modul4.model.classes;

abstract class Mahasiswa extends User{
    private String NIM, jurusan;


    public Mahasiswa(String nama, String alamat, String TTL, String telepon, String NIM, String jurusan) {
        super(nama, alamat, TTL, telepon);
        this.NIM = NIM;
        this.jurusan = jurusan;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String nIM) {
        NIM = nIM;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
}
