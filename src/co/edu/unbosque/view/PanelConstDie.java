package co.edu.unbosque.view;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class PanelConstDie extends JPanel {

    JLabel lblRecordar;
    JLabel lblCapConD;
    JLabel lblCapSinD;

    JTextField txtCapConD;
    JTextField txtCapSinD;

    JButton btnCalcular;
    JButton btnVolver;

    public PanelConstDie(){
        setLayout(null);
        setVisible(false);
        componentes();
    }

    public void componentes(){
        setBackground(Color.cyan);
        Font font = new Font("Century Gothic", Font.BOLD, 12);
        TitledBorder tb = new TitledBorder("Calcular constante dieléctrica");
        tb.setTitleFont(font);
        setBorder(tb);

        lblCapConD = new JLabel("Capacitor con dieléctrico (F): ");
        lblCapConD.setBounds(30,50,180,20);
        add(lblCapConD);

        txtCapConD = new JTextField();
        txtCapConD.setBounds(220,50,250,20);
        add(txtCapConD);

        lblCapSinD = new JLabel("Capacitor sin dieléctrico (F): ");
        lblCapSinD.setBounds(30,90,180,20);
        add(lblCapSinD);

        txtCapSinD = new JTextField();
        txtCapSinD.setBounds(220,90,250,20);
        add(txtCapSinD);

        btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(210,170,100,20);
        add(btnCalcular);
        btnCalcular.setActionCommand("CALCONSTD");

        btnVolver = new JButton("Volver");
        btnVolver.setBounds(320,170,100,20);
        add(btnVolver);
        btnVolver.setActionCommand("VOLVERCONSTANTED");
    }

    public JLabel getLblRecordar() {
        return lblRecordar;
    }

    public void setLblRecordar(JLabel lblRecordar) {
        this.lblRecordar = lblRecordar;
    }

    public JLabel getLblCapConD() {
        return lblCapConD;
    }

    public void setLblCapConD(JLabel lblCapConD) {
        this.lblCapConD = lblCapConD;
    }

    public JLabel getLblCapSinD() {
        return lblCapSinD;
    }

    public void setLblCapSinD(JLabel lblCapSinD) {
        this.lblCapSinD = lblCapSinD;
    }

    public JTextField getTxtCapConD() {
        return txtCapConD;
    }

    public void setTxtCapConD(JTextField txtCapConD) {
        this.txtCapConD = txtCapConD;
    }

    public JTextField getTxtCapSinD() {
        return txtCapSinD;
    }

    public void setTxtCapSinD(JTextField txtCapSinD) {
        this.txtCapSinD = txtCapSinD;
    }

    public JButton getBtnCalcular() {
        return btnCalcular;
    }

    public void setBtnCalcular(JButton btnCalcular) {
        this.btnCalcular = btnCalcular;
    }

    public JButton getBtnVolver() {
        return btnVolver;
    }

    public void setBtnVolver(JButton btnVolver) {
        this.btnVolver = btnVolver;
    }
}
