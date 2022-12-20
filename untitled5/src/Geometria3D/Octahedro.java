package Geometria3D;

public class Octahedro extends  Figura3D{

    private double Lad_Octa;

    public  Octahedro (double Lad_Octa){
        this.Lad_Octa=Lad_Octa;
        calculararea();
        calcularvolumen();
    }
    @Override
    public void calculararea(){area= Math.pow(Lad_Octa,2)* 2* Math.sqrt(3);}
    @Override
    public void calcularvolumen(){volumen =Math.pow(Lad_Octa,3)* ((Math.sqrt(2))/3);}
}
