package modul4.model.classes;

abstract class Staff extends User{
    private String NIK;

    public Staff(String nama, String alamat, String TTL, String telepon, String NIK) {
        super(nama, alamat, TTL, telepon);
        this.NIK = NIK;
    }

    public String getNIK() {
        return NIK;
    }

    public void setNIK(String nIK) {
        NIK = nIK;
    }

    
}
