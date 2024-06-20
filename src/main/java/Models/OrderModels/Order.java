package Models.OrderModels;

public class Order {
    private String namaProduk;
    private String hargaProduk;
    private int jumlah;
    public Order(String namaProduk, String hargaProduk, int jumlah) {
        this.namaProduk = namaProduk;
        this.hargaProduk = hargaProduk;
        this.jumlah = jumlah;
    }
    public String getNamaProduk() {
        return namaProduk;
    }
    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public String getHargaProduk() {
        return hargaProduk;
    }

    public void setHargaProduk(String hargaProduk) {
        this.hargaProduk = hargaProduk;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
}
