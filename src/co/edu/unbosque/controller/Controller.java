package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import co.edu.unbosque.model.Numero;
import co.edu.unbosque.view.Mensaje;
import co.edu.unbosque.view.VentanaPrincipal;

public class Controller implements ActionListener{
    private Mensaje msg;
    private VentanaPrincipal ventana;
    private Numero n1;
    private Numero n2;
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

        //Comandos panel datos
        if(comando.equals("COULOMB"))
        {
            try {
                aux = ventana.getPdatos().getCnum1().getText();
                aux_dou = Double.parseDouble(aux);
                n1 = new Numero(aux_dou);

                aux = ventana.getPdatos().getCnum2().getText();
                aux_dou = Double.parseDouble(aux);
                n2 = new Numero(aux_dou);
            }catch(Exception error)
            {
                msg.mostrarInformacionError("Solo debes usar números y la 'e' en caso de tener un exponente.");
            }


            try {
                aux = ventana.getPdatos().getCdist().getText();
                aux_dou = Double.parseDouble(aux);
                dis = new Numero(aux_dou);
            }catch (Exception error)
            {
                msg.mostrarInformacionError("Solo debes usar números y la 'e' en caso de tener un exponente. ");
            }

            double rta = n1.leyCoulomb(n2,dis);


            ventana.getPrespuesta().getErta().setText(" La fuerza total resultante es: " + rta + " (N) ");
        }

        if(comando.equals("AYUDA"))
        {
            msg.mostrarInformacion("Bienvenido a este programa." + "\n" +
                    "-En el primer espacio insertará la primera carga si tiene decimales las declara después de un punto (.)." +"\n" +
                    "-En dado caso el número sea en notacion cientifica lo insertará de la siguiente manera:  4e-3" +"\n" +
                    "esto será igual que  4x10^-3. De igual manera en el segundo campo. " +"\n" +
                    "-En el ultimo campo debera ingresar la distancia en metros. " +"\n\n" +
                    "Acto final dará al botón que dice Coulomb para hallar la fuerza resultante entra las dos cargas." +"\n" +
                    "O en su defecto a campos electricos, según guste.");
        }


        if(comando.equals("CAMPOS"))
        {
            try {
                aux = ventana.getPdatos().getCnum1().getText();
                aux_dou = Double.parseDouble(aux);
                n1 = new Numero(aux_dou);

                aux = ventana.getPdatos().getCnum2().getText();
                aux_dou = Double.parseDouble(aux);
                n2 = new Numero(aux_dou);
            }catch(Exception error)
            {
                msg.mostrarInformacionError("Solo debes usar números y la 'e' en caso de tener un exponente.");
            }


            try {
                aux = ventana.getPdatos().getCdist().getText();
                aux_dou = Double.parseDouble(aux);
                dis = new Numero(aux_dou);
            }catch (Exception error)
            {
                msg.mostrarInformacionError("La medida debe ser un valor númerico y en metros. ");
            }

            double rta = n1.campoElectricoq1(n2,dis);
            double rta1 = n1.campoElectricoq2(n2,dis);

            ventana.getPrespuesta().getErta().setText(" El campo E2: " + rta + "(N/C) Y " +"\n\n" +
                                                      " El campo E1: " + rta1 + "(N/C)");

        }

        if(comando.equals("SALIRCAMPOS")){
            ventana.getPprincipal().setVisible(true);
            ventana.getPdatos().setVisible(false);
            ventana.getPrespuesta().setVisible(false);
        }




    }

}
