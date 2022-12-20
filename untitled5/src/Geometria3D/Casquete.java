package Geometria3D;

public class Casquete extends Figura3D {
    private double Rad_Cir;
    private double Alt_Cas;
    private final double  NPi = 3.14;

    public  Casquete (double Rad_Cir, double Alt_Cas){
        this.Rad_Cir=Rad_Cir;
        this.Alt_Cas=Alt_Cas;
        calculararea();
        calcularvolumen();
    }
    @Override
    public void calculararea(){area= 2*NPi*Rad_Cir*Alt_Cas;}
    @Override
    public void calcularvolumen(){volumen =((NPi*Math.pow(Alt_Cas,2))/3)*((3*Rad_Cir)-Alt_Cas);}
}
