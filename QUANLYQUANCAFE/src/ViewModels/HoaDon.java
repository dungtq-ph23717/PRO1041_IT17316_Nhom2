package ViewModels;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author vietv
 */
public class HoaDon {

    private String ID;
    private String maHD;
    private Ban ban;
    private NhanVienViewModel tenNV;
    private String ngayLapHD;
    private String phuongThucThanhToan;
    private SanPham sp;
    private double thanhTien;
    private String tinhTrang;

    public HoaDon() {
    }

    public HoaDon(String maHD) {
        this.maHD = maHD;
    }

    public HoaDon(String maHD, String tinhTrang) {
        this.maHD = maHD;
        this.tinhTrang = tinhTrang;
    }

    public HoaDon(String maHD, Ban ban, NhanVienViewModel tenNV, String ngayLapHD, String phuongThucThanhToan, SanPham sp, double thanhTien, String tinhTrang) {
        this.maHD = maHD;
        this.ban = ban;
        this.tenNV = tenNV;
        this.ngayLapHD = ngayLapHD;
        this.phuongThucThanhToan = phuongThucThanhToan;
        this.sp = sp;
        this.thanhTien = thanhTien;
        this.tinhTrang = tinhTrang;
    }

    public HoaDon(String ID, String maHD, String ngayLapHD, NhanVienViewModel tenNV, String tinhTrang) {
        this.ID = ID;
        this.maHD = maHD;
        this.ngayLapHD = ngayLapHD;
        this.tenNV = tenNV;
        this.tinhTrang = tinhTrang;
    }

    public HoaDon(String maHD, String ngayLapHD, NhanVienViewModel tenNV, String tinhTrang) {
        this.maHD = maHD;
        this.ngayLapHD = ngayLapHD;
        this.tenNV = tenNV;
        this.tinhTrang = tinhTrang;

    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getNgayLapHD() {
        return ngayLapHD;
    }

    public void setNgayLapHD(String ngayLapHD) {
        this.ngayLapHD = ngayLapHD;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public String getPhuongThucThanhToan() {
        return phuongThucThanhToan;
    }

    public void setPhuongThucThanhToan(String phuongThucThanhToan) {
        this.phuongThucThanhToan = phuongThucThanhToan;
    }

    public Ban getBan() {
        return ban;
    }

    public void setBan(Ban ban) {
        this.ban = ban;
    }

    public SanPham getSp() {
        return sp;
    }

    public void setSp(SanPham sp) {
        this.sp = sp;
    }

    @Override
    public String toString() {
        return "HoaDon{" + "ID=" + ID + ", maHD=" + maHD + ", ban=" + ban + ", tenNV=" + tenNV + ", ngayLapHD=" + ngayLapHD + ", phuongThucThanhToan=" + phuongThucThanhToan + ", sp=" + sp + ", thanhTien=" + thanhTien + ", tinhTrang=" + tinhTrang + '}';
    }

    public Object[] toRowData() {
        return new Object[]{maHD, ban.getTenBan(), tenNV.getTenCV(), ngayLapHD, phuongThucThanhToan, sp.getTenSP(), thanhTien, tinhTrang};
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public NhanVienViewModel getTenNV() {
        return tenNV;
    }

    public void setTenNV(NhanVienViewModel tenNV) {
        this.tenNV = tenNV;
    }

}
