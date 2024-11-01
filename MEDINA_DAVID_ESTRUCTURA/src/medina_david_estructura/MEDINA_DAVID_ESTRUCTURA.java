
package medina_david_estructura;

import java.awt.BorderLayout;
import java.util.Scanner;


public class MEDINA_DAVID_ESTRUCTURA {
//FUNCIONES PARA EL MENU
    
 // FUNCION PARA INVERTIR UNA PALABRA
    public static void palabraInvertida(Scanner entrada){
        System.out.println("****BIENVENIDO A PALABRA INVERTIDA****");
        System.out.print("Ingresa una palabra: ");
        String palabra = entrada.next();
        String palabraInvertida = new StringBuilder(palabra).reverse().toString();
        System.out.println("\nLa palabra invertida es: "+ palabraInvertida);
                
    }
    
    
    
 // FUNCION  PARA EL NUMERO PERFECTO
    public static void numeroPerfecto (Scanner entrada){
        System.out.println("****BIENVENIDO A NUMERO PERFECTO****");
        System.out.print("Ingrese un numero para verificar si es perfecto: ");
        int numero = entrada.nextInt();
        entrada.nextLine();
        int verificacion =0;
        
         for (int i = 1; i <= numero / 2; i++) {
          if (numero % i == 0) {
            verificacion += i;
        }
    }
         if (verificacion == numero){
             System.out.println(numero + " es un numero perfecto.");
                     
         }else{
             System.out.println(numero + " no es un numero perfecto.");
         }
    }
    
    
 // FUNCION DE NUMERO ALEATORIO PRIMO
    public static void numeroPrimo(){
        System.out.println("****BIENVENIDO A NUMERO PRIMO****");
        int numero = (int) (Math.random()*100)+1;
        System.out.println("El numero generado es: "+numero);
        
        int cantidadDivisores = 0;
        StringBuilder listaDivisores = new StringBuilder();
        
        for (int i = 1; i <= numero; i++) {
            
        if (numero % i == 0) {
            cantidadDivisores++;
            listaDivisores.append(i).append(" ");
            }
            
        }
     if (cantidadDivisores == 2) {
        System.out.println("El numero " + numero + " es primo porque solo tiene dos divisores.");
    } else {
        System.out.println("El numero " + numero + " no es primo porque tiene más de dos divisores.");
    }

    // Mostrar la cantidad y la lista de divisores
    System.out.println("Cantidad de divisores: " + cantidadDivisores);
    System.out.println("Divisores: " + listaDivisores.toString().trim());
    }
    
    
 // FUNCION PARA VOTACIONES
    public static void Votaciones(Scanner entrada) {
        System.out.println("****Bienvenido votaacions o sufragio****");
    System.out.print("Cuantos votantes hay en el pais? ");
    int totalVotantes = entrada.nextInt();
    entrada.nextLine(); 

    int votosValidos = 0;
    // 0-AZUL, 1-ROJO, 2-NEGRO, 3-AMARILLO
    int[] contadorVotos = new int[4]; 

    // Ingreso de votos
    for (int i = 0; i < totalVotantes; i++) {
        System.out.print("\nIngresa tu voto (AZUL, ROJO, NEGRO, AMARILLO): ");
        String voto = entrada.nextLine().toUpperCase(); 

        switch (voto) {
            case "AZUL":
                contadorVotos[0]++;
                votosValidos++;
                break;
            case "ROJO":
                contadorVotos[1]++;
                votosValidos++;
                break;
            case "NEGRO":
                contadorVotos[2]++;
                votosValidos++;
                break;
            case "AMARILLO":
                contadorVotos[3]++;
                votosValidos++;
                break;
            default:
                System.out.println("Voto nulo.");
                break;
        }
    }

   
    if ((votosValidos / (double) totalVotantes) < 0.6) {
        System.out.println("VOTACION FALLIDA. Los votos válidos no alcanzan el 60%.");
    } else {
        // Determinar el ganador
        String[] colores = {"AZUL", "ROJO", "NEGRO", "AMARILLO"};
        int maxVotos = 0;
        String ganador = "";

        for (int i = 0; i < contadorVotos.length; i++) {
            if (contadorVotos[i] > maxVotos) {
                maxVotos = contadorVotos[i];
                ganador = colores[i];
            }
        }

        System.out.println("\n****La planilla ganadora es: " + ganador+"****");
    }
}


 
    
  // FUNCION PARA CONTADOR DE OPCIONES
    public static void imprimirContadorOpciones(int[] contadorOpciones) {
        System.out.println("\nCantidad de veces que se ha ingresado a cada opcion:");
        System.out.println("1. Palabra invertido: " + contadorOpciones[0]);
        System.out.println("2. Numero Perfecto: " + contadorOpciones[1]);
        System.out.println("3. Primos: " + contadorOpciones[2]);
        System.out.println("4. Votaciones: " + contadorOpciones[3]);
    }
    
  //MAIN
    public static void main(String[] args) {
       
        //El scanner y la variable de opcion
        Scanner entrada = new Scanner(System.in);
        int opcion;
        
        //Array para contar opcionees
        int [] contadorOpciones = new int [4];
        
        
        
        //MENU PRINCIPAL DONDE SE LLAMARAN LAS FUNCIONES
        
        do{
            System.out.println("\n\n\n*****BIENVENIDO A MENU LABORATORIO*******");
            System.out.println("1. Palabra inversa o palabra al reves.");
            System.out.println("2. Numero perfecto");
            System.out.println("3. Numeros primos aleatorios.");
            System.out.println("4. Votaciones o sufragio");
            System.out.println("5. SALIR DEL PROGRAMA");
            System.out.println("--Digite una opcion:");
            opcion = entrada.nextInt();
            
            switch (opcion){
                case 1:
                    contadorOpciones[0]++;
                    palabraInvertida(entrada);
                    break;
                case 2:
                    
                    contadorOpciones[1]++;
                    numeroPerfecto(entrada);
                    break;
                    
                case 3:
                    contadorOpciones[2]++;
                    numeroPrimo();
                    break;
                    
                case 4:
                    contadorOpciones[3]++;
                    Votaciones (entrada);
                    break;
                    
                case 5:
                     System.out.println("\n\n****Saliendo del programa...****");
                     imprimirContadorOpciones(contadorOpciones);
                     break;
                     
                   default:
                    System.out.println("Opcion no válida. Intenta de nuevo.");
            
            }
        }while (opcion != 5);
        
        
        
    }
    
}
