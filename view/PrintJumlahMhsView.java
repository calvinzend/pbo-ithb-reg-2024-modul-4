package modul4.view;

import javax.swing.JOptionPane;

public class PrintJumlahMhsView {
    public String inputMK() {
        return JOptionPane.showInputDialog("Masukkan kode MK : ");
    }

    public void tampilkanOutput(int gagal,int banyak, String MK) {
        JOptionPane.showMessageDialog(
            null, "Nama : " + gagal+ "\nJam ngajar : "+
            MK, 
            "Jam ngajar", 
            JOptionPane.INFORMATION_MESSAGE
        );
    }

    
    public void tampilkanError() {
        JOptionPane.showMessageDialog(
                null,
                "Kode MK tidak ada",
                "Data tidak ditemukan",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}
