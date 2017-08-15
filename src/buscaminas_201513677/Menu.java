
package buscaminas_201513677;

import java.util.Scanner;
/**
 *
 * @author Dany
 */
public final class Menu{
    
    Modosjuego mdj = new Modosjuego();
    
public int Opciones;


    public Menu() {
    
    Opciones = 0 ;    
        
     //Menu de Datos     
            System.out.println("***************************************");
            System.out.println("*    Daniel Alejandro Orozco Melgar   *");
            System.out.println("* -----------> 201513677 <----------- *");
            System.out.println("*          IPC 'A' PRACTICA 1         *");
            System.out.println("*            ''BUSCAMINAS''           *");
            System.out.println("***************************************");    
           
            
  
    
    do {
            System.out.println("----------------------------------------");
            System.out.println("               BUSCAMINAS               ");
            System.out.println(" 1. Principiante                        ");
            System.out.println(" 2. Intermedio                          ");
            System.out.println(" 3. Experto                             ");
            System.out.println(" 4. Salir                               ");    
            Scanner leer = new Scanner(System.in);
            Opciones = leer.nextInt();
            switch(Opciones){
                case 1:
                   Modosjuego(Principiante());
                   
                    break;
                case 2:
                    Modosjuego(Intermedio);
                    break;
                case 3:
                    Modosjuego(Experto);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opcion Invalida");
                    break;

            }
        } while (Opciones != 4);
    }

  

   
