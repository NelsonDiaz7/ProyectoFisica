package co.edu.unbosque.view;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class PanelLeyGauss extends JPanel
{

    private JLabel lblTitulo;

    private JButton btnfueraesfera;
    private JButton btndentroesfera;
    private JButton btnvarillacargada;
    private JButton btnlaminacargada;
    private JButton btnvolver;

    public PanelLeyGauss() {
        setLayout(null);
        setVisible(false);
        initComponents();
    }

    public void initComponents() {
        setBackground(Color.cyan);
        Font font = new Font("Century Gothic", Font.BOLD, 12);
        TitledBorder tb = new TitledBorder("Ley de Gauss");
        tb.setTitleFont(font);
        setBorder(tb);

        lblTitulo = new JLabel(" Seleccione una opción sobre la ley de Gauss:  ");
        lblTitulo.setBounds(150, 10, 500, 30);
        add(lblTitulo);

        btnfueraesfera = new JButton("Campo eléctrico fuera de la esfera");
        btnfueraesfera.setBounds(150, 50, 250, 30);
        add(btnfueraesfera);
        btnfueraesfera.setActionCommand("FUERAESFERA");

        btndentroesfera = new JButton("Campo eléctrico dentro de la esfera");
        btndentroesfera.setBounds(150, 90, 250, 30);
        add(btndentroesfera);
        btndentroesfera.setActionCommand("DENTROESFERA");

        btnvarillacargada = new JButton("Linea cargada");
        btnvarillacargada.setBounds(150, 130, 250, 30);
        add(btnvarillacargada);
        btnvarillacargada.setActionCommand("LINEACARGADA");

        btnlaminacargada = new JButton("Lamina cargada");
        btnlaminacargada.setBounds(150, 170, 250, 30);
        add(btnlaminacargada);
        btnlaminacargada.setActionCommand("LAMINACARGADA");

        btnvolver = new JButton("Volver");
        btnvolver.setBounds(150, 210, 250, 30);
        add(btnvolver);
        btnvolver.setActionCommand("VOLVERFLUJO");
    }

    public JButton getBtnvolver() {
        return btnvolver;
    }

    public JLabel getLblTitulo() {
        return lblTitulo;
    }

    public void setLblTitulo(JLabel lblTitulo) {
        this.lblTitulo = lblTitulo;
    }

    public JButton getBtnfueraesfera() {
        return btnfueraesfera;
    }

    public void setBtnfueraesfera(JButton btnfueraesfera) {
        this.btnfueraesfera = btnfueraesfera;
    }

    public JButton getBtndentroesfera() {
        return btndentroesfera;
    }

    public void setBtndentroesfera(JButton btndentroesfera) {
        this.btndentroesfera = btndentroesfera;
    }

    public JButton getBtnvarillacargada() {
        return btnvarillacargada;
    }

    public void setBtnvarillacargada(JButton btnvarillacargada) {
        this.btnvarillacargada = btnvarillacargada;
    }

    public JButton getBtnlaminacargada() {
        return btnlaminacargada;
    }

    public void setBtnlaminacargada(JButton btnlaminacargada) {
        this.btnlaminacargada = btnlaminacargada;
    }
}
