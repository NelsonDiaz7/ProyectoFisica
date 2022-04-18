package co.edu.unbosque.view;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class PanelDenEne2 extends JPanel {

    private JLabel lblcampo;
    private JLabel erecordar;

    private JTextField txtcampo;

    private JButton btncalcular;
    private JButton btnvolver;


    public PanelDenEne2() {
        initComponents();
        setLayout(null);
        setVisible(false);
    }

    public void initComponents() {

        setBackground(Color.cyan);
        Font font = new Font("Century Gothic", Font.BOLD, 12);
        TitledBorder tb = new TitledBorder("Densidad de energia formula 2");
        tb.setTitleFont(font);
        setBorder(tb);

        erecordar = new JLabel(" (Recuerda  micro = e-6, nano = e-9, pico = e-12) ");
        erecordar.setFont(font);
        erecordar.setBounds(140, 20, 300, 20);
        add(erecordar);

        lblcampo = new JLabel("Campo Electrico (C/N): ");
        lblcampo.setBounds(40,90,150,20);
        add(lblcampo);

        txtcampo = new JTextField();
        txtcampo.setBounds(200,90,250,20);
        add(txtcampo);

        btncalcular = new JButton("Calcular");
        btncalcular.setBounds(210,170,100,20);
        add(btncalcular);
        btncalcular.setActionCommand("CALCULARDEN2");

        btnvolver = new JButton("Volver");
        btnvolver.setBounds(320,170,100,20);
        add(btnvolver);
        btnvolver.setActionCommand("VOLVERDEN2");

    }

    public JLabel getLblcampo() {
        return lblcampo;
    }

    public JLabel getErecordar() {
        return erecordar;
    }

    public JTextField getTxtcampo() {
        return txtcampo;
    }

    public JButton getBtncalcular() {
        return btncalcular;
    }

    public JButton getBtnvolver() {
        return btnvolver;
    }
}
