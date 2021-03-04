/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.tiendamusical;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import org.primefaces.event.RowEditEvent;

/**
 *
 * @author Juan Jose Rangel
 */
@Named(value = "editarVista")
@RequestScoped
public class EditarVista {

    private List<Cancion> listaCancion;
    private Cancion cancionSelecionada;

    
    public Cancion getCancionSelecionada() {
        return cancionSelecionada;
    }

    public void setCancionSelecionada(Cancion cancionSelecionada) {
        this.cancionSelecionada = cancionSelecionada;
    }

    public CancionService getService() {
        return service;
    }

    public void setService(CancionService service) {
        this.service = service;
    }

    @Inject
    private CancionService service;

    public EditarVista() {

    }

    @PostConstruct
    public void init() {
        this.listaCancion = service.getListaCancion();
    }

    public List<Cancion> getListaCancion() {
        return listaCancion;
    }

    public void setListaCancion(List<Cancion> listaCancion) {
        this.listaCancion = listaCancion;
    }

    public void onRowEdit(RowEditEvent<Cancion> event) {
        GestorDB.editarCancion(event.getObject());
        FacesMessage msg = new FacesMessage("Cancion Editada", event.getObject().getId());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public void onRowCancel(RowEditEvent<Cancion> event) {
        FacesMessage msg = new FacesMessage("Edicion Cancelada", event.getObject().getId());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public void deleteRow(Cancion cancion) {
        GestorDB.borrarCancion(cancion);
        for (int i = 0; i < listaCancion.size(); i++) {
            if (cancion.getId().equals(listaCancion.get(i).getId())) {
                listaCancion.remove(i);
                service.eliminar(i);
            }
        }
        FacesMessage msg = new FacesMessage("Cancion " + cancion.getId() + " eliminada");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public String comprarCancion(RowEditEvent<Cancion> event) {
        addMessage("Realizado", "Gracias por tu compra ");
        return "compra.xhtml";
    }

    public void addMessage(String summary, String detail) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, detail);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}
