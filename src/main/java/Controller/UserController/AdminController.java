/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.UserController;

import Controller.ProdukController.ProdukController;
import Models.ProdukModel.Produk;
import Models.UserModel.Akun;
import Models.UserModel.User;
import Views.AdminPage;
import Views.Dashboard;
import Views.Login;
import Views.Register;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AdminController {

    private Akun admin;
    private Login loginPage;
    Produk data = new Produk();
    private Register registerPage;
    private ResultSet resultSet;
    private User user;

    public AdminController() {
        user = new User();
    }

    public void showDataProduk(DefaultTableModel tableModel) {
        try {
            tableModel.setRowCount(0);
            resultSet = data.showProduk();
            while (resultSet.next()) {
                data.setNamaProduk(resultSet.getString("nama_produk"));
                data.setHarga(resultSet.getString("harga"));
                data.setStok(resultSet.getString("stok"));
                Object[] datas = {resultSet.getString("id"), data.getNamaProduk(), data.getStok(), data.getHarga()};
                tableModel.addRow(datas);
            }
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan pada : " + e.getMessage());
        }
    }

    public void login(String username, String password, Akun admin, Login login) {
        loginPage = login;
        admin = admin;
        try {
            resultSet = admin.login(username, password);
            if (resultSet == null) {
                System.out.println("Tidak ada akun yang ditemukan...");
                return;
            }
            if (resultSet.next()) {
//                success = true;
                loginPage.dispose();
                AdminPage page = new AdminPage(resultSet.getString("username"));
                page.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Username And Password Incorrect");
//                success = false;
            }
        } catch (Exception e) {
            System.out.println("Terjadi Kesalahan pada : " + e.getMessage());
        }
//        return success;
    }

    public void showDatasUsers(DefaultTableModel tableModel) {
        try {
            tableModel.setRowCount(0);
            resultSet = user.showDataUsers();
            while (resultSet.next()) {
                user.setUsername(resultSet.getString("username"));
                user.setPassword(resultSet.getString("password"));
                Object[] datas = {resultSet.getString("id"), user.getUsername(), user.getPassword()};
                tableModel.addRow(datas);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int deleteDataUser(int id) {
        int result = 0;
        try {
            String sql = "DELETE FROM users WHERE id = ?";
            result = user.deleteDataUser(id);
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan pada : " + e.getMessage());
        }
        return result;
    }

    public void deleteAllUsers() {
        boolean success = user.deleteAllDatasUsers();
        if (success) {
            JOptionPane.showMessageDialog(null, "Berhasil menghapus semua data user...");
        } else {
            JOptionPane.showMessageDialog(null, "Gagal Menghapus semua data user...");
        }
    }

    public boolean updateDataUser(int id, String username, String password) {
        int result = user.updateDataUser(id, username, password);
        if (result != 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean addUser(String username, String password) {
        int result = user.register(username, password);
        if (result != 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean deleteProduk(int id) {
        int result = data.deleteProduk(id);
        if (result != 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean updateProduk(int id, String namaProduk, int harga, int stok) {
        int result = data.updateProduk(id, namaProduk, harga, stok);
        if(result != 0){
            return true;
        }else{
            return false;
        }
    }
    public boolean addProduk(String namaProduk, int harga, int stok){
        int result = data.addProduk(namaProduk, harga, stok);
        if(result != 0){
            return true;
        }else{
            return false;
        }
    }
    public void deleteAllProduk() {
        boolean success = data.deleteAllProduk();
        if(success){
            JOptionPane.showMessageDialog(null, "Berhasil Menghapus Semua Produk...");
        }else{
            JOptionPane.showMessageDialog(null, "Gagal Menghapus semua produk");
        }
    }
}
