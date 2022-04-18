package co.edu.unbosque.view;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class PanelEnergiaAlmacenada extends JPanel {

    private JLabel lblTitulo;

    private JButton btnEnergiaAlmacenada;
    private JButton btnEnergiaAlmacenada2;
    private JButton btnEnergiaAlmacenada3;

    private JLabel lblTitulo2;
    private JButton btnDensidadEnergia1;
    private JButton btnDensidadEnergia2;

    private JButton btnvolver;



    public PanelEnergiaAlmacenada() {
        setLayout(null);
        setVisible(false);
        initComponents();
    }

    public void initComponents()
    {

        setBackground(Color.cyan);
        Font font = new Font("Century Gothic", Font.BOLD, 12);
        TitledBorder tb = new TitledBorder("Energía Almcenada y Densidad de Energía");
        tb.setTitleFont(font);
        setBorder(tb);

        lblTitulo = new JLabel(" Seleccione una opción sobre energia almacenada:  ");
        lblTitulo.setBounds(130, 60, 500, 30);
        add(lblTitulo);

        btnEnergiaAlmacenada = new JButton("Energía almacenada 1");
        btnEnergiaAlmacenada.setBounds(150, 100, 250, 30);
        add(btnEnergiaAlmacenada);
        btnEnergiaAlmacenada.setActionCommand("ENEALM1");

        btnEnergiaAlmacenada2 = new JButton("Energia almacenada 2");
        btnEnergiaAlmacenada2.setBounds(150, 140, 250, 30);
        add(btnEnergiaAlmacenada2);
        btnEnergiaAlmacenada2.setActionCommand("ENEALM2");

        btnEnergiaAlmacenada3 = new JButton("Energia almacenada 3");
        btnEnergiaAlmacenada3.setBounds(150, 180, 250, 30);
        add(btnEnergiaAlmacenada3);
        btnEnergiaAlmacenada3.setActionCommand("ENEALM3");

        lblTitulo2 = new JLabel(" Seleccione una opción sobre densidad de energia:  ");
        lblTitulo2.setBounds(130, 250, 500, 30);
        add(lblTitulo2);

        btnDensidadEnergia1 = new JButton("Densidad de energia 1");
        btnDensidadEnergia1.setBounds(150, 290, 250, 30);
        add(btnDensidadEnergia1);
        btnDensidadEnergia1.setActionCommand("DENEN1");

        btnDensidadEnergia2 = new JButton("Densidad de energia 2");
        btnDensidadEnergia2.setBounds(150, 330, 250, 30);
        add(btnDensidadEnergia2);
        btnDensidadEnergia2.setActionCommand("DENEN2");

        btnvolver = new JButton("Volver");
        btnvolver.setBounds(150, 370, 250, 30);
        add(btnvolver);
        btnvolver.setActionCommand("VOLVERENERGIAALMA");

    }
    public JLabel getLblTitulo() {
        return lblTitulo;
    }

    public JButton getBtnEnergiaAlmacenada() {
        return btnEnergiaAlmacenada;
    }

    public JButton getBtnEnergiaAlmacenada2() {
        return btnEnergiaAlmacenada2;
    }

    public JButton getBtnEnergiaAlmacenada3() {
        return btnEnergiaAlmacenada3;
    }

    public JLabel getLblTitulo2() {
        return lblTitulo2;
    }

    public JButton getBtnDensidadEnergia1() {
        return btnDensidadEnergia1;
    }

    public JButton getBtnDensidadEnergia2() {
        return btnDensidadEnergia2;
    }

    public JButton getBtnvolver() {
        return btnvolver;
    }
}
