import java.util.Scanner;
public class C3{
    double celular;
    int  opcion,comprar,op2;
    double LN , LI, LC,credito;
    Scanner entrada=new Scanner(System.in);
    public void Menu(){
        do{
            /*LN=0.5;
            LI=0.6;
            LC=0.2;
            comprar=0;
            celular=0;*/
            System.out.println("Bienvenido a ChuneFon");
            System.out.println("Escoge una opcion");
            System.out.println("1.-Consulta de saldo");
            System.out.println("2.-Comprar Saldo");
            System.out.println("3.-Llamada");
            System.out.println("4.-Salir");
            System.out.println("Ingresa la opcion");
            opcion=entrada.nextInt();

            switch(opcion){
                case 1:
                    ConsultaSaldo();
                break;

                case 2:
                    ComprarSaldo();
                break;

                case 3:
                    Llamada();
                break;
            }

        }while(opcion!=4);
        System.out.println("            ");
    }

    public void ConsultaSaldo(){
        System.out.println("Bienvenido, tu credito es "+credito);
    }

    public void ComprarSaldo(){
        comprar=0;
        System.out.println("Buenas, ingrese la cantidad a comprar");
        comprar=entrada.nextInt();
        credito+=comprar;
        System.out.println("Tu saldo final es: "+credito);
    }

    public void Llamada(){
        System.out.println("Bienvenido, por favor escoge una opcion");
        System.out.println("1.-Llamada Nacional");
        System.out.println("2.-Llamada Intenacional");
        System.out.println("3.-Llamada Celular");
        System.out.println("Ingresa la opcion");
        op2=entrada.nextInt();

        switch(op2){
            case 1:
                System.out.println("Ingresa el numero de celular");
                celular=entrada.nextDouble();
                
                /*if(celular.length()!=8){
                    System.out.println("No ingresaste 8 digitos");
                }*/

                if (credito<0.4){
                    System.out.println("No tienes saldo");
                }
                else
                {
                    LN=0.5;
                    credito=credito-LN;
                    System.out.println("Tu credito es "+credito);
                }
            break;

            case 2:
                System.out.println("Ingresa el numero de celular");
                celular=entrada.nextDouble();
                
                /*if(celular.length() !=8){
                    System.out.println("No ingresaste 8 digitos");
                }*/

                if (credito<0.4){
                    System.out.println("No tienes saldo");
                }
                else
                {
                    LI=0.6;
                    credito=credito-LI;
                    System.out.println("Tu credito es "+credito);
                }
            break;

            case 3:
                System.out.println("Ingresa el numero de celular");
                celular=entrada.nextDouble();
                /*if(celular.length()!=8){
                    System.out.println("No ingresaste 8 digitos");
                }*/

                if (credito<0.4){
                    System.out.println("No tienes saldo");
                }
                else
                {
                    LC=0.2;
                    credito=credito-LC;
                    System.out.println("Tu credito es "+credito);
                }
            break;
        }

    }
}