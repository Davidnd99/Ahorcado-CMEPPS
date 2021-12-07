/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ahorcado;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author David
 */
public class JugarTest {
    
    public JugarTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Inicio");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Fin");
    }
    
    @Before
    public void setUp() {
        System.out.println("Entro");
    }
    
    @After
    public void tearDown() {
        System.out.println("Salgo");
    }

    /**
     * Test of Partida method, of class Jugar.
     */
    @Test
    public void testPartida() {
        System.out.println("Partida");
        Jugar instance = new Jugar();
        instance.Partida();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
