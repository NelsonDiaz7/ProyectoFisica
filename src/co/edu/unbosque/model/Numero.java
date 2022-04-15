package co.edu.unbosque.model;


import java.text.DecimalFormat;

public class Numero {

    private double num;
    private DecimalFormat df;



    public Numero() {
        num = 0;

    }

    public Numero( double n ) {
        num = n;
        df = new DecimalFormat("#.000");

    }

    public double leyCoulomb(Numero otro, Numero dis)
    {
        double res = 0.0;
        double constante = 9*Math.pow(10,9);
        double operacion = (num)*(otro.num)/Math.pow(dis.num,2);
        res = constante*operacion;

        return res;
    }

    public double campoElectricoq1(Numero otro, Numero dis)
    {
        double fuerza = leyCoulomb(otro, dis);
        double cargaq1 = num;
        double campoE1 = fuerza/cargaq1;

        return campoE1;
    }

    public double campoElectricoq2(Numero otro, Numero dis)
    {
        double fuerza = leyCoulomb(otro, dis);
        double cargaq2 = otro.num;
        double campoE2 = fuerza/cargaq2;

        return campoE2;
    }



    public double getNum() {
        return num;
    }

    public void setNum(double num) {
        this.num = num;
    }
}