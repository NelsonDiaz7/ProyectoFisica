package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.Numero;
import co.edu.unbosque.view.Mensaje;
import co.edu.unbosque.view.VentanaPrincipal;

public class Controller implements ActionListener {
    private Mensaje msg;
    private VentanaPrincipal ventana;
    private Numero n1;
    private Numero n2;
    private Numero n3;
    private Numero n4;
    private Numero n5;
    private Numero n6;
    private Numero dis;


    public Controller() {
        ventana = new VentanaPrincipal();
        msg = new Mensaje();
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
        ventana.getPprincipal().getBtntema6().addActionListener(this);
        ventana.getPprincipal().getBtntema7().addActionListener(this);
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
        //botones panel Capacitancia
        ventana.getPcapacitancia().getBtncapacitorcilindro().addActionListener(this);
        ventana.getPcapacitancia().getBtncapacitoresferico().addActionListener(this);
        ventana.getPcapacitancia().getBtnlaminasparalelas().addActionListener(this);
        ventana.getPcapacitancia().getBtnpotencialcilindro().addActionListener(this);
        ventana.getPcapacitancia().getBtnpotencialesferico().addActionListener(this);
        ventana.getPcapacitancia().getBtnvolver().addActionListener(this);
        //botones panel Capacitancia cilindro
        ventana.getPcapacitanciacilindro().getBtnvolver().addActionListener(this);
        ventana.getPcapacitanciacilindro().getBtncalcular().addActionListener(this);
        //botnes panel Capacitancia esfera
        ventana.getPcapacitanciaesfera().getBtnvolver().addActionListener(this);
        ventana.getPcapacitanciaesfera().getBtncalcular().addActionListener(this);
        //botones panel Capacitancia laminas paralelas
        ventana.getPcapacitancialaminasparalelas().getBtnvolver().addActionListener(this);
        ventana.getPcapacitancialaminasparalelas().getBtncalcular().addActionListener(this);
        //botones potencial del cilindro
        ventana.getPpotencialcilindro().getBtnvolver().addActionListener(this);
        ventana.getPpotencialcilindro().getBtncalcular().addActionListener(this);
        //botones potencial de la esfera
        ventana.getPpotencialesfera().getBtnvolver().addActionListener(this);
        ventana.getPpotencialesfera().getBtncalcular().addActionListener(this);
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
        //botones panel Energia potencial
        ventana.getPenergiapotencial().getBtnvolver().addActionListener(this);
        ventana.getPenergiapotencial().getBtnEnegiaPotencialdoscargas().addActionListener(this);
        ventana.getPenergiapotencial().getBtnEnegiaSobreunaCarga().addActionListener(this);
        //botones panel Energia potencial sobre una carga
        ventana.getPenergiaUnaCarga().getBtnvolver().addActionListener(this);
        ventana.getPenergiaUnaCarga().getBtncalcular().addActionListener(this);
        //botones panel Energia potencial sobre dos cargas
        ventana.getPenergiadoscargas().getBtnvolver().addActionListener(this);
        ventana.getPenergiadoscargas().getBtncalcular().addActionListener(this);
        //botones panel Energia almacenada
        ventana.getPenergiaAlmacenada().getBtnvolver().addActionListener(this);
        ventana.getPenergiaAlmacenada().getBtnEnergiaAlmacenada().addActionListener(this);
        ventana.getPenergiaAlmacenada().getBtnEnergiaAlmacenada2().addActionListener(this);
        ventana.getPenergiaAlmacenada().getBtnEnergiaAlmacenada3().addActionListener(this);
        ventana.getPenergiaAlmacenada().getBtnDensidadEnergia1().addActionListener(this);
        ventana.getPenergiaAlmacenada().getBtnDensidadEnergia2().addActionListener(this);
        //botones panel Energia almacenada1
        ventana.getPeneAlm1().getBtnvolver().addActionListener(this);
        ventana.getPeneAlm1().getBtncalcular().addActionListener(this);
        //botones panel Energia almacenada2
        ventana.getPeneAlm2().getBtnvolver().addActionListener(this);
        ventana.getPeneAlm2().getBtncalcular().addActionListener(this);
        //botones panel Energia almacenada3
        ventana.getPeneAlm3().getBtnvolver().addActionListener(this);
        ventana.getPeneAlm3().getBtncalcular().addActionListener(this);
        //botenes panel densidad energia1
        ventana.getPdenEne1().getBtnvolver().addActionListener(this);
        ventana.getPdenEne1().getBtncalcular().addActionListener(this);
        //botones panel densidad energia2
        ventana.getPdenEne2().getBtnvolver().addActionListener(this);
        ventana.getPdenEne2().getBtncalcular().addActionListener(this);
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
        if (comando.equals("TEMA3")) {
            ventana.getPprincipal().setVisible(false);
            ventana.getPcapacitancia().setVisible(true);
        }
        if (comando.equals("TEMA4")) {
            ventana.getPsumacapa().setVisible(true);
            ventana.getPprincipal().setVisible(false);
        }

        if (comando.equals("TEMA5")) {
            ventana.getPprincipal().setVisible(false);
            ventana.getPpotencial().setVisible(true);
        }

        if (comando.equals("TEMA6")) {
            ventana.getPenergiapotencial().setVisible(true);
            ventana.getPprincipal().setVisible(false);
        }

        if (comando.equals("TEMA7")) {
            ventana.getPprincipal().setVisible(false);
            ventana.getPenergiaAlmacenada().setVisible(true);
        }

        //comandos panel Capacitancia

        if (comando.equals("VOLVERCAPACITANCIA")) {
            ventana.getPprincipal().setVisible(true);
            ventana.getPcapacitancia().setVisible(false);
        }

        if (comando.equals("CAPACITANCIACILINDRO")) {
            ventana.getPcapacitancia().setVisible(false);
            ventana.getPcapacitanciacilindro().setVisible(true);
            ventana.getPrespuesta().setVisible(true);
        }

        if (comando.equals("CAPACITANCIAESFERA")) {
            ventana.getPcapacitancia().setVisible(false);
            ventana.getPcapacitanciaesfera().setVisible(true);
            ventana.getPrespuesta().setVisible(true);
        }

        if (comando.equals("LAMINAPARALELA")) {
            ventana.getPcapacitancia().setVisible(false);
            ventana.getPcapacitancialaminasparalelas().setVisible(true);
            ventana.getPrespuesta().setVisible(true);
        }

        if (comando.equals("POTENCIALCILINDRO")) {
            ventana.getPcapacitancia().setVisible(false);
            ventana.getPpotencialcilindro().setVisible(true);
            ventana.getPrespuesta().setVisible(true);
        }
        if (comando.equals("POTENCIALESFERA")) {
            ventana.getPcapacitancia().setVisible(false);
            ventana.getPpotencialesfera().setVisible(true);
            ventana.getPrespuesta().setVisible(true);
        }

        //Panel capacitancia del cilindro

        if (comando.equals("VOLVERCAPACITANCIACILINDRO")) {
            ventana.getPcapacitancia().setVisible(true);
            ventana.getPcapacitanciacilindro().setVisible(false);
            ventana.getPrespuesta().setVisible(false);
        }

        if (comando.equals("CALCULARCAPACITANCIACILINDRO")) {
            try {
                aux = ventana.getPcapacitanciacilindro().getTxtlongitud().getText();
                aux_dou = Double.parseDouble(aux);
                n1 = new Numero(aux_dou);
                System.out.println(aux);

                aux = ventana.getPcapacitanciacilindro().getTxtradio1().getText();
                aux_dou = Double.parseDouble(aux);
                n2 = new Numero(aux_dou);
                System.out.println(aux);

                aux = ventana.getPcapacitanciacilindro().getTxtradio2().getText();
                aux_dou = Double.parseDouble(aux);
                n3 = new Numero(aux_dou);
                System.out.println(aux);

            } catch (Exception error) {
                msg.mostrarInformacionError("Solo debes usar números y la 'e' en caso de tener un exponente.");
            }

            double rta = n1.CapacitanciaCilindro(n2,n3);
            ventana.getPrespuesta().getErta().setText(" La capacitancia del cilindro es : " + rta + " (F) ");

        }
        //Panel capacitancia de la esfera

        if (comando.equals("VOLVERCAPACITANCIAESFERA")) {
            ventana.getPcapacitancia().setVisible(true);
            ventana.getPcapacitanciaesfera().setVisible(false);
            ventana.getPrespuesta().setVisible(false);
        }

        if (comando.equals("CALCULARCAPACITANCIAESFERA")) {
            try {
                aux = ventana.getPcapacitanciaesfera().getTxtradio1().getText();
                aux_dou = Double.parseDouble(aux);
                n1 = new Numero(aux_dou);
                System.out.println(aux);

                aux = ventana.getPcapacitanciaesfera().getTxtradio2().getText();
                aux_dou = Double.parseDouble(aux);
                n2 = new Numero(aux_dou);
                System.out.println(aux);

            } catch (Exception error) {
                msg.mostrarInformacionError("Solo debes usar números y la 'e' en caso de tener un exponente.");
            }

            double rta = n1.CapacitanciaEsfera(n2);
            ventana.getPrespuesta().getErta().setText(" La capacitancia de la esfera es: " + rta + " (F) ");

        }

        //Panel capacitancia de laminas paralelas

        if (comando.equals("VOLVERLAMINASPARALELAS")) {
            ventana.getPcapacitancia().setVisible(true);
            ventana.getPcapacitancialaminasparalelas().setVisible(false);
            ventana.getPrespuesta().setVisible(false);
        }

        if (comando.equals("CALCULARLAMINASPARALELAS")) {
            try {
                aux = ventana.getPcapacitancialaminasparalelas().getTxtarea().getText();
                aux_dou = Double.parseDouble(aux);
                n1 = new Numero(aux_dou);
                System.out.println(aux);

                aux = ventana.getPcapacitancialaminasparalelas().getTxtdistancia().getText();
                aux_dou = Double.parseDouble(aux);
                n2 = new Numero(aux_dou);
                System.out.println(aux);

            } catch (Exception error) {
                msg.mostrarInformacionError("Solo debes usar números y la 'e' en caso de tener un exponente.");
            }

            double rta = n1.CapacitanciaLaminasParalelas(n2);
            ventana.getPrespuesta().getErta().setText(" La capacitancia de las laminas paralelas es: " + rta + " (F) ");

        }

        //Panel Potencial del cilindro

        if (comando.equals("VOLVERPOTENCIALCILINDRO")) {
            ventana.getPcapacitancia().setVisible(true);
            ventana.getPpotencialcilindro().setVisible(false);
            ventana.getPrespuesta().setVisible(false);
        }

        if (comando.equals("CALCULARPOTENCIALCILINDRO")) {
            try {
                aux = ventana.getPpotencialcilindro().getTxtlongitud().getText();
                aux_dou = Double.parseDouble(aux);
                n1 = new Numero(aux_dou);
                System.out.println(aux);

                aux = ventana.getPpotencialcilindro().getTxtcarga().getText();
                aux_dou = Double.parseDouble(aux);
                n2 = new Numero(aux_dou);
                System.out.println(aux);

                aux = ventana.getPpotencialcilindro().getTxtradio1().getText();
                aux_dou = Double.parseDouble(aux);
                n3 = new Numero(aux_dou);
                System.out.println(aux);

                aux = ventana.getPpotencialcilindro().getTxtradio2().getText();
                aux_dou = Double.parseDouble(aux);
                n4 = new Numero(aux_dou);
                System.out.println(aux);

            } catch (Exception error) {
                msg.mostrarInformacionError("Solo debes usar números y la 'e' en caso de tener un exponente.");
            }

            double rta = n1.PotencialCilindro(n2,n3,n4);
            ventana.getPrespuesta().getErta().setText(" El potencial de el cilindro es: " + rta + " (V) ");//cambiar unidades


        }

        //Panel Potencial de la esfera

        if (comando.equals("VOLVERPOTENCIALESFERA")) {
            ventana.getPcapacitancia().setVisible(true);
            ventana.getPpotencialesfera().setVisible(false);
            ventana.getPrespuesta().setVisible(false);
        }

        if (comando.equals("CALCULARPOTENCIALESFERA")) {
            try {
                aux = ventana.getPpotencialesfera().getTxtcarga().getText();
                aux_dou = Double.parseDouble(aux);
                n1 = new Numero(aux_dou);
                System.out.println(aux);

                aux = ventana.getPpotencialesfera().getTxtradio1().getText();
                aux_dou = Double.parseDouble(aux);
                n2 = new Numero(aux_dou);
                System.out.println(aux);

                aux = ventana.getPpotencialesfera().getTxtradio2().getText();
                aux_dou = Double.parseDouble(aux);
                n3 = new Numero(aux_dou);
                System.out.println(aux);

            } catch (Exception error) {
                msg.mostrarInformacionError("Solo debes usar números y la 'e' en caso de tener un exponente.");
            }

            double rta = n1.PotencialEsfera(n2,n3);
            ventana.getPrespuesta().getErta().setText(" El potecnial de la esfera es: " + rta + " (V) ");


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

        //Comandos panel energia potencial

        if (comando.equals("VOLVERENERGIA")) {
            ventana.getPenergiapotencial().setVisible(false);
            ventana.getPprincipal().setVisible(true);
        }

        if (comando.equals("ENERGIACARGA")) {

            ventana.getPenergiapotencial().setVisible(false);
            ventana.getPenergiaUnaCarga().setVisible(true);
            ventana.getPrespuesta().setVisible(true);

        }

        if (comando.equals("ENERGIADOSCARGAS")) {

            ventana.getPenergiapotencial().setVisible(false);
            ventana.getPenergiadoscargas().setVisible(true);
            ventana.getPrespuesta().setVisible(true);
        }

        //Comandos panel energia almacenada

        if (comando.equals("VOLVERENERGIAALMA")) {
            ventana.getPenergiaAlmacenada().setVisible(false);
            ventana.getPprincipal().setVisible(true);
        }

        if (comando.equals("ENEALM1")) {
            ventana.getPenergiaAlmacenada().setVisible(false);
            ventana.getPeneAlm1().setVisible(true);
            ventana.getPrespuesta().setVisible(true);
        }

        if (comando.equals("ENEALM2")) {
            ventana.getPenergiaAlmacenada().setVisible(false);
            ventana.getPeneAlm2().setVisible(true);
            ventana.getPrespuesta().setVisible(true);
        }

        if (comando.equals("ENEALM3")) {
            ventana.getPenergiaAlmacenada().setVisible(false);
            ventana.getPeneAlm3().setVisible(true);
            ventana.getPrespuesta().setVisible(true);
        }

        if (comando.equals("DENEN1")) {
            ventana.getPenergiaAlmacenada().setVisible(false);
            ventana.getPdenEne1().setVisible(true);
            ventana.getPrespuesta().setVisible(true);
        }

        if (comando.equals("DENEN2")) {
            ventana.getPenergiaAlmacenada().setVisible(false);
            ventana.getPdenEne2().setVisible(true);
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

        if (comando.equals("CALCULARPOTEMASCARGA")) {

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

        //comandos energia potencial de dos cargas

        if (comando.equals("VOLVERENERGIADOSCARGAS")) {
            ventana.getPenergiapotencial().setVisible(true);
            ventana.getPenergiadoscargas().setVisible(false);
            ventana.getPrespuesta().setVisible(false);
        }

        if (comando.equals("CALCULARENERGIADOSCARGAS")) {

            try {
                aux = ventana.getPenergiadoscargas().getTxtcarga1().getText();
                aux_dou = Double.parseDouble(aux);
                n1 = new Numero(aux_dou);
                System.out.println(aux);

                aux = ventana.getPenergiadoscargas().getTxtcarga2().getText();
                aux_dou = Double.parseDouble(aux);
                n2 = new Numero(aux_dou);
                System.out.println(aux);

                aux = ventana.getPenergiadoscargas().getTxtdistancia().getText();
                aux_dou = Double.parseDouble(aux);
                n3 = new Numero(aux_dou);
                System.out.println(aux);


            } catch (Exception error) {
                msg.mostrarInformacionError("Solo debes usar números y la 'e' en caso de tener un exponente.");
            }

            double rta = n1.EnergiaPotencialDosCargas(n2, n3);
            ventana.getPrespuesta().getErta().setText(" La energia potencial es: " + rta + " (J) ");

        }

        //comandos energia potencial de una cargas

        if (comando.equals("VOLVERENERGIAUNACARGA")) {
            ventana.getPenergiapotencial().setVisible(true);
            ventana.getPenergiaUnaCarga().setVisible(false);
            ventana.getPrespuesta().setVisible(false);
        }

        if (comando.equals("CALCULARENERGIAUNACARGA")) {

            try {
                aux = ventana.getPenergiaUnaCarga().getTxtcarga().getText();
                aux_dou = Double.parseDouble(aux);
                n1 = new Numero(aux_dou);
                System.out.println(aux);

                aux = ventana.getPenergiaUnaCarga().getTxtdistancia().getText();
                aux_dou = Double.parseDouble(aux);
                n2 = new Numero(aux_dou);
                System.out.println(aux);

                aux = ventana.getPenergiaUnaCarga().getTxtcarga2().getText();
                aux_dou = Double.parseDouble(aux);
                n3 = new Numero(aux_dou);
                System.out.println(aux);

                aux = ventana.getPenergiaUnaCarga().getTxtdistancia2().getText();
                aux_dou = Double.parseDouble(aux);
                n4 = new Numero(aux_dou);
                System.out.println(aux);

                aux = ventana.getPenergiaUnaCarga().getTxtcarga3().getText();
                aux_dou = Double.parseDouble(aux);
                n5 = new Numero(aux_dou);
                System.out.println(aux);

                aux = ventana.getPenergiaUnaCarga().getTxtdistancia3().getText();
                aux_dou = Double.parseDouble(aux);
                n6 = new Numero(aux_dou);
                System.out.println(aux);


            } catch (Exception error) {
                msg.mostrarInformacionError("Solo debes usar números y la 'e' en caso de tener un exponente.");
            }

            double rta = n1.EnergiaSobreUnaCarga(n2, n3, n4, n5, n6);
            double rta1 = n1.EnergiaTotal(n2, n3, n4, n5, n6);
            ventana.getPrespuesta().getErta().setText(" La energia potencial sobre la carga es: " + rta + " (J) ");
            ventana.getPrespuesta().getErta2().setText(" La energia total es: " + rta1 + " (J) ");

        }

        //comandos energia almacenada 1

        if (comando.equals("VOLVERALM1")) {

            ventana.getPenergiaAlmacenada().setVisible(true);
            ventana.getPeneAlm1().setVisible(false);
            ventana.getPrespuesta().setVisible(false);
        }

        if (comando.equals("CALCULARALM1")) {

            try {
                aux = ventana.getPeneAlm1().getTxtcarga().getText();
                aux_dou = Double.parseDouble(aux);
                n1 = new Numero(aux_dou);
                System.out.println(aux);

                aux = ventana.getPeneAlm1().getTxtcapacitancia().getText();
                aux_dou = Double.parseDouble(aux);
                n2 = new Numero(aux_dou);
                System.out.println(aux);


            } catch (Exception error) {
                msg.mostrarInformacionError("Solo debes usar números y la 'e' en caso de tener un exponente.");
            }

            double rta = n1.EnergiaAlm1(n2);
            ventana.getPrespuesta().getErta().setText(" La energia Almacenada es: " + rta + " (J) ");

        }

        //comandos energia almacenada 2

        if (comando.equals("VOLVERALM2")) {

            ventana.getPenergiaAlmacenada().setVisible(true);
            ventana.getPeneAlm2().setVisible(false);
            ventana.getPrespuesta().setVisible(false);
        }

        if (comando.equals("CALCULARALM2")) {

            try {
                aux = ventana.getPeneAlm2().getTxtcapacitancia().getText();
                aux_dou = Double.parseDouble(aux);
                n1 = new Numero(aux_dou);
                System.out.println(aux);

                aux = ventana.getPeneAlm2().getTxtvoltaje().getText();
                aux_dou = Double.parseDouble(aux);
                n2 = new Numero(aux_dou);
                System.out.println(aux);


            } catch (Exception error) {
                msg.mostrarInformacionError("Solo debes usar números y la 'e' en caso de tener un exponente.");
            }

            double rta = n1.EnergiaAlm2(n2);
            ventana.getPrespuesta().getErta().setText(" La energia almacenada es: " + rta + " (J) ");

        }
        //comandos energia almacenada 3

        if (comando.equals("VOLVERALM3")) {

            ventana.getPenergiaAlmacenada().setVisible(true);
            ventana.getPeneAlm3().setVisible(false);
            ventana.getPrespuesta().setVisible(false);
        }

        if (comando.equals("CALCULARALM3")) {

            try {
                aux = ventana.getPeneAlm3().getTxtcarga().getText();
                aux_dou = Double.parseDouble(aux);
                n1 = new Numero(aux_dou);
                System.out.println(aux);

                aux = ventana.getPeneAlm3().getTxtvoltaje().getText();
                aux_dou = Double.parseDouble(aux);
                n2 = new Numero(aux_dou);
                System.out.println(aux);


            } catch (Exception error) {
                msg.mostrarInformacionError("Solo debes usar números y la 'e' en caso de tener un exponente.");
            }

            double rta = n1.EnergiaAlm3(n2);
            ventana.getPrespuesta().getErta().setText(" La energia almacenada es: " + rta + " (J) ");

        }

            //comandos densidad energia1

        if (comando.equals("VOLVERDEN1")) {

            ventana.getPenergiaAlmacenada().setVisible(true);
            ventana.getPdenEne1().setVisible(false);
            ventana.getPrespuesta().setVisible(false);
        }

        if (comando.equals("CALCULARDEN1")) {

            try {
                aux = ventana.getPdenEne1().getTxtEnergiaalmacenada().getText();
                aux_dou = Double.parseDouble(aux);
                n1 = new Numero(aux_dou);
                System.out.println(aux);

                aux = ventana.getPdenEne1().getTxtarea().getText();
                aux_dou = Double.parseDouble(aux);
                n2 = new Numero(aux_dou);
                System.out.println(aux);

                aux = ventana.getPdenEne1().getTxtdistancia().getText();
                aux_dou = Double.parseDouble(aux);
                n3 = new Numero(aux_dou);
                System.out.println(aux);


            } catch (Exception error) {
                msg.mostrarInformacionError("Solo debes usar números y la 'e' en caso de tener un exponente.");
            }

            double rta = n1.DensidadEne1(n2,n3);
            ventana.getPrespuesta().getErta().setText(" La energia almacenada es: " + rta + " (J/m^3) ");

        }

        //comandos densidad energia2

        if (comando.equals("VOLVERDEN2")) {

            ventana.getPenergiaAlmacenada().setVisible(true);
            ventana.getPdenEne2().setVisible(false);
            ventana.getPrespuesta().setVisible(false);
        }

        if (comando.equals("CALCULARDEN2")) {

            try {
                aux = ventana.getPdenEne2().getTxtcampo().getText();
                aux_dou = Double.parseDouble(aux);
                n1 = new Numero(aux_dou);
                System.out.println(aux);

            } catch (Exception error) {
                msg.mostrarInformacionError("Solo debes usar números y la 'e' en caso de tener un exponente.");
            }

            double rta = n1.DensidadEne2();
            ventana.getPrespuesta().getErta().setText(" La densidad de energía es: " + rta + " (J/m^3) ");

        }
        }
    }


