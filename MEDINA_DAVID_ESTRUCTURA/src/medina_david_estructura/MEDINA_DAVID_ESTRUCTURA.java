
package medina_david_estructura;

import java.awt.BorderLayout;
import java.util.Scanner;


public class MEDINA_DAVID_ESTRUCTURA {
//FUNCIONES PARA EL MENU
    
 // FUNCION PARA INVERTIR UNA PALABRA
    public static void palabraInvertida(Scanner entrada){
        System.out.println("****BIENVENIDO A PALABRA INVERTIDA****");
        System.out.println("Ingresa una palabra: ");
        String palabra = entrada.next();
        String palabraInvertida = new StringBuilder(palabra).reverse().toString();
        System.out.println("\nLa palabra invertida es: "+ palabraInvertida);
                
    }
    
    
    
 // FUNCION  PARA EL NUMERO PERFECTO
    public static void numeroPerfecto (Scanner entrada){
        System.out.println("****BIENVENIDO A NUMERO PERFECTO****");
        System.out.println("Ingrese un numero para verificar si es perfecto: ");
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
        int 
        
    }
    
    
 // FUNCION PARA VOTACIONES
    
 
    
  // FUNCION PARA CONTADOR DE OPCIONES
 
  //MAIN
    public static void main(String[] args) {
       
        //El scanner y la variable de opcion
        Scanner entrada = new Scanner(System.in);
        int opcion;
        
        //Array para contar opcionees
        int [] contadorOpciones = new int [4];
        
        
        
        //MENU PRINCIPAL DONDE SE LLAMARAN LAS FUNCIONES
        
        do{
            System.out.println("*****BIENVENIDO A MENU LABORATORIO*******");
            System.out.println("1. Palabra inversa o palabra al reves.");
            System.out.println("2. Numero perfecto");
            System.out.println("3. Numeros primos aleatorios.");
            System.out.println("4. Votaciones o sufragio");
            System.out.println("--Digite una opcion:");
            opcion = entrada.nextInt();
            
            switch (opcion){
                case 1:
                    
                    palabraInvertida(entrada);
                    break;
                case 2:
                    
                    
                    numeroPerfecto(entrada);
                    break;
                    
                case 3:
                    
                    
                    
                case 4:
                    
                    
                case 5:
                
            
            }
        }while (opcion != 5);
        
        
        
    }
    
}
