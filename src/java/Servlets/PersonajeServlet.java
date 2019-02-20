
package Servlets;


import Logica.Bellota;
import Logica.Campana;
import Logica.FlorDeFuego;
import Logica.FlorDeHielo;
import Logica.Luigi;
import Logica.Mario;
import Logica.Personaje;
import Logica.PowerUp;
import Logica.Toad;
import Logica.Yoshi;
import Logica.YoshiAmarillo;
import Logica.YoshiAzul;
import Logica.YoshiRosa;
import Logica.YoshiVerde;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "PersonajeServlet", urlPatterns = {"/PersonajeServlet"})
public class PersonajeServlet extends HttpServlet {
    
    static Yoshi y;
    static PowerUp poder;
    static Personaje per;
    
    String estado="nada";
    
    public static void liskov1(Yoshi p){
        p.setImagen();
        p.setPoder();
        
        y=p;
    }
    
    public static void liskov2(PowerUp p){
        p.setAspecto();
        p.setHabilidad();
        
        poder=p;
    }
    
    public static void liskov3(Personaje p){
        p.setApariencia(poder.getAspecto());
        p.setDescripcion();
        p.setSalto();
        p.setVelocidad();
        
        per=p;
    }
    
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
        response.setContentType("text/html;charset=UTF-8");
        
        if("YV".equals(request.getParameter("Tipo_m"))){
             liskov1(new YoshiVerde());
        } else if("YAZ".equals(request.getParameter("Tipo_m"))){
             liskov1(new YoshiAzul());
        }else if("YR".equals(request.getParameter("Tipo_m"))){
             liskov1(new YoshiRosa());
        }else if("YA".equals(request.getParameter("Tipo_m"))){
             liskov1(new YoshiAmarillo());
        }else if("N".equals(request.getParameter("Tipo_m"))){
             liskov1(new Yoshi());
        }
       
        
        if("FF".equals(request.getParameter("Tipo_p"))){
             liskov2(new FlorDeFuego());
             estado=poder.getClass().getSimpleName();
        } else if("FH".equals(request.getParameter("Tipo_p"))){
             liskov2(new FlorDeHielo());
             estado=poder.getClass().getSimpleName();
        }else if("B".equals(request.getParameter("Tipo_p"))){
             liskov2(new Bellota());
             estado=poder.getClass().getSimpleName();
        }else if("C".equals(request.getParameter("Tipo_p"))){
             liskov2(new Campana());
             estado=poder.getClass().getSimpleName();
        }else if("N".equals(request.getParameter("Tipo_p"))){
             liskov2(new PowerUp());
        }
        
        if("Mario".equals(request.getParameter("Tipo_c"))){
             liskov3(new Mario());
        } else if("Luigi".equals(request.getParameter("Tipo_c"))){
             liskov3(new Luigi());
        }else if("Toad".equals(request.getParameter("Tipo_c"))){
             liskov3(new Toad());
        }
        
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet personaje</title>");  
            out.println("<link type=\"text/css\" rel=\"stylesheet\" href=\"EstiloServlets.css\"/>");
            out.println("</head>");
            out.println("<body>");
            out.println("<table border=2>");
            
            out.println("<tr>");
                out.println("<td colspan=2>");
                out.println("<h2>Tu personaje es: </h2>");  
                out.println("</td>");     
               
            out.println("</tr>");
           
            out.println("<tr>");
                
                        
               out.println("<td colspan=2>");
               
               out.println("<img src="+per.getApariencia()+"></img>");
               out.println("<img src="+y.getImagen()+"></img>");
               
               out.println("</td>");   
               
            out.println("</tr>");
            
            out.println("<tr>");
               
                out.println("<td>");
                    out.println("<h2>Protagonista: </h2>");
               out.println("</td>");   
                
               out.println("<td>");
               out.println("<h2>"+per.getClass().getSimpleName()+" con "+estado+"</h2>");
               out.println("</td>");
               
            
            out.println("</tr>");
            
            out.println("<tr>");
                out.println("<td>");
                    out.println("<h2>Descripcion: </h2>");
               out.println("</td>");   
                
               out.println("<td>");
               out.println("<h2>"+per.getDescripcion()+"</h2>");
               out.println("</td>");
            
            out.println("</tr>");
            
            out.println("<tr>");
               
                out.println("<td>");
                    out.println("<h2>Salto: </h2>");
               out.println("</td>");   
                
               out.println("<td>");
               out.println("<h2>"+per.getSalto()+" puntos</h2>");
               out.println("</td>");
            
            out.println("</tr>");
            
            out.println("<tr>");
               
                out.println("<td>");
                    out.println("<h2>Velocidad: </h2>");
               out.println("</td>");   
                
               out.println("<td>");
               out.println("<h2>"+per.getVelocidad()+" puntos</h2>");
               out.println("</td>");
            
            out.println("</tr>");
            
            out.println("<tr>");
               
                out.println("<td>");
                    out.println("<h2>Power up: </h2>");
               out.println("</td>");   
                
               out.println("<td>");
               out.println("<h2>"+poder.getHabilidad()+"</h2>");
               out.println("</td>");
            
            out.println("</tr>");
            
            out.println("<tr>");
                
                out.println("<td>");
                    out.println("<h2>Yoshi: </h2>");
               out.println("</td>");   
                
               out.println("<td>");
               out.println("<h2>"+y.getPoder()+"</h2>");
               out.println("</td>");
            
            out.println("</tr>");
            
            out.println("<tr>");
                
                    out.println("<td colspan=2><a href=\"index.jsp\">Hacer nuevo personaje</a></td>");  
            
            out.println("</tr>");
              
            out.println("</table>");
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
