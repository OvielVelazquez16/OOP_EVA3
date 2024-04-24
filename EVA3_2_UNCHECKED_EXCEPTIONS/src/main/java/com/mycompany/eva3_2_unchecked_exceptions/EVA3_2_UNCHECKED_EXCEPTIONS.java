
package com.mycompany.eva3_2_unchecked_exceptions;

/**
 *
 * @author oviel
 */
public class EVA3_2_UNCHECKED_EXCEPTIONS {

    public static void main(String[] args) {
       //NULLPOINTEREXCEPTION:
       //Cuando queremos usar un objeto que no existe.
        Persona persona = null;
        System.out.println(persona.toString());
        int arreglo[] = new int[10];
        arreglo[15] = 100;
        int x = 10, y = 0;
        int resu = x / y;
        System.out.println(resu);
        
    }
}

class Persona{
    
}