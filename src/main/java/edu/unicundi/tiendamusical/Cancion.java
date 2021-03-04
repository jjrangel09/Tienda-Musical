/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.tiendamusical;

import java.io.Serializable;

/**
 *
 * @author Juan Jose Rangel
 */
public class Cancion implements Serializable{

    private Integer  precio;
    private String id, nombre, duracion, disco, nombreArtista, formato;

    public Cancion(String id, String nombre, String duracion, String disco, String nombreArtista, String formato, Integer precio) {
        this.id = id;
        this.nombre = nombre;
        this.duracion = duracion;
        this.disco = disco;
        this.nombreArtista = nombreArtista;
        this.formato = formato;
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

    public String getDisco() {
        return disco;
    }

    public void setDisco(String disco) {
        this.disco = disco;
    }
    

    public String getNombreArtista() {
        return nombreArtista;
    }

    public void setNombreArtista(String nombreArtista) {
        this.nombreArtista = nombreArtista;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

}
