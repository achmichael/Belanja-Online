/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import Controller.UserController.AdminController;
import java.awt.Color;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import Controller.UserController.UserController;
import Models.UserModel.*;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
/**
 *
 * @author HP VCS 15
 */
public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        username_txt.setBackground(new Color(0, 0, 0, 0));
        password_txt.setBackground(new Color(0, 0, 0, 0));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new Background.BackgroundLogin();
        hide_button = new javax.swing.JLabel();
        show_button = new javax.swing.JLabel();
        close_button = new javax.swing.JButton();
        back_button = new javax.swing.JButton();
        username_txt = new javax.swing.JTextField();
        login_button = new javax.swing.JButton();
        register_button = new javax.swing.JButton();
        password_txt = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hide_button.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP VCS 15\\IdeaProjects\\BelanjaOnline\\src\\main\\java\\icons\\hide.png")); // NOI18N
        hide_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hide_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hide_buttonMouseClicked(evt);
            }
        });
        jPanel1.add(hide_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, 40, 40));

        show_button.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP VCS 15\\IdeaProjects\\BelanjaOnline\\src\\main\\java\\icons\\show.png")); // NOI18N
        show_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        show_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                show_buttonMouseClicked(evt);
            }
        });
        jPanel1.add(show_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, 40, 40));

        close_button.setBorderPainted(false);
        close_button.setContentAreaFilled(false);
        close_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(close_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(788, 13, -1, 36));

        back_button.setBorderPainted(false);
        back_button.setContentAreaFilled(false);
        back_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(back_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 13, -1, 36));

        username_txt.setFont(new java.awt.Font("Dubai Medium", 0, 24)); // NOI18N
        username_txt.setForeground(new java.awt.Color(255, 255, 255));
        username_txt.setBorder(null);
        username_txt.setOpaque(false);
        username_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username_txtActionPerformed(evt);
            }
        });
        jPanel1.add(username_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 270, 50));

        login_button.setBorderPainted(false);
        login_button.setContentAreaFilled(false);
        login_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        login_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(login_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 170, 40));

        register_button.setBorderPainted(false);
        register_button.setContentAreaFilled(false);
        register_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        register_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                register_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(register_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, 80, 30));

        password_txt.setFont(new java.awt.Font("Dubai Medium", 0, 24)); // NOI18N
        password_txt.setForeground(new java.awt.Color(255, 255, 255));
        password_txt.setBorder(null);
        password_txt.setOpaque(false);
        password_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_txtActionPerformed(evt);
            }
        });
        jPanel1.add(password_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 270, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 848, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void close_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close_buttonActionPerformed
        String[] options = {"YES", "NO"};
        Icon errorIcon = UIManager.getIcon("OptionPane.errorIcon");
        int option = JOptionPane.showOptionDialog(null, "Apakah Anda yakin ingin keluar dari aplikasi?😢😢😢", "Keluar Aplikasi?", JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, errorIcon, options, options[0]);
        if (option == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_close_buttonActionPerformed

    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
        Display objek = new Display();
        objek.setVisible(true);
        dispose();
    }//GEN-LAST:event_back_buttonActionPerformed

    private void login_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_buttonActionPerformed
        if (username_txt.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Tolong isi username terlebih dahulu...");
        } else if (password_txt.getPassword().equals("")) {
            JOptionPane.showMessageDialog(null, "Tolong isi password terlebih dahulu...");
        } else {
             int response = JOptionPane.showConfirmDialog(null, "Apakah Anda admin?", "Konfirmasi Admin", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if (response == JOptionPane.YES_OPTION) {
            // Jika pengguna mengklik "Yes"
            String username = username_txt.getText();
            char[] passwordChars = password_txt.getPassword();
            String password = new String(passwordChars);    
            Akun admin = new Admin(username, password); // Asumsi ada class Admin yang extend dari Akun
            AdminController adminControl = new AdminController(); // Asumsi ada AdminController
            adminControl.login(admin.getUsername(), admin.getPassword(), admin,this);
        } else if (response == JOptionPane.NO_OPTION) {
            // Jika pengguna mengklik "No"
            String username = username_txt.getText();
            char[] passwordChars = password_txt.getPassword();
            String password = new String(passwordChars);    
            Akun user = new User(username, password);
            UserController userControl = new UserController(user);
            userControl.login(user.getUsername(), user.getPassword(), this);
        }
        }
    }//GEN-LAST:event_login_buttonActionPerformed

    private void username_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_username_txtActionPerformed

    private void password_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_password_txtActionPerformed

    private void hide_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hide_buttonMouseClicked
        password_txt.setEchoChar('\0');
        hide_button.setVisible(false);
        show_button.setVisible(true);
    }//GEN-LAST:event_hide_buttonMouseClicked

    private void show_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_show_buttonMouseClicked
        password_txt.setEchoChar('*');
        hide_button.setVisible(true);
        show_button.setVisible(false);
    }//GEN-LAST:event_show_buttonMouseClicked

    private void register_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_register_buttonActionPerformed
        Register objek = new Register();
        objek.setVisible(true);
        dispose();
    }//GEN-LAST:event_register_buttonActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_button;
    private javax.swing.JButton close_button;
    private javax.swing.JLabel hide_button;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton login_button;
    private javax.swing.JPasswordField password_txt;
    private javax.swing.JButton register_button;
    private javax.swing.JLabel show_button;
    private javax.swing.JTextField username_txt;
    // End of variables declaration//GEN-END:variables
}
