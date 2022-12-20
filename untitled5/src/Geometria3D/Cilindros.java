package Geometria3D;

public class Cilindros extends Figura3D {
    private double Rad_Cir;
    private double Alt_Cil;
    private final double  NPi = 3.14;

    public  Cilindros (double Rad_Cir, double Alt_Cil){
        this.Rad_Cir=Rad_Cir;
        this.Alt_Cil=Alt_Cil;
        calculararea();
        calcularvolumen();
    }
    @Override
    public void calculararea(){area= (2*NPi*Rad_Cir*Alt_Cil) + ( 2*NPi*Math.pow(Rad_Cir,2));}
    @Override
    public void calcularvolumen(){volumen =(NPi*Math.pow(Rad_Cir,2))*Rad_Cir;}

}
