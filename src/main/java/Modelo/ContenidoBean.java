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

public class ContenidoBean implements Serializable {
    
    public boolean cubrir;
    public double cantidad;
    public double franquicia;
    public double total;

    public boolean Cubrir() {
        return cubrir;
    }

    public double getCantidad() {
        return cantidad;
    }

    public double getFranquicia() {
        return franquicia;
    }

    public double getTotal() {
        return total;
    }

    public void setCubrir(boolean cubrir) {
        this.cubrir = cubrir;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void setFranquicia(double franquicia) {
        this.franquicia = franquicia;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
}
