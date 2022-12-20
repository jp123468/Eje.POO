package Geometria3D;

public class Esfera extends Figura3D{

    private double Rad_Esfera;
    private final double  NPi = 3.14;

    public  Esfera (double Rad_Esfera){
        this.Rad_Esfera=Rad_Esfera;
        calculararea();
        calcularvolumen();
    }
    @Override
    public void calculararea(){area= 4*NPi*Math.pow(Rad_Esfera,2);}
    @Override
    public void calcularvolumen(){volumen =4/3*(NPi*Math.pow(Rad_Esfera,3));}
}
