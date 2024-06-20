package Models.UserModel;

import Database.Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Admin extends Akun {
    Database objek = new Database();
    Connection connection = objek.getConnection();
    public Admin (){

    }
    public Admin(String username, String password){
        super(username, password);
    }
    public String showInfo (String username) {
        return "Admin : " + username;
    }
     public ResultSet login (String username, String password){
        try {
            String sql = "SELECT * FROM admins WHERE username = ? AND password = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            resultSet = preparedStatement.executeQuery();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return resultSet;
    }
}
