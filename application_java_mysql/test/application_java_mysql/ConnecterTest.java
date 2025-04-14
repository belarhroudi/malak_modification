/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package application_java_mysql;

import java.sql.Connection;
import model.Connecter;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Malak
 */
public class ConnecterTest {
    
    public ConnecterTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of obtenirConnexion method, of class Connecter.
     */
   @Test
public void testObtenirConnexion() {
    System.out.println("obtenirConnexion");
    Connecter instance = new Connecter();
    Connection result = instance.obtenirConnexion();
    assertNotNull("La connexion ne doit pas être null", result);
}
    
}
