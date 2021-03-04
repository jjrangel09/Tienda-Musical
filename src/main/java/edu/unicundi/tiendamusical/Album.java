/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.tiendamusical;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Juan José Rangel
 */
public class Album implements Serializable {

    private int precio;
    private String id, nombre, duracion, nombreArtista, formato, informacion;
    private ArrayList<Cancion> canciones;

    public Album(String id, String nombre, String duracion, String nombreArtista, String formato, String informacion, int precio) {
        this.precio = precio;
        this.id = id;
        this.nombre = nombre;
        this.duracion = duracion;
        this.nombreArtista = nombreArtista;
        this.formato = formato;
        this.informacion = informacion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getNombreArtista() {
        return nombreArtista;
    }

    public void setNombreArtista(String nombreArtista) {
        this.nombreArtista = nombreArtista;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getInformacion() {
        return informacion;
    }

    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

}
