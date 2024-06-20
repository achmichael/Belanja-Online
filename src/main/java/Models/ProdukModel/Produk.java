package Models.ProdukModel;

import Database.Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Produk extends AbstractProduk implements InterfaceProduk {
    Connection connection;
    ResultSet resultSet;
    PreparedStatement psmt;
    Database objek = new Database();
    public Produk() {
        connection = objek.getConnection();
    }
    public ResultSet searchProduk (int idProduk){
        try {
            String sql = "SELECT * FROM produk WHERE id = ?";
            psmt = connection.prepareStatement(sql);
            psmt.setInt(1,idProduk);
            resultSet = psmt.executeQuery();
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan pada : " + e.getMessage());
        }
        return resultSet;
    }
    public ResultSet searchProduk(String namaProduk) {
        try {
            String sql = "SELECT * FROM produk WHERE nama_produk LIKE ?";
            psmt = connection.prepareStatement(sql);
            psmt.setString(1, "%" + namaProduk + "%");
            resultSet = psmt.executeQuery();
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan pada : " + e.getMessage());
        }
        return resultSet;
    }

    public int addProduk(String namaProduk, int harga, int stok) {
        try {
            String sql = "INSERT INTO produk (nama_produk, harga, stok) VALUES (? , ?, ?) ";
            psmt = connection.prepareStatement(sql);
            psmt.setString(1, namaProduk);
            psmt.setInt(2, harga);
            psmt.setInt(3, stok);
            int rowsUpdate = psmt.executeUpdate();
            return rowsUpdate;
        } catch (Exception e) {
            System.out.println("Terjadi Kesalahan pada : " + e.getMessage());
        }
        return 0;
    }

    public int updateProduk(int idProduk, String namaProduk, int harga, int stok) {
        try {
            String sql = "UPDATE produk SET nama_produk = ?, harga = ?, stok = ? WHERE id = ?";
            psmt = connection.prepareStatement(sql);
            psmt.setString(1, namaProduk);
            psmt.setInt(2, harga);
            psmt.setInt(3, stok);
            psmt.setInt(4, idProduk);
            int rowsUpdate = psmt.executeUpdate();
            return rowsUpdate;
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan saat memperbarui produk: " + e.getMessage());
        }
        return 0;
    }

    public int deleteProduk(int idProduk) {
        try {
            String sql = "DELETE FROM produk WHERE id = ?";
            psmt = connection.prepareStatement(sql);
            psmt.setInt(1, idProduk);
            int rowsAffected = psmt.executeUpdate();
            return rowsAffected;
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan saat menghapus produk: " + e.getMessage());
        }
        return 0;
    }

    public ResultSet showProduk() {
        try {
            String sql = "SELECT * FROM produk";
            psmt = connection.prepareStatement(sql);
            resultSet = psmt.executeQuery();
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan saat menghapus produk: " + e.getMessage());
        }
        return resultSet;
    }
    public int addPesanan (String namaProduk, int harga, int jumlah){
        int result = 0;
        try{
            String sql = "INSERT INTO keranjang (nama_produk, harga, jumlah) VALUES (?, ?, ?)";
            psmt = connection.prepareStatement(sql);
            psmt.setString(1, namaProduk);
            psmt.setInt(2, harga);
            psmt.setInt(3, jumlah);
            result = psmt.executeUpdate();
        }catch(Exception e){
            System.out.println("Terjadi kesalahan pada : " + e.getMessage());
            return 0;
        }
        return result;
    }
    public boolean deleteAllProduk() {
        try{
            String sql = "TRUNCATE TABLE produk";
            psmt = connection.prepareStatement(sql);
            psmt.executeUpdate();
            return true;
        }catch(Exception e){
            System.out.println("Terjadi Kesalahan pada : " + e.getMessage());
            return false;
        }
    }
}
