package modul4.view;

import javax.swing.*;

public class PrintNAView {
    public String inputNIM() {
        return JOptionPane.showInputDialog("Masukkan NIM : ");
    }
    public String inputKodeMK() {
        return JOptionPane.showInputDialog("Masukkan Kode MK : ");
    }

    public void tampilkanNilaiAkhir(String nim, String mk, double nilaiAkhir, String nama) {
        JOptionPane.showMessageDialog(
            null, 
            "NIM : "+ nim 
            + "\nNama : "+ nama +
            "\nNilai akhir : "+ nilaiAkhir, 
            "Nilai Mahasiswa", 
            JOptionPane.INFORMATION_MESSAGE
        );
    }

    public void tampilkanError(String s) {
        JOptionPane.showMessageDialog(
                null,
                s,
                "Data Mahasiswa",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}
