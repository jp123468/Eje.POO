package Geometria2D;

public class Circulo extends Figura {

    private double radio;
    private final double  Npi = 3.14;

    public  Circulo (double radio){
        this.radio=radio;
        calculararea();
        calcularperimetro();
    }

    @Override
    public void calcularperimetro(){perimetro = Npi *(radio*2);}
    @Override
    public void calculararea(){area = Npi*Math.pow(radio,2);}
}
