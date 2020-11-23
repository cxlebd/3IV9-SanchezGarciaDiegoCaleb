import javax.swing.JOptionPane;

public class Proveedores{
    String nombre_cliente;
    int i, j;
    int[] costo = new int[10];
    int[] existencia = new int[10];
    String[] producto = new String[10];
    float suma_costo, max, min, promedio;

    public void Negocio(){
        nombre_cliente = JOptionPane.showInputDialog("Proveedor:");

        JOptionPane.showMessageDialog(null, "Va a escribir el precio de su producto y despues su nombre.");
        for(i = 0; i < costo.length; i++){
            costo[i] = Integer.parseInt(JOptionPane.showInputDialog("Costo del producto: " + (i + 1) + ".","$"));
            suma_costo += costo[i];
            producto[i] = JOptionPane.showInputDialog("Nombre del producto: " + (i + 1) + ".");
        }
        min = max = costo[0];
        for (i = 0; i < costo.length; i++){
            if(costo[i] > max){
                max = costo[i];
            }
            else if(costo [i] < min){
                min = costo[i];
            }
        }
        for(j = 0; j < existencia.length; j++){
            existencia[j] = Integer.parseInt(JOptionPane.showInputDialog("Ahora escribira la cantidad de producto existente\nExistencia del producto: " + (j + 1) + "."));
        }
        NegocioR();
    }
    public void NegocioR(){
        promedio = suma_costo/costo.length;
        JOptionPane.showMessageDialog(null, "Proveedor de los productos: " + nombre_cliente + ".\nSuma total de costos: $" + suma_costo + ".\nEl costo mayor fue de: $" + max +
         ".\nEl costo menor fue de: $" + min + ".\nEl costo promedio de los productos fue de: $" + promedio);        
         JOptionPane.showMessageDialog(null, "Producto: " + producto[0] + "\nCosto: $" + (costo[0] * existencia[0]) + ".\nExistencias: " + existencia[0] + ".\n\n" + "Producto: " + producto[1] + "\nCosto: $" + (costo[1] * existencia[1]) + ".\nExistencias: " + existencia[1] + ".\n\n" +
         "Producto: " + producto[2] + "\nCosto: $" + (costo[2] * existencia[2]) + ".\nExistencias: " + existencia[2] + ".\n\n" +
         "Producto: " + producto[3] + "\nCosto: $" + (costo[3] * existencia[3]) + ".\nExistencias: " + existencia[3] + ".\n\n" +
         "Producto: " + producto[4] + "\nCosto: $" + (costo[4] * existencia[4]) + ".\nExistencias: " + existencia[4] + ".\n\n" +
         "Producto: " + producto[5] + "\nCosto: $" + (costo[5] * existencia[5]) + ".\nExistencias: " + existencia[5] + ".\n\n" +
         "Producto: " + producto[6] + "\nCosto: $" + (costo[6] * existencia[6]) + ".\nExistencias: " + existencia[6] + ".\n\n" +
         "Producto: " + producto[7] + "\nCosto: $" + (costo[7] * existencia[7]) + ".\nExistencias: " + existencia[7] + ".\n\n" +
         "Producto: " + producto[8] + "\nCosto: $" + (costo[8] * existencia[8]) + ".\nExistencias: " + existencia[8] + ".\n\n" +
         "Producto: " + producto[9] + "\nCosto: $" + (costo[9] * existencia[9]) + ".\nExistencias: " + existencia[9] + ".\n\n");   
    }
}