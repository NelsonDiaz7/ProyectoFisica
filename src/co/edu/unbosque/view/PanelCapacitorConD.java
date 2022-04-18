package co.edu.unbosque.view;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class PanelCapacitorConD extends JPanel {

    JLabel titulo;

    JButton btnConstDie;
    JButton btnCampoElectricoD;
    JButton btnCapacitanciaD;
    JButton btnPotencialD;
    JButton btnVolver;

    public PanelCapacitorConD() {
        initComponents();
        setLayout(null);
        setVisible(false);
    }

    public void initComponents(){
        setBackground(Color.cyan);
        Font font = new Font("Century Gothic", Font.BOLD, 12);
        TitledBorder tb = new TitledBorder("Capacitor con dieléctrico");
        tb.setTitleFont(font);
        setBorder(tb);

        titulo = new JLabel("Elija una opción para calcular:");
        titulo.setFont(font);
        titulo.setBounds(180, 30, 300, 30);
        add(titulo);

        btnConstDie = new JButton("Constante dieléctrica");
        btnConstDie.setFont(font);
        btnConstDie.setBounds(150, 70, 240, 30);
        add(btnConstDie);
        btnConstDie.setActionCommand("CONSTDIE");

        btnCampoElectricoD = new JButton("Campo eléctrico con dieléctrico");
        btnCampoElectricoD.setFont(font);
        btnCampoElectricoD.setBounds(150, 110, 240, 30);
        add(btnCampoElectricoD);
        btnCampoElectricoD.setActionCommand("CAMPOELECTRICOD");

        btnCapacitanciaD = new JButton("Capacitancia con dieléctrico");
        btnCapacitanciaD.setFont(font);
        btnCapacitanciaD.setBounds(150, 150, 240, 30);
        add(btnCapacitanciaD);
        btnCapacitanciaD.setActionCommand("CAPACITANCIAD");

        btnPotencialD = new JButton("Potencial eléctrico con dieléctrico");
        btnPotencialD.setFont(font);
        btnPotencialD.setBounds(150, 190, 240, 30);
        add(btnPotencialD);
        btnPotencialD.setActionCommand("POTENCIALD");

        btnVolver = new JButton("Volver");
        btnVolver.setFont(font);
        btnVolver.setBounds(200, 250, 150,30);
        add(btnVolver);
        btnVolver.setActionCommand("VOLVERCAPACITORCOND");
    }

    public JLabel getTitulo() {
        return titulo;
    }

    public void setTitulo(JLabel titulo) {
        this.titulo = titulo;
    }

    public JButton getBtnConstDie() {
        return btnConstDie;
    }

    public void setBtnConstDie(JButton btnConstDie) {
        this.btnConstDie = btnConstDie;
    }

    public JButton getBtnCampoElectricoD() {
        return btnCampoElectricoD;
    }

    public void setBtnCampoElectricoD(JButton btnCampoElectricoD) {
        this.btnCampoElectricoD = btnCampoElectricoD;
    }

    public JButton getBtnCapacitanciaD() {
        return btnCapacitanciaD;
    }

    public void setBtnCapacitanciaD(JButton btnCapacitanciaD) {
        this.btnCapacitanciaD = btnCapacitanciaD;
    }

    public JButton getBtnPotencialD() {
        return btnPotencialD;
    }

    public void setBtnPotencialD(JButton btnPotencialD) {
        this.btnPotencialD = btnPotencialD;
    }

    public JButton getBtnVolver() {
        return btnVolver;
    }

    public void setBtnVolver(JButton btnVolver) {
        this.btnVolver = btnVolver;
    }
}
