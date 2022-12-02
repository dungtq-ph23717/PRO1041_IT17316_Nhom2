/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View.ViewQL;

import DomainModels.HoaDonChiTietModel;
import Service.impl.BanServiceImpl;
import Service.impl.HoaDonChiTietServiceIblm;
import Service.impl.HoaDonServiceIblm;
import Service.impl.SanPhamServiceImpl;
import ViewModels.Ban;
import ViewModels.HoaDon;
import ViewModels.HoaDonChiTiet;
import ViewModels.SanPham;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class ViewTachHD extends javax.swing.JFrame {

    private DefaultTableModel dtm1 = new DefaultTableModel();
    private DefaultTableModel dtm2 = new DefaultTableModel();
    private DefaultComboBoxModel boxModel1 = new DefaultComboBoxModel();
    private DefaultComboBoxModel boxModel2 = new DefaultComboBoxModel();
    private List<HoaDonChiTiet> listHDCT = new ArrayList<>();
    private List<HoaDon> listHD = new ArrayList<>();
    private HoaDonChiTietServiceIblm implHDCT = new HoaDonChiTietServiceIblm();
    private HoaDonServiceIblm implHD = new HoaDonServiceIblm();
    private SanPhamServiceImpl implSP = new SanPhamServiceImpl();

    /**
     * Creates new form ViewTachHD
     */
    public ViewTachHD() {
        initComponents();
        String[] headersGH = {"Mã SP", "Tên SP", "Số lượng", "Đơn giá", "Tổng tiền"};
        tbGH1.setModel(dtm1);
        dtm1.setColumnIdentifiers(headersGH);
        listHDCT = implHDCT.getAll();
        showDataHDCT1(listHDCT);

        tbGH2.setModel(dtm2);
        dtm2.setColumnIdentifiers(headersGH);
        listHDCT = implHDCT.getAll();
        showDataHDCT2(listHDCT);

        listHD = implHD.getAllTT();
        cbbMaHD1.setModel(boxModel1);
        for (HoaDon hd : listHD) {
            boxModel1.addElement(hd.getMaHD());
        }
        cbbMaHD2.setModel(boxModel2);
        for (HoaDon hd : listHD) {
            boxModel2.addElement(hd.getMaHD());
        }
    }

    private void showDataHDCT1(List<HoaDonChiTiet> list) {
        dtm1.setRowCount(0);
        for (HoaDonChiTiet x : list) {
            dtm1.addRow(new Object[]{x.getIdSP().getMaSP(), x.getIdSP().getTenSP(), x.getSoLuong(), x.getIdSP().getGiaBan(), x.getGiaTien()});
        }
    }

    private void showDataHDCT2(List<HoaDonChiTiet> list) {
        dtm2.setRowCount(0);
        for (HoaDonChiTiet x : list) {
            dtm2.addRow(new Object[]{x.getIdSP().getMaSP(), x.getIdSP().getTenSP(), x.getSoLuong(), x.getIdSP().getGiaBan(), x.getGiaTien()});
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbGH1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        cbbMaHD1 = new javax.swing.JComboBox<>();
        cbbMaHD2 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbGH2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbGH1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbGH1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbGH1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbGH1);

        jLabel1.setText("Mã HD tách");

        cbbMaHD1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbbMaHD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbMaHD1ActionPerformed(evt);
            }
        });

        cbbMaHD2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbbMaHD2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbMaHD2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Mã HD");

        tbGH2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbGH2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbGH2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbGH2);

        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Gộp");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(cbbMaHD1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 203, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(cbbMaHD2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(29, 29, 29)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbbMaHD1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(cbbMaHD2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbbMaHD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbMaHD1ActionPerformed
        String ma = cbbMaHD1.getSelectedItem().toString();
        HoaDon hd = implHD.getOne(ma);
        listHDCT = implHDCT.getAllviewGH(hd.getID());
        showDataHDCT1(listHDCT);
    }//GEN-LAST:event_cbbMaHD1ActionPerformed

    private void cbbMaHD2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbMaHD2ActionPerformed
        String ma = cbbMaHD2.getSelectedItem().toString();
        HoaDon hd = implHD.getOne(ma);
        listHDCT = implHDCT.getAllviewGH(hd.getID());
        showDataHDCT2(listHDCT);
    }//GEN-LAST:event_cbbMaHD2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tbGH1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbGH1MouseClicked
