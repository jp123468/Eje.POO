package Geometria2D;

public class Pentagono extends Figura{
    private double lado, apotema;

    public Pentagono (double lado, double apotema){
        this.lado=lado;
        this.apotema = apotema;
        calculararea();
        calcularperimetro();
    }
    @Override
    public void calcularperimetro(){perimetro =  5 * lado;}
    @Override
    public void calculararea(){area = (5/2) * apotema  * lado;}
}
