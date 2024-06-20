package Models.KeranjangModels;

import Database.Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class KeranjangModel {

    private String namaProduk;
    private int harga;
    private LocalDateTime waktuPesan;
    Database objek;
    Connection connection;
    ResultSet resultSet;
    PreparedStatement psmt;

    public KeranjangModel() {
        objek = new Database();
        connection = objek.getConnection();
    }

    public void hapusSemuaPesanan() {
        try {
            String sql = "TRUNCATE TABLE keranjang";
            psmt = connection.prepareStatement(sql);
            psmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("Terjadi Kesalahan pada : " + e.getMessage());
        }
    }
    public int hapusPesanan(String namaProduk) {
        int result = 0;
        try {
            String sql = "DELETE FROM keranjang WHERE nama_produk = ?";
            psmt = connection.prepareStatement(sql);
            psmt.setString(1, namaProduk);
            result = psmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan pada : " + e.getMessage());
            result = 0;
        }
        return result;
    }
    public ResultSet showPesanan() {
        try {
            String sql = "SELECT * FROM keranjang";
            psmt = connection.prepareStatement(sql);
            resultSet = psmt.executeQuery();
        } catch (Exception e) {
            System.out.println("Terjadi Kesalahan pada : " + e.getMessage());
            e.printStackTrace();
        }
        return resultSet;
    }
    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getHarga() {
        return this.harga;
    }
    public void setWaktuPesan(LocalDateTime waktuPesan){
        this.waktuPesan = waktuPesan;
    }
    public LocalDateTime getWaktuPesan(){
        return this.waktuPesan;
    }
}
