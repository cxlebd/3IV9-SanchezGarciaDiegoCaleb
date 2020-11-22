import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class C1{
    public void F(){
        
        System.out.println("Escriba su fecha denacimiento con este formato:\ndd/mm/yyyy");
        Scanner entrada = new Scanner(System.in);
        String fecha = entrada.nextLine();
        
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        LocalDate fechaNac = LocalDate.parse(fecha,fmt);
        
        LocalDate ahora = LocalDate.now();
        
        Period periodo = Period.between(fechaNac, ahora);
        
        System.out.printf("Tu edad es: %s años, %s meses y %s dias",
        periodo.getYears(), periodo.getMonths(), periodo.getDays());        
    }
}