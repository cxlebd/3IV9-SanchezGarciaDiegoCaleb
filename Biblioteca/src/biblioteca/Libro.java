/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author Caleb
 */
public class Libro {

    private String isbn;
    private String titulo;
    private boolean prestado;
    
    public Libro(String isbn, String titulo, boolean prestado){
        this.isbn = isbn;
        this.titulo = titulo;
        this.prestado = prestado;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }
    
    @Override
    public String toString(){
        
        String estado = "Disponible";
        if(this.prestado == true){
            estado = "No disponible";
        }            
                
        return "ISBN: " + this.isbn + "\nTitulo: " + this.titulo + "\nEstado: " + this.prestado;
        
    }
    
}
