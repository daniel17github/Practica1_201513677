
package buscaminas_201513677;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author Dany
 */
public final class Menu{
    
   Modosjuego modos = new Modosjuego ();
String enter;
    public Menu() {
    
        menuInicio();
    }
       
        public  void menuInicio(){
     //Menu de Datos     
            System.out.println("***************************************");
            System.out.println("*    Daniel Alejandro Orozco Melgar   *");
            System.out.println("* -----------> 201513677 <----------- *");
            System.out.println("*          IPC 'A' PRACTICA 1         *");
            System.out.println("*            ''BUSCAMINAS''           *");
            System.out.println("***************************************");    
           
            Scanner leer = new Scanner(System.in);
            enter = leer.nextLine();
                 switch (enter) {
                  case "":
                    menusecundario();
            
                break;
            default:
                System.err.println(" Para avanzar Presinone enter");
                menuInicio();
                break;
        }
  
    }
        
        public void menusecundario(){
        int opc = 0;
        
        
        do{
            
            try{
                
            Scanner a = new Scanner(System.in); 
                
            System.out.println("----------------------------------------");
            System.out.println("               BUSCAMINAS               ");
            System.out.println(" 1. Principiante                        ");
            System.out.println(" 2. Intermedio                          ");
            System.out.println(" 3. Experto                             ");
            System.out.println(" 4. Salir                               ");    
            System.out.println(" Ingrese Opcion: ");
            opc = a.nextInt();
            System.out.println("----------------------------------------");
            
            switch(opc){
                
                 case 1:
                     Modosjuego.Principiante();
                     
                    break;
                 case 2:
                     Modosjuego.Intermedio();
                     break;
                 case 3:
                     Modosjuego.Experto();
                     break;
                 case 4:
                     System.out.println("Saliendo");
                     break;
                     
                 default:
                    System.out.print("La opcion " + opc + " no existe ");
                    System.out.println("!La opcion debe estar entre 1 y 4¡");
                    System.out.println(" ");
                            break;
                    }
                                    
            }catch (InputMismatchException e) {
                    System.err.println("Error!! solo se puden ingresar datos del tipo numerico");
                    System.err.println("Intentelo nuevamente");

                } catch (Exception e) {
                    System.out.println("ERROR !!!");
                }
        } while (opc!=4);
        }
        
}
   
