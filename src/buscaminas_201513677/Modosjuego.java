
package buscaminas_201513677;

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
         String opcenletra;
        
         do{
            
                 
                 Scanner b = new Scanner(System.in);
        System.out.println("    ---------------------------------");
        System.out.println("           NIVEL PRINCIPIANTE        ");
      
        for (int[] matriz1 : matriz) {
            System.out.print("|");
            for (int y = 0; y < matriz1.length; y++) {
                System.out.print(matriz1[y]);
                if (y != matriz1.length - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println("|");
        }
        System.out.println("        ------------------");
        System.out.println("            Voltear:   V");
        System.out.println("            Reiniciar: R");
        System.out.println("            Salir:     S"); 
        System.out.println("");
        System.out.println("    Ingresar Opcion:");
        opcenletra =  b.nextLine();
        opcenletra = opcenletra.toLowerCase();
        System.out.println("   ---------------------------------");
        switch(opcenletra){
         
             case "v":
                    System.out.println("hola");
                 break;
         
             case "r":
                 System.out.println("holix");
                 break;
                 
             case "s":
                 System.out.println("Saliendo....Regreso a Menu Principal");
                 break;
                           
             }
        } while (!"s".equals(opcenletra));
        
      }
      
// Nivel Intermedio
    public  static void Intermedio() {
         int matriz[][]= new int[6][6];
         
          String opcenletra;
        
         do{
            
                 
                 Scanner b = new Scanner(System.in);
        System.out.println("    ---------------------------------");
        System.out.println("           NIVEL INTERMEDIO          ");
        
             for (int[] matriz1 : matriz) {
                 System.out.print("|");
                 for (int y = 0; y < matriz1.length; y++) {
                     System.out.print(matriz1[y]);
                     if (y != matriz1.length - 1) {
                         System.out.print("\t");
                     }
                 }
                 System.out.println("|");
             }
        System.out.println("        ------------------");
        System.out.println("            Voltear:   V");
        System.out.println("            Reiniciar: R");
        System.out.println("            Salir:     S"); 
        System.out.println("");
        System.out.println("    Ingresar Opcion:");
        opcenletra =  b.nextLine();
        opcenletra = opcenletra.toLowerCase();
        System.out.println("   ---------------------------------");
        switch(opcenletra){
         
             case "v":
                    System.out.println("hola");
                 break;
         
             case "r":
                 System.out.println("holix");
                 break;
                 
             case "s":
                 System.out.println("Saliendo....Regreso a Menu Principal");
                 break;
         
                  
         }
             
         } while (!"s".equals(opcenletra));   
    }

    
    //Nivel Experto    
    public static void Experto() {
       
        int matriz [][]= new int[8][8];
        String opcenletra; 
        
        do{
            
            Scanner b = new Scanner(System.in);
        System.out.println("    --------------------------------");
        System.out.println("             NIVEL EXPERTO          ");
    
            
        for (int[] matriz1 : matriz) {
            System.out.print("|");
            for (int y = 0; y < matriz1.length; y++) {
                System.out.print(matriz1[y]);
                if (y != matriz1.length - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println("|");
        }
        System.out.println("        ------------------");
        System.out.println("            Voltear:   V");
        System.out.println("            Reiniciar: R");
        System.out.println("            Salir:     S"); 
        System.out.println("");
        System.out.println("    Ingresar Opcion:");
        opcenletra =  b.nextLine();
        opcenletra = opcenletra.toLowerCase();
        System.out.println("   ---------------------------------");
        switch(opcenletra){
         
             case "v":
                    System.out.println("hola");
                 break;
         
             case "r":
                 System.out.println("holix");
                 break;
                 
             case "s":
                 System.out.println("Saliendo....Regreso a Menu Principal");
                 break;
         
                  
         }
             
         } while (!"s".equals(opcenletra));
        }
    
    
      
    
    }
