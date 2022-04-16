package co.edu.unbosque.view;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class PanelPotencialUnaCarga extends JPanel {

    private JLabel lblcarga;
    private JLabel lbldistancia;
    private JLabel erecordar;

    private JTextField txtcarga;
    private JTextField txtdistancia;

    private JButton btncalcular;
    private JButton btnvolver;

    public PanelPotencialUnaCarga()
    {
      setLayout(null);
      setVisible(false);
      initComponents();
    }

    public void initComponents()
    {

        setBackground(Color.cyan);
        Font font = new Font("Century Gothic", Font.BOLD, 12);
        TitledBorder tb = new TitledBorder("Potencial de una carga");
        tb.setTitleFont(font);
        setBorder(tb);

        erecordar = new JLabel(" (Recuerda  micro = e-6, nano = e-9, pico = e-12) ");
        erecordar.setFont(font);
        erecordar.setBounds(140, 20, 300, 20);
        add(erecordar);

        lblcarga = new JLabel("Carga (N/C): ");
        lblcarga.setBounds(90, 50, 100, 20);
        add(lblcarga);

        lbldistancia = new JLabel("Distancia entre punto y carga(m): ");
        lbldistancia.setBounds(10, 90, 200, 20);
        add(lbldistancia);

        txtcarga = new JTextField();
        txtcarga.setBounds(200, 50, 250, 20);
        add(txtcarga);

        txtdistancia = new JTextField();
        txtdistancia.setBounds(200, 90, 250, 20);
        add(txtdistancia);

        btncalcular = new JButton("Calcular");
        btncalcular.setBounds(210, 150, 100, 20);
        add(btncalcular);
        btncalcular.setActionCommand("CALCULARPOTECARGA");

        btnvolver = new JButton("Volver");
        btnvolver.setBounds(320, 150, 100, 20);
        add(btnvolver);
        btnvolver.setActionCommand("VOLVERPOTECARGA");

    }

    public JLabel getLblcarga() {
        return lblcarga;
    }

    public JLabel getLbldistancia() {
        return lbldistancia;
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

    public JButton getBtncalcular() {
        return btncalcular;
    }

    public JButton getBtnvolver() {
        return btnvolver;
    }
}
