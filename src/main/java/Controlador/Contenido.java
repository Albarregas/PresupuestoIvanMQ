/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ivan9
 */
@WebServlet(name = "Contenido", urlPatterns = {"/Contenido"})
public class Contenido extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        ContenidoBean datosContenido = new ContenidoBean();
        CalcularCuota cuota = new CalcularCuota();
        
        datosContenido.setCantidad(Double.parseDouble(request.getParameter("cantidad")));
        if (request.getParameter("cubrir") == null) {
            datosContenido.setCubrir(false);
        } else {
            datosContenido.setCubrir(true);
        }
        datosContenido.setFranquicia(Double.parseDouble(request.getParameter("franquicia")));
        datosContenido.setTotal(cuota.calcularContenido(datosContenido));
        request.setAttribute("contenido", datosContenido);
        
    }

}
