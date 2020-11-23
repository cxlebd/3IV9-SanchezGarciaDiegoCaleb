import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Gato{
    
    public static char[][] gato = new char[3][3];
    
    public static void imprimirPosiciones(){
        int pos = 1;
        System.out.println("\nSelecciona una posicion en el juego:\nLas casillas marcadas ya estan ocupadas.\n");
        for (int i= 0; i<gato.length; i++){
            for (int j=0; j<gato.length; j++){
                if (gato[i][j] == 'X' || gato[i][j] == 'O')
                    System.out.print( " " + gato[i][j]);
                else
                    System.out.print( " " + pos);                    
                pos++;
            }
            System.out.println();
        }  
    }
    
    public static boolean casillaNoOcupada(int posicion){
        switch (posicion){
            case 1: return gato[0][0]!=' ';
            case 2: return gato[0][1]!=' ';
            case 3: return gato[0][2]!=' ';
            case 4: return gato[1][0]!=' ';
            case 5: return gato[1][1]!=' ';
            case 6: return gato[1][2]!=' ';
            case 7: return gato[2][0]!=' ';
            case 8: return gato[2][1]!=' ';
            case 9: return gato[2][2]!=' ';
            default: return false;
        }
    }
    
    public static void registrarJugada(char caracter) throws IOException{
        boolean salir = false;
        String entrada;
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));    
        int posicion;
        do{
            imprimirPosiciones();
            System.out.println("\nEscribe el numero de casilla que quieres usar:");
            entrada = bufer.readLine();
            posicion = Integer.parseInt(entrada);
            if ( casillaNoOcupada(posicion)){
                switch (posicion){
                    case 1: gato[0][0] = caracter;
                            break;
                    case 2: gato[0][1] = caracter;
                            break;
                    case 3: gato[0][2] = caracter;
                            break;
                    case 4: gato[1][0] = caracter;
                            break;
                    case 5: gato[1][1] = caracter;
                            break;         
                    case 6: gato[1][2] = caracter;
                            break;
                    case 7: gato[2][0] = caracter;
                            break;
                    case 8: gato[2][1] = caracter;
                            break;
                    case 9: gato[2][2] = caracter;
                            break;
                }
              salir = true;
            }
         else
            System.out.println("\nEse lugar no existe o ya esta ocupado.\n"); 
       } while (!salir);
    }
    
    public static void imprimirGato(){
        System.out.println("\nTablero actual:\n");
        for (char[] gato1 : gato) {
            for (int j = 0; j<gato.length; j++) {
                System.out.print("    " + gato1[j]);
            }
            System.out.println();
        }
            
    }
    
    public static boolean ganaPorRenglon(char caracter){

        for (char[] gato1 : gato) {
            if (gato1[0] == caracter && gato1[1] == caracter && gato1[2] == caracter) {
                return true;
            }
        }
        return false;
    }
    
   public static boolean ganaPorColumna(char caracter){

        for (int i=0; i<gato.length; i++){
             if (gato[0][i] == caracter && gato[1][i]==caracter && gato[2][i] == caracter)
                 return true;
         }
        return false;
    }  
    
    public static boolean ganaPorDiagonales(char caracter){    
        // Busca ganador en la columna de izquierda a derecha
        if (gato[0][0] == caracter && gato[1][1]==caracter && gato[2][2] == caracter)
            return true;
        if (gato[0][2] == caracter && gato[1][1]==caracter && gato[2][0] == caracter)
            return true; 
     
        return false;
    } 
   
    public static boolean hayGanador(char caracter){
        if ( ganaPorRenglon(caracter) )
            return true;
        if ( ganaPorColumna(caracter))
            return true;
        if ( ganaPorDiagonales(caracter))
            return true;
        return false;    
}
   
    public static boolean hayEspacio(){
        for (char[] gato1 : gato) {
            for (int j = 0; j<gato.length; j++) {
                if (gato1[j] == '-') { 
                    return true;
                }
            }
        }
        return false;
    }
    
    public static void inicializarTablero(){
        for(int i=0;i<gato.length; i++)
            for(int j=0;j<gato.length; j++)
                gato[i][j] = '-';
    }

    public static void main(String[] args) throws IOException {        
       char jugadorActual = 'X';
       boolean terminar = false;
       inicializarTablero();
       do{
           registrarJugada(jugadorActual);
           imprimirGato();
           if ( hayGanador(jugadorActual)){
               System.out.println("\nGana: " + jugadorActual + "\n");               
               terminar = true;
           }
           else {
               if (!hayEspacio()){
                   // Ya no hay casillas disponibles, el juego se empató
                   System.out.println("Empate");
                   terminar = true;
               }
               else
                   if (jugadorActual == 'X')
                       jugadorActual = 'O';
                   else
                       jugadorActual = 'X';
           }
       } while ( !terminar);        
    }    
}