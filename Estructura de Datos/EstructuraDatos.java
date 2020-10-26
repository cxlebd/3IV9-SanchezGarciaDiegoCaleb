import java.util.Scanner;

class EstructuraDatos{
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        int key, edad, socios, decimal, modulo, aux, repetir, factorial;
        double abono, descontado, tempI, tempF, altura, base, area, perimetro, radio, volumen, num, num1, num2,num3;
        String binario="";


        do{

        System.out.println("Sanchez Garcia Diego Caleb.");
        System.out.println("Menu de opciones.");
        System.out.println("1.- Abono.");
        System.out.println("2.- Decimal a binario.");
        System.out.println("3.- Farenheit a Celsius, Kelvine y Rankie.");
        System.out.println("4.- Cuantos positivos y cuantos negativos.");
        System.out.println("5.- Factura total.");
        System.out.println("6.- Area, perimetro y volumen.");
        System.out.println("7.- Tabla de valores.");
        System.out.println("8.- Factorial.");
        System.out.println("9.- Salida");

        key = entrada.nextInt();
        

        switch (key){
            case 1:
                System.out.println("Escribe tu edad: ");                    
                    edad = entrada.nextInt();
                System.out.println("Escribe tu abono: ");
                    abono = entrada.nextInt();                    
                    if(edad > 65){
                        descontado = abono * 0.40;
                        System.out.println("Tu abono es de: "+(abono-descontado));
                        System.out.println(" ");
                    } 
                    else if(edad < 21){
                        System.out.println("¿Tus padres son socios?");
                        System.out.println("Presiona '1' en caso de si.");
                        System.out.println("Presiona '0' en caso de no.");
                            socios = entrada.nextInt();
                        if(socios == 1){
                            descontado = abono * 0.45;
                            System.out.println("Tu abono es de: "+(abono-descontado));
                            System.out.println(" ");
                        }
                        else {
                            descontado = abono * 0.25;
                            System.out.println("Tu abono es de: "+(abono-descontado)); 
                            System.out.println(" ");
                        }
                    }
                break;

            case 2:
                System.out.println("2.- Decimal a binario.");    
                System.out.println("Introduce el numero.");
                    decimal = entrada.nextInt();
                    aux = decimal;

                    while(decimal > 0){
                        modulo = (decimal % 2);
                        binario = modulo + binario;
                        decimal = decimal / 2;
                    }
                    System.out.println(+aux+" = "+binario+".");
                    System.out.println("");
                break;
            case 3:
                System.out.println("3.- Farenheit, Celsius, Kelvine y Rankie");
                System.out.println("Elige una opcion");
                System.out.println("1) Celsius a Farenheit.");
                System.out.println("2) Celsius a Kelvine.");
                System.out.println("3) Celsius a Rankine.");
                System.out.println("4) Farenheit a Celsius.");
                System.out.println("5) Farenheit a Kelvine.");
                System.out.println("6) Farenheit a Rankine.");
                System.out.println("7) Kelvin a Celsius.");
                System.out.println("8) Kelvin a Farenheit.");
                System.out.println("9) Kelvin a Rankine.");
                System.out.println("10) Rankine a Celsius.");
                System.out.println("11) Rankine a Farenheit.");
                System.out.println("12) Rankine a Kelvin.");

                key = entrada.nextInt();
                    switch(key){
                        case 1:
                            System.out.println("Celcius a Farenheit.");
                            System.out.println("Introduce el valor Celsius.");
                                tempI = entrada.nextDouble();
                                tempF = (tempI*1.8)+32;
                            System.out.println(+tempI+" Celsius = "+tempF+ " Farenheit.");
                            System.out.println("");
                            break;
                        case 2:
                            System.out.println("Celsius a Kelvin.");
                            System.out.println("Introduce el valor de Celsius.");
                                tempI = entrada.nextDouble();
                                tempF = tempI + 273.15;                            
                            System.out.println(+tempI+" Celcius = "+tempF+"Kelvin.");
                            System.out.println("");
                            break;
                        case 3:
                            System.out.println("Celsius a Rankine.");
                            System.out.println("Introduce el valor de Celsius.");
                                tempI = entrada.nextDouble();
                                tempF = (tempI*(9/5)+ 491.67);
                            System.out.println(+tempI+" Celcius = "+tempF+"Rankine.");
                            System.out.println("");
                            break;
                        case 4:
                            System.out.println("Farenheit a Celsius.");
                            System.out.println("Introduce el valor de Farenheit.");
                                tempI = entrada.nextDouble();
                                tempF = (tempI-32)*(5/9);
                            System.out.println(+tempI+" Farenheit = "+tempF+" Celsius.");
                            System.out.println("");
                            break;                            
                        case 5:
                            System.out.println("Farenheit a Kelvin.");
                            System.out.println("Introduce el valor de Farenheit.");
                                tempI = entrada.nextDouble();
                                tempF = ((tempI-32)*(5/9))+273.15;
                            System.out.println(+tempI+" Farenheit = "+tempF+" Kelvin..");
                            System.out.println("");
                            break;
                        case 6:
                            System.out.println("Farenheit a Rankine.");
                            System.out.println("Introduce el valor de Farenheit.");
                                tempI = entrada.nextDouble();
                                tempF = tempI + 459.67;
                            System.out.println(+tempI+" Farenheit = "+tempF+" Rankine.");
                            System.out.println("");
                            break;
                        case 7:                        
                            System.out.println("Kelvin a Celsius.");
                            System.out.println("Introduce el valor de Kelvin.");
                                tempI = entrada.nextDouble();
                                tempF = tempI - 273.15;
                            System.out.println(+tempI+" Kelvin = "+tempF+" Celsius.");
                            System.out.println("");
                            break;
                        case 8:
                            System.out.println("Kelvin a Farenheit.");
                            System.out.println("Introduce el valor de Kelvin.");
                                tempI = entrada.nextDouble();
                                tempF = ((tempI - 273.15)*(9/5))+32;
                            System.out.println(+tempI+" Kelvin = "+tempF+" Farenheit.");
                            System.out.println("");                            
                            break;
                        case 9:
                            System.out.println("Kelvin a Rankine.");
                            System.out.println("Introduce el valor de Kelvin.");
                                tempI = entrada.nextDouble();
                                tempF = ((9*(tempI - 273.15))/5)+491.67;
                            System.out.println(+tempI+" Kelvine = "+tempF+" Rankine.");
                            System.out.println("");
                            break;
                        case 10:
                            System.out.println("Rankine a Celsius.");
                            System.out.println("Introduce el valor de Rankine.");
                                tempI = entrada.nextDouble();
                                tempF = (tempI-491.67)*(5/9);
                            System.out.println(+tempI+" Rankine = "+tempF+" Celsius.");
                            System.out.println("");
                            break;
                        case 11:
                            System.out.println("Rankine a Farenheit.");
                            System.out.println("Introduce el valor de Rankine.");
                                tempI = entrada.nextDouble();
                                tempF = tempI - 459.67;
                            break;
                        case 12:
                            System.out.println("Rankine a Kelvin.");          
                            System.out.println("Introduce el valor de Rankine.");
                                tempI = entrada.nextDouble();
                                tempF = tempI*(5/9);
                            System.out.println(+tempI+" Rankine = "+tempF+" Kelvin.");
                            System.out.println("");
                        }                        
                break;
            case 4:
            int positivos, negativos;
            System.out.println("Ingrese tres numeros enteros positivos o negativos.\nIngrese el primer numero:");
            num1 = entrada.nextDouble();
            System.out.println("Ingrese el segundo numero:");
            num2 = entrada.nextDouble();
            System.out.println("Ingrese el tercer numero:");
            num3 = entrada.nextDouble();
            positivos = 0;
            negativos = 0;
        if(num1 >= 0){
        positivos=positivos + 1;
        }
        else{
            negativos=negativos + 1;
        }
        if(num2 >= 0){
            positivos=positivos + 1;
        }
        else{
            negativos=negativos + 1;
        }   
        if(num3 >= 0){
            positivos=positivos + 1;
        }
        else{
            negativos=negativos + 1;
        }
        System.out.println("Usted ha ingresado "+ positivos + " numeros positivos y " +negativos + " numeros negativos\n" );            
                break;            
            case 5:
            System.out.println("Producto  Precio");
            System.out.println("1. Cubre bocas         24   \n2. Chamarra            60   \n3. Dos cubre bocas     24      \n4. Dos chamarras       120    \n");
            System.out.println("Pulsa cualquier numero para saber cuantos prductos puedes elegir");
            num = entrada.nextInt();
            System.out.println("Puedes elegir 3 productos");
           
            boolean cubre = false;
            boolean chamarra = false;
            boolean cubrebocas = false;
            boolean chamarras= false;            
            
            int precioc = 0;
            int preciol = 0;
            int preciop = 0;
            int preciom = 0;
            int preciolib = 0;
            for(int i=1; i<=3; i++){
            System.out.println("Escribe el numero del producto que quieres");
                num = entrada.nextInt();
                if(num == 1){
                    cubre = true;
                }   if(num == 2){
                    chamarra = true;
                    }   if(num == 3){
                        cubrebocas = true;
                        }   if(num == 4){
                            chamarras = true;
                            }   
            }
            System.out.println("Factura");
            System.out.println("Producto         Precio    ");
            if(cubre){
            System.out.println("Cubre bocas           24       ");
            }   if(chamarra){
                System.out.println("Chamarra              60        ");
                }   if(cubrebocas){
                    System.out.println("Dos cubre bocas       12       ");
                    }   if(chamarras){
                        System.out.println("Dos chamarras     120     ");
                        }   
                break;
            case 6:
                System.out.println("6.- Area, perimetro y volumen.\nElija una opcion");
                System.out.println("1.- Area y perimetro de un rectangulo.");
                System.out.println("2.- Perimetro y area de un triangulo.");
                System.out.println("3.- Volumen de esfera");
                System.out.println("4.- Volumen de cilindro");

                    key = entrada.nextInt();
                        switch(key){
                            case 1:
                                System.out.println("Area y perimetro  de un rectangulo.\nIngrese la altura:");
                                    altura = entrada.nextDouble();
                                System.out.println("Ingresa la base:");
                                    base = entrada.nextDouble();
                                    area = altura*base;
                                    perimetro = (base*2)+(altura*2);
                                System.out.println("La area es: "+area+".\nEl perimetro es: "+perimetro+".\n\n");
                                break;
                            case 2:
                                System.out.println("Perimetro y area de un triangulo.\nIngrese la altura:");
                                    altura = entrada.nextDouble();
                                System.out.println("Ingrese la base:");
                                    base =  entrada.nextDouble();
                                    perimetro = base*3;
                                    area = (base*altura)/2;
                                System.out.println("El perimetro es: "+perimetro+"\nLa area es: "+area+".\n\n");
                                break;
                            case 3:
                                System.out.println("Volumen de esfera.\nIngresa el radio:");
                                    radio = entrada.nextDouble();
                                    volumen = 3.1415 * radio * (4/3);
                                System.out.println("El volumen es de :"+volumen+".\n\n");
                                break;
                            case 4:
                                System.out.println("Volumen de cilindro.\nIngresa la altura:");
                                    altura = entrada.nextDouble();
                                System.out.println("Ingresa el radio:");
                                    radio = entrada.nextDouble();
                                    volumen = 3.1416*(radio*radio)*altura;
                                System.out.println("El volumen es: "+volumen+".\n\n");
                                break;                                
                        }
                break;
            case 7:
                System.out.println("7.- Tabla de valores.");
                    for(int i = 1; i <= 10; i = i + 1)
                        {if(i < 10){
                System.out.println(" "+i+"    "+ i*10 + "    " +i*100 + "   " +i*1000);
                    }else{
                System.out.println(i+"   "+ i*10 + "   " +i*100 + "  " +i*1000);}
                }                
                System.out.println("\n\n");
                break;
            case 8:
                System.out.println("8.- Factorial.\nIngrese un numero positivo:");
                num1 = entrada.nextInt();
                factorial = 1;
                if(num1 > 0){
                    for(int i = 1; i <= num1; i = i + 1)
                    {
                    factorial = factorial*i; 
                    } 
                System.out.println("El factorial de " + num1 + " es " +factorial+"\n\n");
                }else{
                System.out.println("Solo numeros positivos");
                break;            
            }
        }}while (key != 9);
    }
}        
