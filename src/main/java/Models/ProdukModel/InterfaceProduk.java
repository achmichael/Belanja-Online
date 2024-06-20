/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models.ProdukModel;

import java.sql.ResultSet;

public interface InterfaceProduk {
    public ResultSet searchProduk(String namaProduk);
    public ResultSet showProduk();
    public int updateProduk(int idProduk, String namaProduk, int harga, int stok);
    public int deleteProduk(int idProduk);
    public int addProduk(String namaProduk, int harga, int stok);
}
