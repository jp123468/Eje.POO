package Geometria3D;

public class Prisma_Rectangular extends  Figura3D{
    private double Lad_Pris;
    private double Base_Pris;
    private double Altura_Pris;

    public  Prisma_Rectangular (double Lad_Pris,double Base_Pris, double Altura_Pris){
        this.Lad_Pris=Lad_Pris;
        this.Base_Pris=Base_Pris;
        this.Altura_Pris=Altura_Pris;
        calculararea();
        calcularvolumen();
    }
    @Override
    public void calculararea(){area=2*(Base_Pris*Lad_Pris +Lad_Pris*Altura_Pris +Altura_Pris*Base_Pris);}
    @Override
    public void calcularvolumen(){volumen =Base_Pris*Altura_Pris*Lad_Pris;}
}
