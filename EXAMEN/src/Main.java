import java.util.*;
public class Main {
    private static Scanner leer = new Scanner(System.in);
    private static Scanner leer1 = new Scanner(System.in);
    public static void main(String[] args) {
        figura rectangulo = new figura();
        figura cuadrado = new figura();
        circulo circulo1 = new circulo();
        triangulo tria= new triangulo();
        int eleccion, repetido=1;
        double base, altura, lado, radio, hipotenusa, area, perimetro;
        while (repetido==1){
            System.out.println("\uD83D\uDD33 Calculadora de figuras \uD83D\uDD33 \n");
            System.out.print("1-Rectangulo\n2-Cuadrado\n3-Circulo\n4-Triangulo\n5-Salir\n Ingresa tu respuesta: ");
            eleccion= leer.nextInt();
            switch(eleccion) {
                case 1:
                    System.out.println("Eligio rectangulo \n Ingresa base:");
                    base= leer.nextDouble();
                    rectangulo.setBase(base);
                    System.out.println(" Ingresa altura: ");
                    altura= leer.nextDouble();

                    rectangulo.setAltura(altura);
                    rectangulo.arearect(altura,base);
                    rectangulo.perimetrorect(altura, base);
                    break;
                case 2:
                    System.out.println("Eligio cuadrado \n Ingresa lado: ");
                    lado= leer.nextDouble();
                    cuadrado.setLado(lado);
                    cuadrado.areacua(lado);
                    cuadrado.perimetrocua(lado);
                    break;
                case 3:
                    System.out.print("\nEligio circulo \n Ingresa radio:");
                    radio=leer.nextDouble();
                    circulo1.setRadio(radio);
                    circulo1.areacir(radio);
                    circulo1.perimetrocir(radio);
                    break;
                case 4:
                    System.out.print("\nEligio triangulo \n Ingresa base: ");
                    base=leer.nextDouble();
                    tria.setBase(base);
                    System.out.print("\nIngresa altura");
                    altura= leer.nextDouble();
                    tria.setAltura(altura);
                    tria.areatria(altura, base);
                    System.out.println("La hipotenusa es: "+tria.getHipotenusa());
                    tria.perimetro();

                    break;
                case 5:
                    System.out.println("\n\uD83D\uDCE4Saliendo...");
                    repetido=0;
                    break;
                default:
                    System.out.println("*======================================*");
                    System.out.println("\n❌Opción equivocada❌");
            }
        }
    }
}