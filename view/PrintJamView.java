package modul4.view;

import javax.swing.JOptionPane;

public class PrintJamView {
    public String inputNIK() {
        return JOptionPane.showInputDialog("Masukkan NIK : ");
    }

    public void tampilkanJam(int jam, String nama) {
        JOptionPane.showMessageDialog(
            null, "Nama : " +nama+ "\nJam ngajar : "+
            jam, 
            "Jam ngajar", 
            JOptionPane.INFORMATION_MESSAGE
        );
    }

    public void tampilkanError() {
        JOptionPane.showMessageDialog(
                null,
                "Data tidak ditemukkan",
                "Data tidak ditemukan",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}
