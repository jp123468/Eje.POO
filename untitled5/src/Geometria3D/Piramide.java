package Geometria3D;

public class Piramide extends Figura3D{
    private double Lad_Pir;
    private double Alt_Pir;

    public  Piramide (double Lad_Pir, double Alt_Pir){
        this.Lad_Pir=Lad_Pir;
        this.Alt_Pir=Alt_Pir;
        calculararea();
        calcularvolumen();
    }
    @Override
    public void calculararea(){area= Lad_Pir * (Lad_Pir + Math.sqrt((4 * Alt_Pir) + (Math.pow(Lad_Pir, 2))));}
    @Override
    public void calcularvolumen(){volumen =((Math.pow(Lad_Pir, 2)) * Alt_Pir)/3;}

}
