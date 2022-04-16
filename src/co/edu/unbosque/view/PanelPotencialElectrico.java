package co.edu.unbosque.view;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class PanelPotencialElectrico extends JPanel {

    JLabel lblTitulo;
    JButton btnUnacarga;
    JButton btnDosCargas;
    JButton btnVolver;

    public PanelPotencialElectrico(){
        setLayout(null);
        setVisible(false);
        initComponents();
    }

    public void initComponents()
    {

        setBackground(Color.cyan);
        Font font = new Font("Century Gothic", Font.BOLD, 12);
        TitledBorder tb = new TitledBorder("Potencial Electrico");
        tb.setTitleFont(font);
        setBorder(tb);

        lblTitulo = new JLabel("Elija una opción:");
        lblTitulo.setFont(font);
        lblTitulo.setBounds(220, 90, 300, 30);
        add(lblTitulo);

        btnUnacarga = new JButton("Potencial de una carga");
        btnUnacarga.setFont(font);
        btnUnacarga.setBounds(170, 130, 210,30);
        add(btnUnacarga);
        btnUnacarga.setActionCommand("POTECARGA");

        btnDosCargas = new JButton("Potencial más de dos cargas");
        btnDosCargas.setFont(font);
        btnDosCargas.setBounds(170, 180, 210,30);
        add(btnDosCargas);
        btnDosCargas.setActionCommand("POTECARGADOS");

        btnVolver = new JButton("Volver");
        btnVolver.setFont(font);
        btnVolver.setBounds(200, 230, 150,30);
        add(btnVolver);
        btnVolver.setActionCommand("VOLVERPOTE");

    }

    public JLabel getLblTitulo() {
        return lblTitulo;
    }

    public JButton getBtnUnacarga() {
        return btnUnacarga;
    }

    public JButton getBtnDosCargas() {
        return btnDosCargas;
    }

    public JButton getBtnVolver() {
        return btnVolver;
    }
}
