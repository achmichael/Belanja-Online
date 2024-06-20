package Controller.KeranjangController;

import Controller.ProdukController.ProdukController;
import Models.KeranjangModels.KeranjangModel;
import javax.swing.*;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import Views.*;
import java.time.LocalDateTime;
import javax.swing.table.DefaultTableModel;

public class KeranjangController {

    KeranjangModel keranjang;
    ProdukController produk;
    private ResultSet resultSet;
    public boolean show = true;

    public KeranjangController() {
        this.keranjang = new KeranjangModel();
        this.produk = new ProdukController();
    }

    public void deleteAllPesanan() {
        try {
            keranjang.hapusSemuaPesanan();
            JOptionPane.showMessageDialog(null, "Pesanan Semua Berhasil Dihapus", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            System.out.println("Terjadi Kesalahan pada : " + e.getMessage());
        }
    }

    public void deletePesanan(String namaProduk) {
        try {
            int result = keranjang.hapusPesanan(namaProduk);
            if (result != 0) {
                JOptionPane.showMessageDialog(null, "Pesanan Berhasil Dihapus", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Pesanan Gagal Dihapus", "Error", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            System.out.println("Terjadi Kesalahan pada : " + e.getMessage());
        }
    }
    public void showPesanan(DefaultTableModel table) {
        try {
            resultSet = keranjang.showPesanan();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            if (!resultSet.isBeforeFirst()) {
                this.show = false;
                return;
            }
            while (resultSet.next()) {
                keranjang.setNamaProduk(resultSet.getString("nama_produk"));
                keranjang.setHarga(Integer.parseInt(resultSet.getString("harga")));
                String waktuPemesanan = resultSet.getString("waktu_pemesanan");
                LocalDateTime waktuPesan = LocalDateTime.parse(waktuPemesanan, formatter);
                keranjang.setWaktuPesan(waktuPesan);
                int harga = Integer.parseInt(resultSet.getString("harga"));
                int jumlah = Integer.parseInt(resultSet.getString("jumlah"));
                int totalHarga = harga * jumlah;
                Object[] datas = {resultSet.getString("id"), keranjang.getNamaProduk(), keranjang.getHarga(), keranjang.getWaktuPesan().format(formatter), totalHarga};
                table.addRow(datas);
            }
        } catch (Exception e) {
            System.out.println("Terjadi Kesalahan pada : " + e.getMessage());
            e.printStackTrace();
        }
    }
    public String showStruk() {
    StringBuilder message = new StringBuilder();
    int totalHarusDibayar = 0;

    try {
        resultSet = keranjang.showPesanan();
        while (resultSet.next()) {
            String namaProduk = resultSet.getString("nama_produk");
            int jumlah = Integer.parseInt(resultSet.getString("jumlah"));
            int harga = Integer.parseInt(resultSet.getString("harga"));
            int totalHarga = harga * jumlah;
            totalHarusDibayar += totalHarga;

            message.append("Nama Produk: ").append(namaProduk).append("\n")
                   .append("Harga Produk: ").append(harga).append("\n")
                   .append("Jumlah: ").append(jumlah).append("\n")
                   .append("Total Harga: ").append(totalHarga).append("\n")
                   .append("-------------\n");
        }
        message.append("Total Harga Akhir: ").append(totalHarusDibayar).append("\n").append("Metode Pembayaran").append("\n").append("Transfer Ke Rekening 6201231021").append("\n").append("sukses Dibeli");
    } catch (Exception e) {
        System.out.println("Terjadi Kesalahan pada: " + e.getMessage());
    }
    return message.toString();
}
}
