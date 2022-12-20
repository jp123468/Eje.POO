package Geometria3D;

public class Prisma_Pentagonal extends Figura3D {
    private double Lad_Pris;
    private double Apot_Pris;
    private double Altura_Pris;

    public  Prisma_Pentagonal (double Lad_Pris,double Apot_Pris, double Altura_Pris){
        this.Lad_Pris=Lad_Pris;
        this.Apot_Pris=Apot_Pris;
        this.Altura_Pris=Altura_Pris;
        calculararea();
        calcularvolumen();
    }
    @Override
    public void calculararea(){area= 5*Lad_Pris*(Apot_Pris+Altura_Pris);}
    @Override
    public void calcularvolumen(){volumen =((5*Lad_Pris*Apot_Pris)/2)*Altura_Pris;}
}
