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
		Scanner obtener = new Scanner(System.in);
		int estudiantes,i,notaMayor,notaMenor,nota,sumaNotas;
 
		System.out.println("¿Cuantos estudiantes hay?");
		estudiantes = obtener.nextInt();
 
		notaMayor = 0;
		notaMenor = 100;
		sumaNotas = 0;
 
 
		for(i = 1; i <= estudiantes; i++)
		{
			System.out.println("Calificaciones del estudiante " + i + ": ");
			nota = obtener.nextInt();
 
			sumaNotas = sumaNotas + nota;
			if(nota > notaMayor)
			{
				notaMayor=nota;
			}
			if(nota < notaMenor)
			{
				notaMenor=nota;
			}
		}
 
		System.out.println("La calificacion mayor es: " + notaMayor + "\n");
		System.out.println("La calificacion menor es: " + notaMenor + "\n");
 
		DecimalFormat df = new DecimalFormat("#.00");
 
		System.out.println("El promedio es: " + df.format((double)sumaNotas/estudiantes) + "\n");
	}
}