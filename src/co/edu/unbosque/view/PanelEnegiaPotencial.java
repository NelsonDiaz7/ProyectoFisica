package co.edu.unbosque.view;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class PanelEnegiaPotencial extends JPanel {

    private JLabel lblTitulo;

    private JButton btnEnegiaPotencialdoscargas;
    private JButton btnEnegiaSobreunaCarga;
    private JButton btnvolver;

    public PanelEnegiaPotencial(){
        setLayout(null);
        setVisible(false);
        initComponents();
    }

    public void initComponents()
    {

        setBackground(Color.cyan);
        Font font = new Font("Century Gothic", Font.BOLD, 12);
        TitledBorder tb = new TitledBorder("Energía Potencial");
        tb.setTitleFont(font);
        setBorder(tb);

        lblTitulo = new JLabel(" Seleccione una opción sobre energía potencial:  ");
        lblTitulo.setBounds(130, 60, 500, 30);
        add(lblTitulo);

        btnEnegiaPotencialdoscargas = new JButton("Energía Potencial de dos cargas");
        btnEnegiaPotencialdoscargas.setBounds(150, 100, 250, 30);
        add(btnEnegiaPotencialdoscargas);
        btnEnegiaPotencialdoscargas.setActionCommand("ENERGIADOSCARGAS");

        btnEnegiaSobreunaCarga = new JButton("Energia potencial sobre una carga");
        btnEnegiaSobreunaCarga.setBounds(150, 140, 250, 30);
        add(btnEnegiaSobreunaCarga);
        btnEnegiaSobreunaCarga.setActionCommand("ENERGIACARGA");

        btnvolver = new JButton("Volver");
        btnvolver.setBounds(150, 180, 250, 30);
        add(btnvolver);
        btnvolver.setActionCommand("VOLVERENERGIA");
    }

    public JLabel getLblTitulo() {
        return lblTitulo;
    }

    public JButton getBtnEnegiaPotencialdoscargas() {
        return btnEnegiaPotencialdoscargas;
    }

    public JButton getBtnEnegiaSobreunaCarga() {
        return btnEnegiaSobreunaCarga;
    }

    public JButton getBtnvolver() {
        return btnvolver;
    }
}

