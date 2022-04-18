package co.edu.unbosque.view;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class PanelEneAlm1 extends JPanel {

    private JLabel lblcarga;
    private JLabel lblcapacitancia;
    private JLabel erecordar;

    private JTextField txtcarga;
    private JTextField txtcapacitancia;

    private JButton btncalcular;
    private JButton btnvolver;

    public PanelEneAlm1()
    {
        initComponents();
        setLayout(null);
        setVisible(false);
    }

    public void initComponents()
    {
        setBackground(Color.cyan);
        Font font = new Font("Century Gothic", Font.BOLD, 12);
        TitledBorder tb = new TitledBorder("Energia almacenada formula 1");
        tb.setTitleFont(font);
        setBorder(tb);

        erecordar = new JLabel(" (Recuerda  micro = e-6, nano = e-9, pico = e-12) ");
        erecordar.setFont(font);
        erecordar.setBounds(140, 20, 300, 20);
        add(erecordar);

        lblcarga = new JLabel("Carga (C): ");
        lblcarga.setBounds(90, 50, 100, 20);
        add(lblcarga);

        lblcapacitancia = new JLabel("Capacitancia (F): ");
        lblcapacitancia.setBounds(90, 90, 100, 20);
        add(lblcapacitancia);

        txtcarga = new JTextField();
        txtcarga.setBounds(200, 50, 250, 20);
        add(txtcarga);

        txtcapacitancia = new JTextField();
        txtcapacitancia.setBounds(200, 90, 250, 20);
        add(txtcapacitancia);

        btncalcular = new JButton("Calcular");
        btncalcular.setBounds(210, 150, 100, 20);
        add(btncalcular);
        btncalcular.setActionCommand("CALCULARALM1");

        btnvolver = new JButton("Volver");
        btnvolver.setBounds(320, 150, 100, 20);
        add(btnvolver);
        btnvolver.setActionCommand("VOLVERALM1");
    }

    public JLabel getLblcarga() {
        return lblcarga;
    }

    public JLabel getLblcapacitancia() {
        return lblcapacitancia;
    }

    public JLabel getErecordar() {
        return erecordar;
    }

    public JTextField getTxtcarga() {
        return txtcarga;
    }

    public JTextField getTxtcapacitancia() {
        return txtcapacitancia;
    }

    public JButton getBtncalcular() {
        return btncalcular;
    }

    public JButton getBtnvolver() {
        return btnvolver;
    }
}
