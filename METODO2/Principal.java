
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Principal{    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String letra;
        Sueldo sueldoIniciar = new Sueldo();
        Proveedores proveedoresIniciar = new Proveedores();
        Libreria libreriaIniciar = new Libreria();
        String texto = JOptionPane.showInputDialog("1.- Sueldo.\n2.- Proveedores.\n3.- Biblioteca.");
        int op = Integer.parseInt(texto);
        switch(op){
            case 1:        
                do{
                sueldoIniciar.Dinero();
                letra = JOptionPane.showInputDialog("Presione R para repetir.");
                    }while(letra == "r" || letra == "R");
            break;
            case 2:
                do{
                proveedoresIniciar.Negocio();
                letra = JOptionPane.showInputDialog("Presione R para repetir.");
                    }while(letra == "r" || letra == "R");
            break;
            case 3:
                do{

                libreriaIniciar.biblioteca();

                letra = JOptionPane.showInputDialog("Presione R para repetir.");
                    }while(letra == "r" || letra == "R");
            break;
        }
    }
}