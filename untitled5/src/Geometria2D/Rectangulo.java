package Geometria2D;

public class Rectangulo extends Figura {
    //Extends = heredar
    private double base , altura;

    public  Rectangulo (double base, double altura){
        this.base=base;
        this.altura=altura;
        calculararea();
        calcularperimetro();
    }
    @Override
    public void calculararea(){area= base*altura;}
    @Override
    public void calcularperimetro(){perimetro = base*2+altura*2;}
}
