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

public class EdificioBean implements Serializable{
    
    private String tipo;
    private int numeroHabitaciones;
    private String fecha;
    private String tipoConstruccion;
    private double valorEstimado;
    private double valorTotal;

    public String getTipo() {
        return tipo;
    }

    public int getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    public String getFecha() {
        return fecha;
    }

    public String getTipoConstruccion() {
        return tipoConstruccion;
    }

    public double getValorEstimado() {
        return valorEstimado;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNumeroHabitaciones(int numero) {
        this.numeroHabitaciones = numero;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setTipoConstruccion(String tipoConstruccion) {
        this.tipoConstruccion = tipoConstruccion;
    }

    public void setValorEstimado(double valorEstimado) {
        this.valorEstimado = valorEstimado;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
}
