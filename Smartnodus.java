
package smartnodus;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author Alvaro
 */
public class Smartnodus {
    public static void main(String[] args) {
        System.out.println("Bienvenidos SmartNodus");
        
        Scanner sc = new Scanner (System.in);
        boolean salir = false;
        int opcion;
        
        System.out.println("1. Opcion Multiplication Tables");
        System.out.println("2. Opcion Fibonacci ");
        
        try {
 
                System.out.println("Escribe una de las opciones");
                opcion = sc.nextInt();
 
                switch (opcion) {
                    case 1:
                        tables ();
                        break;
                    case 2:
                        fibo ();
                        break;
                    case 3:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 2");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sc.next();
            }
 
    }
    
    static public void fibo (){
      Scanner input = new Scanner(System.in);
        int w = 0;
        int x = 1;
        int y,v;
        System.out.print("Cantidad de numeros: ");
        v = input.nextInt();
        
        for (int i = 0; i < v ; i++){
            System.out.print(w);
            y = w+x;
            w = x;
            x = y;
        }  
    }
    
    
    static public void tables (){
    Scanner input = new Scanner(System.in);
    System.out.print("Ingrese hasta que tabla desea ver: ");
    
    int inputNumber ;
    inputNumber = input.nextInt();
        
        for (int i = 0 ; i<= inputNumber ; i++ ) {
        System.out.println("Tabla " + i);
        
            for (int ii = 0 ; ii <=12; ii ++)
            {
                System.out.println(i + " * " + ii + " = " + i*ii);
            }
        }
    }
}
