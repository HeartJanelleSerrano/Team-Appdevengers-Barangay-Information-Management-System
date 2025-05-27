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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Enumeration;
import java.awt.event.ActionEvent;

public class updateInformation extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField birthdateTXT;
	private JTextField ageTXT;
	private JTextField contactTXT;
	private JTextField occupationTXT;
	private JTextField addressTXT;
	private JTextField enterIDtext;
	private JTextField fullnameTXT;

	public static void main(String[] args) {
		try {
			updateInformation dialog = new updateInformation();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public updateInformation() {
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
			
			JLabel lblNewLabel = new JLabel("Update Resident Information");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel.setBounds(295, 21, 215, 14);
			panel.add(lblNewLabel);
			
			JLabel surNameLBL = new JLabel("Surname");
			surNameLBL.setFont(new Font("Tahoma", Font.PLAIN, 13));
			surNameLBL.setBounds(40, 80, 52, 14);
			panel.add(surNameLBL);
			
			JLabel firstNameLBL = new JLabel("First name");
			firstNameLBL.setFont(new Font("Tahoma", Font.PLAIN, 13));
			firstNameLBL.setBounds(206, 80, 70, 14);
			panel.add(firstNameLBL);
			
			birthdateTXT = new JTextField();
			birthdateTXT.setBounds(40, 151, 179, 20);
			panel.add(birthdateTXT);
			birthdateTXT.setColumns(10);
			
			JLabel middleInitialBL = new JLabel("Middle Initial");
			middleInitialBL.setFont(new Font("Tahoma", Font.PLAIN, 13));
			middleInitialBL.setBounds(420, 80, 79, 14);
			panel.add(middleInitialBL);
			
			JLabel suffixLBL = new JLabel("Suffix");
			suffixLBL.setFont(new Font("Tahoma", Font.PLAIN, 13));
			suffixLBL.setBounds(560, 80, 46, 14);
			panel.add(suffixLBL);
			
			JLabel birthDateLBL = new JLabel("Birthdate");
			birthDateLBL.setFont(new Font("Tahoma", Font.PLAIN, 13));
			birthDateLBL.setBounds(40, 136, 52, 14);
			panel.add(birthDateLBL);
			
			ageTXT = new JTextField();
			ageTXT.setBounds(263, 151, 92, 20);
			panel.add(ageTXT);
			ageTXT.setColumns(10);
			
			JLabel ageLBL = new JLabel("Age");
			ageLBL.setBounds(263, 137, 46, 14);
			panel.add(ageLBL);
			
			contactTXT = new JTextField();
			contactTXT.setBounds(436, 151, 192, 20);
			panel.add(contactTXT);
			contactTXT.setColumns(10);
			
			JLabel contactNumLBL = new JLabel("Contact Number");
			contactNumLBL.setFont(new Font("Tahoma", Font.PLAIN, 13));
			contactNumLBL.setBounds(436, 137, 92, 14);
			panel.add(contactNumLBL);
			
			JLabel statusLBL = new JLabel("Status");
			statusLBL.setFont(new Font("Tahoma", Font.PLAIN, 13));
			statusLBL.setBounds(40, 196, 46, 14);
			panel.add(statusLBL);
			
			occupationTXT = new JTextField();
			occupationTXT.setBounds(436, 209, 192, 20);
			panel.add(occupationTXT);
			occupationTXT.setColumns(10);
			
			JLabel occupationLBL = new JLabel("Occupation");
			occupationLBL.setFont(new Font("Tahoma", Font.PLAIN, 13));
			occupationLBL.setBounds(436, 196, 74, 14);
			panel.add(occupationLBL);
			
			JLabel genderLBL = new JLabel("Gender");
			genderLBL.setBounds(263, 197, 46, 14);
			panel.add(genderLBL);
			
			JRadioButton maleRDBTN = new JRadioButton("Male");
			maleRDBTN.setBounds(263, 209, 52, 20);
			panel.add(maleRDBTN);
			
			JRadioButton femaleRDBTN = new JRadioButton("Female");
			femaleRDBTN.setBounds(320, 209, 79, 21);
			panel.add(femaleRDBTN);
			
			ButtonGroup genderBG = new ButtonGroup();
			genderBG.add(maleRDBTN);
			genderBG.add(femaleRDBTN);
			
			addressTXT = new JTextField();
			addressTXT.setBounds(40, 267, 459, 20);
			panel.add(addressTXT);
			addressTXT.setColumns(10);
			
			JLabel houseNumLBL = new JLabel("House no.");
			houseNumLBL.setFont(new Font("Tahoma", Font.PLAIN, 13));
			houseNumLBL.setBounds(40, 253, 70, 14);
			panel.add(houseNumLBL);
			
			JLabel streetNameLBL = new JLabel("Street Name");
			streetNameLBL.setFont(new Font("Tahoma", Font.PLAIN, 13));
			streetNameLBL.setBounds(206, 253, 76, 14);
			panel.add(streetNameLBL);
			
			JLabel barangayLBL = new JLabel("Barangay");
			barangayLBL.setFont(new Font("Tahoma", Font.PLAIN, 13));
			barangayLBL.setBounds(410, 253, 59, 14);
			panel.add(barangayLBL);
			
			JLabel cityLBL = new JLabel("City");
			cityLBL.setFont(new Font("Tahoma", Font.PLAIN, 13));
			cityLBL.setBounds(652, 253, 46, 14);
			panel.add(cityLBL);
			

			JComboBox<String> statusCB = new JComboBox<String>();
			statusCB.setBounds(40, 209, 179, 21);
			statusCB.addItem("");
			statusCB.addItem("Single");
			statusCB.addItem("Married");
			statusCB.addItem("Divorced");
			statusCB.addItem("Widowed");
			panel.add(statusCB);
			
			JComboBox<String> suffixCB = new JComboBox<String>();
			suffixCB.setBounds(559, 93, 63, 21);
			suffixCB.addItem("");
			suffixCB.addItem("Jr");
			suffixCB.addItem("Sr");
			suffixCB.addItem("I");
			suffixCB.addItem("II");
			suffixCB.addItem("III");
			suffixCB.addItem("IV");
			panel.add(suffixCB);
			
			enterIDtext = new JTextField();
			enterIDtext.setBounds(583, 52, 70, 20);
			panel.add(enterIDtext);
			enterIDtext.setColumns(10);
			
			JLabel lblNewLabel_1 = new JLabel("Enter ID:");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblNewLabel_1.setBounds(525, 54, 52, 14);
			panel.add(lblNewLabel_1);
			
			JButton updateInformationBTN = new JButton("Update Resident");
			updateInformationBTN.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int age;
					int id;
					if(e.getSource()==updateInformationBTN) {
						String fullname = fullnameTXT.getText();
						String suffix = suffixCB.getSelectedItem().toString();
						String birthday = birthdateTXT.getText();
						
						String gender = null;
			            Enumeration<AbstractButton> buttons = genderBG.getElements();
			            while (buttons.hasMoreElements()) {
			                AbstractButton button = buttons.nextElement();
			                if (button.isSelected()) {
			                    gender = button.getText();
			                    break;
			                }
			            }
			           
			            String status = statusCB.getSelectedItem().toString();
			            String occupation = occupationTXT.getText();
			            String address = addressTXT.getText();
			            String contact = contactTXT.getText();
			       
			            if (contact.length() != 11) {
			                JOptionPane.showMessageDialog(null, "Contact number must be exactly 11 digits.");
			                return;
			            }

			            for (int i = 0; i < contact.length(); i++) {
			                if (!Character.isDigit(contact.charAt(i))) {
			                    JOptionPane.showMessageDialog(null, "Contact number must only contain digits.");
			                    return;
			                }
			            }
			            
			            
			            try {
			                age = Integer.parseInt(ageTXT.getText());     
			            } catch (NumberFormatException ex) {
			                JOptionPane.showMessageDialog(null, "Please enter valid numbers for Age.");
			                return;
			            }
			            
			            
			            try {
			                
			                id = Integer.parseInt(enterIDtext.getText());
			                
			            } catch (NumberFormatException ex) {
			                JOptionPane.showMessageDialog(null, "Please enter valid numbers for ID.");
			                return;
			            }
			            
			            try {
			            Connection con = DBConnection.getConnection();
			            String updateQuery = "UPDATE addresident SET fullname = ?, suffix = ?, birthday = ?, age = ?, gender = ?, contact = ?, status = ?, occupation = ?, address = ? WHERE id = ?";
			            PreparedStatement pst = con.prepareStatement(updateQuery);
			            
							pst.setString(1, fullname);
							pst.setString(2, suffix);
							pst.setString(3, birthday);
							pst.setInt(4, age);
							pst.setString(5, gender);
							pst.setString(6, contact);
							pst.setString(7, status);
							pst.setString(8, occupation);
							pst.setString(9, address);
							pst.setInt(10, id);
							
							int rows = pst.executeUpdate();
							
							if(rows > 0) {
								JOptionPane.showMessageDialog(null, "Inserted Successfully");
							}else {
								JOptionPane.showMessageDialog(null, "Failed to Insert");
							}
							
							
						} catch (SQLException e1) {
						
							e1.printStackTrace();
						}
			            
						
					}
				}
			});
			updateInformationBTN.setBounds(295, 314, 186, 23);
			panel.add(updateInformationBTN);
			
			JButton searchIDBTN = new JButton("Search ID");
			searchIDBTN.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e) {
			        if (e.getSource() == searchIDBTN) {
			            int ID;

			            try {
			                // Validate ID input
			                String idText = enterIDtext.getText().trim();
			                if (idText.isEmpty()) {
			                    JOptionPane.showMessageDialog(null, "Please enter an ID.");
			                    return;
			                }

			                ID = Integer.parseInt(idText);
			            } catch (NumberFormatException ex) {
			                JOptionPane.showMessageDialog(null, "ID must be a valid number.");
			                return;
			            }

			            try {
			                Connection con = DBConnection.getConnection();
			                String query = "SELECT * FROM addresident WHERE id = ?";
			                PreparedStatement pst = con.prepareStatement(query);
			                pst.setInt(1, ID);
			                ResultSet rs = pst.executeQuery();

			                if (rs.next()) {
			                    suffixCB.setSelectedItem(rs.getString("suffix"));
			                    statusCB.setSelectedItem(rs.getString("status"));
			                    fullnameTXT.setText(rs.getString("fullname"));
			                    birthdateTXT.setText(rs.getString("birthday"));
			                    ageTXT.setText(rs.getString("age"));
			                    contactTXT.setText(rs.getString("contact"));

			                    String gender = rs.getString("gender");
			                    if ("Male".equalsIgnoreCase(gender)) {
			                        maleRDBTN.setSelected(true);
			                    } else if ("Female".equalsIgnoreCase(gender)) {
			                        femaleRDBTN.setSelected(true);
			                    }

			                    addressTXT.setText(rs.getString("address"));
			                    occupationTXT.setText(rs.getString("occupation"));
			                } else {
			                    JOptionPane.showMessageDialog(null, "No resident found with ID: " + ID);
			                }

			                rs.close();
			                pst.close();
			                con.close();

			            } catch (SQLException e1) {
			                JOptionPane.showMessageDialog(null, "Database error: " + e1.getMessage());
			                e1.printStackTrace();
			            }
			        }
			    }
			});

			searchIDBTN.setBounds(663, 51, 92, 23);
			panel.add(searchIDBTN);
			
			fullnameTXT = new JTextField();
			fullnameTXT.setBounds(40, 93, 459, 20);
			panel.add(fullnameTXT);
			fullnameTXT.setColumns(10);
			
		}
	}
}
