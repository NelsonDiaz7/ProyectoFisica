package co.edu.unbosque.view;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class PanelDenEne1 extends JPanel {

    private JLabel lblEnergiaalmacenada;
    private JLabel lblarea;
    private JLabel lbldistancia;
    private JLabel erecordar;

    private JTextField txtEnergiaalmacenada;
    private JTextField txtarea;
    private JTextField txtdistancia;

    private JButton btncalcular;
    private JButton btnvolver;

    public PanelDenEne1() {
        initComponents();
        setLayout(null);
        setVisible(false);
    }

    public void initComponents() {

        setBackground(Color.cyan);
        Font font = new Font("Century Gothic", Font.BOLD, 12);
        TitledBorder tb = new TitledBorder("Densidad de energia formula 1");
        tb.setTitleFont(font);
        setBorder(tb);

        erecordar = new JLabel(" (Recuerda  micro = e-6, nano = e-9, pico = e-12) ");
        erecordar.setFont(font);
        erecordar.setBounds(140, 20, 300, 20);
        add(erecordar);

        lblEnergiaalmacenada = new JLabel("Energia almacenada (J): ");
        lblEnergiaalmacenada.setBounds(50,50,150,20);
        add(lblEnergiaalmacenada);

        txtEnergiaalmacenada = new JTextField();
        txtEnergiaalmacenada.setBounds(200,50,250,20);
        add(txtEnergiaalmacenada);

        lblarea = new JLabel("Area (m^2): ");
        lblarea.setBounds(90,90,100,20);
        add(lblarea);

        txtarea = new JTextField();
        txtarea.setBounds(200,90,250,20);
        add(txtarea);

        lbldistancia = new JLabel("Distancia(m): ");
        lbldistancia.setBounds(90,130,100,20);
        add(lbldistancia);

        txtdistancia = new JTextField();
        txtdistancia.setBounds(200,130,250,20);
        add(txtdistancia);

        btncalcular = new JButton("Calcular");
        btncalcular.setBounds(210,170,100,20);
        add(btncalcular);
        btncalcular.setActionCommand("CALCULARDEN1");

        btnvolver = new JButton("Volver");
        btnvolver.setBounds(320,170,100,20);
        add(btnvolver);
        btnvolver.setActionCommand("VOLVERDEN1");

    }

    public JLabel getLblEnergiaalmacenada() {
        return lblEnergiaalmacenada;
    }

    public JLabel getLblarea() {
        return lblarea;
    }

    public JLabel getLbldistancia() {
        return lbldistancia;
    }

    public JLabel getErecordar() {
        return erecordar;
    }

    public JTextField getTxtEnergiaalmacenada() {
        return txtEnergiaalmacenada;
    }

    public JTextField getTxtarea() {
        return txtarea;
    }

    public JTextField getTxtdistancia() {
        return txtdistancia;
    }

    public JButton getBtncalcular() {
        return btncalcular;
    }

    public JButton getBtnvolver() {
        return btnvolver;
    }
}
