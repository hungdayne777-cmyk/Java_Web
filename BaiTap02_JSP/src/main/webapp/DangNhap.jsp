<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Đăng Nhập System</title>
        <style>
            .login-box {
                width: 320px;
                padding: 20px 25px;
                border: 1px solid #cccccc;
                border-radius: 8px;
                margin: 40px auto;
                background-color: #f9f9f9;
                box-shadow: 0 2px 5px rgba(0,0,0,0.1);
            }
            .form-group {
                margin-bottom: 15px;
            }
            .form-group label {
                display: block;
                margin-bottom: 5px;
                font-weight: bold;
            }
            .form-group input {
                width: 100%;
                padding: 8px;
                box-sizing: border-box;
                border: 1px solid #ccc;
                border-radius: 4px;
            }
            button {
                width: 100%;
                padding: 10px;
                background-color: #007bff;
                color: white;
                border: none;
                border-radius: 4px;
                cursor: pointer;
                font-size: 15px;
            }
            button:hover {
                background-color: #0056b3;
            }
            .error-msg {
                color: #d9534f;
                margin-top: 15px;
                text-align: center;
                font-weight: bold;
            }
        </style>
    </head>
    <body>
        <div class="login-box">
            <h2 style="text-align: center; margin-top: 0;">ĐĂNG NHẬP</h2>
            
            <form action="DangNhap" method="post">
                <div class="form-group">
                    <label>Tên đăng nhập:</label>
                    <input type="text" name="username" required placeholder="Nhập username">
                </div>
                
                <div class="form-group">
                    <label>Mật khẩu:</label>
                    <input type="password" name="password" required placeholder="Nhập password">
                </div>
                
                <button type="submit">Đăng nhập</button>
            </form>

         
            <c:if test="${not empty error}">
                <div class="error-msg">${error}</div>
            </c:if>
        </div>
    </body>
</html>