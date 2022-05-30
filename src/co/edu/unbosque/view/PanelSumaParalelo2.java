package co.edu.unbosque.view;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class PanelSumaParalelo2 extends JPanel {

    JLabel lblrecordar;
    JLabel lblvoltaje1;
    JLabel lblvoltaje2;

    JLabel lblCantidad;

    JTextField txtvoltaje1;
    JTextField txtvoltaje2;

    JButton btnsumar;
    JButton btnvolver;

    JButton btn3;
    JButton btn4;
    JButton btn5;
    JButton btn6;

    public PanelSumaParalelo2()
    {
        setLayout(null);
        setVisible(false);
        initComponents();
    }

    public void initComponents()
    {

        setBackground(Color.cyan);
        Font font = new Font("Century Gothic", Font.BOLD, 12);
        TitledBorder tb = new TitledBorder("Suma capacitores en Paralelo 2");
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
        btnsumar.setBounds(185,160,100,20);
        add(btnsumar);
        btnsumar.setActionCommand("SUMARPARALELO_2");

        btnvolver = new JButton("Volver");
        btnvolver.setBounds(290,160,100,20);
        add(btnvolver);
        btnvolver.setActionCommand("VOLVERSUMARPARALELO_2");

        lblCantidad = new JLabel(" ¿Otra Cantidad? ");
        lblCantidad.setFont(font);
        lblCantidad.setBounds(15, 200, 300, 20);
        add(lblCantidad);

        btn3 = new JButton("3");
        btn3.setBounds(120,200,50,20);
        add(btn3);
        btn3.setActionCommand("BTN3_2");

        btn4 = new JButton("4");
        btn4.setBounds(180,200,50,20);
        add(btn4);
        btn4.setActionCommand("BTN4_2");

        btn5 = new JButton("5");
        btn5.setBounds(240,200,50,20);
        add(btn5);
        btn5.setActionCommand("BTN5_2");

        btn6 = new JButton("6");
        btn6.setBounds(300,200,50,20);
        add(btn6);
        btn6.setActionCommand("BTN6_2");

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

    public JLabel getLblCantidad() {
        return lblCantidad;
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

    public JButton getBtn3() {
        return btn3;
    }

    public JButton getBtn4() {
        return btn4;
    }

    public JButton getBtn5() {
        return btn5;
    }

    public JButton getBtn6() {
        return btn6;
    }
}
