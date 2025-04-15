/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package application_java_mysql;

import view.Gestion_des_notes;
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
public class Gestion_des_notesTest {
    
    public Gestion_des_notesTest() {
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
     * Test of afficher method, of class Gestion_des_notes.
     */
    @Test
public void testAfficher() {
    System.out.println("afficher");
    Gestion_des_notes instance = new Gestion_des_notes();
    try {
        instance.afficher();
    } catch (Exception e) {
        fail("La méthode afficher a lancé une exception : " + e.getMessage());
    }
}

    /**
     * Test of main method, of class Gestion_des_notes.
     */
   @Test
public void testMain() {
    System.out.println("main");
    String[] args = null;
    try {
        Gestion_des_notes.main(args);
    } catch (Exception e) {
        fail("La méthode main a lancé une exception : " + e.getMessage());
    }
}}
