package Geometria2D;

public class Decagono extends Figura {

    private double lado, apotema;

    public  Decagono (double lado, double longitudLado1){
        this.lado=lado;
        this.apotema = apotema;
        calculararea();
        calcularperimetro();
    }

    @Override
    public void calcularperimetro(){perimetro = 10 * lado;}
    @Override
    public void calculararea(){area = 5 * apotema  * lado;}

}
