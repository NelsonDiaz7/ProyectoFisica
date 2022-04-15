package co.edu.unbosque.view;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class PanelPrincipal extends JPanel {

    private JLabel lblTitulo;

    private JButton btntema1;
    private JButton btntema2;
    private JButton btntema3;


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
        btntema1.setBounds(230, 70, 90,20);
        add(btntema1);
        btntema1.setActionCommand("TEMA1");

        btntema2 = new JButton("Flujo electrico");
        btntema2.setFont(font);
        btntema2.setBounds(230, 100, 120,20);
        add(btntema2);
        btntema2.setActionCommand("TEMA2");

        btntema3 = new JButton("Tema 3");
        btntema3.setFont(font);
        btntema3.setBounds(230, 130, 90,20);
        add(btntema3);
        btntema3.setActionCommand("TEMA3");

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