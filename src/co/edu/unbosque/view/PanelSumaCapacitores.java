package co.edu.unbosque.view;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class PanelSumaCapacitores extends JPanel {

    JLabel lblTitulo;

    JButton btnsumaserie;
    JButton btnSumaParalelo;
    JButton btnVolver;


    public PanelSumaCapacitores()
    {
        setLayout(null);
        setVisible(false);
        InitComp();
    }

    public void InitComp()
    {
        setBackground(Color.cyan);
        Font font = new Font("Century Gothic", Font.BOLD, 12);
        TitledBorder tb = new TitledBorder("Suma de capacitores");
        tb.setTitleFont(font);
        setBorder(tb);

        lblTitulo = new JLabel("Elija una opción:");
        lblTitulo.setFont(font);
        lblTitulo.setBounds(220, 90, 300, 30);
        add(lblTitulo);

        btnsumaserie = new JButton("Suma en serie");
        btnsumaserie.setFont(font);
        btnsumaserie.setBounds(200, 130, 150,30);
        add(btnsumaserie);
        btnsumaserie.setActionCommand("SUMSERIE");

        btnSumaParalelo = new JButton("Suma en paralelo");
        btnSumaParalelo.setFont(font);
        btnSumaParalelo.setBounds(200, 180, 150,30);
        add(btnSumaParalelo);
        btnSumaParalelo.setActionCommand("SUMPARALELO");

        btnVolver = new JButton("Volver");
        btnVolver.setFont(font);
        btnVolver.setBounds(200, 230, 150,30);
        add(btnVolver);
        btnVolver.setActionCommand("VOLVERSUM");

    }

    public JLabel getLblTitulo() {
        return lblTitulo;
    }

    public void setLblTitulo(JLabel lblTitulo) {
        this.lblTitulo = lblTitulo;
    }

    public JButton getBtnsumaserie() {
        return btnsumaserie;
    }

    public void setBtnsumaserie(JButton btnsumaserie) {
        this.btnsumaserie = btnsumaserie;
    }

    public JButton getBtnSumaParalelo() {
        return btnSumaParalelo;
    }

    public void setBtnSumaParalelo(JButton btnSumaParalelo) {
        this.btnSumaParalelo = btnSumaParalelo;
    }

    public JButton getBtnVolver() {
        return btnVolver;
    }

    public void setBtnVolver(JButton btnVolver) {
        this.btnVolver = btnVolver;
    }
}
