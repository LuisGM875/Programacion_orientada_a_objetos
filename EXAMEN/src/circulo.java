public class circulo {
    private double radio;
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {

        this.radio = radio;
    }

    public void areacir(double radio){
        double area;
        area= 3.1416*(radio*radio);
        System.out.println("El area del circulo es: "+area);;
    }
    public void perimetrocir(double radio){
        double perimetro;
        perimetro= 3.1416*(radio+radio);
        System.out.println("El perimetro del circulo es: "+perimetro);
    }
}
