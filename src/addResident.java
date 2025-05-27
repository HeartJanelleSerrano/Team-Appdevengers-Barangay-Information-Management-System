import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Enumeration;
import java.awt.event.ActionEvent;

public class addResident extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField birthdateTXT;
	private JTextField ageTXT;
	private JTextField contactTXT;
	private JTextField occupationTXT;
	private JTextField addressTXT;
	private JTextField fullnameTXT;

	public static void main(String[] args) {
		try {
			addResident dialog = new addResident();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public addResident() {
		setBounds(100, 100, 800, 400);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			
			
			JPanel panel = new JPanel();
			panel.setBorder(new LineBorder(new Color(255, 69, 0), 4));
			panel.setBackground(new Color(255, 240, 245));
			panel.setBounds(0, 0, 784, 361);
			contentPanel.add(panel);
			panel.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("Add New Resident Information");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel.setBounds(295, 21, 215, 14);
			panel.add(lblNewLabel);
			
			JLabel surNameLBL = new JLabel("Surname");
			surNameLBL.setFont(new Font("Tahoma", Font.PLAIN, 13));
			surNameLBL.setBounds(40, 68, 52, 14);
			panel.add(surNameLBL);
			
			JLabel firstNameLBL = new JLabel("First name");
			firstNameLBL.setFont(new Font("Tahoma", Font.PLAIN, 13));
			firstNameLBL.setBounds(229, 68, 70, 14);
			panel.add(firstNameLBL);
			
			birthdateTXT = new JTextField();
			birthdateTXT.setBounds(40, 139, 179, 20);
			panel.add(birthdateTXT);
			birthdateTXT.setColumns(10);
			
			JLabel middleInitialBL = new JLabel("Middle Initial");
			middleInitialBL.setFont(new Font("Tahoma", Font.PLAIN, 13));
			middleInitialBL.setBounds(425, 68, 79, 14);
			panel.add(middleInitialBL);
			
			JLabel suffixLBL = new JLabel("Suffix");
			suffixLBL.setFont(new Font("Tahoma", Font.PLAIN, 13));
			suffixLBL.setBounds(607, 68, 46, 14);
			panel.add(suffixLBL);
			
			JLabel birthDateLBL = new JLabel("Birthdate (YYYY-MM-DD)");
			birthDateLBL.setFont(new Font("Tahoma", Font.PLAIN, 13));
			birthDateLBL.setBounds(40, 126, 179, 14);
			panel.add(birthDateLBL);
			
			ageTXT = new JTextField();
			ageTXT.setBounds(261, 139, 92, 20);
			panel.add(ageTXT);
			ageTXT.setColumns(10);
			
			JLabel ageLBL = new JLabel("Age");
			ageLBL.setFont(new Font("Arial", Font.PLAIN, 12));
			ageLBL.setBounds(263, 124, 46, 14);
			panel.add(ageLBL);
			
			contactTXT = new JTextField();
			contactTXT.setBounds(432, 139, 192, 20);
			panel.add(contactTXT);
			contactTXT.setColumns(10);
			
			JLabel contactNumLBL = new JLabel("Contact Number");
			contactNumLBL.setFont(new Font("Tahoma", Font.PLAIN, 13));
			contactNumLBL.setBounds(436, 126, 92, 14);
			panel.add(contactNumLBL);
			
			JLabel statusLBL = new JLabel("Civil Status");
			statusLBL.setFont(new Font("Tahoma", Font.PLAIN, 13));
			statusLBL.setBounds(40, 190, 179, 14);
			panel.add(statusLBL);
			
			occupationTXT = new JTextField();
			occupationTXT.setBounds(432, 204, 192, 20);
			panel.add(occupationTXT);
			occupationTXT.setColumns(10);
			
			JLabel occupationLBL = new JLabel("Occupation");
			occupationLBL.setFont(new Font("Tahoma", Font.PLAIN, 13));
			occupationLBL.setBounds(436, 190, 74, 14);
			panel.add(occupationLBL);
			
			JLabel genderLBL = new JLabel("Gender");
			genderLBL.setFont(new Font("Tahoma", Font.PLAIN, 13));
			genderLBL.setBounds(261, 190, 112, 14);
			panel.add(genderLBL);
			
			
			JRadioButton maleRDBTN = new JRadioButton("Male");
			maleRDBTN.setBounds(261, 204, 52, 20);
			panel.add(maleRDBTN);

			JRadioButton femaleRDBTN = new JRadioButton("Female");
			femaleRDBTN.setBounds(321, 204, 79, 21);
			panel.add(femaleRDBTN);

			
			ButtonGroup genderGroup = new ButtonGroup();
			genderGroup.add(maleRDBTN);
			genderGroup.add(femaleRDBTN);

			
			addressTXT = new JTextField();
			addressTXT.setBounds(40, 275, 637, 20);
			panel.add(addressTXT);
			addressTXT.setColumns(10);
			
			JLabel houseNumLBL = new JLabel("House no.");
			houseNumLBL.setFont(new Font("Tahoma", Font.PLAIN, 13));
			houseNumLBL.setBounds(41, 261, 70, 14);
			panel.add(houseNumLBL);
			
			JLabel streetNameLBL = new JLabel("Street Name");
			streetNameLBL.setFont(new Font("Tahoma", Font.PLAIN, 13));
			streetNameLBL.setBounds(205, 261, 76, 14);
			panel.add(streetNameLBL);
			
			JLabel barangayLBL = new JLabel("Barangay");
			barangayLBL.setFont(new Font("Tahoma", Font.PLAIN, 13));
			barangayLBL.setBounds(409, 261, 59, 14);
			panel.add(barangayLBL);
			
			JLabel cityLBL = new JLabel("City");
			cityLBL.setFont(new Font("Tahoma", Font.PLAIN, 13));
			cityLBL.setBounds(607, 261, 46, 14);
			panel.add(cityLBL);
			
			JComboBox<String> StatusTXT = new JComboBox<String>();
			StatusTXT.setBounds(40, 204, 179, 21);
			StatusTXT.addItem("");
			StatusTXT.addItem("Single");
			StatusTXT.addItem("Married");
			StatusTXT.addItem("Divorced");
			StatusTXT.addItem("Widowed");
			panel.add(StatusTXT);
			
			JComboBox<String> SuffixCB = new JComboBox<String>();
			SuffixCB.setBounds(607, 81, 63, 22);
			SuffixCB.addItem("");
			SuffixCB.addItem("Jr");
			SuffixCB.addItem("Sr");
			SuffixCB.addItem("I");
			SuffixCB.addItem("II");
			SuffixCB.addItem("III");
			SuffixCB.addItem("IV");
			panel.add(SuffixCB);
			
			JButton addresidentBTN = new JButton("Add Resident ");
			
			addresidentBTN.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String fullname = fullnameTXT.getText();
					String suffix = SuffixCB.getSelectedItem().toString();
					String birthday = birthdateTXT.getText();
					int age = Integer.parseInt(ageTXT.getText());
					String gender = null;
		            Enumeration<AbstractButton> buttons = genderGroup.getElements();
		            while (buttons.hasMoreElements()) {
		                AbstractButton button = buttons.nextElement();
		                if (button.isSelected()) {
		                    gender = button.getText();
		                    break;
		                }
		            }
		            String contact =contactTXT.getText();
		            String status = StatusTXT.getSelectedItem().toString();
		            String occupation = occupationTXT.getText();
		            String address = addressTXT.getText();
		            
		            try {
		          
		                if (fullname.isEmpty() || birthday.isEmpty() || gender == null || contact.isEmpty() || 
		                    status.equalsIgnoreCase("Select status") || occupation.isEmpty() || address.isEmpty()) {
		                    JOptionPane.showMessageDialog(null, "Please fill in all required fields.");
		                    return;
		                }

		          
		                if (!contact.matches("\\d{10,11}")) {
		                    JOptionPane.showMessageDialog(null, "Please enter a valid contact number (10-11 digits).");
		                    return;
		                }

		                Connection con = DBConnection.getConnection();
		                String addQuery = "INSERT INTO addresident"
		                        + "(fullname, suffix, birthday, age, gender, contact, status, occupation, address)"
		                        + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
		                PreparedStatement pst = con.prepareStatement(addQuery);

		                pst.setString(1, fullname);
		                pst.setString(2, suffix);
		                pst.setString(3, birthday);
		                pst.setInt(4, age);
		                pst.setString(5, gender);
		                pst.setString(6, contact);
		                pst.setString(7, status);
		                pst.setString(8, occupation);
		                pst.setString(9, address);

		                int rows = pst.executeUpdate();

		                if (rows > 0) {
		                    JOptionPane.showMessageDialog(null, "Resident added successfully!");
		                } else {
		                    JOptionPane.showMessageDialog(null, "Failed to add resident. Please try again.");
		                }

		                pst.close();
		                con.close();

		            } catch (SQLException e1) {
		                JOptionPane.showMessageDialog(null, "Database error: " + e1.getMessage());
		                e1.printStackTrace(); 
		            } catch (Exception e2) {
		                JOptionPane.showMessageDialog(null, "Unexpected error: " + e2.getMessage());
		                e2.printStackTrace();
		            }	
				}
			});
			addresidentBTN.setBounds(313, 314, 150, 23);
			panel.add(addresidentBTN);
			
			fullnameTXT = new JTextField();
			fullnameTXT.setBounds(40, 82, 537, 20);
			panel.add(fullnameTXT);
			fullnameTXT.setColumns(10);
			
			
		}
	}
}
