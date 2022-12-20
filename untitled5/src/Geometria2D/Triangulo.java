package Geometria2D;

public class Triangulo extends Figura {

    private double base;
    private double altura;
    private double lado;

    private double lado1;


    public Triangulo(double base, double altura, double lado, double lado1) {
        this.base = base;
        this.altura = altura;
        this.lado = lado;
        this.lado1 = lado1;
        calculararea();
        calcularperimetro();
    }

    @Override
    public void calculararea() {area = base * altura / 2;}

    @Override
    public void calcularperimetro() {perimetro = base+lado+lado1;}
}
