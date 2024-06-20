package Views;
import Controller.UserController.AdminController;
import Controller.UserController.UserController;
import Models.UserModel.Admin;
import Models.UserModel.Akun;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class AdminPage extends javax.swing.JFrame {

    DefaultTableModel tableModel;
    DefaultTableModel tableUser;
    AdminController admin;
    Akun akun = new Admin();
    private String nama;
    UserController user;

    public AdminPage(String nama) {
        this.nama = nama;
        initComponents();
        sapa.setText(akun.showInfo(nama));
        initTableModelProduk();
        makeTableTransparentProduk();
        initTableModelUser();
        makeTableTransparentUser();
        admin = new AdminController();
        admin.showDataProduk(tableModel);
        admin.showDatasUsers(tableUser);
    }

    private void initTableModelProduk() {
        String[] columnNames = {"Nomor", "Nama Produk", "Stok", "Harga"};
        tableModel = new DefaultTableModel(null, columnNames);
        table_produk.setModel(tableModel);
        table_produk.setRowHeight(30);
    }

    private void makeTableTransparentProduk() {
        table_produk.setBackground(new Color(0, 0, 0, 0));
        table_produk.setOpaque(false);
        jScrollPane1.setBackground(new Color(0, 0, 0, 0));
        table_produk.setShowGrid(false);
        table_produk.setIntercellSpacing(new java.awt.Dimension(0, 0));
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setOpaque(false);
        table_produk.setDefaultRenderer(Object.class, renderer);
        jScrollPane1.setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);
        JTableHeader header = table_produk.getTableHeader();
        header.setOpaque(false);
        header.setBackground(new Color(0, 0, 0, 0));
        ((DefaultTableCellRenderer) header.getDefaultRenderer()).setOpaque(false);
    }

    private void initTableModelUser() {
        String[] columnNames = {"Nomor", "Username", "Password"};
        tableUser = new DefaultTableModel(null, columnNames);
        table_user.setModel(tableUser);
        table_user.setRowHeight(30);
    }

    private void makeTableTransparentUser() {
        table_user.setBackground(new Color(0, 0, 0, 0));
        table_user.setOpaque(false);
        jScrollPane2.setBackground(new Color(0, 0, 0, 0));
        table_user.setShowGrid(false);
        table_user.setIntercellSpacing(new java.awt.Dimension(0, 0));
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setOpaque(false);
        table_user.setDefaultRenderer(Object.class, renderer);
        jScrollPane1.setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);
        JTableHeader header = table_user.getTableHeader();
        header.setOpaque(false);
        header.setBackground(new Color(0, 0, 0, 0));
        ((DefaultTableCellRenderer) header.getDefaultRenderer()).setOpaque(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new Background.BackgroundAdmin();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_produk = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_user = new javax.swing.JTable();
        delete_button = new javax.swing.JButton();
        delete_all_button = new javax.swing.JButton();
        update_button = new javax.swing.JButton();
        add_button = new javax.swing.JButton();
        sapa = new javax.swing.JLabel();
        back_button = new javax.swing.JButton();
        logout_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        table_produk.setModel(new javax.swing.table.DefaultTableModel(
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
        table_produk.setDragEnabled(true);
        table_produk.setSelectionForeground(new java.awt.Color(0, 0, 0));
        table_produk.setShowGrid(false);
        jScrollPane1.setViewportView(table_produk);

        table_user.setModel(new javax.swing.table.DefaultTableModel(
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
        table_user.setOpaque(false);
        table_user.setSelectionBackground(new java.awt.Color(255, 255, 255));
        table_user.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(table_user);

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

        update_button.setBorder(null);
        update_button.setContentAreaFilled(false);
        update_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_buttonActionPerformed(evt);
            }
        });

        add_button.setBorder(null);
        add_button.setContentAreaFilled(false);
        add_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_buttonActionPerformed(evt);
            }
        });

        sapa.setFont(new java.awt.Font("Dubai Medium", 0, 18)); // NOI18N

        back_button.setBorder(null);
        back_button.setContentAreaFilled(false);
        back_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_buttonActionPerformed(evt);
            }
        });

        logout_button.setBorder(null);
        logout_button.setContentAreaFilled(false);
        logout_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(add_button, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(delete_all_button, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(delete_button, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(update_button, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(262, 262, 262))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(back_button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sapa, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logout_button, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(back_button, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logout_button, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(sapa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(update_button, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete_all_button, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_button, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete_button, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(126, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void delete_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_buttonActionPerformed
        Object[] options = {"Hapus Data User", "Hapus Data Produk", "Batal"};
        int choice = JOptionPane.showOptionDialog(
                null,
                "Anda ingin menghapus data user atau produk?",
                "Konfirmasi Hapus",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[2]
        );

        if (choice == JOptionPane.YES_OPTION) {
            // Hapus Data User
            int selectedRow = table_user.getSelectedRow();
            if (selectedRow == -1) {
                JOptionPane.showMessageDialog(null, "Tolong Pilih data user yang akan dihapus terlebih dahulu...", "Error", JOptionPane.INFORMATION_MESSAGE);
            } else {
                String id = table_user.getValueAt(selectedRow, 0).toString();
                int idUser = Integer.parseInt(id);
                int result = admin.deleteDataUser(idUser);
                if (result != 0) {
                    JOptionPane.showMessageDialog(null, "Berhasil Menghapus Data User...", "Success", JOptionPane.INFORMATION_MESSAGE);
                    admin.showDatasUsers(tableUser);
                } else {
                    JOptionPane.showMessageDialog(null, "Gagal Menghapus Data User...", "Error", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } else if (choice == JOptionPane.NO_OPTION) {
            // Hapus Data Produk
            int selectedRow = table_produk.getSelectedRow();
            if (selectedRow == -1) {
                JOptionPane.showMessageDialog(null, "Tolong Pilih data produk yang akan dihapus terlebih dahulu...", "Error", JOptionPane.INFORMATION_MESSAGE);
            } else {
                String id = table_produk.getValueAt(selectedRow, 0).toString();
                int idProduk = Integer.parseInt(id);
                boolean result = admin.deleteProduk(idProduk);
                if (result) {
                    JOptionPane.showMessageDialog(null, "Berhasil Menghapus Data Produk...", "Success", JOptionPane.INFORMATION_MESSAGE);
                    admin.showDataProduk(tableModel);
                } else {
                    JOptionPane.showMessageDialog(null, "Gagal Menghapus Data Produk...", "Error", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_delete_buttonActionPerformed

    private void delete_all_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_all_buttonActionPerformed
        Object[] options = {"Hapus Data User", "Hapus Data Produk", "Batal"};
        int choice = JOptionPane.showOptionDialog(
                null,
                "Anda ingin menghapus data user atau produk?",
                "Konfirmasi Hapus",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[2]
        );
        // Memproses pilihan pengguna
        if (choice == JOptionPane.YES_OPTION) {
            // Pengguna memilih "Hapus Data User"
            int confirm = JOptionPane.showConfirmDialog(
                    null,
                    "Apakah Anda yakin ingin menghapus semua data user?",
                    "Konfirmasi Hapus",
                    JOptionPane.YES_NO_OPTION
            );
            if (confirm == JOptionPane.YES_OPTION) {
                admin.deleteAllUsers();
                admin.showDatasUsers(tableUser);
            }
        } else if (choice == JOptionPane.NO_OPTION) {
            // Pengguna memilih "Hapus Data Produk"
            int confirm = JOptionPane.showConfirmDialog(
                    null,
                    "Apakah Anda yakin ingin menghapus semua data produk?",
                    "Konfirmasi Hapus",
                    JOptionPane.YES_NO_OPTION
            );
            if (confirm == JOptionPane.YES_OPTION) {
                admin.deleteAllProduk();
                admin.showDataProduk(tableModel);
            }
        }
    }//GEN-LAST:event_delete_all_buttonActionPerformed

    private void update_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_buttonActionPerformed
        Object[] options = {"Update Data User", "Update Data Produk", "Batal"};
        int choice = JOptionPane.showOptionDialog(
                null,
                "Anda ingin mengupdate data user atau produk?",
                "Konfirmasi Update",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[2]
        );

        if (choice == JOptionPane.YES_OPTION) {
            // Update Data User
            int selectedRow = table_user.getSelectedRow();
            if (selectedRow == -1) {
                JOptionPane.showMessageDialog(null, "Tolong pilih data user yang akan di-update");
            } else {
                String id = table_user.getValueAt(selectedRow, 0).toString();
                try {
                    int idUser = Integer.parseInt(id);
                    String username = JOptionPane.showInputDialog(null, "Tolong inputkan username baru...");
                    String password = JOptionPane.showInputDialog(null, "Tolong inputkan password baru...");
                    if (username != null && password != null) {
                        boolean success = admin.updateDataUser(idUser, username, password);
                        if (success) {
                            JOptionPane.showMessageDialog(null, "Update data user berhasil...");
                            admin.showDatasUsers(tableUser);
                        } else {
                            JOptionPane.showMessageDialog(null, "Update data user gagal...");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Update dibatalkan.");
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "ID tidak valid.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else if (choice == JOptionPane.NO_OPTION) {
            // Update Data Produk
            int selectedRow = table_produk.getSelectedRow();
            if (selectedRow == -1) {
                JOptionPane.showMessageDialog(null, "Tolong pilih data produk yang akan di-update");
            } else {
                String id = table_produk.getValueAt(selectedRow, 0).toString();
                try {
                    int idProduk = Integer.parseInt(id);
                    String namaProduk = JOptionPane.showInputDialog(null, "Tolong inputkan nama produk baru...");
                    String hargaProduk = JOptionPane.showInputDialog(null, "Tolong inputkan harga produk baru...");
                    String stok = JOptionPane.showInputDialog(null, "Tolong inputkan Stok produk baru...");
                    if (namaProduk != null && hargaProduk != null) {
                        boolean success = admin.updateProduk(idProduk, namaProduk, Integer.parseInt(hargaProduk), Integer.parseInt(stok));
                        if (success) {
                            JOptionPane.showMessageDialog(null, "Update data produk berhasil...");
                            admin.showDataProduk(tableModel);
                        } else {
                            JOptionPane.showMessageDialog(null, "Update data produk gagal...");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Update dibatalkan.");
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "ID tidak valid.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_update_buttonActionPerformed

    private void add_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_buttonActionPerformed
        Object[] options = {"Tambah Data User",
            "Tambah Data Produk", "Batal"};
        int choice = JOptionPane.showOptionDialog(
                null,
                "Anda ingin menambahkan data user atau produk?",
                "Konfirmasi Tambah",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[2]
        );
        if (choice == JOptionPane.YES_OPTION) {
            // Tambah Data User
            String username = JOptionPane.showInputDialog(null, "Tolong inputkan username baru...");
            String password = JOptionPane.showInputDialog(null, "Tolong inputkan password baru...");
            if (username == null || password == null) {
                JOptionPane.showMessageDialog(null, "Username dan Password tidak boleh kosong", "Error", JOptionPane.INFORMATION_MESSAGE);
            } else if (username.trim().equals("") || password.trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Username dan Password tidak boleh berisikan spasi saja...");
            } else {
                boolean success = admin.addUser(username, password);
                if (success) {
                    JOptionPane.showMessageDialog(null, "Berhasil Menambahkan data user...", "Success", JOptionPane.INFORMATION_MESSAGE);
                    admin.showDatasUsers(tableUser);
                } else {
                    JOptionPane.showMessageDialog(null, "Gagal Menambahkan data user...", "Error", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } else if (choice == JOptionPane.NO_OPTION) {
            String namaProduk = JOptionPane.showInputDialog(null, "Tolong inputkan nama produk baru...");
            String hargaProduk = JOptionPane.showInputDialog(null, "Tolong inputkan harga produk baru...");
            String stok = JOptionPane.showInputDialog(null, "Tolong inputkan stok produk baru...");
            if (namaProduk == null || hargaProduk == null || stok == null) {
                JOptionPane.showMessageDialog(null, "Data produk tidak boleh kosong", "Error", JOptionPane.INFORMATION_MESSAGE);
            } else if (namaProduk.trim().equals("") || hargaProduk.trim().equals("") || stok.trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Data produk tidak boleh berisikan spasi saja...");
            } else {
                boolean success = admin.addProduk(namaProduk, Integer.parseInt(hargaProduk), Integer.parseInt(stok));
                if (success) {
                    JOptionPane.showMessageDialog(null, "Berhasil Menambahkan data produk...", "Success", JOptionPane.INFORMATION_MESSAGE);
                    admin.showDataProduk(tableModel);
                } else {
                    JOptionPane.showMessageDialog(null, "Gagal Menambahkan data produk...", "Error", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_add_buttonActionPerformed

    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
        dispose();
        Display objek = new Display();
        objek.setVisible(true);
    }//GEN-LAST:event_back_buttonActionPerformed

    private void logout_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_buttonActionPerformed
       int confirm = JOptionPane.showConfirmDialog(this, akun.showInfo(nama) + " Apakah anda ingin Logout?", "Konfirmasi Logout", JOptionPane.YES_NO_OPTION);
        if(confirm == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(this, "Anda Berhasil logout", "Success", JOptionPane.INFORMATION_MESSAGE);
            dispose();
            Display page = new Display();
            page.setVisible(true);
        }
    }//GEN-LAST:event_logout_buttonActionPerformed
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(new FlatMacLightLaf());
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_button;
    private javax.swing.JButton back_button;
    private javax.swing.JButton delete_all_button;
    private javax.swing.JButton delete_button;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton logout_button;
    private javax.swing.JLabel sapa;
    private javax.swing.JTable table_produk;
    private javax.swing.JTable table_user;
    private javax.swing.JButton update_button;
    // End of variables declaration//GEN-END:variables
}
