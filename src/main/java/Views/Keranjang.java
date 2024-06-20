package Views;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Controller.KeranjangController.KeranjangController;
import Controller.ProdukController.ProdukController;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.Color;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;

public class Keranjang extends javax.swing.JFrame {

    private KeranjangController keranjang;
    private DefaultTableModel tableModel;
    public boolean show;
    private String nama;

    public Keranjang(String nama) {
        this.nama = nama;
        initComponents();
        keranjang = new KeranjangController();
        initTableModel();
        makeTableTransparent();
        keranjang.showPesanan(tableModel);
        show = keranjang.show;
    }

    public String getNama() {
        return nama;
    }

    private void initTableModel() {
        String[] columnNames = {"Nomor", "Nama Produk", "Harga", "Waktu Pesan", "Total Harga"};
        tableModel = new DefaultTableModel(null, columnNames);
        tabel_keranjang.setModel(tableModel);
        tabel_keranjang.setRowHeight(40);
    }

    private void makeTableTransparent() {
        tabel_keranjang.setBackground(new Color(0, 0, 0, 0));
        tabel_keranjang.setOpaque(false);
        tabel_keranjang.setShowGrid(false);
        tabel_keranjang.setIntercellSpacing(new java.awt.Dimension(0, 0));
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setOpaque(false);
        tabel_keranjang.setDefaultRenderer(Object.class, renderer);
        jScrollPane1.setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);
        JTableHeader header = tabel_keranjang.getTableHeader();
        header.setOpaque(false);
        header.setBackground(new Color(0, 0, 0, 0));
        ((DefaultTableCellRenderer) header.getDefaultRenderer()).setOpaque(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new Background.BackgroundKeranjang();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_keranjang = new javax.swing.JTable();
        delete_button = new javax.swing.JButton();
        delete_all_button = new javax.swing.JButton();
        checkout_button = new javax.swing.JButton();
        back_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        tabel_keranjang.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        tabel_keranjang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nomor", "Nama Produk", "Harga", "Waktu Pesan"
            }
        ));
        tabel_keranjang.setAutoscrolls(false);
        tabel_keranjang.setGridColor(new java.awt.Color(255, 255, 255));
        tabel_keranjang.setOpaque(false);
        tabel_keranjang.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tabel_keranjang.setShowGrid(false);
        tabel_keranjang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_keranjangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel_keranjang);

        delete_button.setBorder(null);
        delete_button.setContentAreaFilled(false);
        delete_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_buttonActionPerformed(evt);
            }
        });

        delete_all_button.setBorder(null);
        delete_all_button.setContentAreaFilled(false);
        delete_all_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete_all_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_all_buttonActionPerformed(evt);
            }
        });

        checkout_button.setBorder(null);
        checkout_button.setContentAreaFilled(false);
        checkout_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        checkout_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkout_buttonActionPerformed(evt);
            }
        });

        back_button.setBorder(null);
        back_button.setContentAreaFilled(false);
        back_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(delete_button, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(delete_all_button, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkout_button, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(back_button, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back_button, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(delete_all_button, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(delete_button, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(checkout_button, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(114, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void delete_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_buttonActionPerformed
        int selectedRow = tabel_keranjang.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Tolong Pilih Pesanan yang akan dihapus");
        } else {
            String namaProduk = tabel_keranjang.getValueAt(selectedRow, 1).toString();
            keranjang.deletePesanan(namaProduk);
            initTableModel();
            keranjang.showPesanan(tableModel);
        }
    }//GEN-LAST:event_delete_buttonActionPerformed

    private void tabel_keranjangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_keranjangMouseClicked

    }//GEN-LAST:event_tabel_keranjangMouseClicked

    private void delete_all_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_all_buttonActionPerformed
        keranjang.deleteAllPesanan();
        initTableModel();
        keranjang.showPesanan(tableModel);
    }//GEN-LAST:event_delete_all_buttonActionPerformed

    private void checkout_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkout_buttonActionPerformed
        int response = JOptionPane.showConfirmDialog(null, "Do you want to buy this product?", "Confirm",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            String message = keranjang.showStruk();
            JOptionPane.showMessageDialog(null, message, "Success", JOptionPane.INFORMATION_MESSAGE);

        }
    }//GEN-LAST:event_checkout_buttonActionPerformed

    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
        dispose();
        Dashboard page = new Dashboard(getNama());
        page.setVisible(true);
    }//GEN-LAST:event_back_buttonActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(new FlatMacLightLaf());
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan pada : " + e.getMessage());
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_button;
    private javax.swing.JButton checkout_button;
    private javax.swing.JButton delete_all_button;
    private javax.swing.JButton delete_button;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabel_keranjang;
    // End of variables declaration//GEN-END:variables
}
