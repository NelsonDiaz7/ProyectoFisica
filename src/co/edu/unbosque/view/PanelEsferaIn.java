package co.edu.unbosque.view;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class PanelEsferaIn extends JPanel {

    JLabel lblcarga;
    JLabel lblradior;
    JLabel lblradioR;
    JLabel erecordar;

    JTextField txtcarga;
    JTextField txtradior;
    JTextField txtradioR;

    JButton btncalcular;
    JButton btnvolver;

    public PanelEsferaIn() {
        setLayout(null);
        setVisible(false);
        initComponents();
    }

    public void initComponents()
    {
        setBackground(Color.cyan);
        Font font = new Font("Century Gothic", Font.BOLD, 12);
        TitledBorder tb = new TitledBorder("Campo dentro de una esfera");
        tb.setTitleFont(font);
        setBorder(tb);

        erecordar = new JLabel(" (Recuerda  micro = e-6, nano = e-9, pico = e-12) ");
        erecordar.setFont(font);
        erecordar.setBounds(140, 20, 300, 20);
        add(erecordar);

        lblcarga = new JLabel("Carga (N/C): ");
        lblradior = new JLabel("Radio r (m): ");
        lblradioR = new JLabel("Radio R (m): ");

        txtcarga = new JTextField();
        txtradior = new JTextField();
        txtradioR = new JTextField();

        btncalcular = new JButton("Calcular");
        btncalcular.setActionCommand("CALCULARESFERAIN");
        btnvolver = new JButton("Volver");
        btnvolver.setActionCommand("VOLVERESFERAIN");

        lblcarga.setBounds(90, 50, 100, 20);
        lblradior.setBounds(90, 90, 100, 20);
        lblradioR.setBounds(90, 130, 100, 20);

        txtcarga.setBounds(200, 50, 250, 20);
        txtradior.setBounds(200, 90, 250, 20);
        txtradioR.setBounds(200, 130, 250, 20);

        btncalcular.setBounds(210, 170, 100, 20);
        btnvolver.setBounds(320, 170, 100, 20);

        add(lblcarga);
        add(lblradior);
        add(lblradioR);

        add(txtcarga);
        add(txtradior);
        add(txtradioR);

        add(btncalcular);
        add(btnvolver);
    }

    public JLabel getLblcarga() {
        return lblcarga;
    }

    public void setLblcarga(JLabel lblcarga) {
        this.lblcarga = lblcarga;
    }

    public JLabel getLblradior() {
        return lblradior;
    }

    public void setLblradior(JLabel lblradior) {
        this.lblradior = lblradior;
    }

    public JLabel getLblradioR() {
        return lblradioR;
    }

    public void setLblradioR(JLabel lblradioR) {
        this.lblradioR = lblradioR;
    }

    public JTextField getTxtcarga() {
        return txtcarga;
    }

    public void setTxtcarga(JTextField txtcarga) {
        this.txtcarga = txtcarga;
    }

    public JTextField getTxtradior() {
        return txtradior;
    }

    public void setTxtradior(JTextField txtradior) {
        this.txtradior = txtradior;
    }

    public JTextField getTxtradioR() {
        return txtradioR;
    }

    public void setTxtradioR(JTextField txtradioR) {
        this.txtradioR = txtradioR;
    }

    public JButton getBtncalcular() {
        return btncalcular;
    }

    public void setBtncalcular(JButton btncalcular) {
        this.btncalcular = btncalcular;
    }

    public JButton getBtnvolver() {
        return btnvolver;
    }

    public void setBtnvolver(JButton btnvolver) {
        this.btnvolver = btnvolver;
    }
}

