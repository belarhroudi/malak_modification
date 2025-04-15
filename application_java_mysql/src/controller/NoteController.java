/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;


import java.sql.*;
import javax.swing.table.DefaultTableModel;
import model.Connecter;

public class NoteController {
    private Connecter conn;
    private Statement stm;
    private ResultSet RS;

    public NoteController() {
        conn = new Connecter();
    }

    public Connection getConnection() {
        return conn.obtenirConnexion();
    }

    public Statement getStatement() throws SQLException {
        if (stm == null || stm.isClosed()) {
            stm = conn.obtenirConnexion().createStatement();
        }
        return stm;
    }

    public ResultSet executerRequete(String sql) throws SQLException {
        stm = getStatement();
        return stm.executeQuery(sql);
    }

    public void executerUpdate(String sql) throws SQLException {
        stm = getStatement();
        stm.executeUpdate(sql);
    }
    
}
