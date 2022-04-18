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
    private PanelCapacitancia pcapacitancia;
    private PanelCapacitanciaCilindro pcapacitanciacilindro;
    private PanelCapacitanciaEsfera pcapacitanciaesfera;
    private PanelCapacitanciaLaminasparalelas pcapacitancialaminasparalelas;
    private PanelPotencialCilindro ppotencialcilindro;
    private PanelPotencialEsfera ppotencialesfera;
    private PanelSumaCapacitores psumacapa;
    private PanelSumaParalelo psumaparalelo;
    private PanelSumaSerie psumaserie;
    private PanelPotencialElectrico ppotencial;
    private PanelPotencialUnaCarga ppotencialUnaCarga;
    private PanelPotencialMasCargas ppotencialMasCargas;
    private PanelEnegiaPotencial penergiapotencial;
    private PanelEnegiaDosCargas penergiadoscargas;
    private PanelEnergiaUnaCarga penergiaUnaCarga;
    private PanelEnergiaAlmacenada penergiaAlmacenada;
    private PanelEneAlm1 peneAlm1;
    private PanelEneAlm2 peneAlm2;
    private PanelEneAlm3 peneAlm3;
    private PanelDenEne1 pdenEne1;
    private PanelDenEne2 pdenEne2;



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

        pcapacitancia = new PanelCapacitancia();
        pcapacitancia.setBounds(25, 25, 535, 415);
        getContentPane().add(pcapacitancia);

        pcapacitanciacilindro = new PanelCapacitanciaCilindro();
        pcapacitanciacilindro.setBounds(25, 25, 535, 250);
        getContentPane().add(pcapacitanciacilindro);

        pcapacitanciaesfera = new PanelCapacitanciaEsfera();
        pcapacitanciaesfera.setBounds(25, 25, 535, 250);
        getContentPane().add(pcapacitanciaesfera);

        pcapacitancialaminasparalelas = new PanelCapacitanciaLaminasparalelas();
        pcapacitancialaminasparalelas.setBounds(25, 25, 535, 250);
        getContentPane().add(pcapacitancialaminasparalelas);

        ppotencialcilindro = new PanelPotencialCilindro();
        ppotencialcilindro.setBounds(25, 25, 535, 250);
        getContentPane().add(ppotencialcilindro);

        ppotencialesfera= new PanelPotencialEsfera();
        ppotencialesfera.setBounds(25, 25, 535, 250);
        getContentPane().add(ppotencialesfera);

        psumacapa = new PanelSumaCapacitores();
        psumacapa.setBounds(25, 25, 535, 415);
        getContentPane().add(psumacapa);

        psumaparalelo = new PanelSumaParalelo();
        psumaparalelo.setBounds(25, 25, 535, 250);
        getContentPane().add(psumaparalelo);

        psumaserie = new PanelSumaSerie();
        psumaserie.setBounds(25, 25, 535, 250);
        getContentPane().add(psumaserie);

        ppotencial = new PanelPotencialElectrico();
        ppotencial.setBounds(25, 25, 535, 415);
        getContentPane().add(ppotencial);

        ppotencialUnaCarga = new PanelPotencialUnaCarga();
        ppotencialUnaCarga.setBounds(25, 25, 535, 250);
        getContentPane().add(ppotencialUnaCarga);

        ppotencialMasCargas = new PanelPotencialMasCargas();
        ppotencialMasCargas.setBounds(25, 25, 535, 250);
        getContentPane().add(ppotencialMasCargas);

        penergiapotencial = new PanelEnegiaPotencial();
        penergiapotencial.setBounds(25, 25, 535, 415);
        getContentPane().add(penergiapotencial);

        penergiadoscargas = new PanelEnegiaDosCargas();
        penergiadoscargas.setBounds(25, 25, 535, 250);
        getContentPane().add(penergiadoscargas);

        penergiaUnaCarga = new PanelEnergiaUnaCarga();
        penergiaUnaCarga.setBounds(25, 25, 535, 250);
        getContentPane().add(penergiaUnaCarga);

        penergiaAlmacenada = new PanelEnergiaAlmacenada();
        penergiaAlmacenada.setBounds(25, 25, 535, 415);
        getContentPane().add(penergiaAlmacenada);

        peneAlm1 = new PanelEneAlm1();
        peneAlm1.setBounds(25, 25, 535, 250);
        getContentPane().add(peneAlm1);

        peneAlm2 = new PanelEneAlm2();
        peneAlm2.setBounds(25, 25, 535, 250);
        getContentPane().add(peneAlm2);

        peneAlm3 = new PanelEneAlm3();
        peneAlm3.setBounds(25, 25, 535, 250);
        getContentPane().add(peneAlm3);

        pdenEne1 = new PanelDenEne1();
        pdenEne1.setBounds(25, 25, 535, 250);
        getContentPane().add(pdenEne1);

        pdenEne2 = new PanelDenEne2();
        pdenEne2.setBounds(25, 25, 535, 250);
        getContentPane().add(pdenEne2);

    }

    public PanelEneAlm1 getPeneAlm1() {
        return peneAlm1;
    }

    public PanelEneAlm2 getPeneAlm2() {
        return peneAlm2;
    }

    public PanelEneAlm3 getPeneAlm3() {
        return peneAlm3;
    }

    public PanelDenEne1 getPdenEne1() {
        return pdenEne1;
    }

    public PanelDenEne2 getPdenEne2() {
        return pdenEne2;
    }

    public PanelEnergiaAlmacenada getPenergiaAlmacenada() {
        return penergiaAlmacenada;
    }

    public PanelEnegiaDosCargas getPenergiadoscargas() {
        return penergiadoscargas;
    }

    public PanelEnergiaUnaCarga getPenergiaUnaCarga() {
        return penergiaUnaCarga;
    }

    public PanelEnegiaPotencial getPenergiapotencial() {
        return penergiapotencial;
    }

    public PanelPotencialUnaCarga getPpotencialUnaCarga() {
        return ppotencialUnaCarga;
    }

    public PanelPotencialMasCargas getPpotencialMasCargas() {
        return ppotencialMasCargas;
    }

    public PanelPotencialElectrico getPpotencial() {
        return ppotencial;
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

    public PanelCapacitancia getPcapacitancia() {
        return pcapacitancia;
    }
    public PanelCapacitanciaCilindro getPcapacitanciacilindro() {
        return pcapacitanciacilindro;
    }

    public PanelCapacitanciaEsfera getPcapacitanciaesfera() {
        return pcapacitanciaesfera;
    }

    public PanelCapacitanciaLaminasparalelas getPcapacitancialaminasparalelas() {
        return pcapacitancialaminasparalelas;
    }

    public PanelPotencialCilindro getPpotencialcilindro() {
        return ppotencialcilindro;
    }

    public PanelPotencialEsfera getPpotencialesfera() {
        return ppotencialesfera;
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
