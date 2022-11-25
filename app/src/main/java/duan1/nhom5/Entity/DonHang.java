package duan1.nhom5.Entity;

import java.util.Date;

public class DonHang {
    private int MaDH;
    private int MaKH;
    private int MaNV;
    private int MaSanPham;
    private int TienBan;
    private Date Ngay;
    private int ThanhToan;

    public DonHang() {
    }

    public DonHang(int maDH, int maKH, int maNV, int maSanPham, int tienBan, Date ngay, int thanhToan) {
        MaDH = maDH;
        MaKH = maKH;
        MaNV = maNV;
        MaSanPham = maSanPham;
        TienBan = tienBan;
        Ngay = ngay;
        ThanhToan = thanhToan;
    }

    public int getMaDH() {
        return MaDH;
    }

    public void setMaDH(int maDH) {
        MaDH = maDH;
    }

    public int getMaKH() {
        return MaKH;
    }

    public void setMaKH(int maKH) {
        MaKH = maKH;
    }

    public int getMaNV() {
        return MaNV;
    }

    public void setMaNV(int maNV) {
        MaNV = maNV;
    }

    public int getMaSanPham() {
        return MaSanPham;
    }

    public void setMaSanPham(int maSanPham) {
        MaSanPham = maSanPham;
    }

    public int getTienBan() {
        return TienBan;
    }

    public void setTienBan(int tienBan) {
        TienBan = tienBan;
    }

    public Date getNgay() {
        return Ngay;
    }

    public void setNgay(Date ngay) {
        Ngay = ngay;
    }

    public int getThanhToan() {
        return ThanhToan;
    }

    public void setThanhToan(int thanhToan) {
        ThanhToan = thanhToan;
    }
}