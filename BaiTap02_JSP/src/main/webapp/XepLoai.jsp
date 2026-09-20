<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Xếp loại sinh viên</title>
</head>
<body>
    <form action="XepLoai" method="post">
                    Điểm Sinh Viên: <input type="number" step="any" name="diem" required><br><br>
                   
                    <button type="submit">Nhập</button>
                </form>
   <c:if test="${not empty diem}">
        <hr>
        <p>Điểm vừa nhập: <strong>${diem}</strong></p>
        <p>Xếp loại: 
            <strong>
                <c:choose>
                    <c:when test="${diem >= 8.0}">
                        <span style="color: green;">Giỏi</span>
                    </c:when>
                    <c:when test="${diem >= 6.5}">
                        <span style="color: blue;">Khá</span>
                    </c:when>
                    <c:when test="${diem >= 5.0}">
                        <span style="color: orange;">Trung bình</span>
                    </c:when>
                    <c:otherwise>
                        <span style="color: red;">Không đạt</span>
                    </c:otherwise>
                </c:choose>
            </strong>
        </p>
    </c:if>
    </p>
</body>
</html>