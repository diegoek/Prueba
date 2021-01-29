package prueba;
import java.util.Scanner;
public class Prueba {

    public static void main(String[] args) {
     int num;
     int inver = 0;
     String cad, cadinver="";
     Scanner n = new Scanner (System.in);

        System.out.println("Digite un numero con signo de 32 bits");
         num = n.nextInt();
        if(num<0){
         cad=num+"";
            for(int i = 1;i<cad.length(); i++){
               cadinver=cad.charAt(i)+cadinver;
               inver=Integer.parseInt(cadinver)*(-1);
            }
            System.out.println("Número invertido: " + inver);
        }else{cad=num+"";
                for(int i = 0; i <cad.length(); i++){
               cadinver=cad.charAt(i)+cadinver;
               inver=Integer.parseInt(cadinver);   
             }
                System.out.println("Número invertido: " + inver);
                
        }       
        
         
         
        
    }
    
}
