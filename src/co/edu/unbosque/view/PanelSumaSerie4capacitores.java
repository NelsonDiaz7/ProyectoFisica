package co.edu.unbosque.view;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class PanelSumaSerie4capacitores extends JPanel {

    JLabel lblrecordar;
    JLabel lblvoltaje1;
    JLabel lblvoltaje2;
    JLabel lblvoltaje3;
    JLabel lblvoltaje4;

    JLabel lblCantidad;

    JTextField txtvoltaje1;
    JTextField txtvoltaje2;
    JTextField txtvoltaje3;
    JTextField txtvoltaje4;

    JButton btnsumar;
    JButton btnvolver;
    JButton btn3capacitor;
    JButton btn2capacitor;
    JButton btn5capacitor;
    JButton btn6capacitor;

    public PanelSumaSerie4capacitores()
    {
        setLayout(null);
        setVisible(false);
        initComponents();
    }

    public void initComponents()
    {

        setBackground(Color.cyan);
        Font font = new Font("Century Gothic", Font.BOLD, 12);
        TitledBorder tb = new TitledBorder("Suma de 4 capacitores en Serie");
        tb.setTitleFont(font);
        setBorder(tb);

        lblrecordar = new JLabel(" (Recuerda  micro = e-6, nano = e-9, pico = e-12) ");
        lblrecordar.setFont(font);
        lblrecordar.setBounds(140, 20, 300, 20);
        add(lblrecordar);

        lblvoltaje1 = new JLabel("Capacitor 1(F): ");
        lblvoltaje1.setBounds(30,50,100,20);
        add(lblvoltaje1);

        txtvoltaje2 = new JTextField();
        txtvoltaje2.setBounds(120,50,150,20);
        add(txtvoltaje2);

        lblvoltaje2 = new JLabel("Capacitor 2(F): ");
        lblvoltaje2.setBounds(30,90,100,20);
        add(lblvoltaje2);

        txtvoltaje1 = new JTextField();
        txtvoltaje1.setBounds(120,90,150,20);
        add(txtvoltaje1);

        lblvoltaje3 = new JLabel("Capacitor 3(F): ");
        lblvoltaje3.setBounds(30,130,100,20);
        add(lblvoltaje3);

        txtvoltaje3 = new JTextField();
        txtvoltaje3.setBounds(120,130,150,20);
        add(txtvoltaje3);

        lblvoltaje4 = new JLabel("Capacitor 4(F): ");
        lblvoltaje4.setBounds(280,50,100,20);
        add(lblvoltaje4);

        txtvoltaje4 = new JTextField();
        txtvoltaje4.setBounds(370,50,150,20);
        add(txtvoltaje4);

        btnsumar = new JButton("Sumar");
        btnsumar.setBounds(210,170,100,20);
        add(btnsumar);
        btnsumar.setActionCommand("SUMARSERIE4");

        btnvolver = new JButton("Volver");
        btnvolver.setBounds(320,170,100,20);
        add(btnvolver);
        btnvolver.setActionCommand("VOLVERSUMARSERIE4");

        lblCantidad = new JLabel(" ¿Otra Cantidad? ");
        lblCantidad.setFont(font);
        lblCantidad.setBounds(15, 190, 300, 20);
        add(lblCantidad);

        btn3capacitor = new JButton("3 capacitores");
        btn3capacitor.setBounds(15, 215, 112, 20);
        add(btn3capacitor);
        btn3capacitor.setActionCommand("3CAPACITORES4");

        btn2capacitor = new JButton("2 capacitores");
        btn2capacitor.setBounds(140, 215, 112, 20);
        add(btn2capacitor);
        btn2capacitor.setActionCommand("2CAPACITORES4");

        btn5capacitor = new JButton("5 capacitores");
        btn5capacitor.setBounds(265, 215, 112, 20);
        add(btn5capacitor);
        btn5capacitor.setActionCommand("5CAPACITORES4");

        btn6capacitor = new JButton("6 capacitores");
        btn6capacitor.setBounds(390, 215, 112, 20);
        add(btn6capacitor);
        btn6capacitor.setActionCommand("6CAPACITORES4");



    }

    public JLabel getLblrecordar() {
        return lblrecordar;
    }

    public JLabel getLblvoltaje1() {
        return lblvoltaje1;
    }

    public JLabel getLblvoltaje2() {
        return lblvoltaje2;
    }

    public JLabel getLblvoltaje3() {
        return lblvoltaje3;
    }

    public JTextField getTxtvoltaje1() {
        return txtvoltaje1;
    }

    public JTextField getTxtvoltaje2() {
        return txtvoltaje2;
    }

    public JTextField getTxtvoltaje3() {
        return txtvoltaje3;
    }

    public JLabel getLblvoltaje4() {
        return lblvoltaje4;
    }

    public JTextField getTxtvoltaje4() {
        return txtvoltaje4;
    }

    public JButton getBtnsumar() {
        return btnsumar;
    }

    public JButton getBtnvolver() {
        return btnvolver;
    }

    public JButton getBtn3capacitor() {
        return btn3capacitor;
    }

    public JButton getBtn2capacitor() {
        return btn2capacitor;
    }

    public JButton getBtn5capacitor() {
        return btn5capacitor;
    }

    public JButton getBtn6capacitor() {
        return btn6capacitor;
    }
}



