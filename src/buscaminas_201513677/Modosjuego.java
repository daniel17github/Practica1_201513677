
package buscaminas_201513677;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author Dany
 */
    public class Modosjuego {
    
  
    
    public Modosjuego(){
 
}
    
    //Nivel principiante
    public static  void Principiante() {
        int matriz[][]= new int[4][4];
        
        
        System.out.println("    ---------------------------------");
        System.out.println("           NIVEL PRINCIPIANTE        ");
      
        for (int x=0; x < matriz.length; x++) {
         System.out.print("|");
            for (int y=0; y < matriz[x].length; y++) {
                System.out.print (matriz[x][y]);
        if (y!=matriz[x].length-1) System.out.print("\t");
            }
                System.out.println("|");
            }
    }
    
    
// Nivel Intermedio
    public  static void Intermedio() {
         int matriz[][]= new int[6][6];
         int opc1 = 0;
        
         do{
             try{
                 
                 Scanner b = new Scanner(System.in);
        System.out.println("    ---------------------------------");
        System.out.println("           NIVEL INTERMEDIO          ");
        
        for (int x=0; x < matriz.length; x++) {
         System.out.print("|");
            for (int y=0; y < matriz[x].length; y++) {
                System.out.print (matriz[x][y]);
        if (y!=matriz[x].length-1) System.out.print("\t");
            }
                System.out.println("|");
            }
        System.out.println("------------------");
        System.out.println(" Voltear:   V");
        System.out.println(" Reiniciar: R");
        System.out.println(" Salir:     S"); 
        System.out.println("");
        System.out.println("Ingresar Opcion:");
        opc1 = b.nextInt();
        System.out.println("   ---------------------------------");
        switch(opc1){
         
             case 1:
                    System.out.println("hola");
                 break;
         
             case 2:
                 System.out.println("holix");
                 break;
                 
             case 3:
                 System.out.println("Saliendo....Regreso a Menu Principal");
                 break;
         
                  
         }
             }catch (InputMismatchException e) {
                    System.err.println("Error!! solo se puden ingresar datos del tipo numerico");
                    System.err.println("Intentelo nuevamente");
                     
                } catch (Exception e) {
                    System.out.println("ERROR !!!");
                }
         } while (opc1!=3);   
    }

    
    //Nivel Experto    
    public static void Experto() {
        
        int matriz [][]= new int[8][8];
        System.out.println("    --------------------------------");
        System.out.println("             NIVEL EXPERTO          ");
    
            
    for (int x=0; x < matriz.length; x++) {
         System.out.print("|");
            for (int y=0; y < matriz[x].length; y++) {
                System.out.print (matriz[x][y]);
        if (y!=matriz[x].length-1) System.out.print("\t");
            }
                System.out.println("|");
            }

        }
    
    
      
    
    }
