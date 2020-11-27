public class Figura{

    //Atributos
    public double area();
    public double perimetro();

    //Constructor
    public Figura(double area, double perimetro){
        this.area = area;
        this.perimetro = perimetro;
    }

    //Getters
    public double getArea(){
        return area;
    }

    public double getPerimetro(){
        return perimetro;
    }

}
