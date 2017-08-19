
package buscaminas_201513677;
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
