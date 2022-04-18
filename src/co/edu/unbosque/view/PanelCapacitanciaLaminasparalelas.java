package co.edu.unbosque.view;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class PanelCapacitanciaLaminasparalelas extends JPanel {


    private JLabel lblarea;
    private JLabel lbldistancia;

    private JTextField txtarea;
    private JTextField txtdistancia;

    private JButton btncalcular;
    private JButton btnvolver;

    public PanelCapacitanciaLaminasparalelas(){

        setVisible(false);
        setLayout(null);
        Inicomponentes();

    }

    public void Inicomponentes()
    {
        setBackground(Color.cyan);
        Font font = new Font("Century Gothic", Font.BOLD, 12);
        TitledBorder tb = new TitledBorder("Capacitancia de laminas paralelas");
        tb.setTitleFont(font);
        setBorder(tb);

        lblarea = new JLabel("Area (m^2): ");
        lblarea.setBounds(90,50,100,20);
        add(lblarea);

        txtarea = new JTextField();
        txtarea.setBounds(200,50,250,20);
        add(txtarea);

        lbldistancia = new JLabel("Distancia (m): ");
        lbldistancia.setBounds(90,90,100,20);
        add(lbldistancia);

        txtdistancia = new JTextField();
        txtdistancia.setBounds(200,90,250,20);
        add(txtdistancia);

        btncalcular = new JButton("Calcular");
        btncalcular.setBounds(210,170,100,20);
        add(btncalcular);
        btncalcular.setActionCommand("CALCULARLAMINASPARALELAS");

        btnvolver = new JButton("Volver");
        btnvolver.setBounds(320,170,100,20);
        add(btnvolver);
        btnvolver.setActionCommand("VOLVERLAMINASPARALELAS");

    }


    public JLabel getLblarea() {
        return lblarea;
    }

    public JLabel getLbldistancia() {
        return lbldistancia;
    }

    public JTextField getTxtarea() {
        return txtarea;
    }

    public JTextField getTxtdistancia() {
        return txtdistancia;
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


