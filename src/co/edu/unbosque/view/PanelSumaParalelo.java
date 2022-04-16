package co.edu.unbosque.view;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class PanelSumaParalelo extends JPanel {

    JLabel lblrecordar;
    JLabel lblvoltaje1;
    JLabel lblvoltaje2;
    JLabel lblvoltaje3;

    JTextField txtvoltaje1;
    JTextField txtvoltaje2;
    JTextField txtvoltaje3;

    JButton btnsumar;
    JButton btnvolver;

    public PanelSumaParalelo()
    {
        setLayout(null);
        setVisible(false);
        initComponents();
    }

    public void initComponents()
    {

        setBackground(Color.cyan);
        Font font = new Font("Century Gothic", Font.BOLD, 12);
        TitledBorder tb = new TitledBorder("Suma capacitores en Paralelo");
        tb.setTitleFont(font);
        setBorder(tb);

        lblrecordar = new JLabel(" (Recuerda  micro = e-6, nano = e-9, pico = e-12) ");
        lblrecordar.setFont(font);
        lblrecordar.setBounds(140, 20, 300, 20);
        add(lblrecordar);

        lblvoltaje1 = new JLabel("Capacitor 1(F): ");
        lblvoltaje1.setBounds(90,50,100,20);
        add(lblvoltaje1);

        txtvoltaje2 = new JTextField();
        txtvoltaje2.setBounds(200,50,250,20);
        add(txtvoltaje2);

        lblvoltaje2 = new JLabel("Capacitor 2(F): ");
        lblvoltaje2.setBounds(90,90,100,20);
        add(lblvoltaje2);

        txtvoltaje1 = new JTextField();
        txtvoltaje1.setBounds(200,90,250,20);
        add(txtvoltaje1);

        lblvoltaje3 = new JLabel("Capacitor 3(F): ");
        lblvoltaje3.setBounds(90,130,100,20);
        add(lblvoltaje3);

        txtvoltaje3 = new JTextField();
        txtvoltaje3.setBounds(200,130,250,20);
        add(txtvoltaje3);

        btnsumar = new JButton("Sumar");
        btnsumar.setBounds(210,170,100,20);
        add(btnsumar);
        btnsumar.setActionCommand("SUMARPARALELO");

        btnvolver = new JButton("Volver");
        btnvolver.setBounds(320,170,100,20);
        add(btnvolver);
        btnvolver.setActionCommand("VOLVERSUMARPARALELO");

    }

    public JLabel getLblrecordar() {
        return lblrecordar;
    }

    public void setLblrecordar(JLabel lblrecordar) {
        this.lblrecordar = lblrecordar;
    }

    public JLabel getLblvoltaje1() {
        return lblvoltaje1;
    }

    public void setLblvoltaje1(JLabel lblvoltaje1) {
        this.lblvoltaje1 = lblvoltaje1;
    }

    public JLabel getLblvoltaje2() {
        return lblvoltaje2;
    }

    public void setLblvoltaje2(JLabel lblvoltaje2) {
        this.lblvoltaje2 = lblvoltaje2;
    }

    public JLabel getLblvoltaje3() {
        return lblvoltaje3;
    }

    public void setLblvoltaje3(JLabel lblvoltaje3) {
        this.lblvoltaje3 = lblvoltaje3;
    }

    public JTextField getTxtvoltaje1() {
        return txtvoltaje1;
    }

    public void setTxtvoltaje1(JTextField txtvoltaje1) {
        this.txtvoltaje1 = txtvoltaje1;
    }

    public JTextField getTxtvoltaje2() {
        return txtvoltaje2;
    }

    public void setTxtvoltaje2(JTextField txtvoltaje2) {
        this.txtvoltaje2 = txtvoltaje2;
    }

    public JTextField getTxtvoltaje3() {
        return txtvoltaje3;
    }

    public void setTxtvoltaje3(JTextField txtvoltaje3) {
        this.txtvoltaje3 = txtvoltaje3;
    }

    public JButton getBtnsumar() {
        return btnsumar;
    }

    public void setBtnsumar(JButton btnsumar) {
        this.btnsumar = btnsumar;
    }

    public JButton getBtnvolver() {
        return btnvolver;
    }

    public void setBtnvolver(JButton btnvolver) {
        this.btnvolver = btnvolver;
    }
}
