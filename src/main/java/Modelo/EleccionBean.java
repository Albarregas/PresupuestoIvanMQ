/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author ivan9
 */
import java.io.Serializable;

public class EleccionBean implements Serializable{

    //Creamos dos variable booleanas de si se ha seleccionado o no
    public boolean edificio;
    public boolean contenido;

    public boolean isEdificio() {
        return edificio;
    }

    public boolean isContenido() {
        return contenido;
    }

    public void setEdificio(boolean edificio) {
        this.edificio = edificio;
    }

    public void setContenido(boolean contenido) {
        this.contenido = contenido;
    }
    

}

