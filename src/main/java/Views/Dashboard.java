package Views;
import java.awt.Color;
import javax.swing.JOptionPane;
import Controller.ProdukController.*;
import Models.UserModel.*;
import Models.UserModel.User;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.Desktop;
import java.net.URI;
import javax.swing.JLabel;

public class Dashboard extends javax.swing.JFrame {

    JLabel[] stoks;
    private Akun akun = new User();
    private String nama;

    public Dashboard(String nama) {
        this.nama = nama;
        initComponents();
        sapa.setText(akun.showInfo(nama));
        search.setBackground(new Color(0, 0, 0, 0));
        stoks = new JLabel[]{stok_1, stok_2, stok_3, stok_4, stok_5};
        ProdukController produk = new ProdukController();
        produk.showStoks(stoks);
    }

    public String getNama() {
        return this.nama;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new Background.BackgroundDashboard();
        search = new javax.swing.JTextField();
        person_button = new javax.swing.JButton();
        keranjang_button = new javax.swing.JButton();
        next_button = new javax.swing.JButton();
        buy_btn = new javax.swing.JButton();
        buy_btn2 = new javax.swing.JButton();
        buy_btn3 = new javax.swing.JButton();
        buy_btn4 = new javax.swing.JButton();
        buy_btn5 = new javax.swing.JButton();
        stok_1 = new javax.swing.JLabel();
        stok_2 = new javax.swing.JLabel();
        stok_3 = new javax.swing.JLabel();
        stok_4 = new javax.swing.JLabel();
        stok_5 = new javax.swing.JLabel();
        fb_button = new javax.swing.JButton();
        ig_button = new javax.swing.JButton();
        sapa = new javax.swing.JLabel();
        twitter_button = new javax.swing.JButton();
        linkedin_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        search.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        search.setBorder(null);
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 300, 30));

        person_button.setBorderPainted(false);
        person_button.setContentAreaFilled(false);
        person_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        person_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                person_buttonMouseClicked(evt);
            }
        });
        jPanel1.add(person_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, 38, 30));

        keranjang_button.setBorderPainted(false);
        keranjang_button.setContentAreaFilled(false);
        keranjang_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        keranjang_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keranjang_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(keranjang_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, 39, 30));

        next_button.setBorderPainted(false);
        next_button.setContentAreaFilled(false);
        next_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(next_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, 40, 30));

        buy_btn.setBorder(null);
        buy_btn.setBorderPainted(false);
        buy_btn.setContentAreaFilled(false);
        buy_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buy_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buy_btnActionPerformed(evt);
            }
        });
        jPanel1.add(buy_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 90, 28));

        buy_btn2.setBorder(null);
        buy_btn2.setBorderPainted(false);
        buy_btn2.setContentAreaFilled(false);
        buy_btn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buy_btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buy_btn2ActionPerformed(evt);
            }
        });
        jPanel1.add(buy_btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 80, 28));

        buy_btn3.setBorder(null);
        buy_btn3.setBorderPainted(false);
        buy_btn3.setContentAreaFilled(false);
        buy_btn3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buy_btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buy_btn3ActionPerformed(evt);
            }
        });
        jPanel1.add(buy_btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, 90, 28));

        buy_btn4.setBorderPainted(false);
        buy_btn4.setContentAreaFilled(false);
        buy_btn4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buy_btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buy_btn4ActionPerformed(evt);
            }
        });
        jPanel1.add(buy_btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 340, 90, 28));

        buy_btn5.setBorder(null);
        buy_btn5.setBorderPainted(false);
        buy_btn5.setContentAreaFilled(false);
        buy_btn5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buy_btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buy_btn5ActionPerformed(evt);
            }
        });
        jPanel1.add(buy_btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 340, 90, 28));
        jPanel1.add(stok_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 70, 20));
        jPanel1.add(stok_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 70, 20));
        jPanel1.add(stok_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, 80, 20));
        jPanel1.add(stok_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 310, 80, 20));
        jPanel1.add(stok_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 310, 70, 20));

        fb_button.setBorder(null);
        fb_button.setContentAreaFilled(false);
        fb_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fb_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fb_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(fb_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 30, 30));

        ig_button.setBorder(null);
        ig_button.setContentAreaFilled(false);
        ig_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ig_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ig_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(ig_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, 30, 30));

        sapa.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jPanel1.add(sapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 150, 30));

        twitter_button.setBorder(null);
        twitter_button.setContentAreaFilled(false);
        twitter_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        twitter_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twitter_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(twitter_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, 40, 40));

        linkedin_button.setBorder(null);
        linkedin_button.setContentAreaFilled(false);
        linkedin_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        linkedin_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linkedin_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(linkedin_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 439, 40, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 859, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buy_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buy_btnActionPerformed
        int id = 1;
        ProdukController produk = new ProdukController();
        produk.buyProduk(id);
        produk.showStoks(stoks);
    }//GEN-LAST:event_buy_btnActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        if (search.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Tolong Masukkan Nama Produk Terlebih Dahulu", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            String namaProduk = search.getText().trim();
            ProdukController produk = new ProdukController();
            produk.searchProduk(namaProduk);
            produk.showStoks(stoks);
        }
    }//GEN-LAST:event_searchActionPerformed

    private void buy_btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buy_btn2ActionPerformed
        int id = 2;
        ProdukController produk = new ProdukController();
        produk.buyProduk(id);
        produk.showStoks(stoks);
    }//GEN-LAST:event_buy_btn2ActionPerformed

    private void buy_btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buy_btn3ActionPerformed
        int id = 3;
        ProdukController produk = new ProdukController();
        produk.buyProduk(id);
        produk.showStoks(stoks);
    }//GEN-LAST:event_buy_btn3ActionPerformed

    private void buy_btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buy_btn4ActionPerformed
        int id = 4;
        ProdukController produk = new ProdukController();
        produk.buyProduk(id);
        produk.showStoks(stoks);
    }//GEN-LAST:event_buy_btn4ActionPerformed

    private void buy_btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buy_btn5ActionPerformed
        int id = 5;
        ProdukController produk = new ProdukController();
        produk.buyProduk(id);
        produk.showStoks(stoks);
    }//GEN-LAST:event_buy_btn5ActionPerformed

    private void keranjang_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keranjang_buttonActionPerformed
        Keranjang objek = new Keranjang(getNama());
        boolean show = objek.show;
        if (show) {
            dispose();
            objek.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Belum ada Produk yang anda tambahkan ke dalam keranjang", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_keranjang_buttonActionPerformed

    private void ig_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ig_buttonActionPerformed
        try {
            String url = "https://www.instagram.com/mchael.86?igsh=NXdqcmoycGVyZHF4";
            // Membuka URL di browser default
            if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                Desktop.getDesktop().browse(new URI(url));
            } else {
                JOptionPane.showMessageDialog(null, "Desktop browsing is not supported!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "An error occurred: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_ig_buttonActionPerformed

    private void fb_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fb_buttonActionPerformed
        try {
            String url = "https://www.facebook.com/akbar.mubarok.967?mibextid=AQBXeECoIFSgMqhe";
            if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                Desktop.getDesktop().browse(new URI(url));
            } else {
                JOptionPane.showMessageDialog(null, "Desktop browsing is not supported!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "An error occurred: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_fb_buttonActionPerformed

    private void linkedin_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linkedin_buttonActionPerformed
        try {
            String url = "https://www.linkedin.com/in/achmad-michael-2b84b928b?utm_source=share&utm_campaign=share_via&utm_content=profile&utm_medium=android_app";
            if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                Desktop.getDesktop().browse(new URI(url));
            } else {
                JOptionPane.showMessageDialog(null, "Desktop browsing is not supported!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "An error occurred: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_linkedin_buttonActionPerformed

    private void twitter_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twitter_buttonActionPerformed
        try {
            String url = "https://x.com/mandailn?t=WB7SIU77ndG0Aee7qSPK1g&s=08";
            if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                Desktop.getDesktop().browse(new URI(url));
            } else {
                JOptionPane.showMessageDialog(null, "Desktop browsing is not supported!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "An error occurred: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_twitter_buttonActionPerformed

    private void person_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_person_buttonMouseClicked
        int confirm = JOptionPane.showConfirmDialog(this, akun.showInfo(nama) + " Apakah anda ingin Logout?", "Konfirmasi Logout", JOptionPane.YES_NO_OPTION);
        if(confirm == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(this, "Anda Berhasil logout", "Success", JOptionPane.INFORMATION_MESSAGE);
            dispose();
            Display page = new Display();
            page.setVisible(true);
        }
    }//GEN-LAST:event_person_buttonMouseClicked

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                   javax.swing.UIManager.setLookAndFeel(new FlatMacLightLaf());
                    break;
                }
            }
        }catch(Exception e){
            System.out.println("Terjadi kesalahan pada : " + e.getMessage());
        }
        //</editor-fold>
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buy_btn;
    private javax.swing.JButton buy_btn2;
    private javax.swing.JButton buy_btn3;
    private javax.swing.JButton buy_btn4;
    private javax.swing.JButton buy_btn5;
    private javax.swing.JButton fb_button;
    private javax.swing.JButton ig_button;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton keranjang_button;
    private javax.swing.JButton linkedin_button;
    private javax.swing.JButton next_button;
    private javax.swing.JButton person_button;
    private javax.swing.JLabel sapa;
    private javax.swing.JTextField search;
    private javax.swing.JLabel stok_1;
    private javax.swing.JLabel stok_2;
    private javax.swing.JLabel stok_3;
    private javax.swing.JLabel stok_4;
    private javax.swing.JLabel stok_5;
    private javax.swing.JButton twitter_button;
    // End of variables declaration//GEN-END:variables
}
