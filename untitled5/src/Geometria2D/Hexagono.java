package Geometria2D;

public class Hexagono extends  Figura{
    private double lado, apotema;

    public Hexagono (double lado, double apotema){
        this.lado=lado;
        this.apotema = apotema;
        calculararea();
        calcularperimetro();
    }
    @Override
    public void calcularperimetro(){perimetro =  6 * lado;}
    @Override
    public void calculararea(){area = 3 * apotema  * lado;}

}
