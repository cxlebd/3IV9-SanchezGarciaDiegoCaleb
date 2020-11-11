import java.util.*;

public class arreglos{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int key, repetir;

        do{
            System.out.println("1.- Promedio de numeros positivos y negativos.\n2.- Promedio de posiciones pares.\n3.- Calificaciones.\n4.- Suma de matrices.\n5.- Salir.");
            key = entrada.nextInt();
            switch (key) {
                case 1:
                do{
                int[] numeros = new int[10];
                int pos = 0, neg = 0; 
                int i;
                double sumaPos = 0, sumaNeg = 0;          
                
                System.out.println("Ingrese los numeros: ");
                for (i = 0; i < numeros.length; i++) {
                    System.out.print("Posicion " + i + ": ");
                    numeros[i]= entrada.nextInt();
                }                
                for (i = 0; i < numeros.length; i++) {
                    if (numeros[i] > 0){ 
                        sumaPos += numeros[i];
                        pos++;
                    } else if (numeros[i] < 0){ 
                        sumaNeg += numeros[i];
                        neg++;
                    }
                }                
                if (pos != 0) {
                    System.out.println("Promedio de los numeros positivos: " + sumaPos / pos);
                } else {
                    System.out.println("No ha introducido numeros positivos\n\n");
                }
                if (neg != 0) {
                    System.out.println("Promedio de los numeros negativos: " + sumaNeg / neg);                               
                } else {
                    System.out.println("No ha introducido numeros negativos\n\n");
                }
                System.out.println("\n1.- Repetir.        2.- Regresar al menu anterior.");
                    repetir = entrada.nextInt();
            }while(repetir == 1);
                    break;            
                case 2:
                    do{
                        int i;
                        int[] numeros = new int[10];
                        double promedio = 0;                    
                        System.out.println("Introduzca los numeros: ");
                        for (i = 0; i < 10; i++) {
                            System.out.print("Posicion " + (1 + i) + ": ");
                            numeros[i] = entrada.nextInt();
                        }                        
                        for (i = 0; i < 10; i++) {
                            if (i % 2 == 0){
                                promedio = promedio + numeros[i];
                            }
                        }                        
                        System.out.println("\nPromedio de los numeros que estan en posiciones pares: "+ promedio/5);  
                    System.out.println("\n1.- Repetir.      2.- Regresar al menu anterior.");
                        repetir = entrada.nextInt();
                }while(repetir == 1);
                    break;
                    case 3:


                    /*asdasdasdasdadasdsadasdas
                    asdasd
                    asd
                    asd
                    asd
                    a
                    */

                    do{
                        int calificacion, califMa, califMe, califN, suma, aprobados, reprobados, califMsP;
                        float promedio;
                        suma = 0;
                        aprobados = 0;
                        reprobados = 0;
                        califMsP = 0;
                        System.out.println("Ingrese el numero de calificaciones.");
                        califN=entrada.nextInt();
                        //Creacion del array para calificaciones
                        int[] calif =new int[califN];
                        for (int i=0; i < calif.length; i++){
                            System.out.print("Calificacion " + (i + 1) + ": ");
                            calif[i]=entrada.nextInt();
                        }
                        //Creacion del for para el promedio
                        for (int i = 0; i < calif.length; i++){
                            suma += calif[i];
                        }
                        promedio = suma/calif.length;
                        //Determinar la calificacion mayor
                        califMa=calif[1];
                        for (int i=0; i<calif.length ; i++){
                            if(calif[i]>califMa){
                                califMa=calif[i];
                            }
                        }
                        //Determinar la calificacion menor
                        califMe=calif[1];
                        for (int i=0; i<calif.length ; i++){
                                if(calif[i]<califMe){
                                    califMe=calif[i];
                                }
                            }
                        //Numero de aprobados y reprobados
                        for(int i=0; i<calif.length; i++){
                            if (calif[i]<6){
                                reprobados+=1;
                            }
                            if (calif[i]>=6){
                                aprobados+=1;
                            }
                        }
                        for(int i = 0; i < calif.length; i++){
                            if(calif[i] > promedio){
                                califMsP += 1;
                            }
                        }

                        do{
                        System.out.println("\n1.- Imprimir todas las calificaciones.\n2.- Promedio de las calificaciones.\n3.- La calificacion mas alta y la mas baja.\n4.- El numero de calificaciones superiores al promedio.\n5.- Cantidad de alumnos aprobados y reprobados.\n6.- Salir.");
                            key = entrada.nextInt();
                            switch (key) {
                                case 1:
                                    
                                    break;                            
                                case 2:
                                System.out.println("\nPromedio: " +promedio+ "\n");
                                    break;
                                case 3:
                                    System.out.println("\nLa calificacon mas alta es: " +califMa+ ".\nLa calificacion mas baja es: " +califMe+ ".");
                                    break;
                                case 4:
                                    System.out.println("\nNumero de calificaciones mayores al promedio: " +califMsP);
                                    break;
                                case 5:
                                    System.out.println("\nAlumnos aprobados: " +aprobados+ ".\nAlumnos reprobados: " +reprobados);
                                    break;                                
                            }        
                        }while(key != 6);
                        System.out.println("1.- Repetir.    2.- Regresar al menu principal.");
                            repetir = entrada.nextInt();
                    }while(repetir == 1);
                        break;
                    case 4:
                    do{
                        int a[][] = new int[3][3];
                        int b[][] = new int[3][3];
                        int s[][] = new int[3][3];
                        int limite, i, j;

                        System.out.println("Ingrese valores de la primera matriz.");
                            for(i = 0; i < 3; i++){
                                for(j= 0; j < 3; j++){
                                    System.out.println("Columna: " +(i+1)+".    Fila: "+(j+1)+".");
                                    a[i][j] = entrada.nextInt();
                                }
                            }
                        
                        System.out.println("\nIngrese valores de la segunda matriz.");
                            for(i = 0; i < 3; i++){
                                for(j= 0; j < 3; j++){
                                    System.out.println("Columna: " +(i+1)+".    Fila: "+(j+1)+".");
                                    b[i][j] = entrada.nextInt();
                                }
                            }
                        System.out.println("\nLa suma es:\n");
                            for(i = 0; i < 3; i++){
                                for(j = 0; j < 3; j++){
                                    s[i][j] = a[i][j] + b[i][j];
                                }
                            }
                        for(i = 0; i < 3; i++){
                            for(j = 0; j < 3; j++){
                                System.out.println("Columna: " +(i+1)+ ".    Fila: "+(j+1)+ ".\n" +s[i][j]+ ".\n");
                            }
                        }
                        System.out.println("1.- Repetir.    2.- Regresar al menu anterior.");
                            repetir = entrada.nextInt();
                    }while(repetir == 1);
                        break;
            }            
        }while(key != 5);
    }
}