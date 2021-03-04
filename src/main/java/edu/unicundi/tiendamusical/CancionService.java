/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.tiendamusical;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.annotation.PostConstruct;
//import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author Juan Jose Rangel
 */
@Named(value = "cancionService")
//@ApplicationScoped
@RequestScoped
public class CancionService {

    private List<Cancion> listaCancion;
    private Integer precio;
    private String id, nombre, duracion, disco, nombreArtista, formato;

    public CancionService() {
        listaCancion = new ArrayList<>();
    }

    @PostConstruct
    public void init() {
        listaCancion = GestorDB.cargarCanciones();
        /*for (int i = 0; i < 5; i++) {
            GestorDB.agregarCancion(new Cancion(getRandomId(), "Cancion " + (i + 1), getRandomDuration(), "Disco " + (i + 1), "nombre Artista " + (i + 1), "Mp3 128Kbps", getRandomPrice()));
        }*/
    }

    private int getRandomPrice() {
        return (int) (Math.random() * 100000);
    }

    private String getRandomId() {
        return UUID.randomUUID().toString().substring(0, 8);
    }

    private String getRandomDuration() {
        return (int) (Math.random() * 10) + ":" + (int) (Math.random() * 60);
    }

    public List<Cancion> getListaCancion() {
        return listaCancion;
    }

    public void setListaCancion(List<Cancion> listaCancion) {
        this.listaCancion = listaCancion;
    }

    void eliminar(int i) {
        this.listaCancion.remove(i);
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

    public void crearCancion() {
        GestorDB.agregarCancion(new Cancion(getRandomId(), nombre, duracion, disco, nombreArtista, formato, precio));
    }

}
