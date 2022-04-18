package co.edu.unbosque.view;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class PanelCapacitanciaconD extends JPanel {

    JLabel lblCapSinDiolectrico;
    JLabel lblConsDeDiolectrico;

    JTextField txtCapSinDiolectrico;
    JTextField txtConsDeDiolectrico;

    JButton btnCalcular;
    JButton btnVolver;

    public PanelCapacitanciaconD(){
        setLayout(null);
        setVisible(false);
        componentes();
    }

    public void componentes(){
        setBackground(Color.cyan);
        Font font = new Font("Century Gothic", Font.BOLD, 12);
        TitledBorder tb = new TitledBorder("Calcular campo electrico dielectrico");
        tb.setTitleFont(font);
        setBorder(tb);

        lblCapSinDiolectrico = new JLabel("Capacitancia sin dielectrico (F): ");
        lblCapSinDiolectrico.setBounds(30,50,180,20);
        add(lblCapSinDiolectrico);

        txtCapSinDiolectrico = new JTextField();
        txtCapSinDiolectrico.setBounds(220,50,250,20);
        add(txtCapSinDiolectrico);

        lblConsDeDiolectrico = new JLabel("Constante dielectrica : ");
        lblConsDeDiolectrico.setBounds(30,90,180,20);
        add(lblConsDeDiolectrico);

        txtConsDeDiolectrico = new JTextField();
        txtConsDeDiolectrico.setBounds(220,90,250,20);
        add(txtConsDeDiolectrico);

        btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(210,170,100,20);
        add(btnCalcular);
        btnCalcular.setActionCommand("CALCULARCAPACITANCIAD");

        btnVolver = new JButton("Volver");
        btnVolver.setBounds(320,170,100,20);
        add(btnVolver);
        btnVolver.setActionCommand("VOLVERCAPACITANCIAD");
    }

    public JLabel getLblCapSinDiolectrico() {
        return lblCapSinDiolectrico;
    }

    public JLabel getLblConsDeDiolectrico() {
        return lblConsDeDiolectrico;
    }

    public JTextField getTxtCapSinDiolectrico() {
        return txtCapSinDiolectrico;
    }

    public JTextField getTxtConsDeDiolectrico() {
        return txtConsDeDiolectrico;
    }

    public JButton getBtnCalcular() {
        return btnCalcular;
    }

    public JButton getBtnVolver() {
        return btnVolver;
    }
}
