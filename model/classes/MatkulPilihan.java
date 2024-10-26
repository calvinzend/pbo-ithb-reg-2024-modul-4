package modul4.model.classes;

public class MatkulPilihan extends MataKuliah{
    private int minimumMHS;

    public MatkulPilihan(String kode, String nama, int sks, int minimumMHS) {
        super(kode, nama, sks);
        this.minimumMHS = minimumMHS;
    }
    
    public int getMinimumMHS() {
        return minimumMHS;
    }

    public void setMinimumMHS(int minimumMHS) {
        this.minimumMHS = minimumMHS;
    }

    @Override
    public String toString() {
        return super.toString() + " Minimul mahasiswa : " +  getMinimumMHS();
    }
}