//        int row = tbGH1.getSelectedRow();
//        String maSP = (String) tbGH1.getValueAt(row, 0);
//        SanPham idSP = implSP.getOne(maSP);
//        String maHD = (String) cbbMaHD1.getSelectedItem();
//        HoaDon hd = implHD.getOne(maHD);
//        Integer sl = (Integer) tbGH1.getValueAt(row, 2);
//        if (sl == 1) {
//            JOptionPane.showMessageDialog(this, implHDCT.updateIDHD(hd.getID(), 1, idSP.getId()));
//        } else {
//            int slt = Integer.parseInt(JOptionPane.showInputDialog("Mời bạn nhập số lượng:"));
//            if (slt <= 0) {
//                JOptionPane.showMessageDialog(this, "Bạn phải nhập đúng định dạng");
//                return;
//            }
//
//            JOptionPane.showMessageDialog(this, implHDCT.updateIDHD(hd.getID(), slt, idSP.getId()));
//            String maHD1 = (String) cbbMaHD2.getSelectedItem();
//            HoaDon hd2 = implHD.getOne(maHD1);
//            Integer slAdd = sl - slt;
////            implHDCT.updateIDHD(hd2.getID(), slAdd, idSP.getId());
//            HoaDonChiTietModel hdct = new HoaDonChiTietModel(idSP.getId(), hd2.getID(), slAdd);
//            implHDCT.add(hdct);
//            String ma1 = cbbMaHD2.getSelectedItem().toString();
//            HoaDon hd1 = implHD.getOne(ma1);
//            listHDCT = implHDCT.getAllviewGH(hd1.getID());
//            showDataHDCT2(listHDCT);
//        }
//
//        listHDCT = implHDCT.getAllviewGH(hd.getID());
//        showDataHDCT1(listHDCT);
    }//GEN-LAST:event_tbGH1MouseClicked

    private void tbGH2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbGH2MouseClicked
        int row = tbGH2.getSelectedRow();
        String maSP = (String) tbGH2.getValueAt(row, 0);
        SanPham idSP = implSP.getOne(maSP);
        String maHD = (String) cbbMaHD1.getSelectedItem();
        HoaDon hd = implHD.getOne(maHD);
        Integer sl = (Integer) tbGH2.getValueAt(row, 2);
        if (sl == 1) {
            JOptionPane.showMessageDialog(this, implHDCT.updateIDHD(hd.getID(), 1, idSP.getId()));
        } else {
            int slt = Integer.parseInt(JOptionPane.showInputDialog("Mời bạn nhập số lượng:"));
            if (slt <= 0) {
                JOptionPane.showMessageDialog(this, "Bạn phải nhập đúng định dạng");
                return;
            }
            JOptionPane.showMessageDialog(this, implHDCT.updateIDHD(hd.getID(), slt, idSP.getId()));
            String maHD1 = (String) cbbMaHD2.getSelectedItem();
            HoaDon hd2 = implHD.getOne(maHD1);
            int slAdd = sl - slt;
//            implHDCT.updateIDHD(hd2.getID(), slAdd, idSP.getId());
            HoaDonChiTietModel hdct = new HoaDonChiTietModel(idSP.getId(), hd2.getID(), slAdd);
            implHDCT.add(hdct);
            String ma1 = cbbMaHD2.getSelectedItem().toString();
            HoaDon hd1 = implHD.getOne(ma1);
            listHDCT = implHDCT.getAllviewGH(hd1.getID());
            showDataHDCT2(listHDCT);
        }
        listHDCT = implHDCT.getAllviewGH(hd.getID());
        showDataHDCT1(listHDCT);
    }//GEN-LAST:event_tbGH2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        String maHD = cbbMaHD2.getSelectedItem().toString();
        HoaDon hd = implHD.getOne(maHD);
        for (int i = 0; i < tbGH1.getRowCount(); i++) {
            String idSP = (String) tbGH1.getValueAt(i, 0);
            SanPham sp = implSP.getOne(idSP);
            implHDCT.gopHD(hd.getID(), sp.getId());
        }
        String ma1 = cbbMaHD1.getSelectedItem().toString();
        HoaDon hd1 = implHD.getOne(ma1);
        JOptionPane.showMessageDialog(this, implHD.delete(ma1));
        boxModel1.removeElement(ma1);
        listHDCT = implHDCT.getAllviewGH(hd.getID());
        showDataHDCT2(listHDCT);
        listHDCT = implHDCT.getAllviewGH(hd1.getID());
        showDataHDCT1(listHDCT);

//        listHDCT = implHDCT.getAllviewGH(hd.getID());
//        showDataHDCT1(listHDCT);
//        showDataHDCT1(listHDCT);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewTachHD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewTachHD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewTachHD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewTachHD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewTachHD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbbMaHD1;
    private javax.swing.JComboBox<String> cbbMaHD2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbGH1;
    private javax.swing.JTable tbGH2;
    // End of variables declaration//GEN-END:variables

}
