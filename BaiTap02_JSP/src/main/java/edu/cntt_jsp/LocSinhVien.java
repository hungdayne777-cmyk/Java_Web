/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package edu.cntt_jsp;

import Model.SinhVien;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MSI
 */
@WebServlet(name = "LocSinhVien", urlPatterns = {"/LocSinhVien"})
public class LocSinhVien extends HttpServlet {

    private List<SinhVien> layDanhSachGoc() {
        List<SinhVien> list = new ArrayList<>();
        list.add(new SinhVien("SV01", "Nguyễn Thái Hưng", 8.5));
        list.add(new SinhVien("SV02", "Trần Thị B", 6.0));
        list.add(new SinhVien("SV03", "Lê Văn C", 9.2));
        list.add(new SinhVien("SV04", "Phạm Đăng D", 4.5));
        list.add(new SinhVien("SV05", "Hoàng Anh E", 7.0));
        return list;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */}
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LocSinhVien</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LocSinhVien at " + request.getContextPath() + "</h1>");
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
        List<SinhVien> dsGoc = layDanhSachGoc();
        List<SinhVien> dsKetQua = new ArrayList<>();    
        String minStr = request.getParameter("diemMin");

        if (minStr != null && !minStr.trim().isEmpty()) {
            try {
                double diemMin = Double.parseDouble(minStr);

              
                for (SinhVien sv : dsGoc) {
                    if (sv.getDiemTB() >= diemMin) {
                        dsKetQua.add(sv);
                    }
                }
                request.setAttribute("diemMin", diemMin);
            } catch (NumberFormatException e) {
                dsKetQua = dsGoc;
            }
        } else {
            
            dsKetQua = dsGoc;
        }

        
        request.setAttribute("list", dsKetQua);
        request.getRequestDispatcher("/LocSinhVien.jsp").forward(request, response);
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
        doGet(request, response);
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
