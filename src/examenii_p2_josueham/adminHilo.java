/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenii_p2_josueham;

import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

/**
 *
 * @author skxka
 */
public class adminHilo extends Thread {

    private Deporte deporte;
    private JProgressBar barra;

    public adminHilo() {
    }

    public adminHilo(Deporte deporte, JProgressBar barra) {
        this.deporte = deporte;
        this.barra = barra;
    }

    public Deporte getDeporte() {
        return deporte;
    }

    public void setDeporte(Deporte deporte) {
        this.deporte = deporte;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public void run() {
        barra.setMaximum(7*deporte.getListaTorneos().size());
        barra.setValue(0);
        
        if (barra.getValue() == barra.getMaximum()) {
            barra.setValue(0);
            JOptionPane.showMessageDialog(null, "Deporte guardado correctamente");
        }
        while (true) {
            try {
                Thread.sleep(1000);
                barra.setValue(barra.getValue() + 1);

            } catch (Exception ex) {
            }
        }
    }
}
