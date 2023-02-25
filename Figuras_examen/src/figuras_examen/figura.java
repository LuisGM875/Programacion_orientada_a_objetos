/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras_examen;

/**
 *
 * @author guich
 */
public class figura {
    private double base;
    private double altura;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    private double lado;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void arearect(double altura, double base){
        double area;
        area=altura*base;
        System.out.println("El area del rectangulo es: "+area);
    }
    public void perimetrorect(double altura, double base){
        double perimetro;
        perimetro= (altura*2)+(base*2);
        System.out.println("El perimetro del rectangulo es: "+perimetro);
    }

    public void areacua(double lado){
        double area;
        area=lado*lado;
        System.out.println("El area del cuadrado es: "+area);;
    }
    public void perimetrocua(double lado){
        double perimetro;
        perimetro= lado*4;
        System.out.println("El perimetro del cuadrado es: "+perimetro);
    }
}
