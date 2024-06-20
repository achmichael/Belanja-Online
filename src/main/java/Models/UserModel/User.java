package Models.UserModel;

import Database.Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class User extends Akun {
    Database objek = new Database();
    Connection connection = objek.getConnection();
    public User() {

    }
    public User(String username, String password) {
        super(username, password);
    }
    public ResultSet login (String username, String password){
        try {
            String sql = "SELECT * FROM users WHERE username = ? AND password = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            resultSet = preparedStatement.executeQuery();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return resultSet;
    }
    public int register(String username, String password) {
        try {
            String sql = "INSERT INTO users (username, password) VALUES (?, ?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            int rowsInserted = preparedStatement.executeUpdate();
            return rowsInserted; // Mengembalikan jumlah baris yang disisipkan
        } catch (SQLException e) {
            return 0;
        }
    }
    public String showInfo (String username) {
        return "Haiii " + username;
    }
    public ResultSet showDataUsers() {
        try{
            String sql = "SELECT * FROM users";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
        }catch(Exception e){
            System.out.println("Terjadi Kesalahan pada : " + e.getMessage());
        }
        return resultSet;
    }
    public int deleteDataUser(int id) {
        try{
            String sql = "DELETE FROM users WHERE id = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            return preparedStatement.executeUpdate();
        }catch(Exception e){
            System.out.println("Terjadi kesalahan pada : " + e.getMessage());
        }
        return 0;
    }
    public boolean deleteAllDatasUsers() {
        try{
            String sql = "TRUNCATE TABLE users";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();
            return true;
        }catch(Exception e){
            System.out.println("Terjadi Kesalahan pada : " + e.getMessage());
            return false;
        }
    }
    public int updateDataUser(int id ,String username, String password){
        try{
            String sql = "UPDATE users SET username = ?, password = ? WHERE id = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            preparedStatement.setInt(3, id);
            return preparedStatement.executeUpdate();
        }catch(Exception e){
            System.out.println("Terjadi Kesalahan pada : " + e.getMessage());
        }
        return 0;
    }
}
