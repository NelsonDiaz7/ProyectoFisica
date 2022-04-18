package co.edu.unbosque.view;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class PanelEneAlm2 extends JPanel {

    private JLabel lblcapacitancia;
    private JLabel lblvoltaje;
    private JLabel erecordar;

    private JTextField txtcapacitancia;
    private JTextField txtvoltaje;

    private JButton btncalcular;
    private JButton btnvolver;

    public PanelEneAlm2()
    {
        initComponents();
        setLayout(null);
        setVisible(false);
    }

    public void initComponents()
    {
        setBackground(Color.cyan);
        Font font = new Font("Century Gothic", Font.BOLD, 12);
        TitledBorder tb = new TitledBorder("Energia almacenada formula 2");
        tb.setTitleFont(font);
        setBorder(tb);

        erecordar = new JLabel(" (Recuerda  micro = e-6, nano = e-9, pico = e-12) ");
        erecordar.setFont(font);
        erecordar.setBounds(140, 20, 300, 20);
        add(erecordar);

        lblcapacitancia = new JLabel("Capacitancia (F): ");
        lblcapacitancia.setBounds(90, 50, 100, 20);
        add(lblcapacitancia);

        lblvoltaje = new JLabel("Voltaje (V): ");
        lblvoltaje.setBounds(90, 90, 100, 20);
        add(lblvoltaje);

        txtcapacitancia = new JTextField();
        txtcapacitancia.setBounds(200, 50, 250, 20);
        add(txtcapacitancia);

        txtvoltaje = new JTextField();
        txtvoltaje.setBounds(200, 90, 250, 20);
        add(txtvoltaje);

        btncalcular = new JButton("Calcular");
        btncalcular.setBounds(210, 150, 100, 20);
        add(btncalcular);
        btncalcular.setActionCommand("CALCULARALM2");

        btnvolver = new JButton("Volver");
        btnvolver.setBounds(320, 150, 100, 20);
        add(btnvolver);
        btnvolver.setActionCommand("VOLVERALM2");
    }

    public JLabel getLblcapacitancia() {
        return lblcapacitancia;
    }

    public JLabel getLblvoltaje() {
        return lblvoltaje;
    }

    public JLabel getErecordar() {
        return erecordar;
    }

    public JTextField getTxtcapacitancia() {
        return txtcapacitancia;
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
