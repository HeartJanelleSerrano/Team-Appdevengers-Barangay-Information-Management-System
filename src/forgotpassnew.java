import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.BevelBorder;

public class forgotpassnew extends JDialog {

    private static final long serialVersionUID = 1L;
    private final JPanel contentPanel = new JPanel();
    private JTextField newpasswordTXT;
    private JTextField confirmpasswordTXT;
    
    private static final String DB_URL = "jdbc:mysql://localhost:3306/tipasdb";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "";

    private JTextField userEmail; 
    
    public forgotpassnew(JTextField emailTXT) {
    	this.userEmail = emailTXT;
       

        setBounds(100, 100, 535, 356);
        getContentPane().setLayout(new BorderLayout());
        contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        getContentPane().add(contentPanel, BorderLayout.CENTER);
        contentPanel.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBorder(null);
        panel.setBackground(new Color(255, 217, 191));
        panel.setBounds(0, 0, 519, 317);
        contentPanel.add(panel);
        panel.setLayout(null);

        JLabel lblNewLabel = new JLabel("Create New Password");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblNewLabel.setBounds(179, 11, 160, 14);
        panel.add(lblNewLabel);

        JLabel lblYourNewPassword = new JLabel("Your new password must be different from any your previous passwords.");
        lblYourNewPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblYourNewPassword.setBounds(36, 63, 449, 32);
        panel.add(lblYourNewPassword);

        newpasswordTXT = new JTextField();
        newpasswordTXT.setBounds(143, 135, 232, 20);
        panel.add(newpasswordTXT);
        newpasswordTXT.setColumns(10);

        JLabel lblNewPassword = new JLabel("New Password");
        lblNewPassword.setFont(new Font("Arial", Font.PLAIN, 14));
        lblNewPassword.setBounds(143, 118, 232, 20);
        panel.add(lblNewPassword);

        JLabel lblConfirmPassword = new JLabel("Confirm Password");
        lblConfirmPassword.setFont(new Font("Arial", Font.PLAIN, 14));
        lblConfirmPassword.setBounds(143, 179, 234, 20);
        panel.add(lblConfirmPassword);

        confirmpasswordTXT = new JTextField();
        confirmpasswordTXT.setColumns(10);
        confirmpasswordTXT.setBounds(143, 197, 234, 20);
        panel.add(confirmpasswordTXT);

        JButton resetBTN = new JButton("Reset Password");
        resetBTN.setFont(new Font("Arial", Font.BOLD, 14));
        resetBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	
                String newPass = newpasswordTXT.getText().trim();
                String confirmPass = confirmpasswordTXT.getText().trim();
                String email = emailTXT.getText();
                
                if(newPass.equals(confirmPass)) {
                
                try { 
                Connection con = DBConnection.getConnection();
                String updateQuery = "UPDATE registeruser SET password = ? WHERE email = ?";
                PreparedStatement pst = con.prepareStatement(updateQuery);
                pst.setString(1, confirmPass);
                pst.setString(2, email); 
               
                int rows = pst.executeUpdate();
                
                if(rows > 0) {
                	JOptionPane.showMessageDialog(null, "Password Updated");
                	dispose();
                }
                else {
                	JOptionPane.showMessageDialog(null, "Password not Updated");
                }
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
                }
                else {
                	JOptionPane.showMessageDialog(null, "New password and confirm password do not match.");

                }
            }
        });
        resetBTN.setBounds(160, 248, 197, 32);
        resetBTN.setBackground(new Color(255, 139, 83));
        panel.add(resetBTN);

        
    }

   
  }

