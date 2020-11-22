import java.util.Scanner;

public class C2{
    Scanner entrada = new Scanner(System.in);    
    int altura, base, key;
    int dm, dme;
    double area;
    double perimetro;

    public void Menu(){
        do{
            System.out.println("Calcular area y perimetro de:\n1.- Un cuadrado.\n2.- Triangulo.\n3.- Circulo.\n4.- Rectangulo.\n5.- Salir.");
            key =entrada.nextInt();
    
            switch(key){
                case 1:
                APC();
                break;
    
                case 2:
                APT();
                break;
    
                case 3:
                APCI();
                break;
    
                case 4:
                APR();
                break;
            }
        }while(key != 5);        
    }    
    public void APC(){
        System.out.println("Ingresa el valor de un lado");
        base = entrada.nextInt();
        area = base*base;
        perimetro = (base*4);
        System.out.println("El area es de: "+area+ " .Y su perimetro es: "+perimetro);
    }
    public void APT(){
        System.out.println("Ingresa el valor de la base");
        base = entrada.nextInt();
        System.out.println("Ingresa el valor de la altura");
        altura = entrada.nextInt();
        area = (base*altura)/2;
        perimetro =(base*3);
        System.out.println("El area es de: "+ area + " .Y su perimetro es: "+ perimetro);
    }
    public void APCI(){
        System.out.println("Ingresa el valor del radio");
        base = entrada.nextInt();
        area = 3.1416*(base*base);
        perimetro = (2*3.1416*base);
        System.out.println("El area es de: "+ area + " .Y el perimetro es: "+ perimetro);   
    }
    public void APR(){
        System.out.println("Ingresa el valor de la base");
        base= entrada.nextInt();
        System.out.println("Ingresa el valor de la altura");
        altura= entrada.nextInt();
        area=(base*altura);
        perimetro=((2*base)+(2*altura));
        System.out.println("El area es de: "+ area + " .Y el perimetro es: "+ perimetro);   
    }
}