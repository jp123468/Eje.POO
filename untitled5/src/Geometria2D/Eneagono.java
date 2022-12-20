package Geometria2D;

public class Eneagono extends Figura {
    private double lado, apotema;

    public  Eneagono (double lado, double apotema){
        this.lado=lado;
        this.apotema = apotema;
        calculararea();
        calcularperimetro();
    }
    @Override
    public void calcularperimetro(){perimetro = 9 * lado;}
    @Override
    public void calculararea(){area = (9/2) * apotema  * lado;}

}
