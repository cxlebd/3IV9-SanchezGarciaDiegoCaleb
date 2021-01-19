/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.util.ArrayList;

/**
 *
 * @author Caleb
 */
public class Estante {
    
    private String nombreEstante;
    private ArrayList<Libro> libros = new ArrayList();

    public void agregarLibroEnEstante(Libro libro1){
    
        libros.add(libro1);
        
    }    
    
    public String getNombreEstante() {
        return nombreEstante;
    }

    public void setNombreEstante(String nombre) {
        this.nombreEstante = nombre;
    }
            
    public String toString(){
    
        return "NOMBRE ESTANTE: " + this.nombreEstante;
        
        
    }
}
