package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;


import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelDatos extends JPanel{

    private JLabel enum1;
    private JLabel enum2;
    private JLabel edist;
    private JLabel eoperaciones;
    private JLabel erecordar;

    private JTextField cdist;
    private JTextField cnum1;
    private JTextField cnum2;

    private JButton bley;
    private JButton bayuda;
    private JButton bcampoe;
    private JButton bsalir;


    public PanelDatos() {
        setLayout(null);
        inicializarComponentes();
        setVisible(false);
    }

    public void inicializarComponentes() {

        setBackground(Color.cyan);
        Font font = new Font("Century Gothic", Font.BOLD, 12);
        TitledBorder tb = new TitledBorder("Panel de datos");
        tb.setTitleFont(font);
        setBorder(tb);

        erecordar = new JLabel(" (Recuerda  micro = e-6, nano = e-9, pico = e-12) ");
        erecordar.setFont(font);
        erecordar.setBounds(140, 20, 300, 20);
        add(erecordar);

        enum1 = new JLabel("Ingrese la primer carga(q1): ");
        enum1.setFont(font);
        enum1.setBounds(40, 50, 170, 20);
        add(enum1);

        cnum1 = new JTextField();
        cnum1.setFont(font);
        cnum1.setBounds(250 , 50 , 250 , 20);
        add(cnum1);

        enum2 = new JLabel("Ingrese la segunda carga(q2): ");
        enum2.setFont(font);
        enum2.setBounds(40, 80, 190, 20);
        add(enum2);

        cnum2 = new JTextField();
        cnum2.setFont(font);
        cnum2.setBounds(250 , 80, 250 , 20);
        add(cnum2);

        edist = new JLabel("Ingrese la distancia en metros(m): ");
        edist.setFont(font);
        edist.setBounds(40, 110, 250, 20);
        add(edist);

        cdist = new JTextField();
        cdist.setFont(font);
        cdist.setBounds(250 , 110, 250 , 20);
        add(cdist);

        eoperaciones = new JLabel("Operaciones: ");
        eoperaciones.setFont(font);
        eoperaciones.setBounds(50, 150, 170, 20);
        add(eoperaciones);

        bley = new JButton("Coulomb");
        bley.setFont(font);
        bley.setBounds(210, 150, 120, 20);
        add(bley);
        bley.setActionCommand("COULOMB");

        bayuda = new JButton("¿Como funciona?");
        bayuda.setFont(font);
        bayuda.setBounds(260, 180, 140,20);
        add(bayuda);
        bayuda.setActionCommand("AYUDA");

        bcampoe = new JButton("Campos Electricos");
        bcampoe.setFont(font);
        bcampoe.setBounds(335, 150, 147,20);
        add(bcampoe);
        bcampoe.setActionCommand("CAMPOS");

        bsalir = new JButton("Volver");
        bsalir.setFont(font);
        bsalir.setBounds(290, 210, 90,20);
        add(bsalir);
        bsalir.setActionCommand("SALIRCAMPOS");




    }

    public JButton getBsalir() {
        return bsalir;
    }

    public void setBsalir(JButton bsalir) {
        this.bsalir = bsalir;
    }

    public JButton getBcampoe() {
        return bcampoe;
    }

    public void setBcampoe(JButton bcampoe) {
        this.bcampoe = bcampoe;
    }

    public JLabel getEdist() {
        return edist;
    }

    public void setEdist(JLabel edist) {
        this.edist = edist;
    }

    public JTextField getCdist() {
        return cdist;
    }

    public void setCdist(JTextField cdist) {
        this.cdist = cdist;
    }

    public JLabel getEnum1() {
        return enum1;
    }

    public void setEnum1(JLabel enum1) {
        this.enum1 = enum1;
    }

    public JLabel getEnum2() {
        return enum2;
    }

    public void setEnum2(JLabel enum2) {
        this.enum2 = enum2;
    }

    public JLabel getEoperaciones() {
        return eoperaciones;
    }

    public void setEoperaciones(JLabel eoperaciones) {
        this.eoperaciones = eoperaciones;
    }

    public JTextField getCnum1() {
        return cnum1;
    }

    public void setCnum1(JTextField cnum1) {
        this.cnum1 = cnum1;
    }

    public JTextField getCnum2() {
        return cnum2;
    }

    public void setCnum2(JTextField cnum2) {
        this.cnum2 = cnum2;
    }

    public JButton getBley() {
        return bley;
    }

    public void setBley(JButton bley) {
        this.bley = bley;
    }

    public JButton getBayuda() {
        return bayuda;
    }

    public void setBayuda(JButton bayuda) {
        this.bayuda = bayuda;
    }
}
