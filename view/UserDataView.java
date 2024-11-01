package modul4.view;

import javax.swing.*;

public class UserDataView {
    public void tampilkanPesan(StringBuilder pesan) {
        JOptionPane.showMessageDialog(
            null, 
            pesan.toString(), 
            "Data Mahasiswa", 
            JOptionPane.INFORMATION_MESSAGE
        );
    }

    public String inputNama() {
        return JOptionPane.showInputDialog("Masukkan Nama : ");
    }

}
