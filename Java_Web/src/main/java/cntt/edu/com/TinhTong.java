package cntt.edu.com;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "TinhTong", urlPatterns = {"/TinhTong"})
public class TinhTong extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        double soA = Double.parseDouble(request.getParameter("soA"));
        double soB = Double.parseDouble(request.getParameter("soB"));
        double kq = soA + soB;

        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Kết Quả Tính Tổng</title>");
            
            // Khối CSS viết trong thẻ <style>
            out.println("<style>");
            out.println("  body { font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif; background-color: #eef2f5; display: flex; justify-content: center; align-items: center; height: 100vh; margin: 0; }");
            out.println("  .card { background-color: #ffffff; padding: 30px; border-radius: 12px; box-shadow: 0 4px 20px rgba(0, 0, 0, 0.08); text-align: center; width: 360px; }");
            out.println("  .title { color: #2c3e50; font-size: 20px; font-weight: bold; margin-bottom: 20px; border-bottom: 2px solid #28a745; padding-bottom: 8px; }");
            out.println("  .result { font-size: 18px; color: #495057; margin: 20px 0; }");
            out.println("  .result b { color: #28a745; font-size: 24px; }");
            out.println("  .btn-back { display: inline-block; margin-top: 15px; padding: 10px 20px; background-color: #28a745; color: white; text-decoration: none; border-radius: 6px; font-weight: 500; transition: 0.3s; }");
            out.println("  .btn-back:hover { background-color: #218838; }");
            out.println("</style>");
            
            out.println("</head>");
            out.println("<body>");

            out.println("<div class='card'>");
            out.println("  <div class='title'>KẾT QUẢ PHÉP CỘNG</div>");
            out.println("  <div class='result'>");
            out.println("    " + soA + " + " + soB + " = <b>" + kq + "</b>");
            out.println("  </div>");
            out.println("  <a href='javascript:history.back()' class='btn-back'>← Quay lại</a>");
            out.println("</div>");

            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("Đang dùng GET để tính");
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("Đang dùng POST để tính");
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Servlet TinhTong có giao diện CSS";
    }
}