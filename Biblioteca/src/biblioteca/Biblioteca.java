/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Caleb
 */
public class Biblioteca {
    
    private static ArrayList<Estante> estantes = new ArrayList();
    static Scanner sc = new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int opcion = 0;
        
        do{
        
            System.out.println("1.- Agregar libro");
            System.out.println("2.- Prestar libro");
            System.out.println("3.- Mostrar estanten mas solicitado");
            System.out.println("4.- Salir");
            
            System.out.println("Ingrese una opcion:");
            opcion = sc.nextInt();
            
            switch (opcion){
            
                case 1:
                    
                    System.out.println("Ingrese datos del libro isbn&titulo");
                    sc.nextLine();
                    String[] datos =  sc.nextLine().split("&");
                    
                    Libro libro = new Libro(datos[0], datos[1], false);                   

                    int numEstante = 0;
                    String nombreEstante = "";
                    
                    if(estantes.isEmpty()){
                    
                        numEstante = 0;
                        System.out.println("Ingrese nombre del estante: ");
                        nombreEstante = sc.nextLine();
                        
                    }else{
                    
                        for (int i = 0; i < estantes.size(); i++) {
                            System.out.println(i + ": " + estantes.get(i).getNombreEstante());
                        }
                        System.out.println(estantes.size() + ": Disponible" + "\Seleccione el numero del estante");                        
                        numEstante = sc.nextInt();
                        if (numEstante >= estantes.size){
                        
                            System.out.println("Ingrese numero del estante");
                            sc.nextLine();
                            nombreEstante = sc.nextLine();
                            
                        }
                    
                        agregarLibro(numEstante, nombreEstante, libro);
                        
                    }
                    
                    break;
                    
                case 2:
                    break;
                   
                case 3:
                    break;
                    
                case 4:
                    System.exit(0);
                    break;
                    
                default:    
                    System.out.println("Opcion no disponible");
            }
        
        }while(opcion != 4);           
                
    }
    
    public static void agregarLibro(int numeroEstante, String nombreEstante, Libro libro1){
    
        
    
    }
    
    public static void prestaLibro(){
    
        
    
    }
    
    public static void mostrarEstanteMasSolicitado(){
    
    
    
    }
    
    
}
