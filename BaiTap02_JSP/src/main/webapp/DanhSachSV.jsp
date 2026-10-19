<%-- 
    Document   : DanhSachSV
    Created on : Sep 20, 2026, 1:05:32 PM
    Author     : MSI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Danh Sách SV</title>
    </head>
    <body>
       <h2>DANH SÁCH SINH VIÊN</h2>

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
            <c:forEach var="sv" items="${list}" varStatus="loop">
                <tr>
                    <td>${loop.count}</td>
                    <td>${sv.maSV}</td>
                    <td>${sv.hoTen}</td>
                    <td>${sv.diemTB}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    </body>
</html>
