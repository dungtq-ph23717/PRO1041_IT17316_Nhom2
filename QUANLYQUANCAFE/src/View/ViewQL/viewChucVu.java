/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package View.ViewQL;

import Service.ChucVuService;
import Service.impl.ChucVuServiceImpl;
import View.ViewNV.ViewNhanVien;
import ViewModels.ChucVu;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hdo48
 */
public class viewChucVu extends javax.swing.JDialog {

    private List<DomainModels.ChucVu> listcv = new ArrayList<>();
    private DefaultTableModel dtm = new DefaultTableModel();
    private ChucVuService chucVuService = new ChucVuServiceImpl();

    /**
     * Creates new form viewChucVu
     */
    public viewChucVu(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        tableChucVu.setModel(dtm);
        String[] headercv = {"ID", "MÃ CV", "TÊN CV"};
        dtm.setColumnIdentifiers(headercv);
        listcv = chucVuService.getAll();
        showdatacv(listcv);
        txtID.disable();

    }

    private void showdatacv(List<DomainModels.ChucVu> lits) {
        dtm.setRowCount(0);
        for (DomainModels.ChucVu cv : lits) {
            dtm.addRow(cv.toRowData());

        }
    }

    private DomainModels.ChucVu getdatacv() {
        DomainModels.ChucVu chucVu = new DomainModels.ChucVu();
        chucVu.setMacv(txtMACV.getText());
        chucVu.setTenCV(txtTENCV.getText());
        return chucVu;
    }

//    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMACV = new javax.swing.JTextField();
        txtTENCV = new javax.swing.JTextField();
        btADD = new javax.swing.JButton();
        btUpdate = new javax.swing.JButton();
        btCLose = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableChucVu = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setText("MÃ CHỨC VỤ");

        jLabel3.setText("TÊN CHỨC VỤ");

        btADD.setText("ADD");
        btADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btADDActionPerformed(evt);
            }
        });

        btUpdate.setText("UPDATE");
        btUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUpdateActionPerformed(evt);
            }
        });

        btCLose.setText("Close");
        btCLose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCLoseActionPerformed(evt);
            }
        });

        tableChucVu.setModel(new javax.swing.table.DefaultTableModel(
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
        tableChucVu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableChucVuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableChucVu);

        jLabel1.setText("ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(btADD, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btCLose, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtID, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtMACV)
                                            .addComponent(txtTENCV, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE))))))
                        .addGap(0, 83, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtMACV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTENCV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCLose)
                    .addComponent(btUpdate)
                    .addComponent(btADD))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCLoseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCLoseActionPerformed
        ViewQuanLyNhanVien nhanVien = new ViewQuanLyNhanVien();
        nhanVien.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btCLoseActionPerformed

    private void tableChucVuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableChucVuMouseClicked
        int row = tableChucVu.getSelectedRow();
        txtID.setText(tableChucVu.getValueAt(row, 0).toString());
        txtMACV.setText(tableChucVu.getValueAt(row, 1).toString());
        txtTENCV.setText(tableChucVu.getValueAt(row, 2).toString());
    }//GEN-LAST:event_tableChucVuMouseClicked

    private void btADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btADDActionPerformed
        JOptionPane.showMessageDialog(this, chucVuService.add(getdatacv()));
        listcv = chucVuService.getAll();
        showdatacv(listcv);
    }//GEN-LAST:event_btADDActionPerformed

    private void btUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUpdateActionPerformed
          JOptionPane.showMessageDialog(this, chucVuService.update(getdatacv(),txtID.getText()));
        listcv = chucVuService.getAll();
        showdatacv(listcv);
    }//GEN-LAST:event_btUpdateActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btADD;
    private javax.swing.JButton btCLose;
    private javax.swing.JButton btUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableChucVu;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMACV;
    private javax.swing.JTextField txtTENCV;
    // End of variables declaration//GEN-END:variables
}