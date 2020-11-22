import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int key;

        C3 obj3 = new C3();
        C2 obj2 = new C2();
        C1 obj1 = new C1();
        
        do{

            System.out.println("1.- Calcular la edad de una persona.\n2.- Calcular area y perimetro.\n3.- Calcular el costo de llamadas telefonicas.\n4.- Salir.");
                key = entrada.nextInt();
            switch (key) {
                case 1:
                    obj1.F();
                    break;        
                case 2:
                    obj2.Menu();
                    break;
            
                case 3:
                    obj3.Menu();
                    break;
            }
        }while(key != 4);
        
    }
}