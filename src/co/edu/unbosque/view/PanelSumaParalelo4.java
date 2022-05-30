package co.edu.unbosque.view;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class PanelSumaParalelo4 extends JPanel {

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

    JButton btn2;
    JButton btn3;
    JButton btn5;
    JButton btn6;

    public PanelSumaParalelo4()
    {
        setLayout(null);
        setVisible(false);
        initComponents();
    }

    public void initComponents()
    {

        setBackground(Color.cyan);
        Font font = new Font("Century Gothic", Font.BOLD, 12);
        TitledBorder tb = new TitledBorder("Suma capacitores en Paralelo 4");
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
        btnsumar.setBounds(185,160,100,20);
        add(btnsumar);
        btnsumar.setActionCommand("SUMARPARALELO_4");

        btnvolver = new JButton("Volver");
        btnvolver.setBounds(290,160,100,20);
        add(btnvolver);
        btnvolver.setActionCommand("VOLVERSUMARPARALELO_4");

        lblCantidad = new JLabel(" ¿Otra Cantidad? ");
        lblCantidad.setFont(font);
        lblCantidad.setBounds(15, 200, 300, 20);
        add(lblCantidad);

        btn2 = new JButton("2");
        btn2.setBounds(120,200,50,20);
        add(btn2);
        btn2.setActionCommand("BTN2_4");

        btn3 = new JButton("3");
        btn3.setBounds(180,200,50,20);
        add(btn3);
        btn3.setActionCommand("BTN3_4");

        btn5 = new JButton("5");
        btn5.setBounds(240,200,50,20);
        add(btn5);
        btn5.setActionCommand("BTN5_4");

        btn6 = new JButton("6");
        btn6.setBounds(300,200,50,20);
        add(btn6);
        btn6.setActionCommand("BTN6_4");

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

    public JLabel getLblvoltaje4() {
        return lblvoltaje4;
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

    public JTextField getTxtvoltaje3() {
        return txtvoltaje3;
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

    public JButton getBtn2() {
        return btn2;
    }

    public JButton getBtn3() {
        return btn3;
    }

    public JButton getBtn5() {
        return btn5;
    }

    public JButton getBtn6() {
        return btn6;
    }
}
