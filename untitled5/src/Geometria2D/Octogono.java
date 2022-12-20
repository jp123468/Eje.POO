package Geometria2D;

public class Octogono extends Figura {
    private double lado, apotema;

    public Octogono (double lado, double apotema){
        this.lado=lado;
        this.apotema = apotema;
        calculararea();
        calcularperimetro();
    }
    @Override
    public void calcularperimetro(){perimetro = 8 * lado;}
    @Override
    public void calculararea(){area = (8/2) * apotema  * lado;}

}
