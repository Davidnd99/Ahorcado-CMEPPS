/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ahorcado;

import Utils.Utils;
import java.util.Scanner;

/**
 *
 * @author David
 */
public class Jugar {
    
    private final int INTENTOS_TOTALES = 10; 
    private int intentos;
    private int aciertos;
    
    public Jugar(){
        intentos = 0;
        aciertos = 0;
    }
    
    public void Partida(){
        
        int intentosRestantes;
        char resp;
        Utils u = new Utils();
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        
        System.out.println("\nIntroduzca la palabra a acertar: ");
        String str = sc.nextLine();
        for (int i=0; i < 20; i++)
        {
            System.out.println();
        }
        
        String str1 = "";
        for (int i=0;i<str.length();i++){
            str1 = str1 + "*";
        }
        System.out.println(str1);

       
        char[] separa = u.separa(str);
        char[] copia = u.separa(str); 
        
        char[] longitud = new char[separa.length];
        //Escribimos tantos guiones como letras tenga la palabra a adivinar
        for (int i = 0; i < longitud.length; i++) {
            longitud[i] = '_';
        }

        while (intentos < INTENTOS_TOTALES && aciertos != longitud.length) {
            u.MuestraOculta(longitud);

            System.out.println("\nIntroduce una letra: ");
            resp = sc.next().toLowerCase().charAt(0);

            //Comprobamos si se ha producido un acierto
            for (int i = 0; i < separa.length; i++) {
                if (separa[i] == resp) {
                    intentos--;
                    longitud[i] = separa[i];
                    separa[i] = ' ';
                    aciertos++;
                }
            }
            intentos++;
            intentosRestantes = INTENTOS_TOTALES - intentos;
            System.out.println("Intentos restantes: " + intentosRestantes);
        }

        //Si hemos acertado la palabra
        if (aciertos == longitud.length) {
            System.out.print("\nEres un crack! has acertado la palabra: ");
            u.MuestraOculta(longitud);
        } 
        else {
            System.out.print("\nTorpe! la palabra era: ");
            for (int i = 0; i < copia.length; i++) {
                System.out.print(copia[i] + " ");
            }
        }
        //Importante resetear contadores
        intentos = 0;
        aciertos = 0;
    }
    
}
