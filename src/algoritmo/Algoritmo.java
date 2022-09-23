package algoritmo;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Algoritmo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner l=new Scanner(System.in);
        int nummay, nummen;
        
        System.out.println("Ingrese el numero mayor");
        nummay=l.nextInt();
        System.out.println("Ingrese el numero menor");
        nummen=l.nextInt();
        
        System.out.println("El MCD es: "+obtener_mcd(nummay,nummen));
    }
    static int obtener_mcd(int a, int b){
        if(b==0){
          return a;
          
        }else{
            return obtener_mcd(b,a%b);
        }
        
    }
    
}
