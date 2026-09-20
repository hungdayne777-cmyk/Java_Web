<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Trang Chủ Admin</title>
        <style>
            .success-card {
                width: 360px;
                padding: 25px;
                border: 1px solid #28a745;
                background-color: #e8f8f0;
                border-radius: 8px;
                margin: 50px auto;
                text-align: center;
                box-shadow: 0 2px 5px rgba(0,0,0,0.1);
            }
            .success-title {
                color: #28a745;
                margin-top: 0;
            }
            .logout-btn {
                display: inline-block;
                margin-top: 15px;
                color: #007bff;
                text-decoration: none;
            }
        </style>
    </head>
    <body>
        <div class="success-card">
            <h2 class="success-title">Đăng nhập thành công</h2>
            <h3>Xin chào ${username}!</h3>
            <a class="logout-btn" href="DangNhap.jsp">⬅ Đăng xuất</a>
        </div>
    </body>
</html>