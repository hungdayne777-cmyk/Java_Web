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
@WebServlet(name = "SinhVien", urlPatterns = {"/SinhVien"})

public class ThongTinSV extends HttpServlet {

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
        String tenSV = request.getParameter("hoTen");
        String maSV = request.getParameter("maSV");
        String lop = request.getParameter("Lop");
        String email = request.getParameter("Email");
        String ngaySinh = request.getParameter("NgaySinh");
        String kq = "Mã Sinh Viên: " + maSV + "<br>" + "Họ Tên: " + tenSV + "<br>" + "Lớp: " + lop + "<br>" + email + "<br>" + ngaySinh;

        System.out.println("Đang dùng GET");
        //processRequest(request, response);
        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {

            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");

            out.println("<html>");

            out.println("<head>");
            out.println("    <meta charset='UTF-8'>");
            out.println("    <title>Thông Tin Sinh Viên (GET)</title>");
            out.println("    <style>");
            out.println("        * { box-sizing: border-box; margin: 0; padding: 0; font-family: 'Segoe UI', Arial, sans-serif; }");
            out.println("        body { background-color: #f1f5f9; display: flex; justify-content: center; align-items: center; min-height: 100vh; }");
            out.println("        .profile-card { background: #ffffff; width: 100%; max-width: 450px; padding: 28px; border-radius: 12px; box-shadow: 0 10px 25px rgba(0,0,0,0.08); border-top: 5px solid #0284c7; }");
            out.println("        .profile-card h2 { color: #0f172a; font-size: 1.35rem; text-align: center; margin-bottom: 20px; padding-bottom: 10px; border-bottom: 2px solid #f1f5f9; text-transform: uppercase; }");
            out.println("        .info-item { display: flex; justify-content: space-between; align-items: center; padding: 12px 0; border-bottom: 1px dashed #e2e8f0; }");
            out.println("        .info-item:last-child { border-bottom: none; }");
            out.println("        .label { color: #64748b; font-weight: 600; font-size: 0.95rem; }");
            out.println("        .value { color: #0f172a; font-weight: 700; font-size: 0.95rem; }");
            out.println("        .badge-class { background-color: #e0f2fe; color: #0369a1; padding: 4px 12px; border-radius: 20px; font-weight: 700; font-size: 0.85rem; }");
            out.println("        .btn-back { display: inline-block; width: 100%; text-decoration: none; background: linear-gradient(135deg, #3498db, #2980b9); color: white; padding: 12px; border-radius: 6px; font-weight: bold; font-size: 0.95rem; }");
            out.println("    </style>");
            out.println("    </style>");
            out.println("</head>");
            out.println("<body>");
            out.println("    <div class='profile-card'>");
            out.println("        <h2>THÔNG TIN SINH VIÊN (GET)</h2>");
            out.println("        <div class='info-item'><span class='label'>Mã sinh viên:</span><span class='value'>" + (maSV != null ? maSV : "") + "</span></div>");
            out.println("        <div class='info-item'><span class='label'>Họ và tên:</span><span class='value'>" + (tenSV != null ? tenSV : "") + "</span></div>");
            out.println("        <div class='info-item'><span class='label'>Lớp:</span><span class='badge-class'>" + (lop != null ? lop : "") + "</span></div>");
            out.println("        <div class='info-item'><span class='label'>Email:</span><span class='value'>" + (email != null ? email : "") + "</span></div>");
            out.println("        <div class='info-item'><span class='label'>Ngày Sinh:</span><span class='value'>" + (ngaySinh != null ? ngaySinh : "") + "</span></div>");
            out.println("<a href='ThongTinSV.html' class='btn-back' style='display: block; text-align: center;'>← Quay lại Nhập Thông Tin</a>");
            out.println("    </div>");
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
        String tenSV = request.getParameter("hoTen");
        String maSV = request.getParameter("maSV");
        String lop = request.getParameter("Lop");
        String email = request.getParameter("Email");
        String ngaySinh = request.getParameter("NgaySinh");
        String kq = "Mã Sinh Viên: " + maSV + "<br>" + "Họ Tên: " + tenSV + "<br>" + "Lớp: " + lop + "<br>" + email + "<br>" + ngaySinh;
        System.out.println("Đang dùng POST");
        //processRequest(request, response);
        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {

            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");

            out.println("<html>");

            out.println("<head>");
            out.println("    <meta charset='UTF-8'>");
            out.println("    <title>Thông Tin Sinh Viên (POST)</title>");
            out.println("    <style>");
            out.println("        * { box-sizing: border-box; margin: 0; padding: 0; font-family: 'Segoe UI', Arial, sans-serif; }");
            out.println("        body { background-color: #f1f5f9; display: flex; justify-content: center; align-items: center; min-height: 100vh; }");
            out.println("        .profile-card { background: #ffffff; width: 100%; max-width: 450px; padding: 28px; border-radius: 12px; box-shadow: 0 10px 25px rgba(0,0,0,0.08); border-top: 5px solid #0284c7; }");
            out.println("        .profile-card h2 { color: #0f172a; font-size: 1.35rem; text-align: center; margin-bottom: 20px; padding-bottom: 10px; border-bottom: 2px solid #f1f5f9; text-transform: uppercase; }");
            out.println("        .info-item { display: flex; justify-content: space-between; align-items: center; padding: 12px 0; border-bottom: 1px dashed #e2e8f0; }");
            out.println("        .info-item:last-child { border-bottom: none; }");
            out.println("        .label { color: #64748b; font-weight: 600; font-size: 0.95rem; }");
            out.println("        .value { color: #0f172a; font-weight: 700; font-size: 0.95rem; }");
            out.println("        .badge-class { background-color: #e0f2fe; color: #0369a1; padding: 4px 12px; border-radius: 20px; font-weight: 700; font-size: 0.85rem; }");
            out.println("        .btn-back { display: inline-block; width: 100%; text-decoration: none; background: linear-gradient(135deg, #3498db, #2980b9); color: white; padding: 12px; border-radius: 6px; font-weight: bold; font-size: 0.95rem; }");
            out.println("    </style>");
            out.println("    </style>");
            out.println("</head>");
            out.println("<body>");
            out.println("    <div class='profile-card'>");
            out.println("        <h2>THÔNG TIN SINH VIÊN (POST)</h2>");
            out.println("        <div class='info-item'><span class='label'>Mã sinh viên:</span><span class='value'>" + (maSV != null ? maSV : "") + "</span></div>");
            out.println("        <div class='info-item'><span class='label'>Họ và tên:</span><span class='value'>" + (tenSV != null ? tenSV : "") + "</span></div>");
            out.println("        <div class='info-item'><span class='label'>Lớp:</span><span class='badge-class'>" + (lop != null ? lop : "") + "</span></div>");
            out.println("        <div class='info-item'><span class='label'>Email:</span><span class='value'>" + (email != null ? email : "") + "</span></div>");
            out.println("        <div class='info-item'><span class='label'>Ngày Sinh:</span><span class='value'>" + (ngaySinh != null ? ngaySinh : "") + "</span></div>");
            out.println("<a href='ThongTinSV.html' class='btn-back' style='display: block; text-align: center;'>← Quay lại Nhập Thông Tin</a>");
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
