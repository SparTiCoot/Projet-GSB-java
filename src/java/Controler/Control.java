/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import DAO.DAO;
import DAO.Connect;
import Modele.Pays;
import Modele.Dep;
import Modele.Med;
import Modele.Spe;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Map;
import java.util.TreeSet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sio
 */
public class Control extends HttpServlet {

    private Modele.Pays p;

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        p = new Pays();
    }

    public void destroy() {
        Connect.close();
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
        String action = request.getParameter("action");
        if (action == null) {
            action = "menu";
        }
        String page = "";
        switch (action) {
            case "menu":
                page = "Menu.jsp";
                break;

            case "choixDep":
                request.setAttribute("tabLesDeps", p.getLesDeps());
                page = "FormMedParDep.jsp";
                break;

            case "choixNom":
                page = "FormMedParNom.jsp";
                break;
                
            case "choixSpecialite":
                request.setAttribute("tabLesSpes", p.getLesSpes());                
                page = "FormMedParSpecialite.jsp";
                break;

            case "affichLesMeds":
                String unDep = request.getParameter("unDep");
                Dep leDep = p.getLeDep(unDep);
                Collection<Med> lesMeds = leDep.getLesMeds();
                page = "affichLesMeds.jsp";
                request.setAttribute("tabLesMeds", lesMeds);
                break;

            case "affichLesMedsParSpecialite":
                String uneSpe = request.getParameter("uneSpe");
                Spe laSpe = p.getLaSpe(uneSpe);
                Collection<Med> lesMedsS = laSpe.getLesMeds();
                page = "affichLesMeds.jsp";
                request.setAttribute("tabLesMedsS", lesMedsS);
                break;
                
            case "affichLesMedsNom":
                String nomMed = request.getParameter("nomMed");
                Collection<Med> resultMeds = new TreeSet<>();
                for (Dep d : p.getLesDeps()) {
                    for (Med m : d.getLesMeds()) {
                        if (m.getNom().startsWith(nomMed)) {
                            resultMeds.add(m);
                        }
                    }
                }
                page = "affichLesMeds.jsp";
                request.setAttribute("tabLesMedsNom", resultMeds);
        }
        request.getRequestDispatcher(page).forward(request, response);

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
