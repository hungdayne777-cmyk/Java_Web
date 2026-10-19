<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bài 5: Lọc Sinh Viên</title>
    </head>
    <body>
        <h2>LỌC SINH VIÊN THEO ĐIỂM TRUNG BÌNH</h2>

     
        <form action="LocSinhVien" method="get">
            <label>Mức điểm tối thiểu: </label>
            <input type="number" step="0.1" name="diemMin" value="${diemMin}" placeholder="Nhập điểm, ví dụ: 6.5">
            <button type="submit">Lọc</button>
        </form>

        <br>

    
        <table border="1" cellspacing="0" cellpadding="8">
            <thead>
                <tr style="background-color: #f2f2f2;">
                    <th>STT</th>
                    <th>Mã Sinh Viên</th>
                    <th>Họ và Tên</th>
                    <th>Điểm Trung Bình</th>
                </tr>
            </thead>
            <tbody>
                <c:choose>
                    <c:when test="${not empty list}">
                        <c:forEach var="sv" items="${list}" varStatus="loop">
                            <tr>
                                <td>${loop.count}</td>
                                <td>${sv.maSV}</td>
                                <td>${sv.hoTen}</td>
                                <td>${sv.diemTB}</td>
                            </tr>
                        </c:forEach>
                    </c:when>
                    <c:otherwise>
                        <tr>
                            <td colspan="4" style="text-align: center; color: red;">
                                Không có sinh viên nào đạt từ ${diemMin} điểm trở lên!
                            </td>
                        </tr>
                    </c:otherwise>
                </c:choose>
            </tbody>
        </table>
    </body>
</html>