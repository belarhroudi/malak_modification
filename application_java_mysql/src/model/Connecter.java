/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


import java.sql.Connection;
import java.sql.DriverManager;

public class Connecter {
   
    // Déclaration de la connexion
    private Connection con;
   
    // Constructeur de la classe Connecter
    public Connecter() {
        try {
            // Chargement du driver MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception e) {
            System.err.println("Erreur de chargement du driver : " + e);
        }
   
        try {
            // Établir la connexion à la base de données
            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/etude", "root", "");
        } catch (Exception e) {
            System.err.println("Erreur de connexion à la base de données : " + e);
        }
    }
   
    // Méthode pour obtenir la connexion
    public Connection obtenirConnexion() {
        return con;
    }}
