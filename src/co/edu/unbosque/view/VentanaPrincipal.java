package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;


import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame{

    private PanelDatos pdatos;
    private PanelRespuesta prespuesta;
    private PanelPrincipal pprincipal;
    private PanelFlujoElectrico pflujo;

    public VentanaPrincipal() {

        setTitle("Calculadora Fisica");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.lightGray);
        getContentPane().setLayout(null);
        Font font = new Font("Century Gothic", Font.BOLD, 14);

        inicializarComponentes();

        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void inicializarComponentes() {

        pdatos = new PanelDatos();
        pdatos.setBounds(25, 25, 535, 250);
        getContentPane().add(pdatos);

        prespuesta = new PanelRespuesta();
        prespuesta.setBounds(25, 300, 535, 140);
        getContentPane().add(prespuesta);

        pprincipal = new PanelPrincipal();
        pprincipal.setBounds(25, 25, 535, 415);
        getContentPane().add(pprincipal);

        pflujo = new PanelFlujoElectrico();
        pflujo.setBounds(25, 25, 535, 415);
        getContentPane().add(pflujo);

    }

    public PanelFlujoElectrico getPflujo() {
        return pflujo;
    }

    public PanelDatos getPdatos() {
        return pdatos;
    }

    public void setPdatos(PanelDatos pdatos) {
        this.pdatos = pdatos;
    }

    public PanelRespuesta getPrespuesta() {
        return prespuesta;
    }

    public void setPrespuesta(PanelRespuesta prespuesta) {
        this.prespuesta = prespuesta;
    }

    public PanelPrincipal getPprincipal() {
        return pprincipal;
    }

}
