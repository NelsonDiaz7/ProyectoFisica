package co.edu.unbosque.model;

import java.text.DecimalFormat;

public class Numero {

    private double num;

    public Numero() {
        num = 0;

    }

    public Numero(double n) {
        num = n;

    }

    public double leyCoulomb(Numero otro, Numero dis) {
        double res = 0.0;
        double constante = 9 * Math.pow(10, 9);
        double operacion = (num) * (otro.num) / Math.pow(dis.num, 2);
        res = constante * operacion;

        return res;
    }

    public double campoElectricoq1(Numero otro, Numero dis) {
        double fuerza = leyCoulomb(otro, dis);
        double cargaq1 = num;
        double campoE1 = fuerza / cargaq1;

        return campoE1;
    }

    public double campoElectricoq2(Numero otro, Numero dis) {
        double fuerza = leyCoulomb(otro, dis);
        double cargaq2 = otro.num;
        double campoE2 = fuerza / cargaq2;

        return campoE2;
    }

    public double CampoEsferaOut(Numero otro) {
        double constante = 8.85e-12;
        double pi = Math.PI;
        double campo = num / ((4) * (pi) * (Math.pow(otro.num, 2)) * (constante));

        return campo;
    }

    public double CampoEsferaIn(Numero radior, Numero radioR) {
        double constante = 8.85e-12;
        double pi = Math.PI;
        double densidad = num / ((1.333333) * (pi) * (Math.pow(radioR.num, 3)));

        double campo = ((densidad) * (radior.num)) / ((3) * (constante));

        return campo;
    }

    public double CampoLineaCargada (Numero longi, Numero radio) {
        double constante = 8.85e-12;
        double pi = Math.PI;
        double landa =  num / longi.num;

        double campo = (landa) / ((2) * (pi) * (radio.num) * (constante));

        return campo;
    }

    public double CampoLaminaCargada(Numero longi)
    {
        double constante = 8.85e-12;
        double densidadsuperficial =  num / longi.num;

        double campo = (densidadsuperficial) / ((2)*constante);

        return campo;


    }
    public double CapacitanciaCilindro(Numero radio1,Numero radio2)

    {
        double constante = 8.85e-12;
        double pi = Math.PI;
        double part1 = 2 * (pi) * (constante) * num;
        double part2 = Math.log(radio2.num / radio1.num);

        double capacitanciacilindro = part1/part2;

        return capacitanciacilindro;
    }

    public double CapacitanciaEsfera(Numero radio2)
    {
        double constante = 8.85e-12;
        double pi = Math.PI;
        double capacitanciaesfera = 4 * (pi) * ((constante)) * (((num * radio2.num) / (radio2.num-num))) ;

        return capacitanciaesfera;
    }

    public double CapacitanciaLaminasParalelas(Numero distancia)
    {
        double constante = 8.85e-12;
        double capacitancialaminasparalelas = num * (constante) / distancia.num;

        return capacitancialaminasparalelas;
    }

    public double PotencialCilindro(Numero carga, Numero radio1, Numero radio2 )//dos radios
    {
        double constante = 8.85e-12;
        double pi = Math.PI;
        double lambda = carga.num/ carga.num;
        double part1 = lambda / 2 * (pi) * (constante);
        double part2 = Math.log(radio2.num / radio1.num);

        double potencialcilindro = part1*part2;

        return potencialcilindro;
    }

    public double PotencialEsfera( Numero radio1, Numero radio2)//dos radios
    {
        double constante = 8.85e-12;
        double pi = Math.PI;
        double part1 = 1 / (4 * (pi) * (constante));
        double part2 = ((1 / radio1.num)-(1 / radio2.num));

        double potencialesfera = num * part1 * part2;

        return potencialesfera;
    }

    public double SumaParalelo(Numero ca1, Numero ca2) {

       double Ceq = num + ca1.num + ca2.num;

        return Ceq;
    }

    public double SumaSerie(Numero ca1, Numero ca2) {

        double Sum = (1/num) + (1/ca1.num) + (1/ca2.num);
        double Ceq = (1/1)/(Sum);

        return Ceq;
    }

    public double PotencialUnaCarga( Numero dis)
    {
        double constante = 9e9;
        double potencial = ((constante)*(num))/dis.num;

        return potencial;
    }

    public double PotencialMasCarga( Numero dis, Numero ca2, Numero dis2, Numero ca3, Numero dis3)
    {
        double constante = 9e9;
        double potencial1 = ((constante)*(num))/dis.num;
        double potencial2 = ((constante)*(ca2.num))/dis2.num;
        double potencial3 = ((constante)*(ca3.num))/dis3.num;

        double potencial = potencial1 + potencial2 + potencial3;

        return potencial;
    }

    public double EnergiaPotencialDosCargas(Numero ca2, Numero dis)
    {
        double constante = 9e9;
        double energiap =  (constante) * (num*ca2.num)/dis.num;

        return energiap;
    }

    public double EnergiaSobreUnaCarga(Numero dis, Numero ca2, Numero dis2, Numero ca3, Numero dis3)
    {
        double constante = 9e9;
        double distanciaQ1Q2 = Math.abs(dis.num-dis2.num);
        double distanciaQ1Q3 = Math.abs(dis.num-dis3.num);
        double Uf = (constante*num)*((ca2.num/distanciaQ1Q2) + (ca3.num/distanciaQ1Q3));

        return Uf;
    }

    public double EnergiaTotal(Numero dis, Numero ca2, Numero dis2, Numero ca3, Numero dis3)
    {
        double constante = 9e9;
        double distanciaQ1Q2 = Math.abs(dis.num-dis2.num);
        double distanciaQ1Q3 = Math.abs(dis.num-dis3.num);
        double distanciaQ2Q3 = Math.abs(dis2.num-dis3.num);
        double UT = (constante)*((num*ca2.num/distanciaQ1Q2) + (num*ca3.num/distanciaQ1Q3) + (ca2.num*ca3.num/distanciaQ2Q3));

        return UT;
    }

    public double EnergiaAlm1(Numero cap)
    {
        double energiaAlm = Math.pow(num,2)/ (2*cap.num);

        return energiaAlm;
    }

    public double EnergiaAlm2(Numero vol)
    {
        double energiaAlm = (0.5)*(num)*(Math.pow(vol.num,2));

        return energiaAlm;
    }

    public double EnergiaAlm3(Numero vol)
    {
        double energiaAlm = (0.5)*(num)*(vol.num);

        return energiaAlm;
    }

    public double DensidadEne1(Numero area, Numero dis)
    {
        double densidadEnergia = num/(area.num*dis.num);

        return densidadEnergia;
    }

    public double DensidadEne2()
    {
        double constante = 8.85e-12;
        double densidadEnergia = (0.5)*(constante)*(Math.pow(num,2));
        return densidadEnergia;
    }


    public double getNum() {
        return num;
    }

    public void setNum(double num) {
        this.num = num;
    }
}
