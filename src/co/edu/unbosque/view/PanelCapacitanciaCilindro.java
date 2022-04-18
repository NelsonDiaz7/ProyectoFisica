package co.edu.unbosque.view;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class PanelCapacitanciaCilindro extends JPanel {

    private JLabel lblradio1;
    private JLabel lbllongitud;
    private JLabel lblradio2;

    private JTextField txtradio1;
    private JTextField txtradio2;
    private JTextField txtlongitud;

    private JButton btncalcular;
    private JButton btnvolver;

    public PanelCapacitanciaCilindro(){

        setVisible(false);
        setLayout(null);
        Inicomponentes();

    }

    public void Inicomponentes()
    {
        setBackground(Color.cyan);
        Font font = new Font("Century Gothic", Font.BOLD, 12);
        TitledBorder tb = new TitledBorder("Capacitancia de un cilindro");
        tb.setTitleFont(font);
        setBorder(tb);


        lbllongitud = new JLabel("Longitud (m): ");
        lbllongitud.setBounds(90,50,120,20);
        add(lbllongitud);

        txtlongitud = new JTextField();
        txtlongitud.setBounds(200,50,250,20);
        add(txtlongitud);

        lblradio1 = new JLabel("Radio interior (m): ");
        lblradio1.setBounds(90,90,120,20);
        add(lblradio1);

        txtradio1 = new JTextField();
        txtradio1.setBounds(200,90,250,20);
        add(txtradio1);

        lblradio2 = new JLabel("Radio exterior (m): ");
        lblradio2.setBounds(90,130,120,20);
        add(lblradio2);

        txtradio2 = new JTextField();
        txtradio2.setBounds(200,130,250,20);
        add(txtradio2);

        btncalcular = new JButton("Calcular");
        btncalcular.setBounds(210,170,100,20);
        add(btncalcular);
        btncalcular.setActionCommand("CALCULARCAPACITANCIACILINDRO");

        btnvolver = new JButton("Volver");
        btnvolver.setBounds(320,170,100,20);
        add(btnvolver);
        btnvolver.setActionCommand("VOLVERCAPACITANCIACILINDRO");

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

    public JLabel getLbllongitud() {
        return lbllongitud;
    }

    public void setLbllongitud(JLabel lbllongitud) {
        this.lbllongitud = lbllongitud;
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

    public JTextField getTxtlongitud() {
        return txtlongitud;
    }

    public void setTxtlongitud(JTextField txtlongitud) {
        this.txtlongitud = txtlongitud;
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