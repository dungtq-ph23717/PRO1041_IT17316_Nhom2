/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package View.ViewNV;

import View.ViewQL.*;
import DomainModels.HoaDonChiTietModel;
import Service.impl.HoaDonChiTietServiceIblm;
import Service.impl.HoaDonServiceIblm;
import Service.impl.SanPhamServiceImpl;
import Service.impl.ToppingServiceImpl;
import ViewModels.HoaDon;
import ViewModels.HoaDonChiTiet;
import ViewModels.SanPham;
import ViewModels.Topping;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class ViewTachHD extends javax.swing.JDialog {

    private DefaultTableModel dtm1 = new DefaultTableModel();
    private DefaultTableModel dtm2 = new DefaultTableModel();
    private DefaultComboBoxModel boxModel1 = new DefaultComboBoxModel();
    private DefaultComboBoxModel boxModel2 = new DefaultComboBoxModel();
    private List<HoaDonChiTiet> listHDCT = new ArrayList<>();
    private List<HoaDon> listHD = new ArrayList<>();
    private HoaDonChiTietServiceIblm implHDCT = new HoaDonChiTietServiceIblm();
    private HoaDonServiceIblm implHD = new HoaDonServiceIblm();
    private SanPhamServiceImpl implSP = new SanPhamServiceImpl();
    private ToppingServiceImpl implTP = new ToppingServiceImpl();

    /**
     * Creates new form ViewTachHD1
     */
    public ViewTachHD(java.awt.Frame parent, boolean modal, HoaDon h) {
        super(parent, modal);
        initComponents();
        String[] headersGH = {"Mã SP", "Tên SP", "Số lượng", "Đơn giá", "Topping", "Tổng tiền"};
        tbGH1.setModel(dtm1);
        dtm1.setColumnIdentifiers(headersGH);

        tbGH2.setModel(dtm2);
        dtm2.setColumnIdentifiers(headersGH);
//        String ma = txtHD.getText();
//        HoaDon hd1 = implHD.getOne(ma);
//        listHDCT = implHDCT.getAllviewGH(hd1.getID());
//        showDataHDCT2(listHDCT);

        listHD = implHD.getAllHDCho();
        cbbMaHD1.setModel(boxModel1);
        for (HoaDon hd : listHD) {
            boxModel1.addElement(hd.getMaHD());
        }
        fillData(h);
    }

    private void fillData(HoaDon h) {
        txtHD.setText(h.getMaHD());
    }

    private void showDataHDCT1(List<HoaDonChiTiet> list) {
        dtm1.setRowCount(0);
        for (HoaDonChiTiet x : list) {
            dtm1.addRow(new Object[]{x.getIdSP().getMaSP(), x.getIdSP().getTenSP(), x.getSoLuong(), x.getIdSP().getGiaBan(), x.getIdTopping().getTopping(), x.getGiaTien()});
        }
    }

    private void showDataHDCT2(List<HoaDonChiTiet> list) {
        dtm2.setRowCount(0);
        for (HoaDonChiTiet x : list) {
            dtm2.addRow(new Object[]{x.getIdSP().getMaSP(), x.getIdSP().getTenSP(), x.getSoLuong(), x.getIdSP().getGiaBan(), x.getIdTopping().getTopping(), x.getGiaTien()});
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

        cbbMaHD1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbGH2 = new javax.swing.JTable();
        btTach = new javax.swing.JButton();
        btGop = new javax.swing.JButton();
        txtHD = new javax.swing.JLabel();
        btHuy = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbGH1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        cbbMaHD1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbbMaHD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbMaHD1ActionPerformed(evt);
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

        btTach.setText("Tách");
        btTach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTachActionPerformed(evt);
            }
        });

        btGop.setText("Gộp");
        btGop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGopActionPerformed(evt);
            }
        });

        txtHD.setText("HD68");

        btHuy.setText("Huỷ");
        btHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHuyActionPerformed(evt);
            }
        });

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
        jScrollPane1.setViewportView(tbGH1);

        jLabel1.setText("Mã HD tách");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/sync_25px.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(cbbMaHD1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btHuy)
                                .addGap(4, 4, 4)
                                .addComponent(btGop)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btTach))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtHD)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 10, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbbMaHD1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btGop)
                    .addComponent(btTach)
                    .addComponent(btHuy))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
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

    private void tbGH2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbGH2MouseClicked
        int row = tbGH2.getSelectedRow();
        String ma1 = txtHD.getText();
        HoaDon hd1 = implHD.getOne(ma1);
        String maSP = (String) tbGH2.getValueAt(row, 0);
        SanPham idSP = implSP.getOne(maSP);
        String maHD = (String) cbbMaHD1.getSelectedItem();
        HoaDon hd = implHD.getOne(maHD);
        String idTP = tbGH2.getValueAt(row, 4).toString();
        Topping tp = implTP.getOne(idTP);
        Integer sl = (Integer) tbGH2.getValueAt(row, 2);
        int slt = Integer.parseInt(JOptionPane.showInputDialog("Mời bạn nhập số lượng:"));
        if (sl == slt && tbGH2.getRowCount() <= 1) {
            JOptionPane.showMessageDialog(this, "Không thể chuyển hết sản phẩm sang hoá đơn khác");
        } else {
            if (txtHD.getText().equalsIgnoreCase(cbbMaHD1.getSelectedItem().toString())) {
                JOptionPane.showMessageDialog(this, "Trùng hoá đơn");
            } else {
                if (slt <= 0) {
                    JOptionPane.showMessageDialog(this, "Bạn phải nhập đúng định dạng");
                    return;
                } else if (slt > (Integer) tbGH2.getValueAt(row, 2)) {
                    JOptionPane.showMessageDialog(this, "Không được nhập quá số lượng");
                    return;
                } else if (slt == sl) {
                    JOptionPane.showMessageDialog(this, implHDCT.updateIDHD(hd.getID(), slt, tp.getId(), idSP.getId()));
                    String maHD1 = txtHD.getText();
                    HoaDon hd2 = implHD.getOne(maHD1);
                    int slAdd = sl - slt;
                    HoaDonChiTietModel hdct = new HoaDonChiTietModel(idSP.getId(), hd2.getID(), slAdd, tp.getId());
                    implHDCT.add(hdct);
                    implHDCT.delete(hd1.getID(), idSP.getId());
                    listHDCT = implHDCT.getAllviewGH(hd1.getID());
                    showDataHDCT2(listHDCT);
                } else {
                    JOptionPane.showMessageDialog(this, implHDCT.updateIDHD(hd.getID(), slt, tp.getId(), idSP.getId()));
                    String maHD1 = txtHD.getText();
                    HoaDon hd2 = implHD.getOne(maHD1);
                    int slAdd = sl - slt;
                    HoaDonChiTietModel hdct = new HoaDonChiTietModel(idSP.getId(), hd2.getID(), slAdd, tp.getId());
                    implHDCT.add(hdct);
                    listHDCT = implHDCT.getAllviewGH(hd1.getID());
                    showDataHDCT2(listHDCT);
                }
            }
        }
        listHDCT = implHDCT.getAllviewGH(hd.getID());
        showDataHDCT1(listHDCT);
    }//GEN-LAST:event_tbGH2MouseClicked

    private void btTachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTachActionPerformed
        JOptionPane.showMessageDialog(this, "Tách thành công");
        this.dispose();
    }//GEN-LAST:event_btTachActionPerformed

    private void btGopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGopActionPerformed
        if (txtHD.getText().equalsIgnoreCase(cbbMaHD1.getSelectedItem().toString())) {
            JOptionPane.showMessageDialog(this, "Không thể gộp hoá đơn trùng");
        } else {
            String maHD = txtHD.getText();
            HoaDon hd = implHD.getOne(maHD);
            String ma1 = cbbMaHD1.getSelectedItem().toString();
            HoaDon hd1 = implHD.getOne(ma1);
            for (int i = 0; i < tbGH1.getRowCount(); i++) {
                String idTP = tbGH2.getValueAt(i, 4).toString();
                Topping tp = implTP.getOne(idTP);
                String idSP = (String) tbGH1.getValueAt(i, 0);
                SanPham sp = implSP.getOne(idSP);
                String idSp1 = tbGH2.getValueAt(i, 0).toString();
                Integer sl = Integer.valueOf(tbGH1.getValueAt(i, 2).toString());
                Integer slt = Integer.valueOf(tbGH2.getValueAt(i, 2).toString());
                if (idSP.equalsIgnoreCase(idSp1)) {
                    HoaDonChiTietModel hdct = new HoaDonChiTietModel(slt + sl);
                    implHDCT.update(hdct, hd.getID(), sp.getId());
                    implHDCT.delete(hd1.getID(), sp.getId());
                    JOptionPane.showMessageDialog(this, implHD.delete(ma1));
                    boxModel1.removeElement(ma1);
                    this.dispose();
                } else {
                    HoaDonChiTietModel hdct1 = new HoaDonChiTietModel(sl);
                    implHDCT.updateIDHD(hd.getID(), sl, tp.getId(), sp.getId());
                    JOptionPane.showMessageDialog(this, implHD.delete(ma1));
                    boxModel1.removeElement(ma1);
                    this.dispose();
                }
                listHDCT = implHDCT.getAllviewGH(hd.getID());
                showDataHDCT2(listHDCT);
                listHDCT.clear();
                showDataHDCT1(listHDCT);
            }
        }

    }//GEN-LAST:event_btGopActionPerformed

    private void btHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHuyActionPerformed
        if (txtHD.getText().equalsIgnoreCase(cbbMaHD1.getSelectedItem().toString())) {
            JOptionPane.showMessageDialog(this, "Trùng hoá đơn");
        } else {
            String maHD = txtHD.getText();
            HoaDon hd = implHD.getOne(maHD);
            String ma1 = cbbMaHD1.getSelectedItem().toString();
            HoaDon hd1 = implHD.getOne(ma1);
            for (int i = 0; i < tbGH1.getRowCount(); i++) {
                String idTP = tbGH2.getValueAt(i, 4).toString();
                Topping tp = implTP.getOne(idTP);
                String idSP = (String) tbGH1.getValueAt(i, 0);
                SanPham sp = implSP.getOne(idSP);
                String idSp1 = tbGH2.getValueAt(i, 0).toString();
                Integer sl = Integer.valueOf(tbGH1.getValueAt(i, 2).toString());
                Integer slt = Integer.valueOf(tbGH2.getValueAt(i, 2).toString());
                if (idSP.equalsIgnoreCase(idSp1)) {
                    HoaDonChiTietModel hdct = new HoaDonChiTietModel(slt + sl);
                    implHDCT.delete(hd.getID(), sp.getId());
                    implHDCT.updateIDHD(hd.getID(), sl + slt, tp.getId(), sp.getId());
                } else {
                    HoaDonChiTietModel hdct1 = new HoaDonChiTietModel(sl);
                    implHDCT.updateIDHD(hd.getID(), sl, tp.getId(), sp.getId());
                }
                listHDCT = implHDCT.getAllviewGH(hd.getID());
                showDataHDCT2(listHDCT);
                listHDCT.clear();
                showDataHDCT1(listHDCT);
            }
        }
    }//GEN-LAST:event_btHuyActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        listHD = implHD.getAllHDCho();
        cbbMaHD1.setModel(boxModel1);
        for (HoaDon hd2 : listHD) {
            if (!hd2.getMaHD().contains(hd2.getMaHD())) {
                boxModel1.addElement(hd2.getMaHD());
            }
        }
        String ma2 = cbbMaHD1.getSelectedItem().toString();
        HoaDon hd = implHD.getOne(ma2);
        listHDCT = implHDCT.getAllviewGH(hd.getID());
        showDataHDCT1(listHDCT);
        String ma1 = txtHD.getText();
        HoaDon hd1 = implHD.getOne(ma1);
        listHDCT = implHDCT.getAllviewGH(hd1.getID());
        showDataHDCT2(listHDCT);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(ViewTachHD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ViewTachHD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ViewTachHD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ViewTachHD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                ViewTachHD dialog = new ViewTachHD(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btGop;
    private javax.swing.JButton btHuy;
    private javax.swing.JButton btTach;
    private javax.swing.JComboBox<String> cbbMaHD1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbGH1;
    private javax.swing.JTable tbGH2;
    private javax.swing.JLabel txtHD;
    // End of variables declaration//GEN-END:variables
}