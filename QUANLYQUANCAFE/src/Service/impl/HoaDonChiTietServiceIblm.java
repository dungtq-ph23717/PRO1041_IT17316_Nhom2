/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.impl;

import DomainModels.HoaDonChiTietModel;
import Repository.HoaDonChiTietRepository;
import Service.ServiceHoaDonChiTiet;
import ViewModels.HoaDonChiTiet;
import java.util.List;

/**
 *
 * @author vietv
 */
public class HoaDonChiTietServiceIblm implements ServiceHoaDonChiTiet {

    private HoaDonChiTietRepository rp = new HoaDonChiTietRepository();

    @Override
    public List<HoaDonChiTiet> getAll() {
        return rp.getAll();
    }

    @Override
    public String add(HoaDonChiTietModel hd) {
        boolean add = rp.add(hd);
        if (add) {
            return "Add thành công";
        } else {
            return "Add thất bại";
        }
    }

    @Override
    public String update(HoaDonChiTietModel hd, String idHD, String idSP) {
        boolean update = rp.update(hd, idHD, idSP);
        if (update) {
            return "update thành công";
        } else {
            return "update thất bại";
        }
    }

    @Override
    public String delete(String idHD, String idSP) {
        boolean delete = rp.delete(idHD, idSP);
        if (delete) {
            return "Delete thành công";
        } else {
            return "Delete thất bại";
        }
    }

    @Override
    public List<HoaDonChiTiet> getAllviewGH(String id) {
        return rp.getAllviewGH(id);
    }

    @Override
    public HoaDonChiTiet getOne(String ma) {
        return rp.getOne(ma);
    }

    @Override
    public String gopHD(String idHD, String idSP) {
        boolean gopHD = rp.gopHD(idHD, idSP);
        if (gopHD) {
            return "Gộp hoá đơn thành công";
        } else {
            return "Gộp hoá đơn thất bại";
        }
    }

    @Override
    public String updateIDHD(String idHD, int soLuong, String idSP) {
        boolean updateIDHD = rp.updateIDHD(idHD, soLuong, idSP);
        if (updateIDHD) {
            return "Chuyển sản phẩm thành công";
        } else {
            return "Chuyển sản phẩm thất bại";
        }
    }

}
