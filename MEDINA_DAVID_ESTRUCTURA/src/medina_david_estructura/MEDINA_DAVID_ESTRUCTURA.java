
package medina_david_estructura;

import java.awt.BorderLayout;
import java.util.Scanner;


public class MEDINA_DAVID_ESTRUCTURA {
//FUNCIONES PARA EL MENU
    
 // FUNCION PARA INVERTIR UNA PALABRA
    
    
    
    
 // FUNCION  PARA EL NUMERO PERFECTO
    
    
    
 // FUNCION DE NUMERO ALEATORIO PRIMO
    
    
    
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
                    
                    
                case 2:
                    
                    
                case 3:
                    
                    
                    
                case 4:
                    
                    
                case 5:
                
            
            }
        }while (opcion != 5);
        
        
        
    }
    
}
