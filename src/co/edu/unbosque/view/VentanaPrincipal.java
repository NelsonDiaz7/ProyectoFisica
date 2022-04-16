package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;


import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame{

    private PanelDatos pdatos;
    private PanelRespuesta prespuesta;
    private PanelPrincipal pprincipal;
    private PanelLeyGauss pleyGauss;
    private PanelEsferaOut pesferaOut;
    private PanelEsferaIn pesferaIn;
    private PanelLineaCargada plineaCargada;
    private PanelLaminaCargada plaminaCargada;
    private PanelSumaCapacitores psumacapa;
    private PanelSumaParalelo psumaparalelo;
    private PanelSumaSerie psumaserie;

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

        pleyGauss = new PanelLeyGauss();
        pleyGauss.setBounds(25, 25, 535, 415);
        getContentPane().add(pleyGauss);

        pesferaOut = new PanelEsferaOut();
        pesferaOut.setBounds(25, 25, 535, 250);
        getContentPane().add(pesferaOut);

        pesferaIn = new PanelEsferaIn();
        pesferaIn.setBounds(25, 25, 535, 250);
        getContentPane().add(pesferaIn);

        plineaCargada = new PanelLineaCargada();
        plineaCargada.setBounds(25, 25, 535, 250);
        getContentPane().add(plineaCargada);

        plaminaCargada = new PanelLaminaCargada();
        plaminaCargada.setBounds(25, 25, 535, 250);
        getContentPane().add(plaminaCargada);

        psumacapa = new PanelSumaCapacitores();
        psumacapa.setBounds(25, 25, 535, 415);
        getContentPane().add(psumacapa);

        psumaparalelo = new PanelSumaParalelo();
        psumaparalelo.setBounds(25, 25, 535, 250);
        getContentPane().add(psumaparalelo);

        psumaserie = new PanelSumaSerie();
        psumaserie.setBounds(25, 25, 535, 250);
        getContentPane().add(psumaserie);

    }

    public PanelSumaSerie getPsumaserie() {
        return psumaserie;
    }

    public PanelSumaParalelo getPsumaparalelo() {
        return psumaparalelo;
    }

    public PanelSumaCapacitores getPsumacapa() {
        return psumacapa;
    }

    public PanelLaminaCargada getPlaminaCargada() {
        return plaminaCargada;
    }

    public PanelLineaCargada getPlineaCargada() {
        return plineaCargada;
    }

    public PanelEsferaIn getPesferaIn() {
        return pesferaIn;
    }

    public PanelEsferaOut getPesferaOut() {
        return pesferaOut;
    }

    public PanelLeyGauss getPleyGauss() {
        return pleyGauss;
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
