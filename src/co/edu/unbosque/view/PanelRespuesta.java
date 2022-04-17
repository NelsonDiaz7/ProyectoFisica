package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelRespuesta extends JPanel{

    private JLabel erta;
    private JLabel erta2;

    public PanelRespuesta() {
        setLayout(null);

        inicializarComponentes();

        setVisible(false);
    }

    public void inicializarComponentes() {

        setBackground(new Color(232,232,232));
        Font font = new Font("Century Gothic", Font.BOLD, 12);
        setBorder(new TitledBorder("Panel de respuesta"));

        erta = new JLabel();
        erta.setFont(font);
        erta.setBounds(35, 35, 480, 80);
        add(erta);

        erta2 = new JLabel();
        erta2.setFont(font);
        erta2.setBounds(35, 65, 480, 80);
        add(erta2);

    }

    public JLabel getErta2() {
        return erta2;
    }

    public void setErta2(JLabel erta2) {
        this.erta2 = erta2;
    }

    public JLabel getErta() {
        return erta;
    }

    public void setErta(JLabel erta) {
        this.erta = erta;
    }


}
