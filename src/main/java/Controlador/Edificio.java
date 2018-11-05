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
import javax.servlet.http.HttpSession;

/**
 *
 * @author ivan9
 */
@WebServlet(name = "Edificio", urlPatterns = {"/Edificio"})
public class Edificio extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String url = "JSP/";
        
        EdificioBean datosEdificio = new EdificioBean();
        CalcularCuota calcula = new CalcularCuota();
        datosEdificio.setFecha(request.getParameter("fecha"));
        datosEdificio.setNumeroHabitaciones(Integer.parseInt(request.getParameter("habitaciones")));
        datosEdificio.setTipo(request.getParameter("tipo"));
        datosEdificio.setTipoConstruccion(request.getParameter("tipoConstr"));
        datosEdificio.setValorEstimado(Double.parseDouble(request.getParameter("valor")));

        
        double valor = calcula.calcularEdificio(datosEdificio);
        
        datosEdificio.setValorTotal(valor);
        HttpSession sesion = request.getSession();
        EleccionBean eleccion = (EleccionBean) sesion.getAttribute("eleccion");
        if ( eleccion.isContenido() ) {
            url += "Contenido.jsp";
        } else {
            url += "Cuota.jsp";
        }
        
        sesion.setAttribute("edificio", datosEdificio);
        request.getRequestDispatcher(url).forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
