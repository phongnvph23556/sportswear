package duan1.nhom5.Entity;

public class LoaiSanPham {
    private int MaLoaiSP;
    private String TenLoai;
    private String NamSX;
    private String HangSX;
    private byte[] HinhAnh;

    public LoaiSanPham() {
    }

    public LoaiSanPham(int maLoaiSP, String tenLoai, String namSX, String hangSX, byte[] hinhAnh) {
        MaLoaiSP = maLoaiSP;
        TenLoai = tenLoai;
        NamSX = namSX;
        HangSX = hangSX;
        HinhAnh = hinhAnh;
    }

    public int getMaLoaiSP() {
        return MaLoaiSP;
    }

    public void setMaLoaiSP(int maLoaiSP) {
        MaLoaiSP = maLoaiSP;
    }

    public String getTenLoai() {
        return TenLoai;
    }

    public void setTenLoai(String tenLoai) {
        TenLoai = tenLoai;
    }

    public String getNamSX() {
        return NamSX;
    }

    public void setNamSX(String namSX) {
        NamSX = namSX;
    }

    public String getHangSX() {
        return HangSX;
    }

    public void setHangSX(String hangSX) {
        HangSX = hangSX;
    }

    public byte[] getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(byte[] hinhAnh) {
        HinhAnh = hinhAnh;
    }

}
