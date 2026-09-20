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
import javax.swing.JOptionPane;

/**
 *
 *
 *
 * @author PC_33
 *
 */
@WebServlet(name = "DangNhap", urlPatterns = {"/DangNhap"})

public class DangNhap extends HttpServlet {

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
        String uname = request.getParameter("username");
        String pass = request.getParameter("pass");
        String kq = "";
        boolean thanhcong = false;
        if(uname != null && pass != null){
        if(uname.trim().equals("admin") && pass.trim().equals("123"))
        {
            kq = "Đăng Nhập Thành Công bằng GET " + uname;
            thanhcong=true;
        }
        else{
        kq="Tên Đăng Nhập Hoặc MK không chính xác";
        }
        }
        else{
        kq="Nhập đầy đủ UserName và Pass";
        }
        System.out.println("Đang dùng GET để đăng nhập");
        //processRequest(request, response);
        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {

            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");

            out.println("<html>");

           out.println("<head>");
            out.println("    <meta charset='UTF-8'>");
            out.println("    <title>Kết Quả Đăng Nhập</title>");
            out.println("    <style>");
            out.println("        * { box-sizing: border-box; margin: 0; padding: 0; font-family: 'Segoe UI', Arial, sans-serif; }");
            out.println("        body { background: linear-gradient(135deg, #e0eafc, #cfdef3); display: flex; justify-content: center; align-items: center; min-height: 100vh; }");
            out.println("        .card { background: #ffffff; padding: 35px 30px; border-radius: 12px; box-shadow: 0 10px 25px rgba(0,0,0,0.1); width: 100%; max-width: 400px; text-align: center; }");
            out.println("        .msg { font-size: 1.1rem; font-weight: bold; margin-bottom: 20px; padding: 15px; border-radius: 8px; }");
            out.println("        .success { background: #d4edda; color: #155724; border: 1px solid #c3e6cb; }");
            out.println("        .error { background: #f8d7da; color: #721c24; border: 1px solid #f5c6cb; }");
            out.println("        .btn-back { display: inline-block; width: 100%; text-decoration: none; background: linear-gradient(135deg, #3498db, #2980b9); color: white; padding: 12px; border-radius: 6px; font-weight: bold; font-size: 0.95rem; }");
            out.println("    </style>");
            out.println("</head>");
            out.println("<body>");

          out.println("<body>");
            out.println("    <div class='card'>");
            out.println("        <div class='msg " + (thanhcong ? "success" : "error") + "'>" + kq + "</div>");
            out.println("        <a href='FormDangNhap.html' class='btn-back'>← Quay lại trang đăng nhập</a>");
            out.println("    </div>");
            out.println("</body>");

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
        String uname = request.getParameter("username");
        String pass = request.getParameter("pass");
         String kq = "";
        boolean thanhcong = false;
        if(uname != null && pass != null){
        if(uname.trim().equals("admin") && pass.trim().equals("123"))
        {
            kq = "Đăng Nhập Thành Công bằng POST " + uname;
            thanhcong=true;
        }
        else{
        kq="Tên Đăng Nhập Hoặc MK không chính xác";
        }
        }
        else{
        kq="Nhập đầy đủ UserName và Pass";
        }
        System.out.println("Đang dùng POST để đăng nhập");
        //processRequest(request, response);
        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {

            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");

            out.println("<html>");

            out.println("<head>");
            out.println("    <meta charset='UTF-8'>");
            out.println("    <title>Kết Quả Đăng Nhập</title>");
            out.println("    <style>");
            out.println("        * { box-sizing: border-box; margin: 0; padding: 0; font-family: 'Segoe UI', Arial, sans-serif; }");
            out.println("        body { background: linear-gradient(135deg, #e0eafc, #cfdef3); display: flex; justify-content: center; align-items: center; min-height: 100vh; }");
            out.println("        .card { background: #ffffff; padding: 35px 30px; border-radius: 12px; box-shadow: 0 10px 25px rgba(0,0,0,0.1); width: 100%; max-width: 400px; text-align: center; }");
            out.println("        .msg { font-size: 1.1rem; font-weight: bold; margin-bottom: 20px; padding: 15px; border-radius: 8px; }");
            out.println("        .success { background: #d4edda; color: #155724; border: 1px solid #c3e6cb; }");
            out.println("        .error { background: #f8d7da; color: #721c24; border: 1px solid #f5c6cb; }");
            out.println("        .btn-back { display: inline-block; width: 100%; text-decoration: none; background: linear-gradient(135deg, #3498db, #2980b9); color: white; padding: 12px; border-radius: 6px; font-weight: bold; font-size: 0.95rem; }");
            out.println("    </style>");
            out.println("</head>");

          out.println("<body>");
            out.println("    <div class='card'>");
            out.println("        <div class='msg " + (thanhcong ? "success" : "error") + "'>" + kq + "</div>");
            out.println("        <a href='FormDangNhap.html' class='btn-back'>← Quay lại trang đăng nhập</a>");
            out.println("    </div>");
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
