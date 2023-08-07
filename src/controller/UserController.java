package controller;

import javax.swing.JOptionPane;
import model.UserModel;
import view.MainWindow;

public class UserController {
    private UserModel model;

    public void setModel(UserModel model) {
        this.model = model;
    }
    
    // method tampilan UI
    public boolean loginUser(MainWindow view) {
        boolean isLogin = false;
        String username = view.getTxtUsername().getText();
        String password = view.getTxtPassword().getText();
        
        if(username.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "FIELD USERNAME TIDAK BOLEH KOSONG");
        } else if(password.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "FIELD PASSWORD TIDAK BOLEH KOSONG");
        } else {
            model.setUsername(username);
            model.setPassword(password);
            
            try {
                model.loginUser();
                isLogin = true;
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(view, new Object[]{
                    "TERJADI ERROR DI DATABASE DENGAN PESAN ", ex.getMessage()
                });
            }
        }
        
        return isLogin;
    }
}
