package co.edu.unbosque.view;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class PanelPotencialConD extends JPanel {

    private JLabel lblVoltaje;
    private JTextField txtVoltaje;

    private JLabel lblConstanteDiolectrico;
    private JTextField txtConstanteDiolectrico;

    private JButton btnVolver;
    private JButton btnCalcular;


    public PanelPotencialConD() {
        setVisible(false);
        setLayout(null);
        iniComponents();
    }

    public void iniComponents() {
        setBackground(Color.cyan);
        Font font = new Font("Century Gothic", Font.BOLD, 12);
        TitledBorder tb = new TitledBorder("Calcular potencial electrico con dielectrico");
        tb.setTitleFont(font);
        setBorder(tb);

        lblVoltaje = new JLabel("Potencial eléctrico sin dieléctrico (Vo): ");
        lblVoltaje.setBounds(30,50,230,20);
        add(lblVoltaje);

        txtVoltaje = new JTextField();
        txtVoltaje.setBounds(280,50,200,20);
        add(txtVoltaje);

        lblConstanteDiolectrico = new JLabel("Constante dielectrica : ");
        lblConstanteDiolectrico.setBounds(30,90,200,20);
        add(lblConstanteDiolectrico);

        txtConstanteDiolectrico = new JTextField();
        txtConstanteDiolectrico.setBounds(280,90,200,20);
        add(txtConstanteDiolectrico);

        btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(210,170,100,20);
        add(btnCalcular);
        btnCalcular.setActionCommand("CALCULARPOTENCIALD");

        btnVolver = new JButton("Volver");
        btnVolver.setBounds(320,170,100,20);
        add(btnVolver);
        btnVolver.setActionCommand("VOLVERPOTENCIALD");

    }

    public JLabel getLblVoltaje() {
        return lblVoltaje;
    }

    public void setLblVoltaje(JLabel lblVoltaje) {
        this.lblVoltaje = lblVoltaje;
    }

    public JTextField getTxtVoltaje() {
        return txtVoltaje;
    }

    public void setTxtVoltaje(JTextField txtVoltaje) {
        this.txtVoltaje = txtVoltaje;
    }

    public JLabel getLblConstanteDiolectrico() {
        return lblConstanteDiolectrico;
    }

    public void setLblConstanteDiolectrico(JLabel lblConstanteDiolectrico) {
        this.lblConstanteDiolectrico = lblConstanteDiolectrico;
    }

    public JTextField getTxtConstanteDiolectrico() {
        return txtConstanteDiolectrico;
    }

    public void setTxtConstanteDiolectrico(JTextField txtConstanteDiolectrico) {
        this.txtConstanteDiolectrico = txtConstanteDiolectrico;
    }

    public JButton getBtnVolver() {
        return btnVolver;
    }

    public void setBtnVolver(JButton btnVolver) {
        this.btnVolver = btnVolver;
    }

    public JButton getBtnCalcular() {
        return btnCalcular;
    }

    public void setBtnCalcular(JButton btnCalcular) {
        this.btnCalcular = btnCalcular;
    }
}
