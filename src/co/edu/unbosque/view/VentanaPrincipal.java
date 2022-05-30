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
    private PanelSumaParalelo2 psumaParalelo2;
    private PanelSumaParalelo4 psumaParalelo4;
    private PanelSumaParalelo5 psumaParalelo5;
    private PanelSumaParalelo6 psumaParalelo6;
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
    private PanelCapacitorConD pcapConD;
    private PanelConstDie pconstDie;
    private PanelCampoElectricoD pCampoElectricoD;
    private PanelCapacitanciaconD pCapacitanciaD;
    private PanelPotencialConD pPotencialD;


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

        psumaParalelo2 = new PanelSumaParalelo2();
        psumaParalelo2.setBounds(25, 25, 535,250);
        getContentPane().add(psumaParalelo2);

        psumaParalelo4 = new PanelSumaParalelo4();
        psumaParalelo4.setBounds(25, 25, 535,250);
        getContentPane().add(psumaParalelo4);

        psumaParalelo5 = new PanelSumaParalelo5();
        psumaParalelo5.setBounds(25, 25, 535,250);
        getContentPane().add(psumaParalelo5);

        psumaParalelo6 = new PanelSumaParalelo6();
        psumaParalelo6.setBounds(25, 25, 535,250);
        getContentPane().add(psumaParalelo6);

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

        pcapConD = new PanelCapacitorConD();
        pcapConD.setBounds(25,25,535,415);
        getContentPane().add(pcapConD);

        pconstDie = new PanelConstDie();
        pconstDie.setBounds(25,25,535,250);
        getContentPane().add(pconstDie);

        pCampoElectricoD = new PanelCampoElectricoD();
        pCampoElectricoD.setBounds(25,25,535,250);
        getContentPane().add(pCampoElectricoD);

        pCapacitanciaD = new PanelCapacitanciaconD();
        pCapacitanciaD.setBounds(25,25,535,250);
        getContentPane().add(pCapacitanciaD);

        pPotencialD = new PanelPotencialConD();
        pPotencialD.setBounds(25,25,535,250);
        getContentPane().add(pPotencialD);


    }

    public PanelSumaParalelo2 getPsumaParalelo2() {
        return psumaParalelo2;
    }

    public void setPsumaParalelo2(PanelSumaParalelo2 psumaParalelo2) {
        this.psumaParalelo2 = psumaParalelo2;
    }

    public PanelSumaParalelo4 getPsumaParalelo4() {
        return psumaParalelo4;
    }

    public void setPsumaParalelo4(PanelSumaParalelo4 psumaParalelo4) {
        this.psumaParalelo4 = psumaParalelo4;
    }

    public PanelSumaParalelo5 getPsumaParalelo5() {
        return psumaParalelo5;
    }

    public void setPsumaParalelo5(PanelSumaParalelo5 psumaParalelo5) {
        this.psumaParalelo5 = psumaParalelo5;
    }

    public PanelSumaParalelo6 getPsumaParalelo6() {
        return psumaParalelo6;
    }

    public void setPsumaParalelo6(PanelSumaParalelo6 psumaParalelo6) {
        this.psumaParalelo6 = psumaParalelo6;
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

    public void setPprincipal(PanelPrincipal pprincipal) {
        this.pprincipal = pprincipal;
    }

    public PanelLeyGauss getPleyGauss() {
        return pleyGauss;
    }

    public void setPleyGauss(PanelLeyGauss pleyGauss) {
        this.pleyGauss = pleyGauss;
    }

    public PanelEsferaOut getPesferaOut() {
        return pesferaOut;
    }

    public void setPesferaOut(PanelEsferaOut pesferaOut) {
        this.pesferaOut = pesferaOut;
    }

    public PanelEsferaIn getPesferaIn() {
        return pesferaIn;
    }

    public void setPesferaIn(PanelEsferaIn pesferaIn) {
        this.pesferaIn = pesferaIn;
    }

    public PanelLineaCargada getPlineaCargada() {
        return plineaCargada;
    }

    public void setPlineaCargada(PanelLineaCargada plineaCargada) {
        this.plineaCargada = plineaCargada;
    }

    public PanelLaminaCargada getPlaminaCargada() {
        return plaminaCargada;
    }

    public void setPlaminaCargada(PanelLaminaCargada plaminaCargada) {
        this.plaminaCargada = plaminaCargada;
    }

    public PanelCapacitancia getPcapacitancia() {
        return pcapacitancia;
    }

    public void setPcapacitancia(PanelCapacitancia pcapacitancia) {
        this.pcapacitancia = pcapacitancia;
    }

    public PanelCapacitanciaCilindro getPcapacitanciacilindro() {
        return pcapacitanciacilindro;
    }

    public void setPcapacitanciacilindro(PanelCapacitanciaCilindro pcapacitanciacilindro) {
        this.pcapacitanciacilindro = pcapacitanciacilindro;
    }

    public PanelCapacitanciaEsfera getPcapacitanciaesfera() {
        return pcapacitanciaesfera;
    }

    public void setPcapacitanciaesfera(PanelCapacitanciaEsfera pcapacitanciaesfera) {
        this.pcapacitanciaesfera = pcapacitanciaesfera;
    }

    public PanelCapacitanciaLaminasparalelas getPcapacitancialaminasparalelas() {
        return pcapacitancialaminasparalelas;
    }

    public void setPcapacitancialaminasparalelas(PanelCapacitanciaLaminasparalelas pcapacitancialaminasparalelas) {
        this.pcapacitancialaminasparalelas = pcapacitancialaminasparalelas;
    }

    public PanelPotencialCilindro getPpotencialcilindro() {
        return ppotencialcilindro;
    }

    public void setPpotencialcilindro(PanelPotencialCilindro ppotencialcilindro) {
        this.ppotencialcilindro = ppotencialcilindro;
    }

    public PanelPotencialEsfera getPpotencialesfera() {
        return ppotencialesfera;
    }

    public void setPpotencialesfera(PanelPotencialEsfera ppotencialesfera) {
        this.ppotencialesfera = ppotencialesfera;
    }

    public PanelSumaCapacitores getPsumacapa() {
        return psumacapa;
    }

    public void setPsumacapa(PanelSumaCapacitores psumacapa) {
        this.psumacapa = psumacapa;
    }

    public PanelSumaParalelo getPsumaparalelo() {
        return psumaparalelo;
    }

    public void setPsumaparalelo(PanelSumaParalelo psumaparalelo) {
        this.psumaparalelo = psumaparalelo;
    }

    public PanelSumaSerie getPsumaserie() {
        return psumaserie;
    }

    public void setPsumaserie(PanelSumaSerie psumaserie) {
        this.psumaserie = psumaserie;
    }

    public PanelPotencialElectrico getPpotencial() {
        return ppotencial;
    }

    public void setPpotencial(PanelPotencialElectrico ppotencial) {
        this.ppotencial = ppotencial;
    }

    public PanelPotencialUnaCarga getPpotencialUnaCarga() {
        return ppotencialUnaCarga;
    }

    public void setPpotencialUnaCarga(PanelPotencialUnaCarga ppotencialUnaCarga) {
        this.ppotencialUnaCarga = ppotencialUnaCarga;
    }

    public PanelPotencialMasCargas getPpotencialMasCargas() {
        return ppotencialMasCargas;
    }

    public void setPpotencialMasCargas(PanelPotencialMasCargas ppotencialMasCargas) {
        this.ppotencialMasCargas = ppotencialMasCargas;
    }

    public PanelEnegiaPotencial getPenergiapotencial() {
        return penergiapotencial;
    }

    public void setPenergiapotencial(PanelEnegiaPotencial penergiapotencial) {
        this.penergiapotencial = penergiapotencial;
    }

    public PanelEnegiaDosCargas getPenergiadoscargas() {
        return penergiadoscargas;
    }

    public void setPenergiadoscargas(PanelEnegiaDosCargas penergiadoscargas) {
        this.penergiadoscargas = penergiadoscargas;
    }

    public PanelEnergiaUnaCarga getPenergiaUnaCarga() {
        return penergiaUnaCarga;
    }

    public void setPenergiaUnaCarga(PanelEnergiaUnaCarga penergiaUnaCarga) {
        this.penergiaUnaCarga = penergiaUnaCarga;
    }

    public PanelEnergiaAlmacenada getPenergiaAlmacenada() {
        return penergiaAlmacenada;
    }

    public void setPenergiaAlmacenada(PanelEnergiaAlmacenada penergiaAlmacenada) {
        this.penergiaAlmacenada = penergiaAlmacenada;
    }

    public PanelEneAlm1 getPeneAlm1() {
        return peneAlm1;
    }

    public void setPeneAlm1(PanelEneAlm1 peneAlm1) {
        this.peneAlm1 = peneAlm1;
    }

    public PanelEneAlm2 getPeneAlm2() {
        return peneAlm2;
    }

    public void setPeneAlm2(PanelEneAlm2 peneAlm2) {
        this.peneAlm2 = peneAlm2;
    }

    public PanelEneAlm3 getPeneAlm3() {
        return peneAlm3;
    }

    public void setPeneAlm3(PanelEneAlm3 peneAlm3) {
        this.peneAlm3 = peneAlm3;
    }

    public PanelDenEne1 getPdenEne1() {
        return pdenEne1;
    }

    public void setPdenEne1(PanelDenEne1 pdenEne1) {
        this.pdenEne1 = pdenEne1;
    }

    public PanelDenEne2 getPdenEne2() {
        return pdenEne2;
    }

    public void setPdenEne2(PanelDenEne2 pdenEne2) {
        this.pdenEne2 = pdenEne2;
    }

    public PanelCapacitorConD getPcapConD() {
        return pcapConD;
    }

    public void setPcapConD(PanelCapacitorConD pcapConD) {
        this.pcapConD = pcapConD;
    }

    public PanelConstDie getPconstDie() {
        return pconstDie;
    }

    public void setPconstDie(PanelConstDie pconstDie) {
        this.pconstDie = pconstDie;
    }

    public PanelCampoElectricoD getpCampoElectricoD() {
        return pCampoElectricoD;
    }

    public void setpCampoElectricoD(PanelCampoElectricoD pCampoElectricoD) {
        this.pCampoElectricoD = pCampoElectricoD;
    }

    public PanelCapacitanciaconD getpCapacitanciaD() {
        return pCapacitanciaD;
    }

    public void setpCapacitanciaD(PanelCapacitanciaconD pCapacitanciaD) {
        this.pCapacitanciaD = pCapacitanciaD;
    }

    public PanelPotencialConD getpPotencialD() {
        return pPotencialD;
    }

    public void setpPotencialD(PanelPotencialConD pPotencialD) {
        this.pPotencialD = pPotencialD;
    }
}
