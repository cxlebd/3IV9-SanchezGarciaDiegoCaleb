/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calificaciones;

/**
 *
 * @author Caleb
 */
import java.util.Scanner;
import java.text.*;

public class estudiantes
{
	public static void main(String[] ARGS)
	{
		Scanner entrada = new Scanner(System.in);
		int estudiantes,i,calificacionMayor,calificacionMenor,calificacion,sumaCalificaciones;
 
		System.out.println("¿Cuantos estudiantes hay?");
		estudiantes = entrada.nextInt();
 
		calificacionMayor = 0;
		calificacionMenor = 100;
		sumaCalificaciones = 0;
                
             
 
		for(i = 1; i <= estudiantes; i++)
		{
			System.out.println("Calificaciones del estudiante " + i + ": ");
			calificacion = entrada.nextInt();
 
			sumaCalificaciones = sumaCalificaciones + calificacion;
			if(calificacion > calificacionMayor)
			{
				calificacionMayor=calificacion;
			}
			if(calificacion < calificacionMenor)
			{
				calificacionMenor=calificacion;
			}
		}
                                
		System.out.println("La calificacion mayor es: " + calificacionMayor + "\n");
		System.out.println("La calificacion menor es: " + calificacionMenor + "\n");
 
		DecimalFormat df = new DecimalFormat("#.00");
 
		System.out.println("El promedio es: " + df.format((double)sumaCalificaciones/estudiantes) + "\n");
	}
}
