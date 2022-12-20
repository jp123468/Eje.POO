package Geometria3D;

public class Cono extends Figura3D {

    private double Rad_Cir;
    private double Alt_Cono;
    private final double  NPi = 3.14;

    public  Cono (double Rad_Cir, double Alt_Cono){
        this.Rad_Cir=Rad_Cir;
        this.Alt_Cono=Alt_Cono;
        calculararea();
        calcularvolumen();
    }
    @Override
    public void calculararea(){area= (NPi* Rad_Cir) *(Rad_Cir+Math.sqrt(Math.pow(Rad_Cir,2)+Math.pow(Alt_Cono,2)));}
    @Override
    public void calcularvolumen(){volumen =((NPi/3)*Math.pow(Rad_Cir,2))*Alt_Cono;}
}
