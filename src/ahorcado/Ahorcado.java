package ahorcado;

import java.util.Random;
import java.util.Scanner;

/**
 *
 *
 *
 * @author David
 *
 */
public class Ahorcado {

    /**
     *
     * @param args the command line arguments
     *
     */
    public static void main(String[] args) {

        Jugar juego = new Jugar();
        
        for (int i = 0; i < 5; i++) {
            juego.Partida();
        }
    }
   

}
