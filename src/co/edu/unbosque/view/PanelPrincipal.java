package co.edu.unbosque.view;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class PanelPrincipal extends JPanel {

    private JLabel lblTitulo;
    private JButton btntema1;
    private JButton btntema2;
    private JButton btntema3;
    private JButton btntema4;
    private JButton btntema5;
    private JButton btntema6;
    private JButton btntema7;


    public PanelPrincipal() {
        setLayout(null);
        setVisible(true);
        initComponents();
    }

    public void initComponents()
    {
        setBackground(Color.cyan);
        Font font = new Font("Century Gothic", Font.BOLD, 12);
        TitledBorder tb = new TitledBorder("Bienvenida");
        tb.setTitleFont(font);
        setBorder(tb);

        lblTitulo = new JLabel("Bienvenido a la calculadora de Fisica :D");
        lblTitulo.setFont(font);
        lblTitulo.setBounds(150, 30, 300, 30);
        add(lblTitulo);

        btntema1 = new JButton("Coulomb");
        btntema1.setFont(font);
        btntema1.setBounds(180, 70, 170,30);
        add(btntema1);
        btntema1.setActionCommand("TEMA1");

        btntema2 = new JButton("Ley de Gauss");
        btntema2.setFont(font);
        btntema2.setBounds(180, 110, 170,30);
        add(btntema2);
        btntema2.setActionCommand("TEMA2");

        btntema3 = new JButton("Tema 3");
        btntema3.setFont(font);
        btntema3.setBounds(180, 150, 170,30);
        add(btntema3);
        btntema3.setActionCommand("TEMA3");

        btntema4 = new JButton("Suma de capacitores");
        btntema4.setFont(font);
        btntema4.setBounds(180, 190, 170,30);
        add(btntema4);
        btntema4.setActionCommand("TEMA4");

        btntema5 = new JButton("Potencial Electrico");
        btntema5.setFont(font);
        btntema5.setBounds(180, 230, 170,30);
        add(btntema5);
        btntema5.setActionCommand("TEMA5");

        btntema6 = new JButton("Energia Potencial");
        btntema6.setFont(font);
        btntema6.setBounds(180, 270, 170,30);
        add(btntema6);
        btntema6.setActionCommand("TEMA6");

        btntema7 = new JButton("Energía Almacenada");
        btntema7.setFont(font);
        btntema7.setBounds(180, 310, 170,30);
        add(btntema7);
        btntema7.setActionCommand("TEMA7");

    }

    public JButton getBtntema7() {
        return btntema7;
    }

    public JButton getBtntema6() {
        return btntema6;
    }

    public JButton getBtntema5() {
        return btntema5;
    }

    public JButton getBtntema4() {
        return btntema4;
    }

    public JLabel getLblTitulo() {
        return lblTitulo;
    }

    public void setLblTitulo(JLabel lblTitulo) {
        this.lblTitulo = lblTitulo;
    }

    public JButton getBtntema1() {
        return btntema1;
    }

    public void setBtntema1(JButton btntema1) {
        this.btntema1 = btntema1;
    }

    public JButton getBtntema2() {
        return btntema2;
    }

    public void setBtntema2(JButton btntema2) {
        this.btntema2 = btntema2;
    }

    public JButton getBtntema3() {
        return btntema3;
    }

    public void setBtntema3(JButton btntema3) {
        this.btntema3 = btntema3;
    }
}
