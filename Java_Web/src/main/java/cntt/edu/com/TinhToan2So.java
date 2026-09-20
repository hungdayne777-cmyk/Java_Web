package cntt.edu.com;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "TinhToan2So", urlPatterns = {"/TinhToan2So"})
public class TinhToan2So extends HttpServlet {

    protected void processCalculator(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        double soA = Double.parseDouble(request.getParameter("soA"));
        double soB = Double.parseDouble(request.getParameter("soB"));
        String phepTinh = request.getParameter("phepTinh");

        double kq = 0;
        String dau = "+";
        String thongBaoLoi = "";

        if ("cong".equals(phepTinh)) {
            kq = soA + soB;
            dau = "+";
        } else if ("tru".equals(phepTinh)) {
            kq = soA - soB;
            dau = "-";
        } else if ("nhan".equals(phepTinh)) {
            kq = soA * soB;
            dau = "×";
        } else if ("chia".equals(phepTinh)) {
            dau = "÷";
            if (soB != 0) {
                kq = soA / soB;
            } else {
                thongBaoLoi = "Không thể chia cho 0!";
            }
        }

        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Kết Quả Tính Toán</title>");
            
            // Khối CSS viết trực tiếp trong thẻ <style>
            out.println("<style>");
            out.println("  body { font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif; background-color: #f4f6f9; display: flex; justify-content: center; align-items: center; height: 100vh; margin: 0; }");
            out.println("  .card { background-color: #ffffff; padding: 30px; border-radius: 12px; box-shadow: 0 4px 15px rgba(0,0,0,0.1); text-align: center; width: 380px; }");
            out.println("  .title { color: #333333; font-size: 20px; margin-bottom: 20px; border-bottom: 2px solid #007bff; padding-bottom: 10px; }");
            out.println("  .result { font-size: 18px; color: #495057; margin: 15px 0; }");
            out.println("  .result b { color: #28a745; font-size: 22px; }");
            out.println("  .error { color: #dc3545; font-weight: bold; font-size: 18px; }");
            out.println("  .btn-back { display: inline-block; margin-top: 20px; padding: 8px 16px; background-color: #007bff; color: #fff; text-decoration: none; border-radius: 6px; font-size: 14px; transition: 0.2s; }");
            out.println("  .btn-back:hover { background-color: #0056b3; }");
            out.println("</style>");
            
            out.println("</head>");
            out.println("<body>");
            
            out.println("<div class='card'>");
            out.println("  <div class='title'>KẾT QUẢ TÍNH TOÁN</div>");

            if (!thongBaoLoi.isEmpty()) {
                out.println("  <div class='error'>" + thongBaoLoi + "</div>");
            } else {
                out.println("  <div class='result'>");
                out.println("    " + soA + " " + dau + " " + soB + " = <b>" + kq + "</b>");
                out.println("  </div>");
            }

            out.println("  <a href='javascript:history.back()' class='btn-back'>← Quay lại</a>");
            out.println("</div>");

            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processCalculator(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processCalculator(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Servlet TinhToan2So có hỗ trợ CSS giao diện";
    }
}