package Models.UserModel;
import Database.Database;
import java.sql.*;
public class Akun {
    Database objek = new Database();
    Connection connection = objek.getConnection();
    private String username;
    private String password;
    ResultSet resultSet;
    PreparedStatement preparedStatement;
    public Akun(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public Akun () {

    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String showInfo (String username) {
        return "Haloo";
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
        PreparedStatement preparedStatement = null;
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
}
