/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.MainWindowController;
import controller.UserController;
import event.UserListener;
import java.awt.Cursor;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import model.UserModel;

/**
 *
 * @author ariqhikari
 */
public class MainWindow extends javax.swing.JFrame implements UserListener {
    private MainWindowController windowController;
    private UserModel model;
    private UserController controller;
    private boolean isLogin = false; 

    public MainWindowController getWindowController() {
        return windowController;
    }

    /**
     * Creates new form MainFrame
     */
    public MainWindow() {
        windowController = new MainWindowController();
        windowController.setBerandaPage(new BerandaPage(this));
        windowController.setDetailMoviePage(new DetailMoviePage(this));
        windowController.setSeatPage(new SeatPage(this));
        
        initComponents();
        
//        txtUsername.setBackground(new java.awt.Color(0,0,0,1));
//        txtPassword.setBackground((new java.awt.Color(0,0,0,1)));
        
        // tambahkan kode agar frame tidak bisa diubah ukuran
        setExtendedState(JFrame.MAXIMIZED_HORIZ);
        setVisible(true);
        setResizable(false);
        
        model = new UserModel();
        model.setListener(this);
        
        controller = new UserController();
        controller.setModel(model);
        
        panelBtnLogin.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    public JTextField getTxtPassword() {
        return txtPassword;
    }

    public JTextField getTxtUsername() {
        return txtUsername;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMain = new javax.swing.JPanel();
        panelLogin = new javax.swing.JPanel();
        txtUsername = new elements.TextField();
        txtPassword = new elements.PasswordField();
        panelBtnLogin = new elements.PanelRound();
        jLabelLogin = new javax.swing.JLabel();
        jLabelPassword = new javax.swing.JLabel();
        jLabelUsername = new javax.swing.JLabel();
        jLabelDescription = new javax.swing.JLabel();
        jLabelTitle = new javax.swing.JLabel();
        jLabelLogo = new javax.swing.JLabel();
        panelRound1 = new elements.PanelRound();
        jLabelLogin1 = new javax.swing.JLabel();
        jLabelBg = new javax.swing.JLabel();
        jLabelRectangle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Five Cinema");
        getContentPane().setLayout(new java.awt.CardLayout());

        panelMain.setLayout(new java.awt.CardLayout());

        panelLogin.setBackground(new java.awt.Color(0, 25, 83));
        panelLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUsername.setBackground(new java.awt.Color(109, 218, 247));
        txtUsername.setPreferredSize(new java.awt.Dimension(65, 25));
        txtUsername.setRound(30);
        txtUsername.setShadowColor(new java.awt.Color(141, 225, 243));
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        panelLogin.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 320, 60));

        txtPassword.setBackground(new java.awt.Color(109, 218, 247));
        txtPassword.setPreferredSize(new java.awt.Dimension(65, 25));
        txtPassword.setRound(20);
        panelLogin.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 400, 320, 60));

        panelBtnLogin.setBackground(new java.awt.Color(22, 55, 128));
        panelBtnLogin.setRoundBottomLeft(30);
        panelBtnLogin.setRoundBottomRight(30);
        panelBtnLogin.setRoundTopLeft(30);
        panelBtnLogin.setRoundTopRight(30);
        panelBtnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelBtnLoginMouseClicked(evt);
            }
        });
        panelBtnLogin.setLayout(new java.awt.CardLayout());

        jLabelLogin.setFont(new java.awt.Font("SansSerif", 0, 32)); // NOI18N
        jLabelLogin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLogin.setText("Login");
        jLabelLogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelLoginMouseClicked(evt);
            }
        });
        panelBtnLogin.add(jLabelLogin, "card2");

        panelLogin.add(panelBtnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 520, 310, 60));

        jLabelPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Password.png"))); // NOI18N
        panelLogin.add(jLabelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, -1, -1));

        jLabelUsername.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Username.png"))); // NOI18N
        panelLogin.add(jLabelUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, -1, -1));

        jLabelDescription.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/description.png"))); // NOI18N
        panelLogin.add(jLabelDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, -1, -1));

        jLabelTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/FIVE CINEMA.png"))); // NOI18N
        panelLogin.add(jLabelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, -1, -1));

        jLabelLogo.setBackground(new java.awt.Color(255, 255, 255));
        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/logo.png"))); // NOI18N
        panelLogin.add(jLabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        panelRound1.setBackground(new java.awt.Color(37, 61, 114));
        panelRound1.setRoundBottomLeft(40);
        panelRound1.setRoundBottomRight(40);
        panelRound1.setRoundTopLeft(40);
        panelRound1.setRoundTopRight(40);
        panelRound1.setLayout(new java.awt.GridBagLayout());

        jLabelLogin1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Login.png"))); // NOI18N
        jLabelLogin1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelLoginMouseClicked(evt);
            }
        });
        panelRound1.add(jLabelLogin1, new java.awt.GridBagConstraints());

        panelLogin.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 520, 290, 71));

        jLabelBg.setBackground(new java.awt.Color(0, 25, 125));
        jLabelBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/bg-login.png"))); // NOI18N
        panelLogin.add(jLabelBg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabelRectangle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/rectangle-login.png"))); // NOI18N
        panelLogin.add(jLabelRectangle, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, -1, -1));

        panelMain.add(panelLogin, "card2");

        getContentPane().add(panelMain, "card3");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLoginMouseClicked
        // TODO add your handling code here:
        login();
    }//GEN-LAST:event_jLabelLoginMouseClicked

    private void panelBtnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBtnLoginMouseClicked
        // TODO add your handling code here:
        login();
    }//GEN-LAST:event_panelBtnLoginMouseClicked

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    public JPanel getPanelLogin() {
        return panelLogin;
    }

    public JPanel getPanelMain() {
        return panelMain;
    }
    
    private void login() {
        isLogin = controller.loginUser(this);
        
        if(isLogin) {
            jLabelLogin.setText("Loading..");
            JOptionPane.showMessageDialog(this, "LOGIN BERHASIL");
            windowController.tampilHalamanBeranda(this);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelBg;
    private javax.swing.JLabel jLabelDescription;
    private javax.swing.JLabel jLabelLogin;
    private javax.swing.JLabel jLabelLogin1;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelRectangle;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelUsername;
    private elements.PanelRound panelBtnLogin;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JPanel panelMain;
    private elements.PanelRound panelRound1;
    private elements.PasswordField txtPassword;
    private elements.TextField txtUsername;
    // End of variables declaration//GEN-END:variables

    @Override
    public void onChange(UserModel model) {
        this.txtUsername.setText(model.getUsername()+"");
        this.txtPassword.setText(model.getPassword());
    }
}