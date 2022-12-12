/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View.ViewQL;

import DomainModels.HoaDonModel;
import Service.impl.BanServiceImpl;
import Service.impl.HoaDonServiceIblm;
import ViewModels.Ban;
import ViewModels.HoaDon;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class ViewTachBan extends javax.swing.JFrame {

    private DefaultTableModel dtm1 = new DefaultTableModel();
    private DefaultTableModel dtm2 = new DefaultTableModel();
    private DefaultComboBoxModel boxModel1 = new DefaultComboBoxModel();
    private DefaultComboBoxModel boxModel2 = new DefaultComboBoxModel();
    private List<Ban> listBan = new ArrayList<>();
    private List<HoaDon> listHD = new ArrayList<>();
    private BanServiceImpl implBan = new BanServiceImpl();
    private HoaDonServiceIblm implHD = new HoaDonServiceIblm();

    /**
     * Creates new form ViewTachBan
     */
    public ViewTachBan(Ban ban) {
        initComponents();
        String[] headersHD = {"Mã HD", "Ngày lập", "Nhân viên", "Trạng thái"};
        tbHDtach.setModel(dtm1);
        dtm1.setColumnIdentifiers(headersHD);
        listHD = implHD.getAllTT();
        showDataHD1(listHD);

        tbHDgoc.setModel(dtm2);
        dtm2.setColumnIdentifiers(headersHD);
        listHD = implHD.getAllTT();
        showDataHD2(listHD);

        listBan = implBan.getAllTT();
        cbbBan1.setModel(boxModel1);
        for (Ban b : listBan) {
            boxModel1.addElement(b.getTenBan());
        }
        fillData(ban);
    }

    private void showDataHD1(List<HoaDon> list) {
        dtm1.setRowCount(0);
        for (HoaDon x : list) {
            dtm1.addRow(new Object[]{x.getMaHD(), x.getNgayLapHD(), x.getTenNV().getTenNV(), x.getTinhTrang()});
        }
    }

    private void showDataHD2(List<HoaDon> list) {
        dtm2.setRowCount(0);
        for (HoaDon x : list) {
            dtm2.addRow(new Object[]{x.getMaHD(), x.getNgayLapHD(), x.getTenNV().getTenNV(), x.getTinhTrang()});
        }
    }

    private void fillData(Ban ban) {
        txtBan.setText(ban.getTenBan());
    }

    private void tachHD() {
        HoaDonModel hd = new HoaDonModel();
        ViewTachHD v = new ViewTachHD();
        v.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        tachHD = new javax.swing.JMenuItem();
        gopHD = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        cbbBan1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbHDtach = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbHDgoc = new javax.swing.JTable();
        btClose = new javax.swing.JButton();
        btBack = new javax.swing.JButton();
        btNext = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txtBan = new javax.swing.JLabel();

        tachHD.setText("Tách hoá đơn");
        tachHD.setToolTipText("");
        tachHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tachHDActionPerformed(evt);
            }
        });
        jPopupMenu1.add(tachHD);

        gopHD.setText("Gộp HD");
        gopHD.setToolTipText("");
        gopHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gopHDActionPerformed(evt);
            }
        });
        jPopupMenu1.add(gopHD);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Bàn tách");

        cbbBan1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbbBan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbBan1ActionPerformed(evt);
            }
        });

        tbHDtach.setModel(new javax.swing.table.DefaultTableModel(
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
        tbHDtach.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(tbHDtach);

        jLabel2.setText("Bàn");

        tbHDgoc.setModel(new javax.swing.table.DefaultTableModel(
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
        tbHDgoc.setComponentPopupMenu(jPopupMenu1);
        jScrollPane2.setViewportView(tbHDgoc);

        btClose.setText("Tách");
        btClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCloseActionPerformed(evt);
            }
        });

        btBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/fast-forward-double-right-arrows-symbol (1).png"))); // NOI18N
        btBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBackActionPerformed(evt);
            }
        });

        btNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/double-arrow (1).png"))); // NOI18N
        btNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNextActionPerformed(evt);
            }
        });

        jButton1.setText("Gộp");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtBan.setText("Bàn 1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btBack, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btNext, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btClose)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtBan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(cbbBan1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbbBan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtBan))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btBack, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btNext, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btClose)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCloseActionPerformed
        JOptionPane.showMessageDialog(this, "Tách bàn thành công");
        this.dispose();
        ViewQuanLy v = new ViewQuanLy();
        v.setVisible(true);
    }//GEN-LAST:event_btCloseActionPerformed

    private void cbbBan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbBan1ActionPerformed
        String ten = cbbBan1.getSelectedItem().toString();
        Ban b = implBan.getOne(ten);
        listHD = implHD.getAllTTViewHD(b.getId());
        showDataHD1(listHD);
    }//GEN-LAST:event_cbbBan1ActionPerformed

    private void btBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackActionPerformed
        try {
            int row = tbHDgoc.getSelectedRow();
            String ten = cbbBan1.getSelectedItem().toString();
            String maHD = (String) tbHDgoc.getValueAt(row, 0);
            Ban b = implBan.getOne(ten);
            implHD.updateID(b.getId(), maHD);

            String ten1 = cbbBan1.getSelectedItem().toString();
            Ban b1 = implBan.getOne(ten1);
            listHD = implHD.getAllTTViewHD(b1.getId());
            showDataHD1(listHD);

            String ten2 = txtBan.getText();
            Ban b2 = implBan.getOne(ten2);
            listHD = implHD.getAllTTViewHD(b2.getId());
            showDataHD2(listHD);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Chưa chọn hoá đơn");
        }
    }//GEN-LAST:event_btBackActionPerformed

    private void btNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNextActionPerformed
        try {
            int row = tbHDtach.getSelectedRow();
            String ten = txtBan.getText();
            String maHD = (String) tbHDtach.getValueAt(row, 0);
            Ban b = implBan.getOne(ten);
            implHD.updateID(b.getId(), maHD);

            String ten1 = cbbBan1.getSelectedItem().toString();
            Ban b1 = implBan.getOne(ten1);
            listHD = implHD.getAllTTViewHD(b1.getId());
            showDataHD1(listHD);

            String ten2 = txtBan.getText();
            Ban b2 = implBan.getOne(ten2);
            listHD = implHD.getAllTTViewHD(b2.getId());
            showDataHD2(listHD);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Chưa chọn hoá đơn");
        }
    }//GEN-LAST:event_btNextActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        for (int i = 0; i < tbHDtach.getRowCount(); i++) {
            String ten = txtBan.getText();
            String maHD = (String) tbHDtach.getValueAt(i, 0);
            Ban b = implBan.getOne(ten);
            implHD.updateID(b.getId(), maHD);
        }
        String ten1 = cbbBan1.getSelectedItem().toString();
        Ban b1 = implBan.getOne(ten1);
        listHD = implHD.getAllTTViewHD(b1.getId());
        showDataHD1(listHD);

        String ten2 = txtBan.getText();
        Ban b2 = implBan.getOne(ten2);
        listHD = implHD.getAllTTViewHD(b2.getId());
        showDataHD2(listHD);

        String tenGop = cbbBan1.getSelectedItem().toString();
        JOptionPane.showMessageDialog(this, implBan.gopBan(tenGop));
        listBan = implBan.getAllTT();
        boxModel1.removeElement(ten1);
        this.dispose();
        ViewQuanLy v = new ViewQuanLy();
        v.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tachHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tachHDActionPerformed
        tachHD();
    }//GEN-LAST:event_tachHDActionPerformed

    private void gopHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gopHDActionPerformed
        tachHD();
    }//GEN-LAST:event_gopHDActionPerformed

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
//            java.util.logging.Logger.getLogger(ViewTachBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ViewTachBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ViewTachBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ViewTachBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ViewTachBan().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBack;
    private javax.swing.JButton btClose;
    private javax.swing.JButton btNext;
    private javax.swing.JComboBox<String> cbbBan1;
    private javax.swing.JMenuItem gopHD;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem tachHD;
    private javax.swing.JTable tbHDgoc;
    private javax.swing.JTable tbHDtach;
    private javax.swing.JLabel txtBan;
    // End of variables declaration//GEN-END:variables
}
