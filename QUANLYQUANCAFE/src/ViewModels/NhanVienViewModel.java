/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModels;

/**
 *
 * @author hdo48
 */
public class NhanVienViewModel {
     private String id;
    private String maNV;
    private String tenNV;
    private String ngaySinh;
    private String SDT;
    private String tencv;

    public NhanVienViewModel() {
    }

    public NhanVienViewModel(String id, String maNV, String tenNV, String ngaySinh, String SDT, String tencv) {
        this.id = id;
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.ngaySinh = ngaySinh;
        this.SDT = SDT;
        this.tencv = tencv;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getTencv() {
        return tencv;
    }

    public void setTencv(String tencv) {
        this.tencv = tencv;
    }

    @Override
    public String toString() {
        return "NhanVienViewModel{" + "id=" + id + ", maNV=" + maNV + ", tenNV=" + tenNV + ", ngaySinh=" + ngaySinh + ", SDT=" + SDT + ", tencv=" + tencv + '}';
    }
    public Object[] toRowData(){
        return new Object[]{id,maNV,tenNV,ngaySinh,SDT,tencv};
    }
}