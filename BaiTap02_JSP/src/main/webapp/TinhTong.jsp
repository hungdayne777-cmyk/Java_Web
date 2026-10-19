<%@page contentType="text/html" pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tính tổng hai số</title>
    </head>
    <body>
    
                  <h2>TÍNH TỔNG HAI SỐ</h2>
                <form action="Tinh-Tong" method="post">
                    Số a: <input type="number" step="any" name="a" required><br><br>
                    Số b: <input type="number" step="any" name="b" required><br><br>
                    <button type="submit">Tính tổng</button>
                </form>
                <h2>KẾT QUẢ TÍNH TỔNG</h2>
                <p>Số thứ nhất (a): <strong>${a}</strong></p>
                <p>Số thứ hai (b): <strong>${b}</strong></p>
                <hr>
                <h3>Tổng là: <span style="color: red;">${tong}</span></h3>
                <br>
            
          

          
          
          
           
     
    </body>
</html>