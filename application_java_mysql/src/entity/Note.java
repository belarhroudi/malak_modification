/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

public class Note {
    private int id;
    private String nomEtudiant;
    private double valeur;

    public Note() {}

    public Note(int id, String nomEtudiant, double valeur) {
        this.id = id;
        this.nomEtudiant = nomEtudiant;
        this.valeur = valeur;
    }

    // Getters et Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNomEtudiant() { return nomEtudiant; }
    public void setNomEtudiant(String nomEtudiant) { this.nomEtudiant = nomEtudiant; }

    public double getValeur() { return valeur; }
    public void setValeur(double valeur) { this.valeur = valeur; }
}