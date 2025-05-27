import java.awt.BorderLayout;
import java.awt.FlowLayout;
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
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Delete extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField birthdateTXT;
	private JTextField surnameTXT;
	private JTextField ageTXT;
	private JTextField contactTXT;
	private JTextField occupationTXT;
	private JTextField housenoTXT;
	private JTextField statusTXT;
	private JTextField suffixTXT;
	private JTextField idretrieveTXT;

	
	public static void main(String[] args) {
		try {
			Delete dialog = new Delete();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Delete() {
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
			
			JLabel lblNewLabel = new JLabel("Delete Resident Information");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel.setBounds(295, 21, 215, 14);
			panel.add(lblNewLabel);
			
			JLabel surNameLBL = new JLabel("Surname");
			surNameLBL.setFont(new Font("Tahoma", Font.PLAIN, 13));
			surNameLBL.setBounds(40, 88, 52, 14);
			panel.add(surNameLBL);
			
			JLabel firstNameLBL = new JLabel("First name");
			firstNameLBL.setFont(new Font("Tahoma", Font.PLAIN, 13));
			firstNameLBL.setBounds(263, 88, 70, 14);
			panel.add(firstNameLBL);
			
			birthdateTXT = new JTextField();
			birthdateTXT.setEditable(false);
			birthdateTXT.setBounds(40, 161, 179, 20);
			panel.add(birthdateTXT);
			birthdateTXT.setColumns(10);
			
			JLabel middleInitialBL = new JLabel("Middle Initial");
			middleInitialBL.setFont(new Font("Tahoma", Font.PLAIN, 13));
			middleInitialBL.setBounds(475, 88, 79, 14);
			panel.add(middleInitialBL);
			
			JLabel suffixLBL = new JLabel("Suffix");
			suffixLBL.setFont(new Font("Tahoma", Font.PLAIN, 13));
			suffixLBL.setBounds(641, 88, 46, 14);
			panel.add(suffixLBL);
			
			surnameTXT = new JTextField();
			surnameTXT.setEditable(false);
			surnameTXT.setBounds(40, 105, 544, 20);
			panel.add(surnameTXT);
			surnameTXT.setColumns(10);
			
			JLabel birthDateLBL = new JLabel("Birthdate");
			birthDateLBL.setFont(new Font("Tahoma", Font.PLAIN, 13));
			birthDateLBL.setBounds(40, 142, 52, 14);
			panel.add(birthDateLBL);
			
			ageTXT = new JTextField();
			ageTXT.setEditable(false);
			ageTXT.setBounds(263, 161, 92, 20);
			panel.add(ageTXT);
			ageTXT.setColumns(10);
			
			JLabel ageLBL = new JLabel("Age");
			ageLBL.setBounds(263, 142, 46, 14);
			panel.add(ageLBL);
			
			contactTXT = new JTextField();
			contactTXT.setEditable(false);
			contactTXT.setBounds(436, 161, 192, 20);
			panel.add(contactTXT);
			contactTXT.setColumns(10);
			
			JLabel contactNumLBL = new JLabel("Contact Number");
			contactNumLBL.setFont(new Font("Tahoma", Font.PLAIN, 13));
			contactNumLBL.setBounds(436, 142, 92, 14);
			panel.add(contactNumLBL);
			
			JLabel statusLBL = new JLabel("Status");
			statusLBL.setFont(new Font("Tahoma", Font.PLAIN, 13));
			statusLBL.setBounds(40, 202, 46, 14);
			panel.add(statusLBL);
			
			occupationTXT = new JTextField();
			occupationTXT.setEditable(false);
			occupationTXT.setBounds(436, 221, 192, 20);
			panel.add(occupationTXT);
			occupationTXT.setColumns(10);
			
			JLabel occupationLBL = new JLabel("Occupation");
			occupationLBL.setFont(new Font("Tahoma", Font.PLAIN, 13));
			occupationLBL.setBounds(436, 202, 74, 14);
			panel.add(occupationLBL);
			
			JLabel genderLBL = new JLabel("Gender");
			genderLBL.setBounds(263, 203, 46, 14);
			panel.add(genderLBL);
			
			JRadioButton maleRDBTN = new JRadioButton("Male");
			maleRDBTN.setBounds(263, 221, 52, 20);
			panel.add(maleRDBTN);
			
			JRadioButton femaleRDBTN = new JRadioButton("Female");
			femaleRDBTN.setBounds(320, 221, 79, 21);
			panel.add(femaleRDBTN);
			
			ButtonGroup gender = new ButtonGroup();
			gender.add(maleRDBTN);
			gender.add(femaleRDBTN);
			
			housenoTXT = new JTextField();
			housenoTXT.setEditable(false);
			housenoTXT.setBounds(40, 283, 661, 20);
			panel.add(housenoTXT);
			housenoTXT.setColumns(10);
			
			JLabel houseNumLBL = new JLabel("House no.");
			houseNumLBL.setFont(new Font("Tahoma", Font.PLAIN, 13));
			houseNumLBL.setBounds(40, 265, 70, 14);
			panel.add(houseNumLBL);
			
			JLabel streetNameLBL = new JLabel("Street Name");
			streetNameLBL.setFont(new Font("Tahoma", Font.PLAIN, 13));
			streetNameLBL.setBounds(206, 265, 76, 14);
			panel.add(streetNameLBL);
			
			JLabel barangayLBL = new JLabel("Barangay");
			barangayLBL.setFont(new Font("Tahoma", Font.PLAIN, 13));
			barangayLBL.setBounds(410, 265, 59, 14);
			panel.add(barangayLBL);
			
			JLabel cityLBL = new JLabel("City");
			cityLBL.setFont(new Font("Tahoma", Font.PLAIN, 13));
			cityLBL.setBounds(587, 265, 46, 14);
			panel.add(cityLBL);
			
			JButton retrieveBTN = new JButton("Search ID") {
				protected void paintComponent(Graphics g) {
				   
				    Graphics2D g2d = (Graphics2D) g;

				    Color startColor = Color.WHITE; 
				    Color endColor = new Color(255, 69, 0); 

				    int width = getWidth();
				    int height = getHeight();

				    GradientPaint gp = new GradientPaint(0, 0, startColor, width, 0, endColor);

				    g2d.setPaint(gp);
				    g2d.fillRect(0, 0, width, height);
				    
				    super.paintComponent(g);
				}
			};
			
			
			retrieveBTN.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(e.getSource()==retrieveBTN) {
						int id = Integer.parseInt(idretrieveTXT.getText());
						
						try {
						Connection con = DBConnection.getConnection();
						String retrieveQuery ="SELECT * FROM addresident WHERE id = ?";
						PreparedStatement pst = con.prepareStatement(retrieveQuery);
						pst.setInt(1, id);
						
						ResultSet rs = pst.executeQuery();
						
						if(rs.next()) {
							surnameTXT.setText(rs.getString("fullname"));
							suffixTXT.setText(rs.getString("suffix"));
							birthdateTXT.setText(rs.getString("birthday"));
							ageTXT.setText(rs.getString("age"));
							contactTXT.setText(rs.getString("contact"));
							statusTXT.setText(rs.getString("status"));
							String gender = rs.getString("gender");
							if ("Male".equalsIgnoreCase(gender)) {
							    maleRDBTN.setSelected(true);
							} else if ("Female".equalsIgnoreCase(gender)) {
							    femaleRDBTN.setSelected(true);
							}

							housenoTXT.setText(rs.getString("address"));
							occupationTXT.setText(rs.getString("occupation"));
							
						}
						
						} catch (SQLException e1) {
							
							e1.printStackTrace();
						}
						
						
					}
				}
			});
			retrieveBTN.setBounds(663, 53, 92, 20);
			panel.add(retrieveBTN);
			
			statusTXT = new JTextField();
			statusTXT.setEditable(false);
			statusTXT.setBounds(40, 221, 179, 20);
			panel.add(statusTXT);
			statusTXT.setColumns(10);
			
			suffixTXT = new JTextField();
			suffixTXT.setEditable(false);
			suffixTXT.setBounds(626, 105, 86, 20);
			panel.add(suffixTXT);
			suffixTXT.setColumns(10);
			
			idretrieveTXT = new JTextField();
			idretrieveTXT.setBounds(594, 53, 59, 20);
			panel.add(idretrieveTXT);
			idretrieveTXT.setColumns(10);
			
			JLabel lblNewLabel_1 = new JLabel("Enter ID:");
			lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 13));
			lblNewLabel_1.setBounds(536, 59, 59, 14);
			panel.add(lblNewLabel_1);
			
			JButton btnNewButton = new JButton("Delete Resident");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int id = Integer.parseInt(idretrieveTXT.getText());
					
					try {
					Connection con = DBConnection.getConnection();
					String retrieveQuery ="DELETE FROM addresident WHERE id = ?";
					PreparedStatement pst = con.prepareStatement(retrieveQuery);
					pst.setInt(1, id);
					
					int rows = pst.executeUpdate();
					
					if(rows > 0) {
						JOptionPane.showMessageDialog(null, "delete success");
						surnameTXT.setText("");
						suffixTXT.setText("");
						birthdateTXT.setText("");
						ageTXT.setText("");
						contactTXT.setText("");
						statusTXT.setText("");
						gender.clearSelection();
						occupationTXT.setText("");
						housenoTXT.setText("");
						idretrieveTXT.setText("");
					}
					else {
						JOptionPane.showMessageDialog(null, "not yet delete");
					}
					
					} catch (SQLException e1) {
						
						e1.printStackTrace();
					}

				}
			});
			btnNewButton.setFont(new Font("Arial", Font.PLAIN, 13));
			btnNewButton.setBounds(320, 316, 136, 23);
			panel.add(btnNewButton);
		}
	}
}
