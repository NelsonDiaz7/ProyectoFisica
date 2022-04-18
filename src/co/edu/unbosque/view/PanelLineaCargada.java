package co.edu.unbosque.view;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class PanelLineaCargada extends JPanel {

    private JLabel lblcarga;
    private JLabel lbllongitud;
    private JLabel lblradio;
    private JLabel erecordar;

    private JTextField txtcarga;
    private JTextField txtlongitud;
    private JTextField txtradio;

    private JButton btncalcular;
    private JButton btnvolver;

    public PanelLineaCargada(){
        setLayout(null);
        setVisible(false);
        InitComponents();
    }

    public void InitComponents(){

        setBackground(Color.cyan);
        Font font = new Font("Century Gothic", Font.BOLD, 12);
        TitledBorder tb = new TitledBorder("Campo linea cargada");
        tb.setTitleFont(font);
        setBorder(tb);

        erecordar = new JLabel(" (Recuerda  micro = e-6, nano = e-9, pico = e-12) ");
        erecordar.setFont(font);
        erecordar.setBounds(140, 20, 300, 20);
        add(erecordar);

        lblcarga = new JLabel("Carga (C): ");
        lblcarga.setBounds(90,50,100,20);
        add(lblcarga);

        txtcarga = new JTextField();
        txtcarga.setBounds(200,50,250,20);
        add(txtcarga);

        lbllongitud = new JLabel("Longitud (m): ");
        lbllongitud.setBounds(90,90,100,20);
        add(lbllongitud);

        txtlongitud = new JTextField();
        txtlongitud.setBounds(200,90,250,20);
        add(txtlongitud);

        lblradio = new JLabel("Radio (m): ");
        lblradio.setBounds(90,130,100,20);
        add(lblradio);

        txtradio = new JTextField();
        txtradio.setBounds(200,130,250,20);
        add(txtradio);

        btncalcular = new JButton("Calcular");
        btncalcular.setBounds(210,170,100,20);
        add(btncalcular);
        btncalcular.setActionCommand("CALCULARLINEACARGADA");

        btnvolver = new JButton("Volver");
        btnvolver.setBounds(320,170,100,20);
        add(btnvolver);
        btnvolver.setActionCommand("VOLVERLINEACARGADA");

    }

    public JLabel getLblcarga() {
        return lblcarga;
    }

    public void setLblcarga(JLabel lblcarga) {
        this.lblcarga = lblcarga;
    }

    public JLabel getLbllongitud() {
        return lbllongitud;
    }

    public void setLbllongitud(JLabel lbllongitud) {
        this.lbllongitud = lbllongitud;
    }

    public JLabel getLblradio() {
        return lblradio;
    }

    public void setLblradio(JLabel lblradio) {
        this.lblradio = lblradio;
    }

    public JTextField getTxtcarga() {
        return txtcarga;
    }

    public void setTxtcarga(JTextField txtcarga) {
        this.txtcarga = txtcarga;
    }

    public JTextField getTxtlongitud() {
        return txtlongitud;
    }

    public void setTxtlongitud(JTextField txtlongitud) {
        this.txtlongitud = txtlongitud;
    }

    public JTextField getTxtradio() {
        return txtradio;
    }

    public void setTxtradio(JTextField txtradio) {
        this.txtradio = txtradio;
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
