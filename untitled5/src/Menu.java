import java.util.Scanner;
//Figuras en 2D
import Geometria2D.Cuadrado;
import Geometria2D.Rectangulo;
import Geometria2D.Triangulo;
import Geometria2D.Circulo;
import Geometria2D.Decagono;
import Geometria2D.Eneagono;
import Geometria2D.Heptagono;
import Geometria2D.Hexagono;
import Geometria2D.Octogono;
import Geometria2D.Pentagono;
//Figuras en 3D
import Geometria3D.Casquete;
import Geometria3D.Cilindros;
import Geometria3D.Cubo;
import Geometria3D.Cono;
import Geometria3D.Esfera;
import Geometria3D.Octahedro;
import Geometria3D.Piramide;
import Geometria3D.Prisma_Triangular;
import Geometria3D.Prisma_Pentagonal;
import Geometria3D.Prisma_Rectangular;


import java.util.Scanner;

public class Menu {
   private static Scanner lectura = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion, opcion1, opcion2;
        opcion = menu_principal();
        while (opcion != 0) {
            if (opcion == 1) {
                opcion1 = menu_Geometria2D();
                while (opcion1 != 0) {
                    switch (opcion) {
                        case 1:
                            System.out.println("Ingrese el valor del radio para el Circulo");
                            double valorRadio = lectura.nextDouble();
                            Circulo miCirculo = new Circulo(valorRadio);
                            System.out.println(miCirculo.getPerimetro());
                            System.out.println(miCirculo.getArea());
                            break;
                        case 2:
                            System.out.println("Ingrese el valor del lado del Cuadrado");
                            double longitudLado = lectura.nextDouble();
                            Cuadrado miCuadrado = new Cuadrado(longitudLado);
                            System.out.println(miCuadrado.getPerimetro());
                            System.out.println(miCuadrado.getArea());
                            break;
                        case 3:
                            System.out.println("Ingrese el valor del lado del Decagono");
                            double longitudLado1 = lectura.nextDouble();
                            System.out.println("Ingrese el valor del apotema del Decagono");
                            double longitudApo1 = lectura.nextDouble();
                            Decagono miDecagono = new Decagono(longitudLado1,longitudApo1);
                            System.out.println(miDecagono.getPerimetro());
                            System.out.println(miDecagono.getArea());
                            break;
                        case 4:
                            System.out.println("Ingrese el valor del lado del Eneagono");
                            double longitudLado2 = lectura.nextDouble();
                            System.out.println("Ingrese el valor del apotema del Eneagono");
                            double longitudApo2 = lectura.nextDouble();
                            Eneagono miEneagono = new Eneagono(longitudLado2,longitudApo2);
                            System.out.println(miEneagono.getPerimetro());
                            System.out.println(miEneagono.getArea());
                            break;
                        case 5:
                            System.out.println("Ingrese el valor del lado del Heptagono");
                            double longitudLado3 = lectura.nextDouble();
                            System.out.println("Ingrese el valor del apotema del Heptagono");
                            double longitudApo3 = lectura.nextDouble();
                            Heptagono miHeptagono = new Heptagono(longitudLado3,longitudApo3);
                            System.out.println(miHeptagono.getPerimetro());
                            System.out.println(miHeptagono.getArea());
                            break;
                        case 6:
                            System.out.println("Ingrese el valor del lado del Hexagono");
                            double longitudLado4 = lectura.nextDouble();
                            System.out.println("Ingrese el valor del apotema del Hexagono");
                            double longitudApo4 = lectura.nextDouble();
                            Hexagono miHexagono = new Hexagono(longitudLado4,longitudApo4);
                            System.out.println(miHexagono.getPerimetro());
                            System.out.println(miHexagono.getArea());
                            break;
                        case 7:
                            System.out.println("Ingrese el valor del lado del Octogono");
                            double longitudLado5 = lectura.nextDouble();
                            System.out.println("Ingrese el valor del apotema del Octogono");
                            double longitudApo5 = lectura.nextDouble();
                            Octogono miOctogono = new Octogono(longitudLado5,longitudApo5);
                            System.out.println(miOctogono.getPerimetro());
                            System.out.println(miOctogono.getArea());
                            break;
                        case 8:
                            System.out.println("Ingrese el valor del lado del Pentagono");
                            double longitudLado6 = lectura.nextDouble();
                            System.out.println("Ingrese el valor del apotema del Pentagono");
                            double longitudApo6 = lectura.nextDouble();
                            Pentagono miPentagono = new Pentagono(longitudLado6,longitudApo6);
                            System.out.println(miPentagono.getPerimetro());
                            System.out.println(miPentagono.getArea());
                            break;
                        case 9:
                            System.out.println("Ingrese la Base del Geometria2D.Rectangulo");
                            double longitudBase = lectura.nextDouble();
                            System.out.println("Ingrese la Altura del Geometria2D.Rectangulo");
                            double longitudAltura = lectura.nextDouble();
                            Rectangulo miRectangulo = new Rectangulo(longitudBase, longitudAltura);
                            System.out.println(miRectangulo.getPerimetro());
                            System.out.println(miRectangulo.getArea());
                            break;
                        case 10:
                            System.out.println("Ingrese la Base del Geometria2D.Triangulo");
                            double longitudbase = lectura.nextDouble();
                            System.out.println("Ingrese la Altura del Geometria2D.Triangulo");
                            double longitudaltura = lectura.nextDouble();
                            System.out.println("Ingrese el segundo lado del Geometria2D.Triangulo");
                            double longitudlado = lectura.nextDouble();
                            System.out.println("Ingrese el tercer lado del Geometria2D.Triangulo");
                            double longitudlado1 = lectura.nextDouble();
                            Triangulo miTriangulo = new Triangulo(longitudbase, longitudaltura, longitudlado, longitudlado1);
                            System.out.println(miTriangulo.getPerimetro());
                            System.out.println(miTriangulo.getArea());
                            break;
                        default:
                            System.out.println("Opcion ingresa es incorrecta");
                            break;
                    }
                }
            }
            else {
                opcion2 = menu_Geometria3D();
                while (opcion2 != 0){
                    switch (opcion) {
                        case 1:
                            System.out.println("Ingrese el valor del radio para el Casquete");
                            double valorRadio = lectura.nextDouble();
                            System.out.println("Ingrese el valor de la altura del Casquete");
                            double valorAlt = lectura.nextDouble();
                            Casquete miCasquete = new Casquete(valorRadio,valorAlt);
                            System.out.println(miCasquete.getArea());
                            System.out.println(miCasquete.getVolumen());
                            break;
                        case 2:
                            System.out.println("Ingrese el valor del radio para el Cilindro");
                            double valorRadio1 = lectura.nextDouble();
                            System.out.println("Ingrese el valor de la altura del Cilindro");
                            double valorAlt1 = lectura.nextDouble();
                            Cilindros miCilindro = new Cilindros(valorRadio1,valorAlt1);
                            System.out.println(miCilindro.getArea());
                            System.out.println(miCilindro.getVolumen());
                            break;
                        case 3:
                            System.out.println("Ingrese el valor del radio para el Cono");
                            double valorRadio2 = lectura.nextDouble();
                            System.out.println("Ingrese el valor de la altura del Cono");
                            double valorAlt2 = lectura.nextDouble();
                            Cono miCono = new Cono(valorRadio2,valorAlt2);
                            System.out.println(miCono.getArea());
                            System.out.println(miCono.getVolumen());
                            break;
                        case 4:
                            System.out.println("Ingrese el valor del lado para el Cubo");
                            double valorLado2 = lectura.nextDouble();
                            Cubo miCubo = new Cubo(valorLado2);
                            System.out.println(miCubo.getArea());
                            System.out.println(miCubo.getVolumen());
                            break;
                        case 5:
                            System.out.println("Ingrese el valor del radio para el Esfera");
                            double valorRadio3 = lectura.nextDouble();
                            Esfera miEsfera = new Esfera(valorRadio3);
                            System.out.println(miEsfera.getArea());
                            System.out.println(miEsfera.getVolumen());
                            break;
                        case 6:
                            System.out.println("Ingrese el valor del lado del Octahedro");
                            double valorLado3 = lectura.nextDouble();
                            Octahedro miOctahedro = new Octahedro(valorLado3);
                            System.out.println(miOctahedro.getArea());
                            System.out.println(miOctahedro.getVolumen());
                            break;
                        case 7:
                            System.out.println("Ingrese el valor del lado de la Piramide");
                            double valorLado4 = lectura.nextDouble();
                            System.out.println("Ingrese el valor de la altura de la Piramide");
                            double valorAlt4 = lectura.nextDouble();
                            Piramide miPiramide = new Piramide(valorLado4,valorAlt4);
                            System.out.println(miPiramide.getArea());
                            System.out.println(miPiramide.getVolumen());
                            break;
                        case 8:
                            System.out.println("Ingrese el valor del lado del Prisma Pentagonal");
                            double valorLado5 = lectura.nextDouble();
                            System.out.println("Ingrese el valor de la apotema del Prisma Pentagonal");
                            double valorApot5 = lectura.nextDouble();
                            System.out.println("Ingrese el valor de la altura del Prisma Pentagonal");
                            double valorAlt5 = lectura.nextDouble();
                            Prisma_Pentagonal miPrisma_Pentagonal = new Prisma_Pentagonal(valorLado5,valorApot5,valorAlt5);
                            System.out.println(miPrisma_Pentagonal.getArea());
                            System.out.println(miPrisma_Pentagonal.getVolumen());
                            break;
                        case 9:
                            System.out.println("Ingrese el valor del lado del Prisma Rectangular");
                            double valorLado6 = lectura.nextDouble();
                            System.out.println("Ingrese el valor de la apotema del Prisma Rectangular");
                            double valorBase6 = lectura.nextDouble();
                            System.out.println("Ingrese el valor de la altura del Prisma Rectangular");
                            double valorAlt6 = lectura.nextDouble();
                            Prisma_Rectangular miPrisma_Rectangular = new Prisma_Rectangular(valorLado6,valorBase6,valorAlt6);
                            System.out.println(miPrisma_Rectangular.getArea());
                            System.out.println(miPrisma_Rectangular.getVolumen());
                            break;
                        case 10:
                            System.out.println("Ingrese el valor del lado del Prisma Triangular");
                            double valorLado7 = lectura.nextDouble();
                            System.out.println("Ingrese el valor de la altura del Prisma Triangular");
                            double valorAlt7 = lectura.nextDouble();
                            Prisma_Triangular miPrisma_Triangular = new Prisma_Triangular(valorLado7,valorAlt7);
                            System.out.println(miPrisma_Triangular.getArea());
                            System.out.println(miPrisma_Triangular.getVolumen());
                            break;
                        default:
                            System.out.println("Opcion ingresa es incorrecta");
                            break;
                    }
                }
            }
            opcion = menu_principal();
        }
        System.out.println("Gracias por usar.");

    }
            private static int menu_principal () {
                int opcion = -1;
                while (opcion < 0 || opcion > 2) {
                    System.out.println("Menu Tipo de Figuras");
                    System.out.println("0.- Salir");
                    System.out.println("1.- Figuras 2D");
                    System.out.println("2.- Figuras 3D");
                    System.out.println("ingrese una opcion ");
                    opcion = lectura.nextInt();

                    if (opcion < 0 || opcion > 2) {
                        System.out.println("Ingrese valores entre 1 y 3");
                    }

                }
                return opcion;
            }

            private static int menu_Geometria2D () {
                int opcion = -1;
                while (opcion < 0 || opcion > 10) {
                    System.out.println("Menu Geometria 2D");
                    System.out.println("0.- Salir");
                    System.out.println("1.- Circulo");
                    System.out.println("2.- Cuadrado");
                    System.out.println("3.- Decagono");
                    System.out.println("4.- Eneagono");
                    System.out.println("5.- Heptagono");
                    System.out.println("6.- Hexagono");
                    System.out.println("7.- Octogono");
                    System.out.println("8.- Pentagono");
                    System.out.println("9.- Rectangulo");
                    System.out.println("10.- Triangulo");
                    System.out.println("ingrese una opcion ");
                    opcion = lectura.nextInt();

                    if (opcion < 0 || opcion > 10) {
                        System.out.println("Ingrese valores entre 1 y 3");
                    }
                }
                return opcion;
            }

            private static int menu_Geometria3D () {
                int opcion = -1;
                while (opcion < 0 || opcion > 10) {
                    System.out.println("Menu Geometria 3D");
                    System.out.println("0.- Salir");
                    System.out.println("1.- Casquete");
                    System.out.println("2.- Cilindros");
                    System.out.println("3.- Cono");
                    System.out.println("4.- Cubo");
                    System.out.println("5.- Esfera");
                    System.out.println("6.- Octahedro");
                    System.out.println("7.- Piramide");
                    System.out.println("8.- Prisma Pentagonal");
                    System.out.println("9.- Prisma Rectangular");
                    System.out.println("10.- Prisma Triangular");
                    System.out.println("ingrese una opcion ");
                    opcion = lectura.nextInt();

                    if (opcion < 0 || opcion > 10) {
                        System.out.println("Ingrese valores entre 1 y 3");
                    }

                }
                return opcion;
            }
}