package modul4.view;

import javax.swing.JOptionPane;

public class PrintGajiView {
    public void tampilkanGaji(double gaji, String nama) {
        JOptionPane.showMessageDialog(
            null, "Nama : " +nama+ "\nGaji : "+
            gaji, 
            "Gaji Staff", 
            JOptionPane.INFORMATION_MESSAGE
        );
    }

    public String inputNIK() {
        return JOptionPane.showInputDialog("Masukkan NIK : ");
    }

    public void tampilkanError() {
        JOptionPane.showMessageDialog(
                null,
                "Data tidak ditemukkan",
                "Data Mahasiswa",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

}

