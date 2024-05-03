/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package starting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;

/**
 *
 * @author Jaden
 */
public class LoginPage extends javax.swing.JFrame {

    /**
     * Creates new form Enroll
     */
    
    private int loginAttempt = 0;
    private int sessionUserID;
    
    public LoginPage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfUsername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        pfPassword = new javax.swing.JPasswordField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("LOGIN");

        jLabel2.setText("Username");

        tfUsername.setToolTipText("username");
        tfUsername.setActionCommand("<Not Set>");

        jLabel3.setText("Password");

        jLabel4.setText("Remember Password");

        jButton1.setBackground(new java.awt.Color(118, 29, 29));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("SIGN IN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Don't have an account?");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Sign up");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pfPassword)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jCheckBox1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(79, 79, 79))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCheckBox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(43, 43, 43)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addContainerGap(116, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 600));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/loginPage.png"))); // NOI18N
        jLabel10.setToolTipText("");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, -1, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        new RegisterPage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String username = tfUsername.getText();
        String password = pfPassword.getText();
        
        if(!username.isBlank() && !password.isBlank()){
            getAuthenticatedUser(username, password);
        }else{
            JOptionPane.showMessageDialog(this, "Please fill in all fields.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void getAuthenticatedUser(String username, String password){
        final String DB_URL = "jdbc:mysql://localhost:3306/myenrollment";
        final String USERNAME = "admin";
        final String PASSWORD = "admin";
        
        try {
            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            // Succesfully connected to database...
            
            String sqlBlockedCheck = "SELECT UserId, UserBlocked FROM ACCOUNT WHERE Username = ?";
            PreparedStatement preparedStatementBlockedCheck = conn.prepareStatement(sqlBlockedCheck);
            preparedStatementBlockedCheck.setString(1, username);

            ResultSet resultSetBlockedCheck = preparedStatementBlockedCheck.executeQuery();
            
            if (resultSetBlockedCheck.next()) {
                int UserId = resultSetBlockedCheck.getInt("UserId");
                boolean isBlocked = resultSetBlockedCheck.getBoolean("UserBlocked");

                // Get the current date and time
                LocalDateTime now = LocalDateTime.now();
                // Convert LocalDateTime to java.sql.Timestamp
                Timestamp currentTimestamp = Timestamp.valueOf(now);

                String sqlLogs = "INSERT INTO LOG (UserId, AttemptDate) VALUES (?,?)";
                PreparedStatement preparedStatementLogs = conn.prepareStatement(sqlLogs);
                preparedStatementLogs.setInt(1, UserId);
                preparedStatementLogs.setTimestamp(2, currentTimestamp);

                int rowsInserted = preparedStatementLogs.executeUpdate();
                if (rowsInserted > 0) {
                    System.out.println("User log was inserted successfully.");
                } else {
                    System.out.println("Sum went wrong homes.");
                }

                if (isBlocked) {
                    JOptionPane.showMessageDialog(null, "User is blocked for exceeding login attempt limit. "
                            + "You may contact an administrator to get your account unblocked.");
                    return;
                }
            }

            String sqlCredential = "SELECT * FROM ACCOUNT WHERE Username = ? AND Password = ?";
            PreparedStatement preparedStatementCredential = conn.prepareStatement(sqlCredential);
            preparedStatementCredential.setString(1, username);
            preparedStatementCredential.setString(2, password);

            ResultSet resultSetCredential = preparedStatementCredential.executeQuery();

            if (resultSetCredential.next()) {
                Object isBlocked = resultSetCredential.getObject(4);
                if (isBlocked.equals("false")) { 
                    sessionUserID = resultSetCredential.getInt("UserID");
                    JOptionPane.showMessageDialog(null, "Login Successful.");
                    loginAttempt = 0;
                    HomePage homePage = new HomePage(sessionUserID);
                    homePage.setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, """
                                                        User was blocked for exceeding login attempt limit.
                                                        You may contact an administrator to get your account unblocked.
                                                        """);
                }
            } else {
                loginAttempt++;
                if (loginAttempt == 3) {
                    String sqlBlocked = "UPDATE user_account set userBlocked = 'true' WHERE username = ?";
                    PreparedStatement preparedStatementBlocked = conn.prepareStatement(sqlBlocked);
                    preparedStatementBlocked.setString(1, username);

                    int rowsUpdated = preparedStatementBlocked.executeUpdate();

                    if (rowsUpdated > 0) {
                        JOptionPane.showMessageDialog(null, """
                                    Account blocked for exceeding login attempt limit.
                                    You may contact an administrator to get your account unblocked.
                                    """);
                        loginAttempt = 0;
                    } else {
                        JOptionPane.showMessageDialog(null, "Failed to update account status.\nUser may not be existing.");
                        loginAttempt = 0;
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Username or password is incorrect."
                            + "\nAttempt " + loginAttempt + " of 3.");
                }
            }
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
    }
    
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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField pfPassword;
    private javax.swing.JTextField tfUsername;
    // End of variables declaration//GEN-END:variables
}
