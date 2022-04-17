package co.edu.unbosque.view;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class PanelEnegiaDosCargas extends JPanel {

    JLabel lblcarga1;
    JLabel lblcarga2;
    JLabel lbldistancia;
    JLabel lblrecordar;

    JTextField txtcarga1;
    JTextField txtcarga2;
    JTextField txtdistancia;

    JButton btncalcular;
    JButton btnvolver;


    public PanelEnegiaDosCargas() {
        setLayout(null);
        setVisible(false);
        initComponents();
    }

    public void initComponents()
    {

        setBackground(Color.cyan);
        Font font = new Font("Century Gothic", Font.BOLD, 12);
        TitledBorder tb = new TitledBorder("Energia potencial dos cargas");
        tb.setTitleFont(font);
        setBorder(tb);

        lblrecordar = new JLabel(" (Recuerda  micro = e-6, nano = e-9, pico = e-12) ");
        lblrecordar.setFont(font);
        lblrecordar.setBounds(140, 20, 300, 20);
        add(lblrecordar);

        lblcarga1 = new JLabel("Carga 1(C): ");
        lblcarga1.setBounds(90,50,100,20);
        add(lblcarga1);

        txtcarga1 = new JTextField();
        txtcarga1.setBounds(200,50,250,20);
        add(txtcarga1);

        lblcarga2 = new JLabel("Carga 2(C): ");
        lblcarga2.setBounds(90,90,100,20);
        add(lblcarga2);

        txtcarga2 = new JTextField();
        txtcarga2.setBounds(200,90,250,20);
        add(txtcarga2);

        lbldistancia = new JLabel("Distancia (m): ");
        lbldistancia.setBounds(90,130,100,20);
        add(lbldistancia);

        txtdistancia = new JTextField();
        txtdistancia.setBounds(200,130,250,20);
        add(txtdistancia);

        btncalcular = new JButton("Calcular");
        btncalcular.setBounds(210,170,100,20);
        add(btncalcular);
        btncalcular.setActionCommand("CALCULARENERGIADOSCARGAS");

        btnvolver = new JButton("Volver");
        btnvolver.setBounds(320,170,100,20);
        add(btnvolver);
        btnvolver.setActionCommand("VOLVERENERGIADOSCARGAS");

    }

    public JLabel getLblcarga1() {
        return lblcarga1;
    }

    public JLabel getLblcarga2() {
        return lblcarga2;
    }

    public JLabel getLbldistancia() {
        return lbldistancia;
    }

    public JLabel getLblrecordar() {
        return lblrecordar;
    }

    public JTextField getTxtcarga1() {
        return txtcarga1;
    }

    public JTextField getTxtcarga2() {
        return txtcarga2;
    }

    public JTextField getTxtdistancia() {
        return txtdistancia;
    }

    public JButton getBtncalcular() {
        return btncalcular;
    }

    public JButton getBtnvolver() {
        return btnvolver;
    }
}
