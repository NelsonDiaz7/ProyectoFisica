package co.edu.unbosque.view;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class PanelEneAlm3 extends JPanel {

    private JLabel lblcarga;
    private JLabel lblvoltaje;
    private JLabel erecordar;

    private JTextField txtcarga;
    private JTextField txtvoltaje;

    private JButton btncalcular;
    private JButton btnvolver;

    public PanelEneAlm3()
    {
        initComponents();
        setLayout(null);
        setVisible(false);
    }

    public void initComponents()
    {
        setBackground(Color.cyan);
        Font font = new Font("Century Gothic", Font.BOLD, 12);
        TitledBorder tb = new TitledBorder("Energia almacenada formula 3");
        tb.setTitleFont(font);
        setBorder(tb);

        erecordar = new JLabel(" (Recuerda  micro = e-6, nano = e-9, pico = e-12) ");
        erecordar.setFont(font);
        erecordar.setBounds(140, 20, 300, 20);
        add(erecordar);

        lblcarga = new JLabel("Carga (C): ");
        lblcarga.setBounds(90, 50, 100, 20);
        add(lblcarga);

        lblvoltaje = new JLabel("Voltaje (V): ");
        lblvoltaje.setBounds(90, 90, 100, 20);
        add(lblvoltaje);

        txtcarga = new JTextField();
        txtcarga.setBounds(200, 50, 250, 20);
        add(txtcarga);

        txtvoltaje = new JTextField();
        txtvoltaje.setBounds(200, 90, 250, 20);
        add(txtvoltaje);

        btncalcular = new JButton("Calcular");
        btncalcular.setBounds(210, 150, 100, 20);
        add(btncalcular);
        btncalcular.setActionCommand("CALCULARALM3");

        btnvolver = new JButton("Volver");
        btnvolver.setBounds(320, 150, 100, 20);
        add(btnvolver);
        btnvolver.setActionCommand("VOLVERALM3");
    }

    public JLabel getLblcarga() {
        return lblcarga;
    }

    public JLabel getLblvoltaje() {
        return lblvoltaje;
    }

    public JLabel getErecordar() {
        return erecordar;
    }

    public JTextField getTxtcarga() {
        return txtcarga;
    }

    public JTextField getTxtvoltaje() {
        return txtvoltaje;
    }

    public JButton getBtncalcular() {
        return btncalcular;
    }

    public JButton getBtnvolver() {
        return btnvolver;
    }
}
