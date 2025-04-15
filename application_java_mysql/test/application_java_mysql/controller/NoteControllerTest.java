/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package application_java_mysql.controller;

import controller.NoteController;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
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
public class NoteControllerTest {
    
    public NoteControllerTest() {
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
     * Test of getConnection method, of class NoteController.
     */
    @Test
public void testGetConnection() {
    System.out.println("getConnection");
    NoteController instance = new NoteController();
    Connection result = instance.getConnection();
    assertNotNull("La connexion ne doit pas être null", result);
}

@Test
public void testGetStatement() throws Exception {
    System.out.println("getStatement");
    NoteController instance = new NoteController();
    Statement result = instance.getStatement();
    assertNotNull("Le Statement ne doit pas être null", result);
}
@Test
public void testExecuterRequete() throws Exception {
    System.out.println("executerRequete");
    String sql = "SELECT * FROM etudient"; // <-- table correcte
    NoteController instance = new NoteController();
    ResultSet result = instance.executerRequete(sql);
    assertNotNull("Le ResultSet ne doit pas être null", result);
}

@Test
public void testExecuterUpdate() throws Exception {
    System.out.println("executerUpdate");
    String sql = "UPDATE etudient SET note = 15 WHERE id = 1"; // <-- table correcte
    NoteController instance = new NoteController();
    instance.executerUpdate(sql);
    // S’il n’y a pas d’exception, c’est réussi
}
}
