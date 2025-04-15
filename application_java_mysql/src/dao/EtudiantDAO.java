/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.Etudiant;
import controller.NoteController;

public class EtudiantDAO {

    private final Connection conn;

    public EtudiantDAO() {
        NoteController controller = new NoteController();
        this.conn = controller.getConnection();
    }

    public List<Etudiant> getAllEtudiants() {
        List<Etudiant> liste = new ArrayList<>();
        String sql = "SELECT * FROM etudient";

        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Etudiant e = new Etudiant(
                    rs.getInt("id"),
                    rs.getString("nom"),
                    rs.getString("prenom"),
                    rs.getString("branche"),
                    rs.getDouble("note")
                );
                liste.add(e);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return liste;
    }

    public boolean ajouterEtudiant(Etudiant e) {
        String sql = "INSERT INTO etudient (id, nom, prenom, branche, note) VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, e.getId());
            ps.setString(2, e.getNom());
            ps.setString(3, e.getPrenom());
            ps.setString(4, e.getBranche());
            ps.setDouble(5, e.getNote());
            return ps.executeUpdate() > 0;

        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public boolean modifierEtudiant(Etudiant e) {
        String sql = "UPDATE etudient SET nom=?, prenom=?, branche=?, note=? WHERE id=?";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, e.getNom());
            ps.setString(2, e.getPrenom());
            ps.setString(3, e.getBranche());
            ps.setDouble(4, e.getNote());
            ps.setInt(5, e.getId());
            return ps.executeUpdate() > 0;

        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public boolean supprimerEtudiant(int id) {
        String sql = "DELETE FROM etudient WHERE id=?";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            return ps.executeUpdate() > 0;

        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public Etudiant rechercherEtudiantParNom(String nom) {
        String sql = "SELECT * FROM etudient WHERE nom = ?";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, nom);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return new Etudiant(
                    rs.getInt("id"),
                    rs.getString("nom"),
                    rs.getString("prenom"),
                    rs.getString("branche"),
                    rs.getDouble("note")
                );
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return null;
    }
}
