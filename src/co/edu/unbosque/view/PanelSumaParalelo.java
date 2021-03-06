package co.edu.unbosque.view;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class PanelSumaParalelo extends JPanel {

    JLabel lblrecordar;
    JLabel lblvoltaje1;
    JLabel lblvoltaje2;
    JLabel lblvoltaje3;

    JLabel lblCantidad;

    JTextField txtvoltaje1;
    JTextField txtvoltaje2;
    JTextField txtvoltaje3;

    JButton btnsumar;
    JButton btnvolver;

    JButton btn2;
    JButton btn4;
    JButton btn5;
    JButton btn6;

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
        TitledBorder tb = new TitledBorder("Suma capacitores en Paralelo 3");
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
        btnsumar.setBounds(185,160,100,20);
        add(btnsumar);
        btnsumar.setActionCommand("SUMARPARALELO_3");

        btnvolver = new JButton("Volver");
        btnvolver.setBounds(290,160,100,20);
        add(btnvolver);
        btnvolver.setActionCommand("VOLVERSUMARPARALELO_3");

        lblCantidad = new JLabel(" ??Otra Cantidad? ");
        lblCantidad.setFont(font);
        lblCantidad.setBounds(15, 200, 300, 20);
        add(lblCantidad);

        btn2 = new JButton("2");
        btn2.setBounds(120,200,50,20);
        add(btn2);
        btn2.setActionCommand("BTN2_3");

        btn4 = new JButton("4");
        btn4.setBounds(180,200,50,20);
        add(btn4);
        btn4.setActionCommand("BTN4_3");

        btn5 = new JButton("5");
        btn5.setBounds(240,200,50,20);
        add(btn5);
        btn5.setActionCommand("BTN5_3");

        btn6 = new JButton("6");
        btn6.setBounds(300,200,50,20);
        add(btn6);
        btn6.setActionCommand("BTN6_3");

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

    public JLabel getLblCantidad() {
        return lblCantidad;
    }

    public void setLblCantidad(JLabel lblCantidad) {
        this.lblCantidad = lblCantidad;
    }

    public JButton getBtn2() {
        return btn2;
    }

    public void setBtn2(JButton btn2) {
        this.btn2 = btn2;
    }

    public JButton getBtn4() {
        return btn4;
    }

    public void setBtn4(JButton btn4) {
        this.btn4 = btn4;
    }

    public JButton getBtn5() {
        return btn5;
    }

    public void setBtn5(JButton btn5) {
        this.btn5 = btn5;
    }

    public JButton getBtn6() {
        return btn6;
    }

    public void setBtn6(JButton btn6) {
        this.btn6 = btn6;
    }
}
