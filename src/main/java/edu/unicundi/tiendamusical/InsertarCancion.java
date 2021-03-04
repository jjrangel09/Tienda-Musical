/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.tiendamusical;

import java.util.UUID;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author Juan José Rangel
 */
@Named(value = "insertar")
@RequestScoped
public class InsertarCancion {

    private Integer precio = 123;
    private String id, nombre, duracion, disco, nombreArtista, formato;

    public void crearCancion() {
        GestorDB.agregarCancion(new Cancion(getRandomId(), nombre, duracion, disco, nombreArtista, formato, precio));
    }

    private String getRandomId() {
        return UUID.randomUUID().toString().substring(0, 8);
    }

    public Integer getPrecio() {
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

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }
}
