package co.edu.unbosque.view;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class PanelSumaSerie2capacitores extends JPanel {

    JLabel lblrecordar;
    JLabel lblvoltaje1;
    JLabel lblvoltaje2;

    JLabel lblCantidad;

    JTextField txtvoltaje1;
    JTextField txtvoltaje2;

    JButton btnsumar;
    JButton btnvolver;
    JButton btn3capacitor;  JButton btn4capacitor;
    JButton btn5capacitor;
    JButton btn6capacitor;

    public PanelSumaSerie2capacitores()
    {
        setLayout(null);
        setVisible(false);
        initComponents();
    }

    public void initComponents()
    {

        setBackground(Color.cyan);
        Font font = new Font("Century Gothic", Font.BOLD, 12);
        TitledBorder tb = new TitledBorder("Suma de 2 capacitores en Serie");
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

        btnsumar = new JButton("Sumar");
        btnsumar.setBounds(210,170,100,20);
        add(btnsumar);
        btnsumar.setActionCommand("SUMARSERIE2");

        btnvolver = new JButton("Volver");
        btnvolver.setBounds(320,170,100,20);
        add(btnvolver);
        btnvolver.setActionCommand("VOLVERSUMARSERIE2");

        lblCantidad = new JLabel(" ¿Otra Cantidad? ");
        lblCantidad.setFont(font);
        lblCantidad.setBounds(15, 190, 300, 20);
        add(lblCantidad);

        btn3capacitor = new JButton("3 capacitores");
        btn3capacitor.setBounds(15, 215, 112, 20);
        add(btn3capacitor);
        btn3capacitor.setActionCommand("3CAPACITORES2");

        btn4capacitor = new JButton("4 capacitores");
        btn4capacitor.setBounds(140, 215, 112, 20);
        add(btn4capacitor);
        btn4capacitor.setActionCommand("4CAPACITORES2");

        btn5capacitor = new JButton("5 capacitores");
        btn5capacitor.setBounds(265, 215, 112, 20);
        add(btn5capacitor);
        btn5capacitor.setActionCommand("5CAPACITORES2");

        btn6capacitor = new JButton("6 capacitores");
        btn6capacitor.setBounds(390, 215, 112, 20);
        add(btn6capacitor);
        btn6capacitor.setActionCommand("6CAPACITORES2");



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

    public JTextField getTxtvoltaje1() {
        return txtvoltaje1;
    }

    public JTextField getTxtvoltaje2() {
        return txtvoltaje2;
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

    public JButton getBtn4capacitor() {
        return btn4capacitor;
    }

    public JButton getBtn5capacitor() {
        return btn5capacitor;
    }

    public JButton getBtn6capacitor() {
        return btn6capacitor;
    }
}



