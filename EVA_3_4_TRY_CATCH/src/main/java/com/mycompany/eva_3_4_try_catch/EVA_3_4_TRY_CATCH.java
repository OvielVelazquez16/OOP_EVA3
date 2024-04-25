

package com.mycompany.eva_3_4_try_catch;

/**
 *
 * @author oviel
 */
public class EVA_3_4_TRY_CATCH {

    public static void main(String[] args) {
        //aritmeticexception
        
        int x = 10, y = 0;
        int resu = 0;
        try{
        resu = x / y;
        
        } catch(ArithmeticException e){    
           e.printStackTrace();
               
    }
      System.out.println("Resultado: " + resu);
}
}
