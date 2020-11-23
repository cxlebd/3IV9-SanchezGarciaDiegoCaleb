import javax.swing.JOptionPane;

public class Sueldo{
    int id, puesto, diurnas, nocturnas;
    double gastos, gastosF, sueldo, sueldoIE = 5000, sueldoIS = 8000;
    double isr = 0.16, infonavit = 0.2, seguro = 0.16;
    String ape;
    public void Dinero(){
        id = Integer.parseInt(JOptionPane.showInputDialog("ID:\n(Numeros)"));
        ape = JOptionPane.showInputDialog("Nombre:");
        puesto = Integer.parseInt(JOptionPane.showInputDialog("¿Cual es tu puesto?\n\n1.- Empleado.\n2.- Empleado supervisor."));
        if(puesto == 1){
            Empleado();
        }
        else{
            EmpleadoSupervisor();
        }
    }    
    public void Empleado(){
        diurnas = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas horas diurnas has trabajado?"));
        nocturnas = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas horas nocturnas has trabajado?"));
        sueldo = sueldoIE + (diurnas*50) + (nocturnas*60);
        SaldoFinal();
    }
    public void EmpleadoSupervisor(){
        gastos = isr + infonavit + seguro;
        gastosF = gastos * sueldoIS;
        sueldoIS -= gastosF;
        SaldoFinal();
    }
    public void SaldoFinal(){
        JOptionPane.showMessageDialog(null, "ID: " + id + "\nNombre: " + ape + "\nTu sueldo quincenal es de: $" + sueldo);
    }
}