package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.Numero;
import co.edu.unbosque.view.Mensaje;
import co.edu.unbosque.view.VentanaPrincipal;

public class Controller implements ActionListener{
    private Mensaje msg;
    private VentanaPrincipal ventana;
    private Numero n1;
    private Numero n2;
    private Numero n3;
    private Numero n4;
    private Numero n5;
    private Numero n6;
    private Numero dis;
    //private DecimalFormat df;


    public Controller() {
        ventana = new VentanaPrincipal();
        msg = new Mensaje();
        //df = new DecimalFormat("0.000");
        ventana.getPprincipal().setVisible(true);

        asignarOyentes();
    }

    public void asignarOyentes() {
        //botones panel datos
        ventana.getPdatos().getBley().addActionListener(this);
        ventana.getPdatos().getBayuda().addActionListener(this);
        ventana.getPdatos().getBcampoe().addActionListener(this);
        ventana.getPdatos().getBsalir().addActionListener(this);
        //botones panel principal
        ventana.getPprincipal().getBtntema1().addActionListener(this);
        ventana.getPprincipal().getBtntema2().addActionListener(this);
        ventana.getPprincipal().getBtntema3().addActionListener(this);
        ventana.getPprincipal().getBtntema4().addActionListener(this);
        ventana.getPprincipal().getBtntema5().addActionListener(this);
        //botones panel gauss
        ventana.getPleyGauss().getBtnfueraesfera().addActionListener(this);
        ventana.getPleyGauss().getBtndentroesfera().addActionListener(this);
        ventana.getPleyGauss().getBtnlaminacargada().addActionListener(this);
        ventana.getPleyGauss().getBtnvarillacargada().addActionListener(this);
        ventana.getPleyGauss().getBtnvolver().addActionListener(this);
        //botones panel esferaout
        ventana.getPesferaOut().getBtnvolver().addActionListener(this);
        ventana.getPesferaOut().getBtncalcular().addActionListener(this);
        //botones panel esferain
        ventana.getPesferaIn().getBtnvolver().addActionListener(this);
        ventana.getPesferaIn().getBtncalcular().addActionListener(this);
        //botones panel linea cargada
        ventana.getPlineaCargada().getBtnvolver().addActionListener(this);
        ventana.getPlineaCargada().getBtncalcular().addActionListener(this);
        //botones panel lamina cargada
        ventana.getPlaminaCargada().getBtnvolver().addActionListener(this);
        ventana.getPlaminaCargada().getBtncalcular().addActionListener(this);
        //botones panel suma capacitores
        ventana.getPsumacapa().getBtnVolver().addActionListener(this);
        ventana.getPsumacapa().getBtnsumaserie().addActionListener(this);
        ventana.getPsumacapa().getBtnSumaParalelo().addActionListener(this);
        //botones panel suma serie
        ventana.getPsumaserie().getBtnvolver().addActionListener(this);
        ventana.getPsumaserie().getBtnsumar().addActionListener(this);
        //botones panel suma paralelo
        ventana.getPsumaparalelo().getBtnvolver().addActionListener(this);
        ventana.getPsumaparalelo().getBtnsumar().addActionListener(this);
        //botones panel potencial electrico
        ventana.getPpotencial().getBtnVolver().addActionListener(this);
        ventana.getPpotencial().getBtnUnacarga().addActionListener(this);
        ventana.getPpotencial().getBtnDosCargas().addActionListener(this);
        //botenes panel una carga
        ventana.getPpotencialUnaCarga().getBtnvolver().addActionListener(this);
        ventana.getPpotencialUnaCarga().getBtncalcular().addActionListener(this);
        //botones panel dos cargas
        ventana.getPpotencialMasCargas().getBtnvolver().addActionListener(this);
        ventana.getPpotencialMasCargas().getBtncalcular().addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();
        String aux = "";
        double aux_dou = 0.0;

        //Comandos panel principal
        if (comando.equals("TEMA1")) {
            ventana.getPprincipal().setVisible(false);
            ventana.getPdatos().setVisible(true);
            ventana.getPrespuesta().setVisible(true);
        }
        if (comando.equals("TEMA2")) {
            ventana.getPprincipal().setVisible(false);
            ventana.getPleyGauss().setVisible(true);
        }
        if (comando.equals("TEMA4")) {
            ventana.getPsumacapa().setVisible(true);
            ventana.getPprincipal().setVisible(false);
        }

        if (comando.equals("TEMA5")) {
            ventana.getPprincipal().setVisible(false);
            ventana.getPpotencial().setVisible(true);
        }

        //Comandos panel suma capacitores
        if (comando.equals("VOLVERSUM")) {
            ventana.getPsumacapa().setVisible(false);
            ventana.getPprincipal().setVisible(true);
        }

        if (comando.equals("SUMSERIE")) {
            ventana.getPsumacapa().setVisible(false);
            ventana.getPsumaserie().setVisible(true);
            ventana.getPrespuesta().setVisible(true);
        }

        if (comando.equals("SUMPARALELO")) {
            ventana.getPsumacapa().setVisible(false);
            ventana.getPsumaparalelo().setVisible(true);
            ventana.getPrespuesta().setVisible(true);
        }

        //Comandos panel potencial electrico

        if (comando.equals("VOLVERPOTE")) {
            ventana.getPpotencial().setVisible(false);
            ventana.getPprincipal().setVisible(true);
        }

        if (comando.equals("POTECARGA")) {
            ventana.getPpotencial().setVisible(false);
            ventana.getPpotencialUnaCarga().setVisible(true);
            ventana.getPrespuesta().setVisible(true);
        }

        if (comando.equals("POTECARGADOS")) {
            ventana.getPpotencial().setVisible(false);
            ventana.getPpotencialMasCargas().setVisible(true);
            ventana.getPrespuesta().setVisible(true);
        }

        //Comandos panel datos
        if (comando.equals("COULOMB")) {
            try {
                aux = ventana.getPdatos().getCnum1().getText();
                aux_dou = Double.parseDouble(aux);
                n1 = new Numero(aux_dou);

                aux = ventana.getPdatos().getCnum2().getText();
                aux_dou = Double.parseDouble(aux);
                n2 = new Numero(aux_dou);
            } catch (Exception error) {
                msg.mostrarInformacionError("Solo debes usar números y la 'e' en caso de tener un exponente.");
            }


            try {
                aux = ventana.getPdatos().getCdist().getText();
                aux_dou = Double.parseDouble(aux);
                dis = new Numero(aux_dou);
            } catch (Exception error) {
                msg.mostrarInformacionError("Solo debes usar números y la 'e' en caso de tener un exponente. ");
            }

            double rta = n1.leyCoulomb(n2, dis);


            ventana.getPrespuesta().getErta().setText(" La fuerza total resultante es: " + rta + " (N) ");
        }

        if (comando.equals("AYUDA")) {
            msg.mostrarInformacion("Bienvenido a este programa." + "\n" +
                    "-En el primer espacio insertará la primera carga si tiene decimales las declara después de un punto (.)." + "\n" +
                    "-En dado caso el número sea en notacion cientifica lo insertará de la siguiente manera:  4e-3" + "\n" +
                    "esto será igual que  4x10^-3. De igual manera en el segundo campo. " + "\n" +
                    "-En el ultimo campo debera ingresar la distancia en metros. " + "\n\n" +
                    "Acto final dará al botón que dice Coulomb para hallar la fuerza resultante entra las dos cargas." + "\n" +
                    "O en su defecto a campos electricos, según guste.");
        }


        if (comando.equals("CAMPOS")) {
            try {
                aux = ventana.getPdatos().getCnum1().getText();
                aux_dou = Double.parseDouble(aux);
                n1 = new Numero(aux_dou);

                aux = ventana.getPdatos().getCnum2().getText();
                aux_dou = Double.parseDouble(aux);
                n2 = new Numero(aux_dou);
            } catch (Exception error) {
                msg.mostrarInformacionError("Solo debes usar números y la 'e' en caso de tener un exponente.");
            }


            try {
                aux = ventana.getPdatos().getCdist().getText();
                aux_dou = Double.parseDouble(aux);
                dis = new Numero(aux_dou);
            } catch (Exception error) {
                msg.mostrarInformacionError("La medida debe ser un valor númerico y en metros. ");
            }

            double rta = n1.campoElectricoq1(n2, dis);
            double rta1 = n1.campoElectricoq2(n2, dis);

            ventana.getPrespuesta().getErta().setText(" El campo E2: " + rta + "(N/C) Y " + "\n\n" +
                    " El campo E1: " + rta1 + "(N/C)");

        }

        if (comando.equals("SALIRCAMPOS")) {
            ventana.getPprincipal().setVisible(true);
            ventana.getPdatos().setVisible(false);
            ventana.getPrespuesta().setVisible(false);
        }

        //Comandos panel ley gauss

        if (comando.equals("FUERAESFERA")) {
            ventana.getPleyGauss().setVisible(false);
            ventana.getPesferaOut().setVisible(true);
            ventana.getPrespuesta().setVisible(true);
        }

        if (comando.equals("DENTROESFERA")) {
            ventana.getPleyGauss().setVisible(false);
            ventana.getPesferaIn().setVisible(true);
            ventana.getPrespuesta().setVisible(true);
        }

        if (comando.equals("LINEACARGADA")) {
            ventana.getPleyGauss().setVisible(false);
            ventana.getPlineaCargada().setVisible(true);
            ventana.getPrespuesta().setVisible(true);
        }

        if (comando.equals("LAMINACARGADA")) {
            ventana.getPleyGauss().setVisible(false);
            ventana.getPlaminaCargada().setVisible(true);
            ventana.getPrespuesta().setVisible(true);
        }

        if (comando.equals("VOLVERFLUJO")) {
            ventana.getPprincipal().setVisible(true);
            ventana.getPleyGauss().setVisible(false);
        }

        //comandos panel esferaout

        if (comando.equals("VOLVERESFERAOUT")) {
            ventana.getPleyGauss().setVisible(true);
            ventana.getPesferaOut().setVisible(false);
            ventana.getPrespuesta().setVisible(false);
        }

        if (comando.equals("CALCULARESFERAOUT")) {
            try {
                aux = ventana.getPesferaOut().getTxtcarga().getText();
                aux_dou = Double.parseDouble(aux);
                n1 = new Numero(aux_dou);
                System.out.println(aux);

                aux = ventana.getPesferaOut().getTxtradio().getText();
                aux_dou = Double.parseDouble(aux);
                n2 = new Numero(aux_dou);
                System.out.println(aux);

            } catch (Exception error) {
                msg.mostrarInformacionError("Solo debes usar números y la 'e' en caso de tener un exponente.");
            }

            double rta = n1.CampoEsferaOut(n2);
            ventana.getPrespuesta().getErta().setText(" El campo fuera de la esfera es: " + rta + " (N/C) ");

        }

        //comandos panel esferain

        if (comando.equals("VOLVERESFERAIN")) {
            ventana.getPleyGauss().setVisible(true);
            ventana.getPesferaIn().setVisible(false);
            ventana.getPrespuesta().setVisible(false);
        }

        if (comando.equals("CALCULARESFERAIN")) {
            try {
                aux = ventana.getPesferaIn().getTxtcarga().getText();
                aux_dou = Double.parseDouble(aux);
                n1 = new Numero(aux_dou);
                System.out.println(aux);

                aux = ventana.getPesferaIn().getTxtradior().getText();
                aux_dou = Double.parseDouble(aux);
                n2 = new Numero(aux_dou);
                System.out.println(aux);

                aux = ventana.getPesferaIn().getTxtradioR().getText();
                aux_dou = Double.parseDouble(aux);
                n3 = new Numero(aux_dou);
                System.out.println(aux);

            } catch (Exception error) {
                msg.mostrarInformacionError("Solo debes usar números y la 'e' en caso de tener un exponente.");
            }

            double rta = n1.CampoEsferaIn(n2, n3);
            ventana.getPrespuesta().getErta().setText(" El campo dentro de la esfera es: " + rta + " (N/C) ");
        }

        //comandos panel linea cargada

        if (comando.equals("VOLVERLINEACARGADA")) {
            ventana.getPleyGauss().setVisible(true);
            ventana.getPlineaCargada().setVisible(false);
            ventana.getPrespuesta().setVisible(false);
        }

        if (comando.equals("CALCULARLINEACARGADA")) {
            try {
                aux = ventana.getPlineaCargada().getTxtcarga().getText();
                aux_dou = Double.parseDouble(aux);
                n1 = new Numero(aux_dou);
                System.out.println(aux);

                aux = ventana.getPlineaCargada().getTxtlongitud().getText();
                aux_dou = Double.parseDouble(aux);
                n2 = new Numero(aux_dou);
                System.out.println(aux);

                aux = ventana.getPlineaCargada().getTxtradio().getText();
                aux_dou = Double.parseDouble(aux);
                n3 = new Numero(aux_dou);
                System.out.println(aux);

            } catch (Exception error) {
                msg.mostrarInformacionError("Solo debes usar números y la 'e' en caso de tener un exponente.");
            }

            double rta = n1.CampoLineaCargada(n2, n3);
            ventana.getPrespuesta().getErta().setText(" El campo de la linea es: " + rta + " (N/C) ");
        }

        //comandos panel lamina cargada

        if (comando.equals("VOLVERLAMINACARGADA")) {
            ventana.getPleyGauss().setVisible(true);
            ventana.getPlaminaCargada().setVisible(false);
            ventana.getPrespuesta().setVisible(false);
        }

        if (comando.equals("CALCULARLAMINACARGADA")) {

            try {
                aux = ventana.getPlaminaCargada().getTxtcarga().getText();
                aux_dou = Double.parseDouble(aux);
                n1 = new Numero(aux_dou);
                System.out.println(aux);

                aux = ventana.getPlaminaCargada().getTxtlongitud().getText();
                aux_dou = Double.parseDouble(aux);
                n2 = new Numero(aux_dou);
                System.out.println(aux);

            } catch (Exception error) {
                msg.mostrarInformacionError("Solo debes usar números y la 'e' en caso de tener un exponente.");
            }

            double rta = n1.CampoLaminaCargada(n2);
            ventana.getPrespuesta().getErta().setText(" El campo de una lamina cargada es: " + rta + " (N/C) ");
        }

        //comandos panel suma paralelo

        if (comando.equals("VOLVERSUMARPARALELO")) {
            ventana.getPsumacapa().setVisible(true);
            ventana.getPsumaparalelo().setVisible(false);
            ventana.getPrespuesta().setVisible(false);
        }

        if (comando.equals("SUMARPARALELO")) {
            try {
                aux = ventana.getPsumaparalelo().getTxtvoltaje1().getText();
                aux_dou = Double.parseDouble(aux);
                n1 = new Numero(aux_dou);
                System.out.println(aux);

                aux = ventana.getPsumaparalelo().getTxtvoltaje2().getText();
                aux_dou = Double.parseDouble(aux);
                n2 = new Numero(aux_dou);
                System.out.println(aux);

                aux = ventana.getPsumaparalelo().getTxtvoltaje3().getText();
                aux_dou = Double.parseDouble(aux);
                n3 = new Numero(aux_dou);
                System.out.println(aux);

            } catch (Exception error) {
                msg.mostrarInformacionError("Solo debes usar números y la 'e' en caso de tener un exponente.");
            }

            double rta = n1.SumaParalelo(n2, n3);
            ventana.getPrespuesta().getErta().setText(" La suma en paralelo es: " + rta + " (F) ");

        }

        //comandos panel suma serie

        if (comando.equals("VOLVERSUMARSERIE")) {
            ventana.getPsumacapa().setVisible(true);
            ventana.getPsumaserie().setVisible(false);
            ventana.getPrespuesta().setVisible(false);
        }

        if (comando.equals("SUMARSERIE")) {

            try {
                aux = ventana.getPsumaserie().getTxtvoltaje1().getText();
                aux_dou = Double.parseDouble(aux);
                n1 = new Numero(aux_dou);
                System.out.println(aux);

                aux = ventana.getPsumaserie().getTxtvoltaje2().getText();
                aux_dou = Double.parseDouble(aux);
                n2 = new Numero(aux_dou);
                System.out.println(aux);

                aux = ventana.getPsumaserie().getTxtvoltaje3().getText();
                aux_dou = Double.parseDouble(aux);
                n3 = new Numero(aux_dou);
                System.out.println(aux);

            } catch (Exception error) {
                msg.mostrarInformacionError("Solo debes usar números y la 'e' en caso de tener un exponente.");
            }

            double rta = n1.SumaSerie(n2, n3);
            ventana.getPrespuesta().getErta().setText(" La suma en serie es: " + rta + " (F) ");
        }

        //comandos potencial una carga

        if (comando.equals("VOLVERPOTECARGA")) {
            ventana.getPpotencial().setVisible(true);
            ventana.getPpotencialUnaCarga().setVisible(false);
            ventana.getPrespuesta().setVisible(false);
        }

        if (comando.equals("CALCULARPOTECARGA")) {

            try {
                aux = ventana.getPpotencialUnaCarga().getTxtcarga().getText();
                aux_dou = Double.parseDouble(aux);
                n1 = new Numero(aux_dou);
                System.out.println(aux);

                aux = ventana.getPpotencialUnaCarga().getTxtdistancia().getText();
                aux_dou = Double.parseDouble(aux);
                n2 = new Numero(aux_dou);
                System.out.println(aux);


            } catch (Exception error) {
                msg.mostrarInformacionError("Solo debes usar números y la 'e' en caso de tener un exponente.");
            }

            double rta = n1.PotencialUnaCarga(n2);
            ventana.getPrespuesta().getErta().setText(" El potencial eléctrico es: " + rta + " (V) ");
        }

        //comandos potencial dos cargas

        if (comando.equals("VOLVERPOTEMASCARGA")) {
            ventana.getPpotencial().setVisible(true);
            ventana.getPpotencialMasCargas().setVisible(false);
            ventana.getPrespuesta().setVisible(false);
        }

        if (comando.equals("CALCULARPOTEMASCARGA"))
        {

            try {
                aux = ventana.getPpotencialMasCargas().getTxtcarga().getText();
                aux_dou = Double.parseDouble(aux);
                n1 = new Numero(aux_dou);
                System.out.println(aux);

                aux = ventana.getPpotencialMasCargas().getTxtdistancia().getText();
                aux_dou = Double.parseDouble(aux);
                n2 = new Numero(aux_dou);
                System.out.println(aux);

                aux = ventana.getPpotencialMasCargas().getTxtcarga2().getText();
                aux_dou = Double.parseDouble(aux);
                n3 = new Numero(aux_dou);
                System.out.println(aux);

                aux = ventana.getPpotencialMasCargas().getTxtdistancia2().getText();
                aux_dou = Double.parseDouble(aux);
                 n4 = new Numero(aux_dou);
                System.out.println(aux);

                aux = ventana.getPpotencialMasCargas().getTxtcarga3().getText();
                aux_dou = Double.parseDouble(aux);
                n5 = new Numero(aux_dou);
                System.out.println(aux);

                aux = ventana.getPpotencialMasCargas().getTxtdistancia3().getText();
                aux_dou = Double.parseDouble(aux);
                 n6 = new Numero(aux_dou);
                System.out.println(aux);


            } catch (Exception error) {
                msg.mostrarInformacionError("Solo debes usar números y la 'e' en caso de tener un exponente.");
            }

            double rta = n1.PotencialMasCarga(n2, n3, n4, n5, n6);
            ventana.getPrespuesta().getErta().setText(" El potencial eléctrico es: " + rta + " (V) ");

        }

        }
    }


