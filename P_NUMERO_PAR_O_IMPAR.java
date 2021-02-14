/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p_numero_par_o_impar;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author ESTEFANIA TAMAY
 */
public class P_NUMERO_PAR_O_IMPAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
       
        String respuesta = "S";
       
       String CAD = ("");
        
        while (respuesta.equalsIgnoreCase("S")){
           
            System.out.println("NUMERO PAR O IMPAR");
            System.out.println ("¿Qué cadena desea analizar?");
            
            CAD = entrada.nextLine();
            
            String textoPorPantalla="";
            
            char[] array = {'a','e','i','o','u'};
            
            for (int i=0; i<array.length; i++) {
                
                switch (analizarVocal(CAD,array[i])){
                    
                    
                    case 1: textoPorPantalla=textoPorPantalla+"\nEl número de letras "+array[i]+" es par. "; break;
                    
                    case -1: textoPorPantalla=textoPorPantalla+"\nEl número de letras "+array[i]+" es impar. "; break;
                    
                    case 0: textoPorPantalla=textoPorPantalla+"\nEl número de letras "+array[i]+" es cero. "; break;
                }
            }
                System.out.println (textoPorPantalla);
                
                System.out.print ("¿Desea analizar otra cadena? (Si , No) ");
                
                respuesta = entrada.nextLine();              
        }
        
    }
        
          public static int analizarVocal (String CAD, char vocalParaAnalizar) {
        
              Stack<String> pila = new Stack(); char v=vocalParaAnalizar; String vocal=String.valueOf(vocalParaAnalizar);
        
              int i=0; int auxiliar=0;
        
              while (i<CAD.length()) {
            
                  if (Character.toLowerCase(CAD.charAt(i))==v&&pila.empty()) {pila.push(vocal); auxiliar++;}
            
                  else if (Character.toLowerCase(CAD.charAt(i))==v&&!pila.empty()) {pila.pop();}
            
                  i++;
        
              }
        
              if (auxiliar==0) {return 0;} else { if (pila.empty()) {return 1;} else {return -1;}}     
    
          }  
        
 }
    
    

