package co.edu.unbosque.view;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class PanelPotencialEsfera extends JPanel {

    private JLabel lblradio1;
    private JLabel lblcarga;
    private JLabel erecordar;
    private JLabel lblradio2;

    private JTextField txtradio1;
    private JTextField txtradio2;
    private JTextField txtcarga;

    private JButton btncalcular;
    private JButton btnvolver;

    public PanelPotencialEsfera(){

        setVisible(false);
        setLayout(null);
        Inicomponentes();

    }

    public void Inicomponentes()
    {
        setBackground(Color.cyan);
        Font font = new Font("Century Gothic", Font.BOLD, 12);
        TitledBorder tb = new TitledBorder("Potencial de una esfera");
        tb.setTitleFont(font);
        setBorder(tb);

        erecordar = new JLabel(" (Recuerda  micro = e-6, nano = e-9, pico = e-12) ");
        erecordar.setFont(font);
        erecordar.setBounds(140, 20, 300, 20);
        add(erecordar);

        lblcarga = new JLabel("Carga (C): ");
        lblcarga.setBounds(110,50,100,20);
        add(lblcarga);

        txtcarga = new JTextField();
        txtcarga.setBounds(200,50,250,20);
        add(txtcarga);

        lblradio1 = new JLabel("Radio interno (m): ");
        lblradio1.setBounds(90,90,120,20);
        add(lblradio1);

        txtradio1 = new JTextField();
        txtradio1.setBounds(200,90,250,20);
        add(txtradio1);

        lblradio2 = new JLabel("Radio externo (m): ");
        lblradio2.setBounds(90,130,120,20);
        add(lblradio2);

        txtradio2 = new JTextField();
        txtradio2.setBounds(200,130,250,20);
        add(txtradio2);

        btncalcular = new JButton("Calcular");
        btncalcular.setBounds(210,170,100,20);
        add(btncalcular);
        btncalcular.setActionCommand("CALCULARPOTENCIALESFERA");

        btnvolver = new JButton("Volver");
        btnvolver.setBounds(320,170,100,20);
        add(btnvolver);
        btnvolver.setActionCommand("VOLVERPOTENCIALESFERA");

    }

    public JLabel getLblradio1() {
        return lblradio1;
    }

    public void setLblradio1(JLabel lblradio1) {
        this.lblradio1 = lblradio1;
    }
    public JLabel getLblradio2() {
        return lblradio2;
    }

    public void setLblradio2(JLabel getLblradio2) {
        this.lblradio2 = getLblradio2;
    }

    public JLabel getLblcarga() {
        return lblcarga;
    }

    public void setLblcarga(JLabel lblcarga) {
        this.lblcarga = lblcarga;
    }

    public JTextField getTxtradio1() {
        return txtradio1;
    }

    public void setTxtradio1(JTextField txtradio1) {
        this.txtradio1 = txtradio1;
    }

    public JTextField getTxtradio2() {
        return txtradio2;
    }

    public void setTxtradio2(JTextField txtradio2) {
        this.txtradio2 = txtradio2;
    }

    public JTextField getTxtcarga() {
        return txtcarga;
    }

    public void setTxtcarga(JTextField txtcarga) {
        this.txtcarga = txtcarga;
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
