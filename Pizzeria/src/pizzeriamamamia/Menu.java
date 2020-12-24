/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeriamamamia;

//import Pizza.Queso;
import Pizza.*;
import java.util.Scanner;

/**
 *
 * @author demon
 */
public class Menu{
    
    public void MenuOperaciones(){
        
        Scanner entrada = new Scanner(System.in);
        int total = 0;
        int opc;
        int precio=0;
        String quesito2=null;
        String tamano = null;
        //voy a crear un objeto llamado pizza
         Pizza pizza;//=null;
        do{
        
        System.out.println("Bienvenidos a la Pizzeria Los Tacos");
        System.out.println("¿Que desea ordenar?");
        System.out.println("1.- Pizza de Queso");
        System.out.println("2.- Pizza de Peperoni");
        System.out.println("3.- Pizza de Vegetariana");
        System.out.println("Pulsa 4 para salir");
        System.out.println("Gracias uwu");
        
        opc = entrada.nextInt();
        
        switch(opc){
            //Pizza Pepperoni
            case 1:
                //polimorfismo
                pizza = new Queso();
                
                Queso quesito = new Queso();
                /*ques.elegirtipoqueso();*/
                //me pregunte que tipo de queso quiero?
                System.out.println("Buenas,escoge el tamaño. Porfaaaaa");
                System.out.println("1-Mediana(4 rebanadas)");
                System.out.println("2-Grande(8 rebanadas)");
                System.out.println("3-Familiar(12 rebanadas)");
                System.out.println("4-Parmesano(16 rebanadas)");
                opc=entrada.nextInt();
                switch(opc){
                    case 1:
                        tamano="Mediana";
                        break;
                    case 2:
                        tamano="Grande";
                        break;
                    case 3:
                        tamano="Familiar";
                        break; 
                    case 4:
                        tamano="Parmesano";
                        break;
                }
                System.out.println("¿Con que Queso tu pizza "+tamano+"?");
                //System.out.println("1-Mozzarella");
                //System.out.println("2-Parmesano");
                quesito.elegirtipoqueso();
                System.out.println("Escoge");
                opc=entrada.nextInt();
                switch(opc){
                    case 1:
                        quesito2="Mozzarella";
                        if(tamano.equalsIgnoreCase("Mediana")){
                            precio=75;
                            total+=75;
                        }
                        if(tamano.equalsIgnoreCase("Grande")){
                            precio=89;
                            total+=89;
                        }
                        if(tamano.equalsIgnoreCase("Familiar")){
                            precio=112;
                            total+=112;
                        }
                        if(tamano.equalsIgnoreCase("Parmesano")){
                            precio=135;
                            total+=135;
                        }
                    break;
                    
                    case 2:
                        quesito2="Parmesano";
                        if(tamano.equalsIgnoreCase("Mediana")){
                            precio=90;
                            total+=90;
                        }
                        if(tamano.equalsIgnoreCase("Grande")){
                            precio=115;
                            total+=115;
                        }
                        if(tamano.equalsIgnoreCase("Familiar")){
                            precio=135;
                            total+=135;
                        }
                        if(tamano.equalsIgnoreCase("Parmesano")){
                            precio=175;
                            total+=175;
                        }
                    break;
                }
                
                pizza.hornear();
                pizza.cortar();
                pizza.empacar();
                System.out.println("Por tu pizza de Queso "+quesito2+" tamaño: "+tamano+ " serian $"+precio);
                System.out.println("Tu pizza esta lista para entregarse");
                break;
            case 2:
                //Pizza de Pepperoni
                pizza = new Pepperoni();
                System.out.println("Buenas,escoge el tamaño. Porfaaaaa");
                System.out.println("1-Mediana(4 rebanadas)");
                System.out.println("2-Grande(8 rebanadas)");
                System.out.println("3-Familiar(12 rebanadas)");
                System.out.println("4-Parmesano(16 rebanadas)");
                opc=entrada.nextInt();
                switch(opc){
                    case 1:
                        tamano="Mediana";
                        precio=96;
                        total+=96;
                        break;
                    case 2:
                        tamano="Grande";
                        precio=119;
                        total+=119;
                        break;
                    case 3:
                        tamano="Familiar";
                        precio=131;
                        total+=131;
                        break; 
                    case 4:
                        tamano="Parmesano";
                        precio=167;
                        total+=167;
                        break;
                }
                pizza.hornear();
                pizza.cortar();
                pizza.empacar();
                System.out.println("Por tu pizza de Pepperoni de tamaño: "+tamano+" son $"+precio);
                System.out.println("Tu pizza de Pepperoni esta lista para entregar :3");
                
                break;
            case 3: 
                pizza = new Vegetariana();
                System.out.println("Buenas,escoge el tamaño. Porfaaaaa");
                System.out.println("1-Mediana(4 rebanadas)");
                System.out.println("2-Grande(8 rebanadas)");
                System.out.println("3-Familiar(12 rebanadas)");
                System.out.println("4-Parmesano(16 rebanadas)");
                opc=entrada.nextInt();
                switch(opc){
                    case 1:
                        tamano="Mediana";
                        precio=88;
                        total+=88;
                        break;
                    case 2:
                        tamano="Grande";
                        precio=97;
                        total+=97;
                        break;
                    case 3:
                        tamano="Familiar";
                        precio=111;
                        total+=111;
                        break; 
                    case 4:
                        tamano="Parmesano";
                        precio=157;
                        total+=157;
                        break;
                }
                pizza.hornear();
                pizza.cortar();
                pizza.empacar();
                System.out.println("Por tu pizza de Vegetariana de tamaño: "+tamano+" son $"+precio);
                System.out.println("Tu pizza Vegetariana(askaaaa) esta lista para entregar");
                break;
            }
        
        }while(opc != 4);
        System.out.println("El total por tus pizzas es de $"+total);
    }
}