package Controller.ProdukController;

import Models.KeranjangModels.KeranjangModel;
import Models.ProdukModel.*;
import java.sql.ResultSet;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ProdukController {

    private Produk produk;
    private ResultSet resultSet;

    public ProdukController() {
        this.produk = new Produk();
    }

    public void buyProduk(int id) {
        try {
            resultSet = produk.searchProduk(id);
            if (resultSet.next() && Integer.parseInt(resultSet.getString("stok")) != 0) {
                int response = JOptionPane.showConfirmDialog(null,
                        "Apakah Anda akan membeli produk ini?",
                        "Konfirmasi Pembelian",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE);
                if (response == JOptionPane.YES_OPTION) {
                    String jumlahStr = JOptionPane.showInputDialog(null,
                            "Masukkan jumlah barang yang akan dibeli:",
                            "Jumlah Pembelian",
                            JOptionPane.PLAIN_MESSAGE);
                    int jumlah = Integer.parseInt(jumlahStr);
                    int stok = Integer.parseInt(resultSet.getString("stok"));
                    if (jumlah > stok) {
                        JOptionPane.showMessageDialog(null, "Stok Barang tidak cukup", "Error", JOptionPane.INFORMATION_MESSAGE);
                        return;
                    } else {
                        int updateStok = stok - jumlah;
                        produk.updateProduk(Integer.parseInt(resultSet.getString("id")), resultSet.getString("nama_produk"), Integer.parseInt(resultSet.getString("harga")), updateStok);
                        int result = produk.addPesanan(resultSet.getString("nama_produk"), Integer.parseInt(resultSet.getString("harga")), jumlah);
                        if (result != 0) {
                            JOptionPane.showMessageDialog(null, "Produk Sukses Ditambahkan Ke dalam Keranjang", "Success", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "Gagal Menambahkan Produk Ke dalam Keranjang", "Error", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Stok Produk Habis...", "Error", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            System.out.println("Terjaadi Kesalahan pada : " + e.getMessage());
        }
    }

    public void searchProduk(String namaProduk) {
        try {
            resultSet = produk.searchProduk(namaProduk);
            if (resultSet.next()) {
                JOptionPane.showMessageDialog(null, "Nama Produk : " + resultSet.getString("nama_produk") + "\nHarga Produk : " + resultSet.getString("harga") + "\nStok : " + resultSet.getString("stok"), "Produk Ditemukan", JOptionPane.INFORMATION_MESSAGE);
                int response = JOptionPane.showConfirmDialog(null,
                        "Apakah Anda akan membeli produk ini?",
                        "Konfirmasi Pembelian",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE);
                if (response == JOptionPane.YES_OPTION) {
                    String jumlahStr = JOptionPane.showInputDialog(null,
                            "Masukkan jumlah barang yang akan dibeli:",
                            "Jumlah Pembelian",
                            JOptionPane.PLAIN_MESSAGE);
                    int jumlah = Integer.parseInt(jumlahStr);
                    int stok = Integer.parseInt(resultSet.getString("stok"));
                    if (stok == 0) {
                        JOptionPane.showMessageDialog(null, "Stok Barang sudah habis");
                        return;
                    } else if (jumlah > stok){
                        JOptionPane.showMessageDialog(null, "Stok barang tidak cukup");
                        return;
                    }else{
                        int updateStok = stok - jumlah;
                        produk.updateProduk(Integer.parseInt(resultSet.getString("id")), resultSet.getString("nama_produk"), Integer.parseInt(resultSet.getString("harga")), updateStok);
                        int result = produk.addPesanan(resultSet.getString("nama_produk"), Integer.parseInt(resultSet.getString("harga")), jumlah);
                        if (result != 0) {
                            JOptionPane.showMessageDialog(null, "Produk Sukses Ditambahkan Ke dalam Keranjang", "Success", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "Gagal Menambahkan Produk Ke dalam Keranjang", "Error", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Produk Tidak Ditemukan", "Error", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            System.out.println("Terjadi Kesalahan pada : " + e.getMessage());
        }
    }

    public void showStoks(JLabel[] label) {
        int index = 0;
        try {
            resultSet = produk.showProduk();
            while (resultSet.next()) {
                int stok = Integer.parseInt(resultSet.getString("stok"));
                if (stok == 0) {
                    label[index].setText("Stok Habis");
                } else {
                    label[index].setText("Stok : " + stok);
                }
                index++;
            }
        } catch (Exception e) {
            System.out.println("Terjadi Kesalahan pada : " + e.getMessage());
        }
    }
}
