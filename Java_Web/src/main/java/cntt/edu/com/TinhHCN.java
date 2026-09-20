/*

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license

 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template

 */
package cntt.edu.com;

import java.io.IOException;

import java.io.PrintWriter;

import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;

import jakarta.servlet.http.HttpServlet;

import jakarta.servlet.http.HttpServletRequest;

import jakarta.servlet.http.HttpServletResponse;

/**
 *
 *
 *
 * @author PC_33
 *
 */
@WebServlet(name = "TinhHCN", urlPatterns = {"/TinhHCN"})

public class TinhHCN extends HttpServlet {

    /**
     *
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     *
     * methods.
     *
     *
     *
     * @param request servlet request
     *
     * @param response servlet response
     *
     * @throws ServletException if a servlet-specific error occurs
     *
     * @throws IOException if an I/O error occurs
     *
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {

            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");

            out.println("<html>");

            out.println("<head>");

            out.println("<title>Servlet TinhTong</title>");

            out.println("</head>");

            out.println("<body>");

            out.println("<h1>Servlet TinhTong at " + request.getContextPath() + "</h1>");

            out.println("</body>");

            out.println("</html>");

        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     *
     * Handles the HTTP <code>GET</code> method.
     *
     *
     *
     * @param request servlet request
     *
     * @param response servlet response
     *
     * @throws ServletException if a servlet-specific error occurs
     *
     * @throws IOException if an I/O error occurs
     *
     */
    @Override

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // processRequest(request, response);
        double chieuDai = Double.parseDouble(request.getParameter("chieuDai"));
        double chieuRong = Double.parseDouble(request.getParameter("chieuRong"));
        double CV = (chieuDai + chieuRong)*2;
        double DT = chieuDai * chieuRong;
        System.out.println("Đang dùng GET để tính");
        //processRequest(request, response);
        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {

            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");

            out.println("<html>");

            out.println("<head>");

            out.println("<title>Servlet TinhTong</title>");

            out.println("</head>");

            out.println("<body>");

            out.println("Kết quả phép tính Chu Vi: " + chieuDai + "+" + chieuRong + " x " + "2" + "=" + "<b>"+CV+"</b>");
            out.println("Kết quả phép tính Diện Tích: " + chieuDai + " x " + chieuRong + "=" + "<b>"+DT+"</b>");

            out.println("</body>");

            out.println("</html>");

        }

    }

    /**
     *
     * Handles the HTTP <code>POST</code> method.
     *
     *
     *
     * @param request servlet request
     *
     * @param response servlet response
     *
     * @throws ServletException if a servlet-specific error occurs
     *
     * @throws IOException if an I/O error occurs
     *
     */
    @Override

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        double chieuDai = Double.parseDouble(request.getParameter("chieuDai"));
        double chieuRong = Double.parseDouble(request.getParameter("chieuRong"));
        double CV = (chieuDai + chieuRong)*2;
        double DT = chieuDai * chieuRong;
        System.out.println("Đang dùng POST để tính");
        //processRequest(request, response);
        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {

            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");

            out.println("<html>");

            out.println("<head>");

            out.println("<title>Servlet TinhTong</title>");

            out.println("</head>");

            out.println("<body>");

            out.println("Kết quả phép tính Chu Vi: " + chieuDai + "+" + chieuRong + " x " + "2" + "=" + "<b>"+CV+"</b>");
            out.println("Kết quả phép tính Diện Tích: " + chieuDai + " x " + chieuRong + "=" + "<b>"+DT+"</b>");

            out.println("</body>");

            out.println("</html>");

        }

    }

    /**
     *
     * Returns a short description of the servlet.
     *
     *
     *
     * @return a String containing servlet description
     *
     */
    @Override

    public String getServletInfo() {

        return "Short description";

    }// </editor-fold>

}
