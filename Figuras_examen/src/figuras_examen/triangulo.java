/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras_examen;

/**
 *
 * @author guich
 */
public class triangulo {
    private double base;
    private double altura;
    private double hipotenusa;
    private double area;


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

    public void areatria(double altura, double base){
        double area;
        area=(base*altura)/2;
        System.out.println("El area del cuadrado es: "+area);;
    }
    public double getHipotenusa() {
        this.hipotenusa=Math.sqrt(Math.pow(this.altura,2)+Math.pow(this.base,2));
        return hipotenusa;
    }
    public void perimetro(){
        double perimetro;
        perimetro=altura+this.hipotenusa+base;
        System.out.println("El perimetro del triangulo es: "+perimetro);
    }
    public void Tipo(double altura, double base, double hipotenusa){
        if (altura==base && base==hipotenusa){
            System.out.println("El triangulo es equilatero");
        }else if(altura!=base && base!=hipotenusa) {
            System.out.println("El triangulo es escaleno");
        }else{
            System.out.println("El triangulo es isoceles");
        }
    }

}
