import javax.swing.JOptionPane;
import java.util.Scanner;

public class Libreria{
    int key,idsacar, menu=1;
    String ejemplaresp;
    Scanner entrada=new Scanner(System.in);
    String matrizBb[][] = new String[3][4];    
    public void biblioteca(){
        do{        
        String texto = JOptionPane.showInputDialog("1.- Guardar un libro.\n2.- Sacar un libro.");
        int key = Integer.parseInt(texto);        
        switch (key) {
            case 1:
                guardarLibro();
                break;
            case 2:
                sacarLibro();
                break;
        }
        String menu = JOptionPane.showInputDialog("1.- Ingresar otro libro.\n2.- Salir.");        
    }while (menu == 1);
}
    public void guardarLibro(){

        for(int i=0; i<3; i++){
            for(int j=0; j<1; j++){

                matrizBb[i][0] = JOptionPane.showInputDialog("Titulo del libro:");
                matrizBb[i][1] = JOptionPane.showInputDialog("Autor del libro:");
                matrizBb[i][2] = JOptionPane.showInputDialog("Cantidad de ejemplares:");               
                    }
            String key = JOptionPane.showInputDialog("1.- Ingresar otro libro.\n2.- Regresar.");
            if(Integer.valueOf(key) == 2){
                break;
            }
        }
    }
    public void sacarLibro(){        
        for(int k=0; k<3; k++){
            for(int h=0; h<1; h++){
                JOptionPane.showMessageDialog(null, "ID: " + (k+1) + "\nTitulo del libro: " + matrizBb[k][0] + "\n Autor del libro: "
                + matrizBb[k][1] + "\n Cantidad de ejemplares en existencia en la biblioteca: " + matrizBb[k][2] +
                "\n Cantidad de libros prestados: " + matrizBb[k][3]);
            }
        }
        String idsacar = JOptionPane.showInputDialog("Inserte la ID del libro que quiere:");
        String ejemplaresp = JOptionPane.showInputDialog("¿Cual es la cantidad de ejemplares prestados?:");
        if(Integer.parseInt(matrizBb[Integer.valueOf(idsacar)][2])>Integer.parseInt(ejemplaresp)){
        matrizBb[Integer.valueOf(idsacar)][3]=ejemplaresp;
        matrizBb[Integer.valueOf(idsacar)][2]=String.valueOf (Integer.parseInt(matrizBb[Integer.valueOf(idsacar)][2])-Integer.parseInt(ejemplaresp));
        for(int k=0; k<3; k++){
            for(int h=0; h<1; h++){
                JOptionPane.showMessageDialog(null, "Libro: " + (k+1) + "\nTitulo del libro: " + matrizBb[k][0] + "\n Autor del libro: "
                + matrizBb[k][1] + "\n Cantidad de ejemplares en existencia en la biblioteca: " + matrizBb[k][2] +
                "\n Cantidad de libros prestados: " + matrizBb[k][3]);
            }
        }
    }else{
        JOptionPane.showMessageDialog(null, "No podemos prestar esa cantidad de libros.");
        }
    }
}