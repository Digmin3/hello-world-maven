package sonar.com.sonar.maven;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hola mundo!" );
        
        int i;
        
        for(i=0;i<10;i++)
        {
        	System.out.println("Hello World " +i);
        }
        
        if(i==0)
        {
        	System.out.println("Hello World " +i);
        	
        	 if(i==0)
             {
             	System.out.println("Hello World " +i);
             		
             }
        }
        
        List<Integer> lista = new ArrayList<Integer>();
        Scanner reader = new Scanner(System.in);
        int numero = 0;
         
        System.out.println("Introduce números. El cero para salir");
        System.out.println("Introduce números. El cero para salir");
        System.out.println("Introduce números. El cero para salir");
        System.out.println("Introduce números. El cero para salir");
        
        
         
        do {			
            numero = reader.nextInt();
            lista.add(numero);
        } while (numero!=0);
        
        String mivariable = "<undefined>";
        
        try {
        	
        	mivariable = mivariable + "aaaa";
        	
        }catch(Exception e){
        	
        }
    }
}
