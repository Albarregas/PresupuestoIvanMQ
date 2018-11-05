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
@WebServlet(name = "Eleccion", urlPatterns = {"/Eleccion"})
public class Eleccion extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String url = "JSTL/";
        EleccionBean eleccion = new EleccionBean();
        
        //el checkbox de presupuesto edificio esta seleccionado es diferente de null
        if ( request.getParameter("edificios") != null ) {
            eleccion.setEdificio(true);
            url+="Edificio.jsp";
        } else {
             eleccion.setEdificio(false);
        }
        
        //el checkbox de presupuesto contenido esta seleccionado es diferente de null
        if ( request.getParameter("contenido") != null ) {
            eleccion.setContenido(true);
            if ( url.equals("")){
                url+="Contenido.jsp";
            }
        } else {
            eleccion.setContenido(false);
        }
        
        HttpSession sesionEleccion = request.getSession();
        sesionEleccion.setAttribute("eleccion", eleccion);
        
        request.getRequestDispatcher(url).forward(request, response);
        
    }


}
