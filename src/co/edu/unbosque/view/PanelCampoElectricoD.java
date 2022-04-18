package co.edu.unbosque.view;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class PanelCampoElectricoD extends JPanel {

    JLabel lblCampoElectrico;
    JLabel lblConsD;

    JTextField txtCapSinD;
    JTextField txtConsD;

    JButton btnCalcular;
    JButton btnVolver;

    public PanelCampoElectricoD(){
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

        lblCampoElectrico = new JLabel("Campo sin dieléctrico (F): ");
        lblCampoElectrico.setBounds(30,50,180,20);
        add(lblCampoElectrico);

        txtCapSinD = new JTextField();
        txtCapSinD.setBounds(200,50,250,20);
        add(txtCapSinD);

        lblConsD = new JLabel("Constante dielectrica : ");
        lblConsD.setBounds(30,90,180,20);
        add(lblConsD);

        txtConsD = new JTextField();
        txtConsD.setBounds(200,90,250,20);
        add(txtConsD);

        btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(210,170,100,20);
        add(btnCalcular);
        btnCalcular.setActionCommand("CALCULARCAMPOELECTRICOD");

        btnVolver = new JButton("Volver");
        btnVolver.setBounds(320,170,100,20);
        add(btnVolver);
        btnVolver.setActionCommand("VOLVERCAMPOELECTRICOD");
    }

    public JLabel getLblCampoElectrico() {
        return lblCampoElectrico;
    }

    public JLabel getLblConsD() {
        return lblConsD;
    }

    public JTextField getTxtCapSinD() {
        return txtCapSinD;
    }

    public JTextField getTxtConsD() {
        return txtConsD;
    }

    public JButton getBtnCalcular() {
        return btnCalcular;
    }

    public JButton getBtnVolver() {
        return btnVolver;
    }
}
