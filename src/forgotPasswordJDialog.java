import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.Properties;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import javax.mail.*;
import javax.mail.internet.*;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class forgotPasswordJDialog extends JDialog {

    private static final long serialVersionUID = 1L;
    private final JPanel contentPanel = new JPanel();
    private JTextField emailTXT;

    // Replace with your DB connection details
    private final String DB_URL = "jdbc:mysql://localhost/tipasdb";
    private final String DB_USER = "root";
    private final String DB_PASS = "";

    public forgotPasswordJDialog() {
    	
        setBounds(100, 100, 450, 200);
        getContentPane().setLayout(new BorderLayout());
        contentPanel.setBackground(new Color(254, 213, 171));
        contentPanel.setBorder(null);
        getContentPane().add(contentPanel, BorderLayout.CENTER);
        contentPanel.setLayout(null);

        JLabel lblTitle = new JLabel("Forgot Password?");
        lblTitle.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblTitle.setBounds(150, 11, 132, 29);
        contentPanel.add(lblTitle);

        JLabel lblInstruction = new JLabel("Enter your email address");
        lblInstruction.setFont(new Font("Tahoma", Font.PLAIN, 13));
        lblInstruction.setBounds(144, 47, 171, 14);
        contentPanel.add(lblInstruction);

        emailTXT = new JTextField();
        emailTXT.setBounds(85, 76, 273, 20);
        contentPanel.add(emailTXT);
        emailTXT.setColumns(10);
        

        JButton btnContinue = new JButton("Continue");
        btnContinue.setBackground(new Color(255, 140, 0));
        btnContinue.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                checkEmail(emailTXT.getText().trim());
            }
        });
        btnContinue.setBounds(173, 107, 89, 23);
        contentPanel.add(btnContinue);
    }

    private void checkEmail(String email) {
        if (email.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter your email.");
            return;
        }

        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
             PreparedStatement stmt = conn.prepareStatement("SELECT favorite_pet FROM registeruser WHERE email = ?")) {

            stmt.setString(1, email);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                String correctPet = rs.getString("favorite_pet");

                String userAnswer = JOptionPane.showInputDialog(this, "What is your favorite pet?");
                if (userAnswer != null && userAnswer.trim().equalsIgnoreCase(correctPet)) {      
                	JOptionPane.showMessageDialog(this, "Pet Match");
                    forgotpassnew pass = new forgotpassnew(emailTXT);
                    pass.setLocationRelativeTo(null);
                	pass.setVisible(true);
                	setVisible(false);
                    
                } else {
                    JOptionPane.showMessageDialog(this, "Incorrect answer to the security question.");
                }

            } else {
                JOptionPane.showMessageDialog(this, "Email not found.");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage());
            ex.printStackTrace();
        }
    }

  

    
        
    
}
 