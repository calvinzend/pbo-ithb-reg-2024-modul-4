package modul4.view;

import javax.swing.*;

public class PrintNRView {
    public String inputKodeMK() {
        return JOptionPane.showInputDialog("Masukkan Kode MK : ");
    }

    public void tamplikanNilaiNR(double nilaiNR, String kode){
        JOptionPane.showMessageDialog(
            null, 
            "Kode Mata Kuliah : " + kode 
            +"\nNilai NR : "+ nilaiNR, 
            "Nilai Rata-rata Akhir ", 
            JOptionPane.INFORMATION_MESSAGE
        );
    }

    public void tampilkanError() {
        JOptionPane.showMessageDialog(
                null,
                "Kode IMata Kuliah salah!!",
                "Data Mahasiswa",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}
