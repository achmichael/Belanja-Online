# Dokumentasi Aplikasi Belanja Online Sederhana

## Pendahuluan
Aplikasi Belanja Online Sederhana adalah aplikasi desktop yang dibangun menggunakan bahasa pemrograman Java dan berbasis GUI dengan menggunakan JFrame. Aplikasi ini menerapkan desain pola MVC (Model-View-Controller) dan memiliki fitur untuk user dan admin.

## Fitur

### Fitur User
- **Belanja Produk**: User dapat melihat daftar produk yang tersedia dan menambahkan produk ke keranjang belanja.
- **Menghapus Pesanan**: User dapat menghapus produk dari keranjang belanja.
- **Checkout**: User dapat melakukan checkout untuk menyelesaikan pembelian.

### Fitur Admin
- **CRUD Produk**: Admin dapat melakukan pengolahan data produk, termasuk menambahkan, melihat, memperbarui, dan menghapus produk.
- **CRUD User**: Admin dapat melakukan pengolahan data user, termasuk menambahkan, melihat, memperbarui, dan menghapus user.

## Struktur Proyek
Proyek ini mengikuti pola desain MVC agar lebih mudah untuk memanage dan mendebugging kode

## Deskripsi Kelas

### Model
- **Product.java**: Kelas ini merepresentasikan data produk.
- **User.java**: Kelas ini merepresentasikan data user.
- **ProductModel.java**: Kelas ini mengelola operasi CRUD untuk data produk.
- **UserModel.java**: Kelas ini mengelola operasi CRUD untuk data user.

### View
- **AdminPage.java**: Kelas ini mengatur tampilan GUI untuk admin.
- **Dashboard.java**: Kelas ini mengatur tampilan GUI untuk melihat produk.
- **Keranjang.java**: Kelas ini mengatur tampilan GUI untuk melihat produk yang sudah ditambahkan ke keranjang.
- **Display.java**: Kelas ini mengatur tampilan GUI untuk proses checkout.

### Controller
- **AdminController.java**: Kelas ini mengontrol alur data antara AdminPage dan model.
- **UserController.java**: Kelas ini mengontrol alur data antara UserPage dan model.
- **KeranjangController.java**: Kelas Ini mengontrol alur data antara ProdukModel dan Keranjang
### Main Class
- **App.java**: Kelas ini berfungsi untuk menjalankan aplikasi.

## Integrasi dengan Database

### Database Connection
Aplikasi ini menggunakan kelas **DatabaseConnection** untuk mengelola koneksi ke database. Koneksi ke database digunakan untuk menyimpan, memperbarui, dan mengambil data produk dan user.

#### DatabaseConnection.java
```java
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/online_shop";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
```
### Anda Bisa Mengganti Username, password dan nama dari database anda sendiri

Aplikasi ini menggunakan prinsip-prinsip Pemrograman Berorientasi Objek (OOP) sebagai berikut:

- **`Encapsulation`**: Semua data produk dan user disimpan dalam kelas model yang terpisah, dan akses ke data tersebut dilakukan melalui metode getter dan setter.
- **`Inheritance`**: Struktur aplikasi memungkinkan penambahan fitur baru dengan mudah melalui pewarisan kelas.
- **`Interface`**: Metode ini digunakan untuk menerapkan prinsip Reusability.
- **`Abstraction`**: Detail implementasi disembunyikan dari user, yang hanya berinteraksi dengan antarmuka GUI.

## Cara Menjalankan Aplikasi
1. Clone repositori ini.
2. Buka proyek di IDE favorit Anda (misalnya, IntelliJ IDEA, Eclipse).
3. Jalankan `Display.java` untuk memulai aplikasi. (Entrypoint Aplikasi)

