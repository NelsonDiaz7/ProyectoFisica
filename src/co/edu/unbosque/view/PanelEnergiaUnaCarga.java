package co.edu.unbosque.view;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class PanelEnergiaUnaCarga  extends JPanel {

    private JLabel lblcarga;
    private JLabel lbldistancia;
    private JLabel lblcarga2;
    private JLabel lbldistancia2;
    private JLabel lblcarga3;
    private JLabel lbldistancia3;
    private JLabel erecordar;

    private JTextField txtcarga;
    private JTextField txtdistancia;
    private JTextField txtcarga2;
    private JTextField txtdistancia2;
    private JTextField txtcarga3;
    private JTextField txtdistancia3;

    private JButton btncalcular;
    private JButton btnvolver;


    public PanelEnergiaUnaCarga() {
        setLayout(null);
        setVisible(false);
        initComponents();
    }

    public void initComponents()
    {

        setBackground(Color.cyan);
        Font font = new Font("Century Gothic", Font.BOLD, 12);
        TitledBorder tb = new TitledBorder("Energia Potencial sobre una carga");
        tb.setTitleFont(font);
        setBorder(tb);

        erecordar = new JLabel(" (Recuerda  micro = e-6, nano = e-9, pico = e-12) ");
        erecordar.setFont(font);
        erecordar.setBounds(140, 20, 300, 20);
        add(erecordar);

        lblcarga = new JLabel("Carga a analizar(C):");
        lblcarga.setBounds(10, 60, 200, 20);
        add(lblcarga);

        lbldistancia = new JLabel("Distancia inicial 1(m):");
        lbldistancia.setBounds(10, 90, 200, 20);
        add(lbldistancia);

        lblcarga2 = new JLabel("Carga 2(C):");
        lblcarga2.setBounds(30, 120, 200, 20);
        add(lblcarga2);

        lbldistancia2 = new JLabel("Distancia inicial 2(m):");
        lbldistancia2.setBounds(10, 150, 200, 20);
        add(lbldistancia2);

        lblcarga3 = new JLabel("Carga 3(C):");
        lblcarga3.setBounds(300, 80, 200, 20);
        add(lblcarga3);

        lbldistancia3 = new JLabel("Distancia inicial 3(m):");
        lbldistancia3.setBounds(280, 110, 200, 20);
        add(lbldistancia3);

        txtcarga = new JTextField();
        txtcarga.setBounds(150, 60, 120, 20);
        add(txtcarga);

        txtdistancia = new JTextField();
        txtdistancia.setBounds(150, 90, 120, 20);
        add(txtdistancia);

        txtcarga2 = new JTextField();
        txtcarga2.setBounds(150, 120, 120, 20);
        add(txtcarga2);

        txtdistancia2 = new JTextField();
        txtdistancia2.setBounds(150, 150, 120, 20);
        add(txtdistancia2);

        txtcarga3 = new JTextField();
        txtcarga3.setBounds(405, 80, 120, 20);
        add(txtcarga3);

        txtdistancia3 = new JTextField();
        txtdistancia3.setBounds(405, 110, 120, 20);
        add(txtdistancia3);

        btncalcular = new JButton("Calcular");
        btncalcular.setBounds(200, 210, 100, 20);
        add(btncalcular);
        btncalcular.setActionCommand("CALCULARENERGIAUNACARGA");

        btnvolver = new JButton("Volver");
        btnvolver.setBounds(310, 210, 100, 20);
        add(btnvolver);
        btnvolver.setActionCommand("VOLVERENERGIAUNACARGA");
    }

    public JLabel getLblcarga() {
        return lblcarga;
    }

    public JLabel getLbldistancia() {
        return lbldistancia;
    }

    public JLabel getLblcarga2() {
        return lblcarga2;
    }

    public JLabel getLbldistancia2() {
        return lbldistancia2;
    }

    public JLabel getLblcarga3() {
        return lblcarga3;
    }

    public JLabel getLbldistancia3() {
        return lbldistancia3;
    }

    public JLabel getErecordar() {
        return erecordar;
    }

    public JTextField getTxtcarga() {
        return txtcarga;
    }

    public JTextField getTxtdistancia() {
        return txtdistancia;
    }

    public JTextField getTxtcarga2() {
        return txtcarga2;
    }

    public JTextField getTxtdistancia2() {
        return txtdistancia2;
    }

    public JTextField getTxtcarga3() {
        return txtcarga3;
    }

    public JTextField getTxtdistancia3() {
        return txtdistancia3;
    }

    public JButton getBtncalcular() {
        return btncalcular;
    }

    public JButton getBtnvolver() {
        return btnvolver;
    }
}
