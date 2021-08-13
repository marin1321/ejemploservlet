package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import negocios.Alumno;

@WebServlet(name = "muestraRegistro", urlPatterns = {"/muestraRegistro"})
public class muestraRegistro extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String nombre = request.getParameter("nombre");
            String apellidos = request.getParameter("apellidos");
            Double promedio = Double.parseDouble(request.getParameter("prom"));
            Alumno alumno = new Alumno(nombre, apellidos, promedio);
//TODO output your page here, no hacer
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet muestraRegistro</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet muestraRegistro at "
                    + request.getContextPath() + "</h1>");
            out.println("<h2> Este es el Servlet muestraRegistro.java ficha 1964179 </h2>");
            out.println("<h3> A continuación se muestran los parámetros recibidos</h3 >        ");
            out.println(alumno);
            out.println("</body>");
            out.println("</html>");
        }
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
