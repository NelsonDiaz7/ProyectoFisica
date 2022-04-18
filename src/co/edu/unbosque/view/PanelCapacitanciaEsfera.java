package co.edu.unbosque.view;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class PanelCapacitanciaEsfera extends JPanel {


    private JLabel lblradio1;
    private JLabel lblradio2;

    private JTextField txtradio1;
    private JTextField txtradio2;

    private JButton btncalcular;
    private JButton btnvolver;

    public PanelCapacitanciaEsfera(){

        setVisible(false);
        setLayout(null);
        Inicomponentes();

    }

    public void Inicomponentes()
    {
        setBackground(Color.cyan);
        Font font = new Font("Century Gothic", Font.BOLD, 12);
        TitledBorder tb = new TitledBorder("Capacitancia de una esfera");
        tb.setTitleFont(font);
        setBorder(tb);

        lblradio1 = new JLabel("Radio interno (m): ");
        lblradio1.setBounds(90,50,120,20);
        add(lblradio1);

        txtradio1 = new JTextField();
        txtradio1.setBounds(200,50,250,20);
        add(txtradio1);

        lblradio2 = new JLabel("Radio externo (m): ");
        lblradio2.setBounds(90,90,120,20);
        add(lblradio2);

        txtradio2 = new JTextField();
        txtradio2.setBounds(200,90,250,20);
        add(txtradio2);

        btncalcular = new JButton("Calcular");
        btncalcular.setBounds(210,170,100,20);
        add(btncalcular);
        btncalcular.setActionCommand("CALCULARCAPACITANCIAESFERA");

        btnvolver = new JButton("Volver");
        btnvolver.setBounds(320,170,100,20);
        add(btnvolver);
        btnvolver.setActionCommand("VOLVERCAPACITANCIAESFERA");

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
