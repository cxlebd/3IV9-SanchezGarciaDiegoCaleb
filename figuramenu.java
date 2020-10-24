import java.util.Scanner;

class figuramenu{

    public static void main(String[] args){
        /*
            Programa que imprima un menú para calcular
            área y perimetro de cuadrado, triangulo y circulo.
        */
        Scanner entrada = new Scanner(System.in);
        int opcion;
        int altura, base;
        double resultado, radio;

        //Creación del menú.
        System.out.println("Calculador de áreas y perimetros.");
        System.out.println("Elija una de las siguientes opciones: ");
        System.out.println("1.- Area de un Cuadrado.");
        System.out.println("2.- Area de un Triangulo.");
        System.out.println("3.- Area de un Circulo.");
        System.out.println("4.- Perimetro de un Cuadrado.");
        System.out.println("5.- Perimetro de un Triangulo.");
        System.out.println("6.- Perimetro de un Circulo.");
        System.out.println("7.- Salir.");

        opcion = entrada.nextInt();

        //Saber qué opción para qué calculo.
        switch (opcion) {
            case 1:
                System.out.println("Area de un cuadrado: ");
                System.out.println("Ingresa el valor de un lado: ");
                base = entrada.nextInt();
                resultado = base*base;
                System.out.println("El area es de: "+resultado);
                //Cerrar los casos.
                     break;

            case 2:
                System.out.println("Ingresa el valor de la base: ");
                base = entrada.nextInt();
                System.out.println("Ingresa el valor de la altura.");
                altura = entrada.nextInt();
                resultado = (base*altura)/2;
                System.out.println("La area es de: "+resultado);
                    break;

            case 3:
                System.out.println("Ingresa el valor de un lado: ");
                base = entrada.nextInt();
                resultado = base*4;
                System.out.println("El perimetro es de: "+resultado);
                    break;  
            
            case 4:
                System.out.println("Ingresa el valor de un lado: ");
                base = entrada.nextInt();
                resultado = base*4;
                System.out.println("El perimetro es de: "+resultado);
                    break;                

            case 5:
                System.out.println("Ingresa el valor de un lado: ");
                base = entrada.nextInt();
                resultado = base*3;
                System.out.println("El perimetro es de: "+resultado);
                    break;

            case 6:
                System.out.println("Ingresa el radio: ");
                radio = entrada.nextDouble();
                resultado = (2)*(3.1416)*(radio);
                System.out.println("El perimetro es de: "+resultado);
                    break;
                
                
            default:
                System.out.println("Gracias por venir.");
        }
    }
}