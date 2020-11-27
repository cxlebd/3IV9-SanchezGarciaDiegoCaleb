public class Cuadrado extends Figura{

    //Atributos
    private double lado;

    //Constructor
    public Cuadrado(double area, double, perimetro, double lado){
        super(double area, double, perimetro);
        
        this.lado = lado;
    }

    //Getter
    public double getLado(){
        return lado;
    }

    //Setter
    public double setLado(double lado){
        this.lado = lado;
    }

}