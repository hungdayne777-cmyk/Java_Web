<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div id="tab-dashboard" class="tab-content-section active">

    <div class="row g-3 mb-4">
        <!-- 1. Tổng Khoa -->
        <div class="col-12 col-sm-6 col-xl-3">
            <a href="${pageContext.request.contextPath}/khoa?action=list" class="text-decoration-none">
                <div class="card border-0 shadow-sm rounded-4 p-3 style-card-primary h-100 transition-card">
                    <div class="d-flex justify-content-between align-items-center">
                        <div>
                            <p class="text-muted mb-1 fw-semibold">Tổng Số Khoa</p>
                            <h2 class="fw-bold text-dark mb-0"><div class="number">${totalKhoa}</div></h2>
                        </div>
                        <div class="stat-icon bg-primary-subtle text-primary p-3 rounded-4">
                            <i class="fa-solid fa-graduation-cap fa-2x"></i>
                        </div>
                    </div>
                </div>
            </a>
        </div>


        <div class="col-12 col-sm-6 col-xl-3">
            <a href="${pageContext.request.contextPath}/sinhvien?action=list" class="text-decoration-none">
                <div class="card border-0 shadow-sm rounded-4 p-3 style-card-success h-100 transition-card">
                    <div class="d-flex justify-content-between align-items-center">
                        <div>
                            <p class="text-muted mb-1 fw-semibold">Tổng Sinh Viên</p>
                            <h2 class="fw-bold text-dark mb-0"><div class="number">${totalSV}</div></h2>
                        </div>
                        <div class="stat-icon bg-success-subtle text-success p-3 rounded-4">
                            <i class="fa-solid fa-users fa-2x"></i>
                        </div>
                    </div>
                </div>
            </a>
        </div>

  
        <div class="col-12 col-sm-6 col-xl-3">
            <a href="${pageContext.request.contextPath}/monhoc?action=list" class="text-decoration-none">
                <div class="card border-0 shadow-sm rounded-4 p-3 style-card-warning h-100 transition-card">
                    <div class="d-flex justify-content-between align-items-center">
                        <div>
                            <p class="text-muted mb-1 fw-semibold">Tổng Môn học</p>
                            <h2 class="fw-bold text-dark mb-0"><div class="number">${totalMH}</div></h2>
                        </div>
                        <div class="stat-icon bg-warning-subtle text-warning p-3 rounded-4">
                            <i class="fa-solid fa-book-open fa-2x"></i>
                        </div>
                    </div>
                </div>
            </a>
        </div>

        <!-- 4. Lượt Đăng Ký Môn -->
        <div class="col-12 col-sm-6 col-xl-3">
            <a href="${pageContext.request.contextPath}/dangky?action=list" class="text-decoration-none">
                <div class="card border-0 shadow-sm rounded-4 p-3 style-card-info h-100 transition-card">
                    <div class="d-flex justify-content-between align-items-center">
                        <div>
                            <p class="text-muted mb-1 fw-semibold">Lượt đăng ký môn</p>
                            <h2 class="fw-bold text-dark mb-0"><div class="number">${totalDangKy}</div></h2>
                        </div>
                        <div class="stat-icon bg-info-subtle text-info p-3 rounded-4">
                            <i class="fa-solid fa-pen-to-square fa-2x"></i>
                        </div>
                    </div>
                </div>
            </a>
        </div>
    </div>


    <div class="card border-0 shadow-sm rounded-4 p-4">
        <h5 class="fw-bold mb-3">Hoạt động gần đây</h5>
        <p class="text-muted mb-0">Chào mừng bạn đến với Hệ thống Quản lý Giáo vụ. Chọn các chức năng ở menu bên trái hoặc nhấn trực tiếp vào các thẻ thống kê phía trên để bắt đầu thao tác.</p>
    </div>
</div>