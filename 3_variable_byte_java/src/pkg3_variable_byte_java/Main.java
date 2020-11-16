/*
Este programa muestra la tipos variable de tipo byte en java, es una
variable primitiva porque no es un objeto, no tiene métodos ni necesita
una invocación para ser creada. Su rango aproximado se encuentra entre el
número -128 y el 127. Para almacenar un dato ocupa 1 byte en memoria.
 */
package pkg3_variable_byte_java;

/**
 * @author Emilio Carcaño Bringas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         byte ciento_veintisiete = 127; //Podemos definir y asignarle una valor al mismo tiempo
         System.out.println("El rango se encuentra esntre -128 y "+ciento_veintisiete);
         
        byte numero_pequeno; //Definimos la variable de tipo byte
        numero_pequeno = 10; //Le asignamos un valor a la variable
        
        /*Escribimos sout y oprimimos la tecla tab para escribit System.out.println("")
        el signo + nos sirve para unir el texto a imprimir con el valor a imprimir*/
        System.out.println("Por eso almacenamos numeros pequeños, por ejemplo el: "+numero_pequeno);
        
    }
    
}
