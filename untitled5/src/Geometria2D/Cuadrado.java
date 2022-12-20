package Geometria2D;

//import java.lang;
public class Cuadrado extends Figura {
    private double lado;

    public  Cuadrado (double lado){
        this.lado=lado;
        calculararea();
        calcularperimetro();
    }
    @Override
    public void calcularperimetro(){perimetro = lado*4;}
    @Override
    public void calculararea(){area = lado*lado;}
}

