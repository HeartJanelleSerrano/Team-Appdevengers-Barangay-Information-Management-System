import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Enumeration;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JPasswordField;

public class logins extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField fullnameTXT;
	private JTextField maritalStatusComboBox;
	private JTextField ReligionTXT;
	private JTextField NationalityTXT;
	private JTextField SuffixTXT;
	private JTextField BirthdateTXT;
	private JTextField userNametxt;
	private JTextField ageTXT;
	private JPasswordField passwordTXT1;
	private JTextField addressTXT;
	private JTextField zipCodeTXT;
	private JTextField countryTXT;
	private JTextField usernameTXT;
	private JPasswordField passwordTXT;
	private JTextField emailTXT;
	private JTextField favoriteTXT;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					logins frame = new logins();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public logins() throws SQLException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	   
	    	
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1350, 729);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel taskBarPNL = new JPanel() {
			protected void paintComponent(Graphics g) {
			    super.paintComponent(g);
			    Graphics2D g2d = (Graphics2D) g;

			    
			    Color startColor = new Color(255, 69, 0); 
			    Color endColor = Color.WHITE; 

			    int width = getWidth();
			    int height = getHeight();

			    GradientPaint gp = new GradientPaint(0, 0, startColor, width, 0, endColor);

			    g2d.setPaint(gp);
			    g2d.fillRect(0, 0, width, height); 
			   
			}

		};
		taskBarPNL.setBackground(new Color(255, 140, 0));
		taskBarPNL.setBounds(0, 0, 1350, 80);
		panel.add(taskBarPNL);
		taskBarPNL.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("BARANGAY IBAYO-TIPAS");
		lblNewLabel_1.setBounds(80, 20, 566, 39);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 40));
		taskBarPNL.add(lblNewLabel_1);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 56, 1350, 673);
		panel.add(tabbedPane);
		
		JButton loginBTN1 = new JButton("LOG IN") {
			protected void paintComponent(Graphics g) {
			    super.paintComponent(g);
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
		loginBTN1.setBounds(1000, 20, 120, 39);
		loginBTN1.setForeground(new Color(255, 255, 255));
		loginBTN1.setFont(new Font("Arial Black", Font.BOLD, 20));
		loginBTN1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==loginBTN1) {
					tabbedPane.setSelectedIndex(0);
				}
			}
		});
		
		
		loginBTN1.setFocusPainted(false);
		
		
				loginBTN1.setContentAreaFilled(false);
				taskBarPNL.add(loginBTN1);
				
				JButton signUpBTN = new JButton("SIGN UP") {
					protected void paintComponent(Graphics g) {
					    super.paintComponent(g);
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
				signUpBTN.setBounds(1150, 20, 170, 39);
				signUpBTN.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(e.getSource()== signUpBTN) {
							tabbedPane.setSelectedIndex(1);
						}
					}
				});
				signUpBTN.setForeground(new Color(255, 255, 255));
				signUpBTN.setFont(new Font("Arial Black", Font.BOLD, 20));
				
				signUpBTN.setContentAreaFilled(false);
				signUpBTN.setFocusPainted(false);
				taskBarPNL.add(signUpBTN);
				
		
		JPanel loginPNL = new JPanel();
		tabbedPane.addTab("New tab", null, loginPNL, null);
		loginPNL.setLayout(null);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setIcon(new ImageIcon("C:\\Users\\lemonstar\\Downloads\\55.png"));
		lblNewLabel_9.setBounds(360, 127, 618, 274);
		loginPNL.add(lblNewLabel_9);
		
		JLabel lblNewLabel_8 = new JLabel("BRGY IBAYO-TIPAS");
		lblNewLabel_8.setForeground(new Color(255, 255, 255));
		lblNewLabel_8.setFont(new Font("Arial", Font.PLAIN, 27));
		lblNewLabel_8.setBounds(771, 396, 272, 31);
		loginPNL.add(lblNewLabel_8);
		
		JLabel lblNewLabel_7 = new JLabel("WELCOME");
		lblNewLabel_7.setForeground(new Color(255, 255, 255));
		lblNewLabel_7.setFont(new Font("Arial", Font.BOLD, 27));
		lblNewLabel_7.setBounds(826, 340, 152, 45);
		loginPNL.add(lblNewLabel_7);
		
		JButton btnlogin = new JButton("LOGIN");
		btnlogin.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        if (e.getSource() == btnlogin) {
		            String username = usernameTXT.getText().trim();
		            String password = passwordTXT.getText().trim();

		          
		            if (username.isEmpty() || password.isEmpty()) {
		                JOptionPane.showMessageDialog(null, "Username or Password cannot be empty.");
		                return;
		            }

		        
		            Connection con = DBConnection.getConnection();
		            String query = "SELECT * FROM registeruser WHERE username = ? AND password = ?";

		            try {
		                PreparedStatement pst = con.prepareStatement(query);
		                pst.setString(1, username);
		                pst.setString(2, password);
		                ResultSet rs = pst.executeQuery();

		                if (rs.next()) {
		                   
		                    JOptionPane.showMessageDialog(null, "Login successful!");
		                    DashBoard main = new DashBoard();
		                    main.setVisible(true);
		                } else {
		                   
		                    JOptionPane.showMessageDialog(null, "Invalid username or password.");
		                }

		                rs.close();
		                pst.close();
		                con.close();

		            } catch (SQLException e1) {
		                e1.printStackTrace();
		                JOptionPane.showMessageDialog(null, "Database error: " + e1.getMessage());
		            }
		        }
		    }
		});

		btnlogin.setBackground(new Color(255, 140, 0));
		btnlogin.setFont(new Font("Arial", Font.PLAIN, 15));
		btnlogin.setBounds(456, 466, 145, 25);
		loginPNL.add(btnlogin);
		
		JButton forgotPasswordBTN = new JButton("Forgot Password");
		forgotPasswordBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==forgotPasswordBTN) {
					forgotPasswordJDialog forgotPassJD = new forgotPasswordJDialog();
					forgotPassJD.setVisible(true);
					forgotPassJD.setLocationRelativeTo(null);
				}
			}
		});
		forgotPasswordBTN.setFont(new Font("Arial", Font.PLAIN, 9));
		forgotPasswordBTN.setBounds(544, 400, 106, 11);
		forgotPasswordBTN.setContentAreaFilled(false);
		forgotPasswordBTN.setBorderPainted(false);
		
		loginPNL.add(forgotPasswordBTN);
		
		JLabel lblNewLabel_6 = new JLabel("Password");
		lblNewLabel_6.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(425, 354, 82, 14);
		loginPNL.add(lblNewLabel_6);
		
		passwordTXT = new JPasswordField();
		passwordTXT.setFont(new Font("Arial", Font.PLAIN, 12));
		passwordTXT.setBounds(425, 368, 211, 31);
		loginPNL.add(passwordTXT);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel.setBounds(425, 282, 68, 14);
		loginPNL.add(lblNewLabel);
		
		usernameTXT = new JTextField();
		usernameTXT.setFont(new Font("Arial", Font.PLAIN, 12));
		usernameTXT.setBounds(425, 296, 211, 31);
		loginPNL.add(usernameTXT);
		usernameTXT.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Log In ");
		lblNewLabel_4.setForeground(new Color(255, 128, 64));
		lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 25));
		lblNewLabel_4.setBounds(491, 205, 82, 31);
		loginPNL.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\lemonstar\\Pictures\\Screenshots\\grad...png"));
		lblNewLabel_3.setBounds(706, 111, 382, 451);
		loginPNL.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\lemonstar\\Pictures\\Screenshots\\white.png"));
		lblNewLabel_2.setBounds(342, 111, 382, 451);
		loginPNL.add(lblNewLabel_2);
		
		JLabel bgLbl = new JLabel("");
		bgLbl.setIcon(new ImageIcon("C:\\Users\\lemonstar\\Downloads\\Untitled design.png"));
		bgLbl.setBounds(0, 0, 1345, 645);
		loginPNL.add(bgLbl);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(0, 0, 46, 14);
		loginPNL.add(lblNewLabel_5);
		
		JPanel signUpPNL = new JPanel();
		tabbedPane.addTab("New tab", null, signUpPNL, null);
		signUpPNL.setLayout(null);
		
		JRadioButton maleRadioButton = new JRadioButton("Male");
		maleRadioButton.setFont(new Font("Arial", Font.PLAIN, 13));
		maleRadioButton.setBackground(new Color(255, 255, 255));
		maleRadioButton.setBounds(816, 398, 61, 23);
		signUpPNL.add(maleRadioButton);

		JRadioButton femaleRadioButton = new JRadioButton("Female");
		femaleRadioButton.setFont(new Font("Arial", Font.PLAIN, 13));
		femaleRadioButton.setBackground(new Color(255, 255, 255));
		femaleRadioButton.setBounds(879, 398, 71, 23);
		signUpPNL.add(femaleRadioButton);

		
		ButtonGroup genderGroup = new ButtonGroup();
		genderGroup.add(maleRadioButton);
		genderGroup.add(femaleRadioButton);


		maleRadioButton.setSelected(true);
		
		
		JComboBox<String> StatusTXT = new JComboBox<String>();
		StatusTXT.addItem(" ");
		StatusTXT.addItem("Single");
		StatusTXT.addItem("Married");
		StatusTXT.addItem("Divorced");
		StatusTXT.addItem("Widowed");
		
		JButton registerBTN = new JButton("Register");
		registerBTN.setFont(new Font("Arial", Font.PLAIN, 13));
		registerBTN.setBackground(new Color(255, 140, 0));
		registerBTN.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String fullname = fullnameTXT.getText().trim();
		        String suffix = SuffixTXT.getText().trim();
		        String birthday = BirthdateTXT.getText().trim();
		        String ageText = ageTXT.getText().trim();

		        String selectedGender = null;
		        for (Enumeration<AbstractButton> buttons = genderGroup.getElements(); buttons.hasMoreElements();) {
		            AbstractButton button = buttons.nextElement();
		            if (button.isSelected()) {
		                selectedGender = button.getText();
		                break;
		            }
		        }

		        String status = StatusTXT.getSelectedItem() != null ? StatusTXT.getSelectedItem().toString() : null;
		        String nationality = NationalityTXT.getText().trim();
		        String religion = ReligionTXT.getText().trim();
		        String country = countryTXT.getText().trim();
		        String address = addressTXT.getText().trim();
		        String zipText = zipCodeTXT.getText().trim();
		        String email = emailTXT.getText().trim();
		        String username = userNametxt.getText().trim();

		        
		        String password = passwordTXT1.getText();

		        String favpet = favoriteTXT.getText().trim();

		       

		        int age, zip;
		        try {
		            age = Integer.parseInt(ageText);
		            zip = Integer.parseInt(zipText);
		        } catch (NumberFormatException nfe) {
		            JOptionPane.showMessageDialog(null, "Please enter valid numbers for Age and Zip.");
		            return;
		        }

		        java.sql.Date sqlBirthday;
		        try {
		            sqlBirthday = java.sql.Date.valueOf(birthday); 
		        } catch (IllegalArgumentException ex) {
		            JOptionPane.showMessageDialog(null, "Birthday format must be YYYY-MM-DD.");
		            return;
		        }

		        String insertQuery = "INSERT INTO registeruser "
		                + "(fullname, suffix, birthday, age, gender, status, nationality, religion, country, address, zip, email, username, password, favorite_pet) "
		                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		        try (Connection con = DBConnection.getConnection();
		             PreparedStatement ps = con.prepareStatement(insertQuery)) {

		            ps.setString(1, fullname);
		            ps.setString(2, suffix.isEmpty() ? null : suffix);
		            ps.setDate(3, sqlBirthday);
		            ps.setInt(4, age);
		            ps.setString(5, selectedGender);
		            ps.setString(6, status);
		            ps.setString(7, nationality.isEmpty() ? null : nationality);
		            ps.setString(8, religion.isEmpty() ? null : religion);
		            ps.setString(9, country.isEmpty() ? null : country);
		            ps.setString(10, address.isEmpty() ? null : address);
		            ps.setInt(11, zip);
		            ps.setString(12, email.isEmpty() ? null : email);
		            ps.setString(13, username);
		            ps.setString(14, password);
		            ps.setString(15, favpet.isEmpty() ? null : favpet);

		            int rows = ps.executeUpdate();
		            if (rows > 0) {
		                JOptionPane.showMessageDialog(null, "User registered successfully!");
		                // Optionally clear form fields here
		            } else {
		                JOptionPane.showMessageDialog(null, "Registration failed. Try again.");
		            }

		        } catch (SQLException ex) {
		            ex.printStackTrace();
		            JOptionPane.showMessageDialog(null, "Database error: " + ex.getMessage());
		        }
		    }
		});


		registerBTN.setBounds(936, 508, 112, 30);
		signUpPNL.add(registerBTN);
		
		favoriteTXT = new JTextField();
		favoriteTXT.setBounds(502, 391, 112, 20);
		signUpPNL.add(favoriteTXT);
		favoriteTXT.setColumns(10);
		
		emailTXT = new JTextField();
		emailTXT.setBounds(502, 246, 223, 20);
		signUpPNL.add(emailTXT);
		emailTXT.setColumns(10);
		
		JLabel middlenameLBL = new JLabel("Middle Name");
		middlenameLBL.setFont(new Font("Arial", Font.PLAIN, 13));
		middlenameLBL.setBounds(830, 171, 91, 14);
		signUpPNL.add(middlenameLBL);
		
		JLabel firstnamelbl = new JLabel("First Name");
		firstnamelbl.setFont(new Font("Arial", Font.PLAIN, 13));
		firstnamelbl.setBounds(663, 171, 81, 14);
		signUpPNL.add(firstnamelbl);
		
		JLabel lastNameLBL = new JLabel("Last Name");
		lastNameLBL.setFont(new Font("Arial", Font.PLAIN, 13));
		lastNameLBL.setBounds(502, 171, 74, 14);
		signUpPNL.add(lastNameLBL);

		
		StatusTXT.setBounds(948, 294, 120, 20); 
		signUpPNL.add(StatusTXT);
		JLabel statusLbl = new JLabel("Status");
		statusLbl.setFont(new Font("Arial", Font.PLAIN, 13));
		statusLbl.setBounds(948, 279, 46, 14);
		signUpPNL.add(statusLbl);
		

		
		
		JLabel countryLbl = new JLabel("Country");
		countryLbl.setFont(new Font("Arial", Font.PLAIN, 13));
		countryLbl.setBounds(948, 331, 67, 14);
		signUpPNL.add(countryLbl);
		
		countryTXT = new JTextField();
		countryTXT.setFont(new Font("Arial", Font.PLAIN, 11));
		countryTXT.setBounds(948, 346, 100, 20);
		signUpPNL.add(countryTXT);
		countryTXT.setColumns(10);
		
		JLabel cityLbl = new JLabel("City");
		cityLbl.setFont(new Font("Arial", Font.PLAIN, 13));
		cityLbl.setBounds(770, 464, 30, 14);
		signUpPNL.add(cityLbl);
		
		JLabel barangayLbl = new JLabel("Barangay");
		barangayLbl.setFont(new Font("Arial", Font.PLAIN, 13));
		barangayLbl.setBounds(682, 464, 62, 14);
		signUpPNL.add(barangayLbl);
		
		JLabel streetLbl = new JLabel("Street Name");
		streetLbl.setFont(new Font("Arial", Font.PLAIN, 13));
		streetLbl.setBounds(583, 464, 86, 14);
		signUpPNL.add(streetLbl);
		
		JLabel houseLbl = new JLabel("House No.");
		houseLbl.setFont(new Font("Arial", Font.PLAIN, 13));
		houseLbl.setBounds(502, 464, 74, 14);
		signUpPNL.add(houseLbl);
		
		addressTXT = new JTextField();
		addressTXT.setFont(new Font("Arial", Font.PLAIN, 11));
		addressTXT.setBounds(502, 433, 317, 20);
		signUpPNL.add(addressTXT);
		addressTXT.setColumns(10);
		
		passwordTXT1 = new JPasswordField();
		passwordTXT1.setFont(new Font("Arial", Font.PLAIN, 11));
		passwordTXT1.setBounds(502, 346, 223, 20);
		signUpPNL.add(passwordTXT1);
		
		JLabel passwordLbl = new JLabel("Password");
		passwordLbl.setFont(new Font("Arial", Font.PLAIN, 13));
		passwordLbl.setBounds(502, 331, 60, 14);
		signUpPNL.add(passwordLbl);
		
		
		JLabel genderLbl = new JLabel("Gender");
		genderLbl.setFont(new Font("Arial", Font.PLAIN, 13));
		genderLbl.setBounds(854, 377, 46, 14);
		signUpPNL.add(genderLbl);

		
		
		JLabel ageLbl = new JLabel("Age");
		ageLbl.setFont(new Font("Arial", Font.PLAIN, 13));
		ageLbl.setBounds(773, 279, 46, 14);
		signUpPNL.add(ageLbl);
		
		ageTXT = new JTextField();
		ageTXT.setFont(new Font("Arial", Font.PLAIN, 11));
		ageTXT.setBounds(773, 295, 86, 20);
		signUpPNL.add(ageTXT);
		ageTXT.setColumns(10);
		
		JLabel emailLbl = new JLabel("Username");
		emailLbl.setFont(new Font("Arial", Font.PLAIN, 13));
		emailLbl.setBounds(502, 279, 60, 14);
		signUpPNL.add(emailLbl);
		
		userNametxt = new JTextField();
		userNametxt.setFont(new Font("Arial", Font.PLAIN, 11));
		userNametxt.setBounds(502, 295, 223, 20);
		signUpPNL.add(userNametxt);
		userNametxt.setColumns(10);
		
		JLabel birthdateLbl = new JLabel("Birthdate YYYY-MM-DD");
		birthdateLbl.setFont(new Font("Arial", Font.PLAIN, 13));
		birthdateLbl.setBounds(773, 331, 148, 14);
		signUpPNL.add(birthdateLbl);
		
		BirthdateTXT = new JTextField();
		BirthdateTXT.setFont(new Font("Arial", Font.PLAIN, 11));
		BirthdateTXT.setBounds(773, 346, 147, 20);
		signUpPNL.add(BirthdateTXT);
		BirthdateTXT.setColumns(10);
		
		JLabel suffixLbl = new JLabel("Suffix");
		suffixLbl.setFont(new Font("Arial", Font.PLAIN, 13));
		suffixLbl.setBounds(969, 171, 46, 14);
		signUpPNL.add(suffixLbl);
		
		SuffixTXT = new JTextField();
		SuffixTXT.setFont(new Font("Arial", Font.PLAIN, 11));
		SuffixTXT.setBounds(969, 189, 86, 20);
		signUpPNL.add(SuffixTXT);
		SuffixTXT.setColumns(10);
		
		JLabel nationalityLbl = new JLabel("Nationality");
		nationalityLbl.setFont(new Font("Arial", Font.PLAIN, 13));
		nationalityLbl.setBounds(773, 231, 86, 14);
		signUpPNL.add(nationalityLbl);
		
		NationalityTXT = new JTextField();
		NationalityTXT.setBounds(773, 246, 119, 20);
		signUpPNL.add(NationalityTXT);
		NationalityTXT.setColumns(10);
		
		JLabel religionLbl = new JLabel("Religion");
		religionLbl.setFont(new Font("Arial", Font.PLAIN, 13));
		religionLbl.setBounds(949, 231, 46, 14);
		signUpPNL.add(religionLbl);
		
		ReligionTXT = new JTextField();
		ReligionTXT.setFont(new Font("Arial", Font.PLAIN, 11));
		ReligionTXT.setBounds(949, 247, 119, 20);
		signUpPNL.add(ReligionTXT);
		ReligionTXT.setColumns(10);
		
		fullnameTXT = new JTextField();
		fullnameTXT.setBounds(500, 189, 421, 20);
		signUpPNL.add(fullnameTXT);
		fullnameTXT.setColumns(10);
		
		JLabel createLbl = new JLabel("Create account");
		createLbl.setFont(new Font("Arial", Font.PLAIN, 25));
		createLbl.setBounds(487, 121, 182, 24);
		signUpPNL.add(createLbl);
		
		zipCodeTXT = new JTextField();
		zipCodeTXT.setFont(new Font("Arial", Font.PLAIN, 11));
		zipCodeTXT.setBounds(944, 426, 104, 20);
		signUpPNL.add(zipCodeTXT);
		zipCodeTXT.setColumns(10);
		
		JLabel zipcodeLbl = new JLabel("Zip Code");
		zipcodeLbl.setFont(new Font("Arial", Font.PLAIN, 13));
		zipcodeLbl.setBounds(944, 448, 71, 14);
		signUpPNL.add(zipcodeLbl);
		
		JLabel lblNewLabel_10 = new JLabel("Email");
		lblNewLabel_10.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_10.setBounds(502, 231, 46, 14);
		signUpPNL.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Favorite Pet");
		lblNewLabel_11.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_11.setBounds(502, 377, 86, 14);
		signUpPNL.add(lblNewLabel_11);
		
		JLabel bckgrndLbl = new JLabel("   ");
		bckgrndLbl.setFont(new Font("Arial", Font.PLAIN, 11));
		bckgrndLbl.setIcon(new ImageIcon("C:\\Users\\lemonstar\\Downloads\\erawdada.jpg"));
		bckgrndLbl.setBounds(0, 0, 1345, 645);
		signUpPNL.add(bckgrndLbl);

		
	}
}
