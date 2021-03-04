/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.tiendamusical;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Juan José Rangel
 */

public class GestorDB { 
    public static void agregarCancion(Cancion cancion){
        DBManager database = new DBManager();
        try {
            String query = "INSERT INTO canciones (id_album, id, nombre, duracion, disco, artista, formato, precio) VALUES (?, ?, ?, ?, ?, ?, ?, ?);";
            PreparedStatement sentenciaP = database.open().prepareStatement(query);
            sentenciaP.setString(1, "asd");
            sentenciaP.setString(2, cancion.getId());
            sentenciaP.setString(3, cancion.getNombre());
            sentenciaP.setString(4, cancion.getDuracion());
            sentenciaP.setString(5, cancion.getDisco());
            sentenciaP.setString(6, cancion.getNombreArtista());
            sentenciaP.setString(7, cancion.getFormato());
            sentenciaP.setInt(8, cancion.getPrecio());
            sentenciaP.executeUpdate();
            sentenciaP.close();
            database.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public static void editarCancion(Cancion cancion){
        DBManager database = new DBManager();
        try {
            String query = "UPDATE canciones SET id_album = ?, id = ?, nombre = ?, duracion = ?, disco = ?, artista = ?, formato = ?, precio = ? WHERE canciones.id = ?;";
            PreparedStatement sentenciaP = database.open().prepareStatement(query);
            sentenciaP.setString(1, "asd");
            sentenciaP.setString(2, cancion.getId());
            sentenciaP.setString(3, cancion.getNombre());
            sentenciaP.setString(4, cancion.getDuracion());
            sentenciaP.setString(5, cancion.getDisco());
            sentenciaP.setString(6, cancion.getNombreArtista());
            sentenciaP.setString(7, cancion.getFormato());
            sentenciaP.setInt(8, cancion.getPrecio());
            sentenciaP.setString(9, cancion.getId());
            sentenciaP.executeUpdate();
            sentenciaP.close();
            database.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void borrarCancion(Cancion cancion){
        DBManager database = new DBManager();
        try {
            String query = "DELETE FROM canciones WHERE canciones.id = ?";
            
            PreparedStatement sentenciaP = database.open().prepareStatement(query);
            sentenciaP.setString(1, cancion.getId());
            sentenciaP.execute();
            sentenciaP.close();
            database.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void agregarAlbum(Cancion cancion){
        DBManager database = new DBManager();
        try {
            String query = "INSERT INTO personas (documento, nombre, telefono, email, foto) VALUES (?, ?, ?, ?, ?);";
            PreparedStatement sentenciaP = database.open().prepareStatement(query);
            sentenciaP.setString(1, cancion.getId());
            sentenciaP.setString(2, cancion.getId());
            sentenciaP.setString(3, cancion.getId());
            sentenciaP.setString(4, cancion.getId());
            sentenciaP.setString(5, cancion.getId());
            sentenciaP.executeUpdate();
            sentenciaP.close();
            database.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public static void editarAlbum(Cancion cancion){
        DBManager database = new DBManager();
        try {
            String query = "UPDATE personas SET documento = ?, nombre = ?, telefono = ?, email = ?, foto = ? WHERE id = ?;";
            PreparedStatement sentenciaP = database.open().prepareStatement(query);
            sentenciaP.setString(1, cancion.getId());
            sentenciaP.setString(2, cancion.getId());
            sentenciaP.setString(3, cancion.getId());
            sentenciaP.setString(4, cancion.getId());
            sentenciaP.setString(5, cancion.getId());
            sentenciaP.setString(6, cancion.getId());

            sentenciaP.executeUpdate();
            sentenciaP.close();
            database.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void borrarAlbum(Cancion cancion){
        DBManager database = new DBManager();
        try {
            String query = "DELETE FROM personas WHERE id = ?;";
            PreparedStatement sentenciaP = database.open().prepareStatement(query);
            sentenciaP.setString(1, cancion.getId());

            sentenciaP.execute();
            sentenciaP.close();
            database.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static ArrayList cargarCanciones(){
        DBManager database = new DBManager();
        ArrayList<Cancion> listaCanciones = new ArrayList<>();
        try {
        String query = "SELECT * FROM canciones;";
        PreparedStatement sentenciaP = database.open().prepareStatement(query);
        ResultSet resultado  = sentenciaP.executeQuery();

        while (resultado.next()) {
          listaCanciones.add(new Cancion(resultado.getString("id"), resultado.getString("nombre"), resultado.getString("duracion"), resultado.getString("disco"), resultado.getString("artista"), resultado.getString("formato"), resultado.getInt("precio")));
        }
        sentenciaP.close();
        database.close();
      } catch (SQLException ae) {
        System.out.println(ae.getMessage());
      }
        return listaCanciones;
    }
    public static void cargarAlbumes(){
        DBManager database = new DBManager();
        try {
        String query = "SELECT * FROM artistas;";
        PreparedStatement sentenciaP = database.open().prepareStatement(query);
        ResultSet resultado  = sentenciaP.executeQuery();

        while (resultado.next()) {
          //comboBox.addItem(resultado.getString("artista"));
        }

        sentenciaP.close();
        database.close();
      } catch (SQLException ae) {
        System.out.println(ae.getMessage());
      }
    }
}
