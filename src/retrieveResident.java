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

public class retrieveResident extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField birthdateTXT;
	private JTextField ageTXT;
	private JTextField contactTXT;
	private JTextField occupationTXT;
	private JTextField housenoTXT;
	private JTextField statusTXT;
	private JTextField idretrieveTXT;
	private JTextField fullnameTXT;
	private JTextField suffixTXT;
	
	public static void main(String[] args) {
		try {
			retrieveResident dialog = new retrieveResident();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public retrieveResident() {
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
			
			JLabel lblNewLabel = new JLabel("Retrieve Resident Information");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel.setBounds(295, 21, 215, 14);
			panel.add(lblNewLabel);
			
			JLabel surNameLBL = new JLabel("Surname");
			surNameLBL.setFont(new Font("Tahoma", Font.PLAIN, 13));
			surNameLBL.setBounds(30, 84, 52, 14);
			panel.add(surNameLBL);
			
			JLabel firstNameLBL = new JLabel("First name");
			firstNameLBL.setFont(new Font("Tahoma", Font.PLAIN, 13));
			firstNameLBL.setBounds(237, 84, 70, 14);
			panel.add(firstNameLBL);
			
			birthdateTXT = new JTextField();
			birthdateTXT.setBounds(30, 155, 215, 20);
			birthdateTXT.setEditable(false);
			panel.add(birthdateTXT);
			birthdateTXT.setColumns(10);
			
			JLabel middleInitialBL = new JLabel("Middle Initial");
			middleInitialBL.setFont(new Font("Tahoma", Font.PLAIN, 13));
			middleInitialBL.setBounds(439, 84, 162, 14);
			panel.add(middleInitialBL);
			
			JLabel suffixLBL = new JLabel("Suffix");
			suffixLBL.setFont(new Font("Tahoma", Font.PLAIN, 13));
			suffixLBL.setBounds(591, 84, 46, 14);
			panel.add(suffixLBL);
			
			JLabel birthDateLBL = new JLabel("Birthdate");
			birthDateLBL.setFont(new Font("Tahoma", Font.PLAIN, 13));
			birthDateLBL.setBounds(30, 140, 52, 14);
			panel.add(birthDateLBL);
			
			ageTXT = new JTextField();
			ageTXT.setEditable(false);
			ageTXT.setBounds(316, 155, 79, 20);
			panel.add(ageTXT);
			ageTXT.setColumns(10);
			
			JLabel ageLBL = new JLabel("Age");
			ageLBL.setFont(new Font("Tahoma", Font.PLAIN, 13));
			ageLBL.setBounds(327, 139, 46, 17);
			panel.add(ageLBL);
			
			contactTXT = new JTextField();
			contactTXT.setEditable(false);
			contactTXT.setBounds(463, 155, 226, 20);
			panel.add(contactTXT);
			contactTXT.setColumns(10);
			
			JLabel contactNumLBL = new JLabel("Contact Number");
			contactNumLBL.setFont(new Font("Tahoma", Font.PLAIN, 13));
			contactNumLBL.setBounds(463, 140, 131, 14);
			panel.add(contactNumLBL);
			
			JLabel statusLBL = new JLabel("Status");
			statusLBL.setFont(new Font("Tahoma", Font.PLAIN, 13));
			statusLBL.setBounds(30, 205, 118, 14);
			panel.add(statusLBL);
			
			occupationTXT = new JTextField();
			occupationTXT.setEditable(false);
			occupationTXT.setBounds(463, 218, 226, 20);
			panel.add(occupationTXT);
			occupationTXT.setColumns(10);
			
			JLabel occupationLBL = new JLabel("Occupation");
			occupationLBL.setFont(new Font("Tahoma", Font.PLAIN, 13));
			occupationLBL.setBounds(463, 205, 106, 14);
			panel.add(occupationLBL);
			
			JLabel genderLBL = new JLabel("Gender");
			genderLBL.setFont(new Font("Tahoma", Font.PLAIN, 13));
			genderLBL.setBounds(290, 205, 46, 14);
			panel.add(genderLBL);
			
			JRadioButton maleRDBTN = new JRadioButton("Male");
			maleRDBTN.setBounds(284, 218, 52, 20);
			panel.add(maleRDBTN);
			
			JRadioButton femaleRDBTN = new JRadioButton("Female");
			femaleRDBTN.setBounds(360, 218, 79, 21);
			panel.add(femaleRDBTN);
			
			ButtonGroup gender = new ButtonGroup();
			gender.add(maleRDBTN);
			gender.add(femaleRDBTN);
			
			housenoTXT = new JTextField();
			housenoTXT.setBounds(30, 273, 636, 20);
			housenoTXT.setEditable(false);
			panel.add(housenoTXT);
			housenoTXT.setColumns(10);
			
			JLabel houseNumLBL = new JLabel("House no.");
			houseNumLBL.setFont(new Font("Tahoma", Font.PLAIN, 13));
			houseNumLBL.setBounds(35, 260, 70, 14);
			panel.add(houseNumLBL);
			
			JLabel streetNameLBL = new JLabel("Street Name");
			streetNameLBL.setFont(new Font("Tahoma", Font.PLAIN, 13));
			streetNameLBL.setBounds(224, 260, 76, 14);
			panel.add(streetNameLBL);
			
			JLabel barangayLBL = new JLabel("Barangay");
			barangayLBL.setFont(new Font("Tahoma", Font.PLAIN, 13));
			barangayLBL.setBounds(439, 258, 59, 19);
			panel.add(barangayLBL);
			
			JLabel cityLBL = new JLabel("City");
			cityLBL.setFont(new Font("Tahoma", Font.PLAIN, 13));
			cityLBL.setBounds(638, 260, 46, 14);
			panel.add(cityLBL);
			
			JButton retrieveBTN = new JButton("Retrieve Resident") {
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
							fullnameTXT.setText(rs.getString("fullname"));
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
			retrieveBTN.setBounds(316, 316, 162, 23);
			panel.add(retrieveBTN);
			
			statusTXT = new JTextField();
			statusTXT.setEditable(false);
			statusTXT.setBounds(30, 218, 215, 20);
			panel.add(statusTXT);
			statusTXT.setColumns(10);
			
			idretrieveTXT = new JTextField();
			idretrieveTXT.setBounds(679, 49, 59, 20);
			panel.add(idretrieveTXT);
			idretrieveTXT.setColumns(10);
			
			JLabel lblNewLabel_1 = new JLabel("Enter ID");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblNewLabel_1.setBounds(626, 51, 82, 14);
			panel.add(lblNewLabel_1);
			
			fullnameTXT = new JTextField();
			fullnameTXT.setEditable(false);
			fullnameTXT.setBounds(30, 99, 502, 20);
			panel.add(fullnameTXT);
			fullnameTXT.setColumns(10);
			
			suffixTXT = new JTextField();
			suffixTXT.setBounds(591, 99, 63, 20);
			suffixTXT.setEditable(false);
			panel.add(suffixTXT);
			suffixTXT.setColumns(10);
		}
	}
}
