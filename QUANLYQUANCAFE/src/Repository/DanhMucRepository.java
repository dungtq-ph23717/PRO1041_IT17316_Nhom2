/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Utilities.DBContext;
import ViewModels.DanhMuc;
import ViewModels.SanPham;
import java.util.List;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

/**
 *
 * @author ACER
 */
public class DanhMucRepository {

    public List<DanhMuc> getAll() {
        String query = "SELECT [ID]\n"
                + "      ,[MaDM]\n"
                + "      ,[TenDM]\n"
                + "  FROM [dbo].[DanhMuc]";
        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ResultSet rs = ps.executeQuery();
            List<DanhMuc> list = new ArrayList<>();
            while (rs.next()) {
                DanhMuc danhMuc = new DanhMuc(rs.getString(1), rs.getString(2), rs.getString(3));
                list.add(danhMuc);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public boolean add(DanhMuc danhMuc) {
        String query = "INSERT INTO [dbo].[DanhMuc]\n"
                + "           ([MaDM]\n"
                + "           ,[TenDM])\n"
                + "     VALUES\n"
                + "           (?,?)";
        int check = 0;
        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, danhMuc.getMaDanhMuc());
            ps.setObject(2, danhMuc.getTenDanhMuc());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }


    public DanhMuc getOne(String ten) {
        String query = "SELECT [ID]\n"
                + "      ,[MaDM]\n"
                + "      ,[TenDM]\n"
                + "  FROM [dbo].[DanhMuc]\n"
                + "  WHERE TenDM like ?";
        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, ten);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return new DanhMuc(rs.getString(1), rs.getString(2), rs.getString(3));
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

//    public static void main(String[] args) {
//        List<DanhMuc> list = new DanhMucRepository().searchTenDanhMuc("Trà sữa");
//        for (DanhMuc x : list) {
//            System.out.println(x);
//        }
//    }

}