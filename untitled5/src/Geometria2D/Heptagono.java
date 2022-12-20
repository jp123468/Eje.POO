package Geometria2D;

public class Heptagono extends Figura {
    private double lado, apotema;

    public  Heptagono (double lado, double apotema){
        this.lado=lado;
        this.apotema = apotema;
        calculararea();
        calcularperimetro();
    }
    @Override
    public void calcularperimetro(){perimetro = 7 * lado;}
    @Override
    public void calculararea(){area = (7/2) * apotema  * lado;}

}
