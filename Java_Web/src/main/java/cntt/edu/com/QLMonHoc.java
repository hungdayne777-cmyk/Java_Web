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
@WebServlet(name = "MonHoc", urlPatterns = {"/MonHoc"})

public class QLMonHoc extends HttpServlet {

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
        String tenMH = request.getParameter("tenMH");
        String maMH = request.getParameter("maMH");
        String soTC = request.getParameter("soTC");
        String kq = "Mã Môn Học: " + maMH + "<br>" + "Tên Môn: " + tenMH + "<br>" + soTC;

        System.out.println("Đang dùng GET");
        //processRequest(request, response);
        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {

            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");

            out.println("<html>");

            out.println("<head>");
            out.println("    <meta charset='UTF-8'>");
            out.println("    <title>Thông Tin Môn Học</title>");
            out.println("    <style>");
            out.println("        * { box-sizing: border-box; margin: 0; padding: 0; font-family: 'Segoe UI', Arial, sans-serif; }");
            out.println("        body { background: #f1f5f9; display: flex; justify-content: center; align-items: center; min-height: 100vh; }");
            out.println("        .card { background: #ffffff; width: 100%; max-width: 420px; padding: 28px; border-radius: 12px; box-shadow: 0 10px 25px rgba(0,0,0,0.08); border-top: 5px solid #2563eb; }");
            out.println("        .card h2 { color: #1e293b; font-size: 1.35rem; text-align: center; margin-bottom: 20px; padding-bottom: 10px; border-bottom: 2px solid #f1f5f9; }");
            out.println("        .info-item { display: flex; justify-content: space-between; align-items: center; padding: 12px 0; border-bottom: 1px dashed #e2e8f0; }");
            out.println("        .info-item:last-child { border-bottom: none; }");
            out.println("        .label { color: #64748b; font-weight: 600; font-size: 0.95rem; }");
            out.println("        .value { color: #0f172a; font-weight: 700; font-size: 1rem; }");
            out.println("        .badge-tc { background-color: #dbeafe; color: #1d4ed8; padding: 4px 12px; border-radius: 20px; font-weight: 700; font-size: 0.9rem; }");
            out.println("        .btn-back { display: inline-block; width: 100%; text-decoration: none; background: linear-gradient(135deg, #3498db, #2980b9); color: white; padding: 12px; border-radius: 6px; font-weight: bold; font-size: 0.95rem; }");
            out.println("    </style>");
            out.println("    </style>");
            out.println("</head>");
            out.println("<body>");
            out.println("    <div class='card'>");
            out.println("        <h2>THÔNG TIN MÔN HỌC (GET)</h2>");
            out.println("        <div class='info-item'><span class='label'>Mã môn học:</span><span class='value'>" + (maMH != null ? maMH : "") + "</span></div>");
            out.println("        <div class='info-item'><span class='label'>Tên môn học:</span><span class='value'>" + (tenMH != null ? tenMH : "") + "</span></div>");
            out.println("        <div class='info-item'><span class='label'>Số tín chỉ:</span><span class='badge-tc'>" + (soTC != null ? soTC : "0") + " tín chỉ</span></div>");
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
        String tenMH = request.getParameter("tenMH");
        String maMH = request.getParameter("maMH");
        String soTC = request.getParameter("soTC");
        String kq = "Mã Môn Học: " + maMH + "<br>" + "Tên Môn: " + tenMH + "<br>" + soTC;

        System.out.println("Đang dùng POST");
        //processRequest(request, response);
        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {

            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");

            out.println("<html>");

            out.println("<head>");
            out.println("    <meta charset='UTF-8'>");
            out.println("    <title>Thông Tin Môn Học</title>");
            out.println("    <style>");
            out.println("        * { box-sizing: border-box; margin: 0; padding: 0; font-family: 'Segoe UI', Arial, sans-serif; }");
            out.println("        body { background: #f1f5f9; display: flex; justify-content: center; align-items: center; min-height: 100vh; }");
            out.println("        .card { background: #ffffff; width: 100%; max-width: 420px; padding: 28px; border-radius: 12px; box-shadow: 0 10px 25px rgba(0,0,0,0.08); border-top: 5px solid #2563eb; }");
            out.println("        .card h2 { color: #1e293b; font-size: 1.35rem; text-align: center; margin-bottom: 20px; padding-bottom: 10px; border-bottom: 2px solid #f1f5f9; }");
            out.println("        .info-item { display: flex; justify-content: space-between; align-items: center; padding: 12px 0; border-bottom: 1px dashed #e2e8f0; }");
            out.println("        .info-item:last-child { border-bottom: none; }");
            out.println("        .label { color: #64748b; font-weight: 600; font-size: 0.95rem; }");
            out.println("        .value { color: #0f172a; font-weight: 700; font-size: 1rem; }");
            out.println("        .badge-tc { background-color: #dbeafe; color: #1d4ed8; padding: 4px 12px; border-radius: 20px; font-weight: 700; font-size: 0.9rem; }");
            out.println("        .btn-back { display: inline-block; width: 100%; text-decoration: none; background: linear-gradient(135deg, #3498db, #2980b9); color: white; padding: 12px; border-radius: 6px; font-weight: bold; font-size: 0.95rem; }");
            out.println("    </style>");
            out.println("    </style>");
            out.println("</head>");
            out.println("<body>");
            out.println("    <div class='card'>");
            out.println("        <h2>THÔNG TIN MÔN HỌC (POST)</h2>");
            out.println("        <div class='info-item'><span class='label'>Mã môn học:</span><span class='value'>" + (maMH != null ? maMH : "") + "</span></div>");
            out.println("        <div class='info-item'><span class='label'>Tên môn học:</span><span class='value'>" + (tenMH != null ? tenMH : "") + "</span></div>");
            out.println("        <div class='info-item'><span class='label'>Số tín chỉ:</span><span class='badge-tc'>" + (soTC != null ? soTC : "0") + " tín chỉ</span></div>");
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
