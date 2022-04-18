package co.edu.unbosque.view;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class PanelCapacitancia extends JPanel{

    private JLabel lblTitulo;

    private JButton btncapacitoresferico;
    private JButton btncapacitorcilindro;
    private JButton btnlaminasparalelas;
    private JButton btnpotencialcilindro;
    private JButton btnpotencialesferico;
    private JButton btnvolver;

    public PanelCapacitancia() {
        setLayout(null);
        setVisible(false);
        initComponents();
    }

    public void initComponents() {
        setBackground(Color.cyan);
        Font font = new Font("Century Gothic", Font.BOLD, 12);
        TitledBorder tb = new TitledBorder("Capacitancia y potencial");
        tb.setTitleFont(font);
        setBorder(tb);

        lblTitulo = new JLabel(" Seleccione una opción sobre la Capacitancia:  ");
        lblTitulo.setBounds(150, 10, 500, 30);
        add(lblTitulo);

        btncapacitoresferico = new JButton("Capacitancia de la esféra ");
        btncapacitoresferico.setBounds(150, 50, 250, 30);
        add(btncapacitoresferico);
        btncapacitoresferico.setActionCommand("CAPACITANCIAESFERA");

        btncapacitorcilindro = new JButton("Capacitancia del cilindro  ");
        btncapacitorcilindro.setBounds(150, 90, 250, 30);
        add(btncapacitorcilindro);
        btncapacitorcilindro.setActionCommand("CAPACITANCIACILINDRO");

        btnlaminasparalelas = new JButton("Capacitancia Laminas paralelas ");
        btnlaminasparalelas.setBounds(150, 130, 250, 30);
        add(btnlaminasparalelas);
        btnlaminasparalelas.setActionCommand("LAMINAPARALELA");

        btnpotencialcilindro = new JButton("Potencial del cilindro ");
        btnpotencialcilindro.setBounds(150, 170, 250, 30);
        add(btnpotencialcilindro);
        btnpotencialcilindro.setActionCommand("POTENCIALCILINDRO");

        btnpotencialesferico = new JButton("Potencial de la esfera ");
        btnpotencialesferico.setBounds(150, 210, 250, 30);
        add(btnpotencialesferico);
        btnpotencialesferico.setActionCommand("POTENCIALESFERA");

        btnvolver = new JButton("Volver");
        btnvolver.setBounds(150, 250, 250, 30);
        add(btnvolver);
        btnvolver.setActionCommand("VOLVERCAPACITANCIA");
    }

    public JLabel getLblTitulo() {
        return lblTitulo;
    }

    public void setLblTitulo(JLabel lblTitulo) {
        this.lblTitulo = lblTitulo;
    }

    public JButton getBtncapacitoresferico() {
        return btncapacitoresferico;
    }

    public void setBtncapacitoresferico(JButton btncapacitoresferico) {
        this.btncapacitoresferico = btncapacitoresferico;
    }

    public JButton getBtncapacitorcilindro() {
        return btncapacitorcilindro;
    }

    public void setBtncapacitorcilindro(JButton btncapacitorcilindro) {
        this.btncapacitorcilindro = btncapacitorcilindro;
    }

    public JButton getBtnlaminasparalelas() {
        return btnlaminasparalelas;
    }

    public void setBtnlaminasparalelas(JButton btnlaminasparalelas) {
        this.btnlaminasparalelas = btnlaminasparalelas;
    }

    public JButton getBtnpotencialcilindro() {
        return btnpotencialcilindro;
    }

    public void setBtnpotencialcilindro(JButton btnpotencialcilindro) {
        this.btnpotencialcilindro = btnpotencialcilindro;
    }

    public JButton getBtnpotencialesferico() {
        return btnpotencialesferico;
    }

    public void setBtnpotencialesferico(JButton btnpotencialesferico) {
        this.btnpotencialesferico = btnpotencialesferico;
    }

    public JButton getBtnvolver() {
        return btnvolver;
    }

    public void setBtnvolver(JButton btnvolver) {
        this.btnvolver = btnvolver;
    }


}
