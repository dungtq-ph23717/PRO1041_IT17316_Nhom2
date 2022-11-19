/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DomainModels.KhuyenMaiModel;
import Utilities.DBContext;
import ViewModels.KhuyenMai;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author vietv
 */
public class KhuyenMaiRepository {

    public List<KhuyenMai> getAll() {
        String query = "SELECT [ID]\n"
                + "      ,[MaKM]\n"
                + "      ,[TenKM]\n"
                + "      ,[HinhThucGG]\n"
                + "      ,[MucGiam]\n"
                + "      ,[TGBatDau]\n"
                + "      ,[TGKetThuc]\n"
                + "      ,[Mota]\n"
                + "  FROM [dbo].[KhuyenMai]";
        List<KhuyenMai> listKM = new ArrayList<>();
        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                KhuyenMai km = new KhuyenMai(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8));
                listKM.add(km);
            }
            return listKM;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<KhuyenMai> searchMaKM(String maKM) {
        String query = "SELECT [ID]\n"
                + "      ,[MaKM]\n"
                + "      ,[TenKM]\n"
                + "      ,[HinhThucGG]\n"
                + "      ,[MucGiam]\n"
                + "      ,[TGBatDau]\n"
                + "      ,[TGKetThuc]\n"
                + "      ,[Mota]\n"
                + "  FROM [dbo].[KhuyenMai]\n"
                + "  WHERE MaKM LIKE ?";
        List<KhuyenMai> listKM = new ArrayList<>();
        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, "%" + maKM + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                KhuyenMai km = new KhuyenMai(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8));
                listKM.add(km);
            }
            return listKM;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean add(KhuyenMaiModel km) {
        int check = 0;
        String query = "INSERT INTO [dbo].[KhuyenMai]\n"
                + "           ([MaKM]\n"
                + "           ,[TenKM]\n"
                + "           ,[HinhThucGG]\n"
                + "           ,[MucGiam]\n"
                + "           ,[TGBatDau]\n"
                + "           ,[TGKetThuc]\n"
                + "           ,[Mota])\n"
                + "     VALUES\n"
                + "           (?,?,?,?,?,?,?)";
        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, km.getMaKM());
            ps.setObject(2, km.getTenKM());
            ps.setObject(3, km.getHinhThucGG());
            ps.setObject(4, km.getMucGiam());
            ps.setObject(5, km.getTgBatDau());
            ps.setObject(6, km.getTgKetThuc());
            ps.setObject(7, km.getMoTa());
            check = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public boolean update(KhuyenMaiModel km, String IDKM) {
        int check = 0;
        String query = "UPDATE [dbo].[KhuyenMai]\n"
                + "   SET [MaKM] = ?\n"
                + "      ,[TenKM] = ?\n"
                + "      ,[HinhThucGG] = ?\n"
                + "      ,[MucGiam] = ?\n"
                + "      ,[TGBatDau] = ?\n"
                + "      ,[TGKetThuc] = ?\n"
                + "      ,[Mota] = ?\n"
                + " WHERE ID = ?";
        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, km.getMaKM());
            ps.setObject(2, km.getTenKM());
            ps.setObject(3, km.getHinhThucGG());
            ps.setObject(4, km.getMucGiam());
            ps.setObject(5, km.getTgBatDau());
            ps.setObject(6, km.getTgKetThuc());
            ps.setObject(7, km.getMoTa());
            ps.setString(8, IDKM);
            check = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public boolean xoa(String IDKM) {
        int check = 0;
        String query = "DELETE FROM [dbo].[KhuyenMai]\n"
                + "      WHERE ID = ?";
        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, IDKM);
            check = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public static void main(String[] args) {
        List<KhuyenMai> show = new KhuyenMaiRepository().getAll();
        for (KhuyenMai x : show) {
            System.out.println(x);
        }
    }
}
