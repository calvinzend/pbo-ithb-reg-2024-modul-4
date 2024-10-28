package modul4.view;

import javax.swing.*;

public class PrintMatkulAmbilView {
    public String inputNIM() {
        return JOptionPane.showInputDialog("Masukkan NIM : ");
    }

    public void tampilkan(String pesan){
        JOptionPane.showMessageDialog(
            null, 
            pesan, 
            "Nilai Mahasiswa", 
            JOptionPane.INFORMATION_MESSAGE
        );
    }
}
