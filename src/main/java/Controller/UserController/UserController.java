package Controller.UserController;
import Models.UserModel.*;
import Views.*;
import java.sql.ResultSet;
import javax.swing.*;
public class UserController {
    private Akun user;
    private Login loginPage;
    private Register registerPage;
    private ResultSet resultSet;
    public UserController(Akun user) {
        this.user = user;
        registerPage = new Register();
    }
    public void login(String username, String password, Login login){
        loginPage = login;
        try{
            resultSet = user.login(username, password);
            if (resultSet == null) {
                System.out.println("Tidak ada akun yang ditemukan...");
                return;
            }
            if (resultSet.next()) {
//                success = true;
                loginPage.dispose();    
                Dashboard dashboard = new Dashboard(resultSet.getString("username"));
                dashboard.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "Username And Password Incorrect");
//                success = false;
            }
        }catch (Exception e){
            System.out.println("Terjadi Kesalahan pada : " + e.getMessage());
        }
//        return success;
    }
    public void register (String username, String password, Register register, Login loginPage){
        this.registerPage = register;
        loginPage = loginPage;
//        boolean success = false;
        user.setUsername(username);
        user.setPassword(password);
        int result = user.register(username, password);
        if (result != 0){
            JOptionPane.showMessageDialog(null, "Register Berhasil Silahkan Login...");
            registerPage.dispose();
            loginPage.setVisible(true);
//            success = true;
        }else{
            JOptionPane.showMessageDialog(null, "Username Sudah digunakan");
//            success = false;
        }
//        return success;
    }
}
