/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Utils {
    
    //Separa la cadena en caracteres para ser tratados
    public char[] separa(String palabra) {

        char[] letras;
        
        letras = new char[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            letras[i] = palabra.charAt(i);
        }

        return letras;
    }
    
    //Mostramos la palabra oculta separada por espacios
    public void MuestraOculta(char[] tusRespuestas) {
        for (int i = 0; i < tusRespuestas.length; i++) {
            System.out.print(tusRespuestas[i] + " ");
        }
    }
  
}
