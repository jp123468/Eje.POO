package Geometria3D;

public class Prisma_Triangular extends Figura3D{
    private double Lad_Pris;
    private double Alt_Pris;

    public  Prisma_Triangular (double Lad_Pris, double Alt_Pris){
        this.Lad_Pris=Lad_Pris;
        this.Alt_Pris=Alt_Pris;
        calculararea();
        calcularvolumen();
    }
    @Override
    public void calculararea(){area= Lad_Pris *((Math.sqrt(3))/2)*Lad_Pris+ (3*Alt_Pris);}
    @Override
    public void calcularvolumen(){volumen =(Math.sqrt(3))/4 *(Math.pow(Lad_Pris, 2)) * Alt_Pris;}
}
