package Geometria3D;

public class Cubo extends  Figura3D{
    private double Lad_Cubo;

    public  Cubo (double Lad_Cubo){
        this.Lad_Cubo=Lad_Cubo;
        calculararea();
        calcularvolumen();
    }
    @Override
    public void calculararea(){area=  6*Math.pow(Lad_Cubo,2);}
    @Override
    public void calcularvolumen(){volumen =Math.pow(Lad_Cubo,3);}
}
