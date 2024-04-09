package holamundojava;

import java.util.Scanner;


/**
 *
 * @author lepaccio
 */
public class HolaMundoJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Definimos la variable
        var usuario = "Juan";
        var titulo = "Ingeniero";
        
        var union = titulo +" "+  usuario;
        System.out.println("union = " + union);
        
        var i = 3;
        var j = 4; 
        System.out.println(i+j);//Se realiza la suma de numeros
        //Evaluacion de izq a der
        System.out.println(i + j + usuario);//Asume la suma y despues añade usuario entonces es contexto entero
        System.out.println(usuario + i + j);//El contexto cadena es un conjunto de caracteres por lo que se toma i y j como caracteres
        System.out.println(usuario + (i + j));//El contexto es cadena pero gracias al parentesis primero se da prioridad a la suma y luego se considera el contexto cadena
        
        var nombre = "karla";
        System.out.println("Nueva linea: \n" + nombre);
        System.out.println("Tabulador:\t" + nombre);
        System.out.println("Retroceso:\b" + nombre);
        System.out.println("Comilla simple: \'" + nombre + "\'");
        System.out.println("Comilla doble: \"" + nombre + "\"");
        
        
        System.out.println("Escribe tu nombre: ");
        Scanner escaner = new Scanner(System.in);
        var user = "Carlos";
        user = escaner.nextLine();
        System.out.println("user = " + user);
        System.out.println("Escribe el titulo: ");
        var tittle = escaner.nextLine();
        System.out.println("Resultado: " + tittle + " " + user);        
    }
    
}
