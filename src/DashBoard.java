import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTabbedPane;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Enumeration;
import java.awt.event.ActionEvent;
import java.awt.Font;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import java.awt.GridLayout;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.UIManager;
import javax.swing.JSeparator;
import java.awt.Component;

public class DashBoard extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField fullnameTXT;
	private JTextField addressTXT;
	private JTextField ageTXT;
	private JTextField fullnameTXT1;
	private JTextField addressTXT1;
	private JTextField purposeTXT1;
	private JTextField dateissuedTXT1;
	private JTextField fullnameTXT2;
	private JTextField addressTXT2;
	private JTextField purposeTXT2;
	private JTextField dateTXT2;
	private JTextField namecomplaintTXT;
	private JTextField namerespondentTXT;
	private JTextField blotteraddressTXT;
	private JTextField descriptionTXT;
	private JTextField contactcomplaintTXT;
	private JTextField contactrespondentTXT;
	private JTextField casenumberTXT;
	private JTextField name1TXT;
	private JTextField NameTXT;
	private JTextField contactTXT;
	private JTextField contact1TXT;
	private JTextField address1TXT;
	private JTextField diTXT;
	private JTextField witnessTXT;
	private JTextField evidenceTXT;
	private JTextField fullnameTXT3;
	private JTextField addressTXT3;
	private JTextField householdTXT3;
	private JTextField headTXT3;
	private JTextField educTXT3;
	private JTextField datereportedTXT;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DashBoard frame = new DashBoard();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public DashBoard() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 768);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel mainPanel = new JPanel();
		mainPanel.setBounds(0, 0, 1350, 729);
		contentPane.add(mainPanel);
		mainPanel.setLayout(null);

		JPanel sidepnlDashBoard = new JPanel() {
			@Override
			
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
		
	
		sidepnlDashBoard.setBounds(0, 0, 298, 729);
		sidepnlDashBoard.setBackground(new Color(255, 128, 128));
		mainPanel.add(sidepnlDashBoard);
		sidepnlDashBoard.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Admin");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel.setBounds(146, 48, 85, 20);
		sidepnlDashBoard.add(lblNewLabel);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(294, -27, 1079, 858);
		mainPanel.add(tabbedPane);
		
		JPanel bgPNL = new JPanel();
		tabbedPane.addTab("New tab", null, bgPNL, null);
		bgPNL.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 1046, 729);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		bgPNL.add(scrollPane);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\lemonstar\\Downloads\\m.png"));
		scrollPane.setViewportView(lblNewLabel_1);
		
		JPanel brgyOffcialsPNL = new JPanel();
		tabbedPane.addTab("New tab", null, brgyOffcialsPNL, null);
		brgyOffcialsPNL.setLayout(null);
		
		JLabel lblNewLabel_8 = new JLabel("Barangay officials");
		lblNewLabel_8.setFont(new Font("Arial", Font.PLAIN, 25));
		lblNewLabel_8.setBounds(423, 0, 223, 30);
		brgyOffcialsPNL.add(lblNewLabel_8);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\lemonstar\\Pictures\\Screenshots\\BRGY OFFICIALS...png"));
		lblNewLabel_5.setBounds(-98, 0, 1423, 762);
		brgyOffcialsPNL.add(lblNewLabel_5);
		
		JPanel ResidentInfoPNL = new JPanel();
		tabbedPane.addTab("New tab", null, ResidentInfoPNL, null);
		ResidentInfoPNL.setLayout(null);
		
		JButton deleteBTN = new JButton("Delete");
		deleteBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Delete delete = new Delete();
				delete.setVisible(true);
				delete.setLocationRelativeTo(null);
				
				
			}
		});
		deleteBTN.setIcon(new ImageIcon("C:\\Users\\lemonstar\\Downloads\\delete.png"));
		deleteBTN.setBounds(340, 440, 396, 85);
		deleteBTN.setFont(new Font("Arial", Font.PLAIN, 15));
		ResidentInfoPNL.add(deleteBTN);
		
		JButton updateBTN = new JButton("Update");     
		updateBTN.setIcon(new ImageIcon("C:\\Users\\lemonstar\\Downloads\\update.png"));
		updateBTN.setBounds(340, 321, 396, 85);
		updateBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateInformation upinformation = new updateInformation();
				upinformation.setVisible(true);
				upinformation.setLocationRelativeTo(null);
			}
		});
		updateBTN.setFont(new Font("Arial", Font.PLAIN, 15));
		ResidentInfoPNL.add(updateBTN);
		
		JButton createBTN = new JButton("Create");
		createBTN.setIcon(new ImageIcon("C:\\Users\\lemonstar\\Downloads\\8888.png"));
		createBTN.setBounds(340, 69, 396, 85);
		createBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==createBTN) {
					addResident resident = new addResident();
					resident.setVisible(true);
					resident.setLocationRelativeTo(null);
				
				}
				
			}
		});
		createBTN.setBackground(new Color(255, 255, 224));
		ResidentInfoPNL.add(createBTN);
		createBTN.setFont(new Font("Arial", Font.PLAIN, 15));

		JButton btnRetrieve = new JButton("Retrieve");
		btnRetrieve.setIcon(new ImageIcon("C:\\Users\\lemonstar\\Downloads\\retrieve.png"));
		btnRetrieve.setBounds(340, 195, 396, 85);
		btnRetrieve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				retrieveResident retresident = new retrieveResident();
				retresident.setVisible(true);
				retresident.setLocationRelativeTo(null);
			}
		});
		btnRetrieve.setBackground(new Color(224, 255, 255));
		ResidentInfoPNL.add(btnRetrieve);
		btnRetrieve.setFont(new Font("Arial", Font.PLAIN, 9));
		
		JButton showallBTN = new JButton("View Records");
		showallBTN.setIcon(new ImageIcon("C:\\Users\\lemonstar\\Downloads\\4444.png"));
		showallBTN.setBounds(340, 567, 396, 85);
		showallBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Showall show = new Showall();
				show.setVisible(true);
				show.setLocationRelativeTo(null);
			}
		});
		showallBTN.setFont(new Font("Tahoma", Font.PLAIN, 16));
		ResidentInfoPNL.add(showallBTN);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setIcon(new ImageIcon("C:\\Users\\lemonstar\\Downloads\\Untitled design.png"));
		lblNewLabel_9.setBounds(0, 0, 1046, 729);
		ResidentInfoPNL.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("New label");
		lblNewLabel_10.setBounds(71, 140, 120, 42);
		ResidentInfoPNL.add(lblNewLabel_10);
		
		JPanel documentsandRequestPNL = new JPanel();
		tabbedPane.addTab("New tab", null, documentsandRequestPNL, null);
		documentsandRequestPNL.setLayout(null);
		
		JTabbedPane docsnreqTAB = new JTabbedPane(JTabbedPane.TOP);
		docsnreqTAB.setBounds(232, -22, 800, 731);
		documentsandRequestPNL.add(docsnreqTAB);
		
		
		JButton permitBTN = new JButton("Permit");
		permitBTN.setIcon(new ImageIcon("C:\\Users\\lemonstar\\Downloads\\permits.png"));
		permitBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				docsnreqTAB.setSelectedIndex(2);
			}
		});
		permitBTN.setBounds(63, 470, 106, 117);
		documentsandRequestPNL.add(permitBTN);
		
		
		JButton indigencyBTN = new JButton("Indigency");
		indigencyBTN.setIcon(new ImageIcon("C:\\Users\\lemonstar\\Downloads\\indigencys.png"));
		indigencyBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				docsnreqTAB.setSelectedIndex(1);
				
			}
		});
		indigencyBTN.setBounds(63, 292, 106, 117);
		documentsandRequestPNL.add(indigencyBTN);
		
		JButton clearanceBTN = new JButton("Clearance");
		clearanceBTN.setIcon(new ImageIcon("C:\\Users\\lemonstar\\Downloads\\CLearances.png"));
		clearanceBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String fullname = fullnameTXT.getText();
			
					docsnreqTAB.setSelectedIndex(0);
					
				
			}
		});
		clearanceBTN.setBounds(63, 125, 106, 117);
		documentsandRequestPNL.add(clearanceBTN);
		
	
		JPanel clearancePNL = new JPanel();
		clearancePNL.setBorder(new LineBorder(new Color(165, 42, 42), 4));
		clearancePNL.setBackground(new Color(255, 240, 245));
		docsnreqTAB.addTab("New tab", null, clearancePNL, null);
		clearancePNL.setLayout(null);
		
		JLabel lastnameLBL = new JLabel("Last Name");
		lastnameLBL.setFont(new Font("Arial", Font.PLAIN, 15));
		lastnameLBL.setBounds(66, 127, 86, 14);
		clearancePNL.add(lastnameLBL);
		
		JLabel firstnameLBL = new JLabel("First Name");
		firstnameLBL.setFont(new Font("Arial", Font.PLAIN, 15));
		firstnameLBL.setBounds(397, 127, 104, 14);
		clearancePNL.add(firstnameLBL);
		
		JLabel middlenameLBL = new JLabel("Middle Name");
		middlenameLBL.setFont(new Font("Arial", Font.PLAIN, 15));
		middlenameLBL.setBounds(653, 127, 96, 14);
		clearancePNL.add(middlenameLBL);
		
		fullnameTXT = new JTextField();
		fullnameTXT.setFont(new Font("Arial", Font.PLAIN, 12));
		fullnameTXT.setBounds(53, 145, 696, 39);
		clearancePNL.add(fullnameTXT);
		fullnameTXT.setColumns(10);
		
		JLabel addressLBL = new JLabel("Address");
		addressLBL.setFont(new Font("Arial", Font.PLAIN, 15));
		addressLBL.setBounds(66, 237, 68, 14);
		clearancePNL.add(addressLBL);
		
		addressTXT = new JTextField();
		addressTXT.setFont(new Font("Arial", Font.PLAIN, 12));
		addressTXT.setBounds(53, 254, 696, 39);
		clearancePNL.add(addressTXT);
		addressTXT.setColumns(10);
		
		JLabel ageLBL = new JLabel("Age");
		ageLBL.setFont(new Font("Arial", Font.PLAIN, 15));
		ageLBL.setBounds(66, 331, 46, 20);
		clearancePNL.add(ageLBL);
		
		ageTXT = new JTextField();
		ageTXT.setBounds(53, 351, 115, 39);
		clearancePNL.add(ageTXT);
		ageTXT.setColumns(10);
		
		JButton addBTN = new JButton("Add Clearance");
		addBTN.setBackground(new Color(255, 128, 0));
		addBTN.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        try {
		            String fullname = fullnameTXT.getText().trim();
		            String address = addressTXT.getText().trim();
		            String ageText = ageTXT.getText().trim();

		            if (fullname.isEmpty() || address.isEmpty() || ageText.isEmpty()) {
		                JOptionPane.showMessageDialog(null, "Please fill in all fields.");
		                return;
		            }

		            if (!fullname.matches("[a-zA-Z\\s]+")) {
		                JOptionPane.showMessageDialog(null, "Name must contain only letters.");
		                return;
		            }

		            int age = Integer.parseInt(ageText);
		            if (age < 0 || age > 120) {
		                JOptionPane.showMessageDialog(null, "Please enter a valid age (0-120).");
		                return;
		            }
		            
		            Connection con = DBConnection.getConnection();
		            String addQuery = "INSERT INTO clearance (fullname, address, age) VALUES(?, ?, ?)";
		            PreparedStatement pst = con.prepareStatement(addQuery);
		            pst.setString(1, fullname);
		            pst.setString(2, address);
		            pst.setInt(3, age);

		            int rows = pst.executeUpdate();

		            if (rows > 0) {
		                JOptionPane.showMessageDialog(null, "Insert successful.");
		            } else {
		                JOptionPane.showMessageDialog(null, "Insert failed.");
		            }

		        } catch (NumberFormatException ex) {
		            JOptionPane.showMessageDialog(null, "Age must be a number.");
		        } catch (SQLException ex) {
		            JOptionPane.showMessageDialog(null, "Database error: " + ex.getMessage());
		        }
		    }
		});
		
				
				
				addBTN.setFont(new Font("Arial", Font.PLAIN, 15));
				addBTN.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				addBTN.setBounds(53, 547, 162, 39);
				clearancePNL.add(addBTN);
				
				JLabel clearanceLBL = new JLabel("CLEARANCE");
				clearanceLBL.setFont(new Font("Arial", Font.PLAIN, 30));
				clearanceLBL.setBounds(308, 25, 204, 31);
				clearancePNL.add(clearanceLBL);
				
				JPanel indigencyPNL = new JPanel();
				indigencyPNL.setBorder(new LineBorder(new Color(165, 42, 42), 4));
				indigencyPNL.setBackground(new Color(255, 240, 245));
				docsnreqTAB.addTab("New tab", null, indigencyPNL, null);
				indigencyPNL.setLayout(null);
				
				JLabel indigencyLBL = new JLabel("INDIGENCY");
				indigencyLBL.setFont(new Font("Arial", Font.PLAIN, 30));
				indigencyLBL.setBounds(308, 28, 181, 31);
				indigencyPNL.add(indigencyLBL);
				
				fullnameTXT1 = new JTextField();
				fullnameTXT1.setFont(new Font("Arial", Font.PLAIN, 12));
				fullnameTXT1.setColumns(10);
				fullnameTXT1.setBounds(53, 141, 696, 39);
				indigencyPNL.add(fullnameTXT1);
				
				JLabel lastnameLBL_1 = new JLabel("Last Name");
				lastnameLBL_1.setFont(new Font("Arial", Font.PLAIN, 15));
				lastnameLBL_1.setBounds(66, 123, 86, 14);
				indigencyPNL.add(lastnameLBL_1);
				
				JLabel firstnameLBL_1 = new JLabel("First Name");
				firstnameLBL_1.setFont(new Font("Arial", Font.PLAIN, 15));
				firstnameLBL_1.setBounds(363, 123, 104, 14);
				indigencyPNL.add(firstnameLBL_1);
				
				JLabel middlenameLBL_1 = new JLabel("Middle Name");
				middlenameLBL_1.setFont(new Font("Arial", Font.PLAIN, 15));
				middlenameLBL_1.setBounds(653, 123, 96, 14);
				indigencyPNL.add(middlenameLBL_1);
				
				addressTXT1 = new JTextField();
				addressTXT1.setFont(new Font("Arial", Font.PLAIN, 12));
				addressTXT1.setColumns(10);
				addressTXT1.setBounds(53, 235, 696, 39);
				indigencyPNL.add(addressTXT1);
				
				purposeTXT1 = new JTextField();
				purposeTXT1.setFont(new Font("Arial", Font.PLAIN, 12));
				purposeTXT1.setColumns(10);
				purposeTXT1.setBounds(53, 330, 696, 39);
				indigencyPNL.add(purposeTXT1);
				
				dateissuedTXT1 = new JTextField();
				dateissuedTXT1.setFont(new Font("Arial", Font.PLAIN, 12));
				dateissuedTXT1.setColumns(10);
				dateissuedTXT1.setBounds(53, 429, 355, 39);
				indigencyPNL.add(dateissuedTXT1);
				
				JLabel addressLBL_1 = new JLabel("Address");
				addressLBL_1.setFont(new Font("Arial", Font.PLAIN, 15));
				addressLBL_1.setBounds(66, 215, 68, 14);
				indigencyPNL.add(addressLBL_1);
				
				JLabel purposeLBL = new JLabel("Purpose");
				purposeLBL.setFont(new Font("Arial", Font.PLAIN, 15));
				purposeLBL.setBounds(66, 311, 68, 14);
				indigencyPNL.add(purposeLBL);
				
				JLabel dateissuedLBL = new JLabel("Date issued");
				dateissuedLBL.setFont(new Font("Arial", Font.PLAIN, 15));
				dateissuedLBL.setBounds(66, 411, 86, 14);
				indigencyPNL.add(dateissuedLBL);
				
				JButton printBTN = new JButton("Print");
				printBTN.setBackground(new Color(255, 128, 0));
				printBTN.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					    try {
					        String fullname = fullnameTXT1.getText().trim();
					        String address = addressTXT1.getText().trim();
					        String purpose = purposeTXT1.getText().trim();
					        String dateissue = dateissuedTXT1.getText().trim(); 

					        if (fullname.isEmpty() || address.isEmpty() || purpose.isEmpty() || dateissue.isEmpty()) {
					            JOptionPane.showMessageDialog(null, "Please complete all fields.");
					            return;
					        }

					        if (!fullname.matches("[a-zA-Z\\s]+")) {
					            JOptionPane.showMessageDialog(null, "Name must only contain letters and spaces.");
					            return;
					        }

					        Connection con = DBConnection.getConnection();
					        String addQuery = "INSERT INTO indigency(fullname, address, purpose, dateissue) VALUES(?, ?, ?, ?)";
					        PreparedStatement pst = con.prepareStatement(addQuery);

					        pst.setString(1, fullname);
					        pst.setString(2, address);
					        pst.setString(3, purpose);
					        pst.setString(4, dateissue);

					        int rows = pst.executeUpdate();

					        if (rows > 0) {
					            JOptionPane.showMessageDialog(null, "Insert successful.");
					        } else {
					            JOptionPane.showMessageDialog(null, "Insert failed.");
					        }

					    } catch (SQLException ex) {
					        JOptionPane.showMessageDialog(null, "Database error: " + ex.getMessage());
					    }
					}

				});
				
		printBTN.setFont(new Font("Arial", Font.PLAIN, 15));
		printBTN.setBounds(61, 531, 115, 39);
		indigencyPNL.add(printBTN);
		
		JPanel permitPNL = new JPanel();
		permitPNL.setBorder(new LineBorder(new Color(165, 42, 42), 4));
		permitPNL.setBackground(new Color(255, 240, 245));
		docsnreqTAB.addTab("New tab", null, permitPNL, null);
		permitPNL.setLayout(null);
		
		JLabel lblPermit = new JLabel("PERMIT");
		lblPermit.setFont(new Font("Arial", Font.PLAIN, 30));
		lblPermit.setBounds(340, 21, 120, 31);
		permitPNL.add(lblPermit);
		
		JLabel lastnameLBL_2 = new JLabel("Last Name");
		lastnameLBL_2.setFont(new Font("Arial", Font.PLAIN, 15));
		lastnameLBL_2.setBounds(65, 146, 86, 14);
		permitPNL.add(lastnameLBL_2);
		
		JLabel firstnameLBL_2 = new JLabel("First Name");
		firstnameLBL_2.setFont(new Font("Arial", Font.PLAIN, 15));
		firstnameLBL_2.setBounds(358, 146, 104, 14);
		permitPNL.add(firstnameLBL_2);
		
		JLabel middlenameLBL_2 = new JLabel("Middle Name");
		middlenameLBL_2.setFont(new Font("Arial", Font.PLAIN, 15));
		middlenameLBL_2.setBounds(652, 146, 96, 14);
		permitPNL.add(middlenameLBL_2);
		
		fullnameTXT2 = new JTextField();
		fullnameTXT2.setFont(new Font("Arial", Font.PLAIN, 12));
		fullnameTXT2.setColumns(10);
		fullnameTXT2.setBounds(52, 164, 696, 37);
		permitPNL.add(fullnameTXT2);
		
		JLabel addressLBL_2 = new JLabel("Address");
		addressLBL_2.setFont(new Font("Arial", Font.PLAIN, 15));
		addressLBL_2.setBounds(65, 238, 68, 14);
		permitPNL.add(addressLBL_2);
		
		addressTXT2 = new JTextField();
		addressTXT2.setFont(new Font("Arial", Font.PLAIN, 12));
		addressTXT2.setColumns(10);
		addressTXT2.setBounds(52, 258, 696, 37);
		permitPNL.add(addressTXT2);
		
		JLabel purposeLBL_1 = new JLabel("Purpose");
		purposeLBL_1.setFont(new Font("Arial", Font.PLAIN, 15));
		purposeLBL_1.setBounds(65, 334, 68, 14);
		permitPNL.add(purposeLBL_1);
		
		purposeTXT2 = new JTextField();
		purposeTXT2.setFont(new Font("Arial", Font.PLAIN, 12));
		purposeTXT2.setColumns(10);
		purposeTXT2.setBounds(52, 353, 696, 37);
		permitPNL.add(purposeTXT2);
		
		JLabel dateLBL = new JLabel("Date");
		dateLBL.setFont(new Font("Arial", Font.PLAIN, 15));
		dateLBL.setBounds(65, 434, 50, 14);
		permitPNL.add(dateLBL);
		
		dateTXT2 = new JTextField();
		dateTXT2.setFont(new Font("Arial", Font.PLAIN, 12));
		dateTXT2.setColumns(10);
		dateTXT2.setBounds(52, 452, 222, 37);
		permitPNL.add(dateTXT2);
		
		JButton printBTN1 = new JButton("Print");
		printBTN1.setBackground(new Color(255, 128, 0));
		printBTN1.setForeground(Color.BLACK);
		printBTN1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    String fullname = fullnameTXT2.getText().trim();
			    String address = addressTXT2.getText().trim();
			    String purpose = purposeTXT2.getText().trim();
			    String date = dateTXT2.getText().trim();

			   
			    if (fullname.isEmpty() || address.isEmpty() || purpose.isEmpty() || date.isEmpty()) {
			        JOptionPane.showMessageDialog(null, "Please fill in all fields.");
			        return;
			    }

			    if (!date.matches("\\d{4}-\\d{2}-\\d{2}")) {
			        JOptionPane.showMessageDialog(null, "Invalid date format. Please use yyyy-MM-dd.");
			        return;
			    }

			    try {
			        Connection con = DBConnection.getConnection();
			        String addQuery = "INSERT INTO permit(fullname, address, purpose, date) VALUES(?, ?, ?, ?)";
			        PreparedStatement pst = con.prepareStatement(addQuery);

			        pst.setString(1, fullname);
			        pst.setString(2, address);
			        pst.setString(3, purpose);
			        pst.setString(4, date);

			        int rows = pst.executeUpdate();

			        if (rows > 0) {
			            JOptionPane.showMessageDialog(null, "Insert successful");
			        } else {
			            JOptionPane.showMessageDialog(null, "Insert failed");
			        }

			        pst.close();
			        con.close();

			    } catch (SQLException e1) {
			        JOptionPane.showMessageDialog(null, "Database error: " + e1.getMessage());
			        e1.printStackTrace();
			    } catch (Exception ex) {
			        JOptionPane.showMessageDialog(null, "Unexpected error: " + ex.getMessage());
			        ex.printStackTrace();
			    }
			}
			});
		
		printBTN1.setFont(new Font("Arial", Font.PLAIN, 15));
		printBTN1.setBounds(60, 554, 115, 37);
		permitPNL.add(printBTN1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBackground(new Color(248, 248, 255));
		lblNewLabel_2.setBounds(10, 0, 1035, 731);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\lemonstar\\Downloads\\Untitled design (5).png"));
		documentsandRequestPNL.add(lblNewLabel_2);
		
		JPanel reportsPNL = new JPanel();
		tabbedPane.addTab("New tab", null, reportsPNL, null);
		reportsPNL.setLayout(null);
		
		
		JButton brgyOfficials = new JButton("Barangay Officials") {
			
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
		brgyOfficials.setIcon(null);
		brgyOfficials.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()== brgyOfficials);
				tabbedPane.setSelectedIndex(1);
			}
		});
		brgyOfficials.setContentAreaFilled(false);
		brgyOfficials.setFont(new Font("Arial", Font.PLAIN, 14));
	
		
		brgyOfficials.setBounds(40, 157, 220, 35);
		sidepnlDashBoard.add(brgyOfficials);
		
		JButton ResidentInfoBTN = new JButton("Residents Information") {
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
		
		ResidentInfoBTN.setFont(new Font("Arial", Font.PLAIN, 14));
		ResidentInfoBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == ResidentInfoBTN) {
					tabbedPane.setSelectedIndex(2);
					
					
				}
				
			}
		});
		ResidentInfoBTN.setContentAreaFilled(false);
		ResidentInfoBTN.setBounds(40, 251, 220, 35);
		sidepnlDashBoard.add(ResidentInfoBTN);
		
		JButton DocumentsnRequestBTN = new JButton("Documents and Requests") {
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
		DocumentsnRequestBTN.setFont(new Font("Arial", Font.PLAIN, 14));
		DocumentsnRequestBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == DocumentsnRequestBTN) {
					tabbedPane.setSelectedIndex(3);
					
					
				}
				
			}
		});
		DocumentsnRequestBTN.setContentAreaFilled(false);
		DocumentsnRequestBTN.setBounds(40, 341, 220, 35);
		sidepnlDashBoard.add(DocumentsnRequestBTN);
		
		JButton ReportsBTN = new JButton("Reports") {
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
		ReportsBTN.setFont(new Font("Arial", Font.PLAIN, 14));
		ReportsBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == ReportsBTN) {
					tabbedPane.setSelectedIndex(4);
					
					
				}
			}
		});
		ReportsBTN.setContentAreaFilled(false);
		ReportsBTN.setBounds(40, 428, 220, 35);
		sidepnlDashBoard.add(ReportsBTN);
		
		JButton organizationBTN = new JButton("	Organizations") {
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
		organizationBTN.setContentAreaFilled(false);
		organizationBTN.setFont(new Font("Arial", Font.PLAIN, 14));
		organizationBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == organizationBTN) {
					tabbedPane.setSelectedIndex(5);
	
				}
			}
		});
		organizationBTN.setBounds(40, 521, 220, 35);
		sidepnlDashBoard.add(organizationBTN);
		
		JButton logoutBTN = new JButton("Log Out") {
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
		logoutBTN.setContentAreaFilled(false);
		logoutBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(
					    null,
					    "Are you sure you want to logout?",
					    "Logout Confirmation",
					    JOptionPane.YES_NO_OPTION,
					    JOptionPane.QUESTION_MESSAGE
					);

					if (result == JOptionPane.YES_OPTION) {
					    System.exit(result);
					}

			}
		});
		logoutBTN.setFont(new Font("Arial", Font.PLAIN, 14));
		logoutBTN.setBounds(40, 635, 220, 35);
		sidepnlDashBoard.add(logoutBTN);
		
		JLabel lblBrgyIbayotipas = new JLabel("Brgy ibayo-Tipas");
		lblBrgyIbayotipas.setFont(new Font("Arial", Font.PLAIN, 14));
		lblBrgyIbayotipas.setBounds(146, 82, 142, 20);
		sidepnlDashBoard.add(lblBrgyIbayotipas);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\lemonstar\\Downloads\\LOGO-removebg-preview.png"));
		lblNewLabel_7.setBounds(24, 11, 142, 123);
		sidepnlDashBoard.add(lblNewLabel_7);
		
		JTabbedPane reportsTAB = new JTabbedPane(JTabbedPane.TOP);
		reportsTAB.setBounds(136, -28, 897, 731);
		reportsPNL.add(reportsTAB);
		
			
		JButton homeBTN = new JButton("HOME");
		homeBTN.setVisible(false);
		homeBTN.setBounds(109, 108, 89, 23);
		
		JButton bawcBTN = new JButton("VAWC");
		bawcBTN.setFont(new Font("Arial", Font.BOLD, 13));
		bawcBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				reportsTAB.setSelectedIndex(2);
			}
		});
		bawcBTN.setBounds(20, 354, 106, 41);
		reportsPNL.add(bawcBTN);
		
		JButton Blotter = new JButton("Blotter");
		Blotter.setFont(new Font("Arial", Font.BOLD, 13));
		Blotter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				reportsTAB.setSelectedIndex(0);
				
			}
		});
		Blotter.setBounds(20, 161, 106, 41);
		reportsPNL.add(Blotter);
		
		JButton complainBTN = new JButton("Complaint ");
		complainBTN.setFont(new Font("Arial", Font.BOLD, 13));
		complainBTN.setBounds(20, 254, 106, 41);
		reportsPNL.add(complainBTN);
		complainBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				reportsTAB.setSelectedIndex(1);
			}
		});
		
		
		JPanel blotterPNL = new JPanel();
		reportsTAB.addTab("New tab", null, blotterPNL, null);
		blotterPNL.setLayout(null);
		
		JPanel blotterPNL_1 = new JPanel();
		blotterPNL_1.setBorder(new LineBorder(new Color(165, 42, 42), 4));
		blotterPNL_1.setBackground(new Color(255, 240, 245));
		blotterPNL_1.setLayout(null);
		blotterPNL_1.setBounds(0, 0, 892, 703);
		blotterPNL.add(blotterPNL_1);
		
		JLabel lblBlotter = new JLabel("BLOTTER");
		lblBlotter.setFont(new Font("Arial", Font.PLAIN, 30));
		lblBlotter.setBounds(360, 29, 159, 31);
		blotterPNL_1.add(lblBlotter);
		
		namecomplaintTXT = new JTextField();
		namecomplaintTXT.setFont(new Font("Arial", Font.PLAIN, 12));
		namecomplaintTXT.setColumns(10);
		namecomplaintTXT.setBounds(83, 151, 419, 41);
		blotterPNL_1.add(namecomplaintTXT);
		
		JLabel namecomplainantLBL = new JLabel("Name of Complainant");
		namecomplainantLBL.setFont(new Font("Arial", Font.PLAIN, 15));
		namecomplainantLBL.setBounds(93, 133, 141, 14);
		blotterPNL_1.add(namecomplainantLBL);
		
		namerespondentTXT = new JTextField();
		namerespondentTXT.setFont(new Font("Arial", Font.PLAIN, 12));
		namerespondentTXT.setColumns(10);
		namerespondentTXT.setBounds(83, 245, 419, 41);
		blotterPNL_1.add(namerespondentTXT);
		
		blotteraddressTXT = new JTextField();
		blotteraddressTXT.setFont(new Font("Arial", Font.PLAIN, 12));
		blotteraddressTXT.setColumns(10);
		blotteraddressTXT.setBounds(83, 353, 292, 41);
		blotterPNL_1.add(blotteraddressTXT);
		
		descriptionTXT = new JTextField();
		descriptionTXT.setFont(new Font("Arial", Font.PLAIN, 12));
		descriptionTXT.setColumns(10);
		descriptionTXT.setBounds(83, 454, 355, 96);
		blotterPNL_1.add(descriptionTXT);
		
		JLabel addressLBL_3 = new JLabel("Address");
		addressLBL_3.setFont(new Font("Arial", Font.PLAIN, 15));
		addressLBL_3.setBounds(93, 334, 68, 14);
		blotterPNL_1.add(addressLBL_3);
		
		JLabel descriptionLBL = new JLabel("Description Incident");
		descriptionLBL.setFont(new Font("Arial", Font.PLAIN, 15));
		descriptionLBL.setBounds(93, 435, 141, 14);
		blotterPNL_1.add(descriptionLBL);
		
		JButton printBTN_2 = new JButton("Print");
		printBTN_2.setBackground(new Color(255, 128, 0));
		printBTN_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    String complaint = namecomplaintTXT.getText().trim();
			    String contactComplaint = contactcomplaintTXT.getText().trim();
			    String respondent = namerespondentTXT.getText().trim();
			    String contactrespondent = contactrespondentTXT.getText().trim();
			    String address = blotteraddressTXT.getText().trim();
			    String caseNumberStr = casenumberTXT.getText().trim();
			    String description = descriptionTXT.getText().trim();
			    String datereported = datereportedTXT.getText().trim();

		
			    if (complaint.isEmpty() || contactComplaint.isEmpty() || respondent.isEmpty() || contactrespondent.isEmpty() ||
			        address.isEmpty() || caseNumberStr.isEmpty() || description.isEmpty() || datereported.isEmpty()) {
			        JOptionPane.showMessageDialog(null, "Please fill in all fields.");
			        return;
			    }

			    int caseNumber;
			    try {
			        caseNumber = Integer.parseInt(caseNumberStr);
			    } catch (NumberFormatException nfe) {
			        JOptionPane.showMessageDialog(null, "Case number must be a valid integer.");
			        return;
			    }

			   
			    if (!datereported.matches("\\d{4}-\\d{2}-\\d{2}")) {
			        JOptionPane.showMessageDialog(null, "Invalid date format. Please use yyyy-MM-dd.");
			        return;
			    }

			    try {
			        Connection con = DBConnection.getConnection();
			        String printQuery = "INSERT INTO blotter "
			                + "(complaint_name, contact_complaint, respondent_name, contact_respondent, address, case_no, incident_description, date_reported) "
			                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
			        PreparedStatement pst = con.prepareStatement(printQuery);

			        pst.setString(1, complaint);
			        pst.setString(2, contactComplaint);
			        pst.setString(3, respondent);
			        pst.setString(4, contactrespondent);
			        pst.setString(5, address);
			        pst.setInt(6, caseNumber);
			        pst.setString(7, description);
			        pst.setString(8, datereported);

			        int rows = pst.executeUpdate();

			        if (rows > 0) {
			            JOptionPane.showMessageDialog(null, "Insert successful");
			        } else {
			            JOptionPane.showMessageDialog(null, "Insert failed");
			        }

			        pst.close();
			        con.close();

			    } catch (SQLException e1) {
			        JOptionPane.showMessageDialog(null, "Database error: " + e1.getMessage());
			        e1.printStackTrace();
			    } catch (Exception ex) {
			        JOptionPane.showMessageDialog(null, "Unexpected error: " + ex.getMessage());
			        ex.printStackTrace();
			    }
			}

		});
		
		
		
		printBTN_2.setFont(new Font("Arial", Font.PLAIN, 15));
		printBTN_2.setBounds(83, 599, 115, 31);
		blotterPNL_1.add(printBTN_2);
		
		JLabel namerespondentLBL = new JLabel("Name of Respondent");
		namerespondentLBL.setFont(new Font("Arial", Font.PLAIN, 15));
		namerespondentLBL.setBounds(93, 228, 141, 14);
		blotterPNL_1.add(namerespondentLBL);
		
		contactcomplaintTXT = new JTextField();
		contactcomplaintTXT.setFont(new Font("Arial", Font.PLAIN, 12));
		contactcomplaintTXT.setColumns(10);
		contactcomplaintTXT.setBounds(558, 151, 224, 41);
		blotterPNL_1.add(contactcomplaintTXT);
		
		JLabel signatureLBL = new JLabel("Contact No.");
		signatureLBL.setFont(new Font("Arial", Font.PLAIN, 15));
		signatureLBL.setBounds(567, 129, 103, 18);
		blotterPNL_1.add(signatureLBL);
		
		JLabel signatureLBL_1 = new JLabel("Contact No.");
		signatureLBL_1.setFont(new Font("Arial", Font.PLAIN, 15));
		signatureLBL_1.setBounds(567, 223, 115, 18);
		blotterPNL_1.add(signatureLBL_1);
		
		contactrespondentTXT = new JTextField();
		contactrespondentTXT.setFont(new Font("Arial", Font.PLAIN, 12));
		contactrespondentTXT.setColumns(10);
		contactrespondentTXT.setBounds(558, 245, 224, 41);
		blotterPNL_1.add(contactrespondentTXT);
		
		JLabel casenumberLBL = new JLabel("Case Number");
		casenumberLBL.setFont(new Font("Arial", Font.PLAIN, 15));
		casenumberLBL.setBounds(453, 332, 103, 18);
		blotterPNL_1.add(casenumberLBL);
		
		casenumberTXT = new JTextField();
		casenumberTXT.setFont(new Font("Arial", Font.PLAIN, 12));
		casenumberTXT.setColumns(10);
		casenumberTXT.setBounds(438, 353, 344, 41);
		blotterPNL_1.add(casenumberTXT);
		
		datereportedTXT = new JTextField();
		datereportedTXT.setBounds(494, 455, 288, 95);
		blotterPNL_1.add(datereportedTXT);
		datereportedTXT.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Date Reported");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(500, 436, 109, 14);
		blotterPNL_1.add(lblNewLabel_4);
		
		JPanel complaintPNL = new JPanel();
		complaintPNL.setBorder(new LineBorder(new Color(165, 42, 42), 4));
		complaintPNL.setBackground(new Color(255, 240, 245));
		reportsTAB.addTab("New tab", null, complaintPNL, null);
		complaintPNL.setLayout(null);
		
		name1TXT = new JTextField();
		name1TXT.setFont(new Font("Arial", Font.PLAIN, 12));
		name1TXT.setColumns(10);
		name1TXT.setBounds(102, 244, 509, 40);
		complaintPNL.add(name1TXT);
		
		JLabel complaintLBL = new JLabel("COMPLAINT INCIDENT");
		complaintLBL.setFont(new Font("Arial", Font.PLAIN, 30));
		complaintLBL.setBounds(276, 32, 323, 31);
		complaintPNL.add(complaintLBL);
		
		JLabel namecomplainantLBL_1 = new JLabel("Name of Complainant");
		namecomplainantLBL_1.setFont(new Font("Arial", Font.PLAIN, 15));
		namecomplainantLBL_1.setBounds(112, 120, 141, 14);
		complaintPNL.add(namecomplainantLBL_1);
		
		NameTXT = new JTextField();
		NameTXT.setFont(new Font("Arial", Font.PLAIN, 12));
		NameTXT.setColumns(10);
		NameTXT.setBounds(102, 138, 509, 40);
		complaintPNL.add(NameTXT);
		
		contactTXT = new JTextField();
		contactTXT.setFont(new Font("Arial", Font.PLAIN, 12));
		contactTXT.setColumns(10);
		contactTXT.setBounds(644, 138, 157, 40);
		complaintPNL.add(contactTXT);
		
		JLabel contactLBL = new JLabel("Contact No");
		contactLBL.setFont(new Font("Arial", Font.PLAIN, 15));
		contactLBL.setBounds(649, 118, 84, 18);
		complaintPNL.add(contactLBL);
		
		contact1TXT = new JTextField();
		contact1TXT.setFont(new Font("Arial", Font.PLAIN, 12));
		contact1TXT.setColumns(10);
		contact1TXT.setBounds(644, 244, 157, 40);
		complaintPNL.add(contact1TXT);
		
		JLabel contactnoLBL = new JLabel("Contact No");
		contactnoLBL.setFont(new Font("Arial", Font.PLAIN, 15));
		contactnoLBL.setBounds(649, 223, 84, 18);
		complaintPNL.add(contactnoLBL);
		
		address1TXT = new JTextField();
		address1TXT.setFont(new Font("Arial", Font.PLAIN, 12));
		address1TXT.setColumns(10);
		address1TXT.setBounds(102, 342, 292, 40);
		complaintPNL.add(address1TXT);
		
		JLabel addressLBL_4 = new JLabel("Address");
		addressLBL_4.setFont(new Font("Arial", Font.PLAIN, 15));
		addressLBL_4.setBounds(112, 323, 68, 14);
		complaintPNL.add(addressLBL_4);
		
		diTXT = new JTextField();
		diTXT.setFont(new Font("Arial", Font.PLAIN, 12));
		diTXT.setColumns(10);
		diTXT.setBounds(102, 446, 355, 92);
		complaintPNL.add(diTXT);
		
		JLabel descriptionLBL_1 = new JLabel("Description Incident");
		descriptionLBL_1.setFont(new Font("Arial", Font.PLAIN, 15));
		descriptionLBL_1.setBounds(112, 427, 141, 14);
		complaintPNL.add(descriptionLBL_1);
		
		witnessTXT = new JTextField();
		witnessTXT.setFont(new Font("Arial", Font.PLAIN, 12));
		witnessTXT.setColumns(10);
		witnessTXT.setBounds(460, 342, 341, 40);
		complaintPNL.add(witnessTXT);
		
		JLabel lblWitness = new JLabel("Witness");
		lblWitness.setFont(new Font("Arial", Font.PLAIN, 15));
		lblWitness.setBounds(472, 321, 68, 18);
		complaintPNL.add(lblWitness);
		
		JButton printBTN_3 = new JButton("Print");
		printBTN_3.setBackground(new Color(255, 128, 0));
		printBTN_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					String name = NameTXT.getText();
					String name1 = name1TXT.getText();
					String contact = contactTXT.getText();
					String contact1 = contact1TXT.getText();
					String address1 = address1TXT.getText();
					String witness = witnessTXT.getText();
					String evidence = evidenceTXT.getText();
					String di = diTXT.getText();
		            
		          
		            try {
		            Connection con = DBConnection.getConnection();
		            String addQuery = "INSERT INTO complaint (name, name1, contact, contact1, address1, witness ,evidence , di ) VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
		            PreparedStatement pst = con.prepareStatement(addQuery);
		            
						pst.setString(1, name);
						pst.setString(2, name1);
						pst.setString(3, contact);
						pst.setString(4, contact1);
						pst.setString(5, address1);
						pst.setString(6, witness);
						pst.setString(7, evidence);
						pst.setString(8, di);

						int rows = pst.executeUpdate();
						
						if(rows > 0) {
							JOptionPane.showMessageDialog(null, "insert success");
						}else {
							JOptionPane.showMessageDialog(null, "not success");
						}
						
						
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
		            
					
			
			}
		});
		printBTN_3.setFont(new Font("Arial", Font.PLAIN, 15));
		printBTN_3.setBounds(102, 604, 115, 31);
		complaintPNL.add(printBTN_3);
		
		JLabel namerespondentLBL_1 = new JLabel("Name of Respondent");
		namerespondentLBL_1.setFont(new Font("Arial", Font.PLAIN, 15));
		namerespondentLBL_1.setBounds(112, 225, 141, 14);
		complaintPNL.add(namerespondentLBL_1);
		
		evidenceTXT = new JTextField();
		evidenceTXT.setFont(new Font("Arial", Font.PLAIN, 12));
		evidenceTXT.setColumns(10);
		evidenceTXT.setBounds(487, 470, 314, 40);
		complaintPNL.add(evidenceTXT);
		
		JLabel evidenceLBL = new JLabel("Evidence");
		evidenceLBL.setFont(new Font("Arial", Font.PLAIN, 15));
		evidenceLBL.setBounds(494, 451, 68, 14);
		complaintPNL.add(evidenceLBL);
		
		JPanel vawcPNL = new JPanel();
		vawcPNL.setBorder(new LineBorder(new Color(165, 42, 42), 4));
		vawcPNL.setBackground(new Color(255, 240, 245));
		reportsTAB.addTab("New tab", null, vawcPNL, null);
		vawcPNL.setLayout(null);
		
		JLabel vawcLBL = new JLabel("VAWC");
		vawcLBL.setFont(new Font("Arial", Font.PLAIN, 30));
		vawcLBL.setBounds(391, 31, 103, 31);
		vawcPNL.add(vawcLBL);
		
		JLabel fullnameLBL = new JLabel("Full Name");
		fullnameLBL.setFont(new Font("Arial", Font.PLAIN, 15));
		fullnameLBL.setBounds(121, 133, 141, 14);
		vawcPNL.add(fullnameLBL);
		
		fullnameTXT3 = new JTextField();
		fullnameTXT3.setFont(new Font("Arial", Font.PLAIN, 12));
		fullnameTXT3.setColumns(10);
		fullnameTXT3.setBounds(113, 151, 699, 39);
		vawcPNL.add(fullnameTXT3);
		
		addressTXT3 = new JTextField();
		addressTXT3.setFont(new Font("Arial", Font.PLAIN, 12));
		addressTXT3.setColumns(10);
		addressTXT3.setBounds(113, 245, 699, 39);
		vawcPNL.add(addressTXT3);
		
		JLabel addressLBL_5 = new JLabel("Address");
		addressLBL_5.setFont(new Font("Arial", Font.PLAIN, 15));
		addressLBL_5.setBounds(121, 229, 68, 14);
		vawcPNL.add(addressLBL_5);
		
		householdTXT3 = new JTextField();
		householdTXT3.setFont(new Font("Arial", Font.PLAIN, 12));
		householdTXT3.setColumns(10);
		householdTXT3.setBounds(113, 343, 351, 39);
		vawcPNL.add(householdTXT3);
		
		JLabel householdLBL = new JLabel("Household No");
		householdLBL.setFont(new Font("Arial", Font.PLAIN, 15));
		householdLBL.setBounds(121, 323, 103, 14);
		vawcPNL.add(householdLBL);
		
		headTXT3 = new JTextField();
		headTXT3.setFont(new Font("Arial", Font.PLAIN, 12));
		headTXT3.setColumns(10);
		headTXT3.setBounds(490, 343, 322, 39);
		vawcPNL.add(headTXT3);
		
		JLabel headfamilyLBL = new JLabel("Name of Head Family");
		headfamilyLBL.setFont(new Font("Arial", Font.PLAIN, 15));
		headfamilyLBL.setBounds(494, 319, 149, 23);
		vawcPNL.add(headfamilyLBL);
		
		educTXT3 = new JTextField();
		educTXT3.setFont(new Font("Arial", Font.PLAIN, 12));
		educTXT3.setColumns(10);
		educTXT3.setBounds(112, 453, 351, 39);
		vawcPNL.add(educTXT3);
		
		JLabel educationalLBL = new JLabel("Educational Attainment");
		educationalLBL.setFont(new Font("Arial", Font.PLAIN, 15));
		educationalLBL.setBounds(120, 435, 158, 14);
		vawcPNL.add(educationalLBL);
		
		JLabel lblNewLabel_12 = new JLabel("Currently Studying?");
		lblNewLabel_12.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_12.setBounds(594, 431, 133, 23);
		vawcPNL.add(lblNewLabel_12);
	
		
		JRadioButton yesRDBTN = new JRadioButton("Yes");
		yesRDBTN.setFont(new Font("Arial", Font.PLAIN, 12));
		yesRDBTN.setBackground(Color.WHITE);
		yesRDBTN.setBounds(594, 461, 52, 23);
		vawcPNL.add(yesRDBTN);
		
		JRadioButton noRDBTN = new JRadioButton("No");
		noRDBTN.setFont(new Font("Arial", Font.PLAIN, 12));
		noRDBTN.setBackground(Color.WHITE);
		noRDBTN.setBounds(664, 461, 52, 23);
		vawcPNL.add(noRDBTN);
		
		
		ButtonGroup vawcGroup = new ButtonGroup();
		vawcGroup.add(yesRDBTN);
		vawcGroup.add(noRDBTN);
		
		JButton printBTN4 = new JButton("Print");
		printBTN4.setBackground(new Color(255, 128, 0));
		printBTN4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					String fullname = fullnameTXT3.getText();
					String address = addressTXT3.getText();
					String household = householdTXT3.getText();
					String head = headTXT3.getText();
					String educ = educTXT3.getText();
					String vawc = null;
		            Enumeration<AbstractButton> buttons = vawcGroup.getElements();
		            while (buttons.hasMoreElements()) {
		                AbstractButton button = buttons.nextElement();
		                if (button.isSelected()) {
		                    vawc = button.getText();
		                    break;
		                }
		            }
				
		            try {
		            Connection con = DBConnection.getConnection();
		            String addQuery = "INSERT INTO vawc (fullname, address, household, head, educ, vawc) VALUES(?, ?, ?, ?, ?, ?)";
		            PreparedStatement pst = con.prepareStatement(addQuery);
		            
						pst.setString(1, fullname);
						pst.setString(2, address);
						pst.setString(3, household);
						pst.setString(4, head);
						pst.setString(5, educ);
						pst.setString(6, vawc);
						

						int rows = pst.executeUpdate();
						
						if(rows > 0) {
							JOptionPane.showMessageDialog(null, "insert success");
						}else {
							JOptionPane.showMessageDialog(null, "not success");
						}
						
						
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
		            
					
					
				}
			});
		
		
		printBTN4.setFont(new Font("Arial", Font.PLAIN, 15));
		printBTN4.setBounds(113, 545, 115, 31);
		vawcPNL.add(printBTN4);
		
		JPanel sidepnlDashBoard_1 = new JPanel() {
			protected void paintComponent(Graphics g) {
			}
		};
		sidepnlDashBoard_1.setBounds(580, 13, 1, 1);
		sidepnlDashBoard_1.setLayout(null);
		sidepnlDashBoard_1.setBackground(new Color(255, 128, 128));
		reportsPNL.add(sidepnlDashBoard_1);
		
		
		JButton organizationsBTN_1 = new JButton("Organizations");
		organizationsBTN_1.setFont(new Font("Arial", Font.PLAIN, 14));
		organizationsBTN_1.setBounds(51, 521, 191, 35);
		sidepnlDashBoard_1.add(organizationsBTN_1);
		
		JLabel lblNewLabel_6 = new JLabel("Admin");
		lblNewLabel_6.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(130, 35, 85, 20);
		sidepnlDashBoard_1.add(lblNewLabel_6);
		
		JButton brgyofficialsBTN_1 = new JButton("Barangay Officials");
		brgyofficialsBTN_1.setFont(new Font("Arial", Font.PLAIN, 14));
		brgyofficialsBTN_1.setBounds(51, 157, 191, 35);
		sidepnlDashBoard_1.add(brgyofficialsBTN_1);
		homeBTN.setVisible(false);
		homeBTN.setBounds(109, 108, 89, 23);
		
		JButton inforesidentsBTN_1 = new JButton("Resisdents Information");
		inforesidentsBTN_1.setFont(new Font("Arial", Font.PLAIN, 14));
		inforesidentsBTN_1.setBounds(51, 251, 191, 35);
		sidepnlDashBoard_1.add(inforesidentsBTN_1);
		
		JButton documentsBTN_1 = new JButton("Documents and Requests");
		documentsBTN_1.setFont(new Font("Arial", Font.PLAIN, 14));
		documentsBTN_1.setBounds(51, 341, 191, 35);
		sidepnlDashBoard_1.add(documentsBTN_1);
		
		JButton reportsBTN_1 = new JButton("Reports");
		reportsBTN_1.setFont(new Font("Arial", Font.PLAIN, 14));
		reportsBTN_1.setBounds(51, 428, 191, 35);
		sidepnlDashBoard_1.add(reportsBTN_1);
		
		JButton btnNewButton_1 = new JButton("Log Out");
		btnNewButton_1.setFont(new Font("Arial", Font.PLAIN, 14));
		btnNewButton_1.setBounds(51, 649, 191, 35);
		sidepnlDashBoard_1.add(btnNewButton_1);
		
		JLabel lblBrgyIbayotipas_2 = new JLabel("Brgy ibayo-Tipas");
		lblBrgyIbayotipas_2.setFont(new Font("Arial", Font.PLAIN, 14));
		lblBrgyIbayotipas_2.setBounds(130, 66, 142, 20);
		sidepnlDashBoard_1.add(lblBrgyIbayotipas_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\lemonstar\\Downloads\\Untitled design (5).png"));
		lblNewLabel_3.setBounds(20, 0, 1034, 731);
		reportsPNL.add(lblNewLabel_3);
		
		JPanel organizationsPNL = new JPanel();
		tabbedPane.addTab("New tab", null, organizationsPNL, null);
		organizationsPNL.setLayout(null);
		
		JPanel barangaybasketnallleaguePNL_1 = new JPanel();
		barangaybasketnallleaguePNL_1.setLayout(null);
		barangaybasketnallleaguePNL_1.setBorder(new LineBorder(new Color(255, 140, 0), 2));
		barangaybasketnallleaguePNL_1.setBounds(292, 22, 220, 675);
		organizationsPNL.add(barangaybasketnallleaguePNL_1);
		
		JLabel lblCleanUpDrive = new JLabel("Clean Up Drive");
		lblCleanUpDrive.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCleanUpDrive.setBounds(57, 11, 101, 16);
		barangaybasketnallleaguePNL_1.add(lblCleanUpDrive);
		
		JLabel lblFounder_1 = new JLabel("Founder");
		lblFounder_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblFounder_1.setBounds(10, 304, 57, 16);
		barangaybasketnallleaguePNL_1.add(lblFounder_1);
		
		JLabel lblPanisSandara = new JLabel("Panis, Sandara");
		lblPanisSandara.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPanisSandara.setBounds(115, 304, 95, 16);
		barangaybasketnallleaguePNL_1.add(lblPanisSandara);
		
		JLabel lblDateIssue_1 = new JLabel("Date issued");
		lblDateIssue_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDateIssue_1.setBounds(10, 359, 82, 16);
		barangaybasketnallleaguePNL_1.add(lblDateIssue_1);
		
		JLabel lblFounder_1_1_2 = new JLabel("For");
		lblFounder_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblFounder_1_1_2.setBounds(10, 417, 26, 16);
		barangaybasketnallleaguePNL_1.add(lblFounder_1_1_2);
		
		JLabel lblFounder_1_1_1_1 = new JLabel("Years");
		lblFounder_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblFounder_1_1_1_1.setBounds(10, 472, 38, 16);
		barangaybasketnallleaguePNL_1.add(lblFounder_1_1_1_1);
		
		JLabel lblMarch = new JLabel("March 05, 2015");
		lblMarch.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblMarch.setBounds(112, 359, 108, 16);
		barangaybasketnallleaguePNL_1.add(lblMarch);
		
		JLabel lblAdult = new JLabel("Adult");
		lblAdult.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblAdult.setBounds(160, 417, 38, 16);
		barangaybasketnallleaguePNL_1.add(lblAdult);
		
		JLabel lblBendoyJomar_3_1 = new JLabel("10");
		lblBendoyJomar_3_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblBendoyJomar_3_1.setBounds(178, 472, 21, 16);
		barangaybasketnallleaguePNL_1.add(lblBendoyJomar_3_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("New label");
		lblNewLabel_4_1.setIcon(new ImageIcon("C:\\Users\\lemonstar\\Downloads\\Untitled design (7).png"));
		lblNewLabel_4_1.setBounds(21, 52, 177, 106);
		barangaybasketnallleaguePNL_1.add(lblNewLabel_4_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(new Color(255, 127, 80));
		separator_1.setAlignmentY(1.0f);
		separator_1.setBounds(21, 192, 171, 16);
		barangaybasketnallleaguePNL_1.add(separator_1);
		
		JSeparator separator_2_2 = new JSeparator();
		separator_2_2.setBackground(new Color(255, 127, 80));
		separator_2_2.setAlignmentY(1.0f);
		separator_2_2.setBounds(10, 331, 189, 16);
		barangaybasketnallleaguePNL_1.add(separator_2_2);
		
		JSeparator separator_2_2_1 = new JSeparator();
		separator_2_2_1.setBackground(new Color(255, 127, 80));
		separator_2_2_1.setAlignmentY(1.0f);
		separator_2_2_1.setBounds(10, 386, 189, 16);
		barangaybasketnallleaguePNL_1.add(separator_2_2_1);
		
		JSeparator separator_2_2_1_1 = new JSeparator();
		separator_2_2_1_1.setBackground(new Color(255, 127, 80));
		separator_2_2_1_1.setAlignmentY(1.0f);
		separator_2_2_1_1.setBounds(10, 444, 189, 16);
		barangaybasketnallleaguePNL_1.add(separator_2_2_1_1);
		
		JSeparator separator_2_2_1_1_1 = new JSeparator();
		separator_2_2_1_1_1.setBackground(new Color(255, 127, 80));
		separator_2_2_1_1_1.setAlignmentY(1.0f);
		separator_2_2_1_1_1.setBounds(10, 499, 189, 16);
		barangaybasketnallleaguePNL_1.add(separator_2_2_1_1_1);
		
		JPanel barangaybasketnallleaguePNL_1_1 = new JPanel();
		barangaybasketnallleaguePNL_1_1.setBackground(UIManager.getColor("Button.background"));
		barangaybasketnallleaguePNL_1_1.setLayout(null);
		barangaybasketnallleaguePNL_1_1.setBorder(new LineBorder(Color.RED, 2));
		barangaybasketnallleaguePNL_1_1.setBounds(543, 22, 220, 675);
		organizationsPNL.add(barangaybasketnallleaguePNL_1_1);
		
		JLabel lblBarangayHealthComittee = new JLabel("Barangay Health Committee");
		lblBarangayHealthComittee.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBarangayHealthComittee.setBounds(10, 11, 200, 16);
		barangaybasketnallleaguePNL_1_1.add(lblBarangayHealthComittee);
		
		JLabel lblFounder_1_2 = new JLabel("Founder");
		lblFounder_1_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblFounder_1_2.setBounds(10, 304, 57, 16);
		barangaybasketnallleaguePNL_1_1.add(lblFounder_1_2);
		
		JLabel lblManguiKathleen = new JLabel("Mangui, Kathleen");
		lblManguiKathleen.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblManguiKathleen.setBounds(101, 304, 98, 16);
		barangaybasketnallleaguePNL_1_1.add(lblManguiKathleen);
		
		JLabel lblDateIssue_1_1 = new JLabel("Date issued");
		lblDateIssue_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDateIssue_1_1.setBounds(10, 359, 82, 16);
		barangaybasketnallleaguePNL_1_1.add(lblDateIssue_1_1);
		
		JLabel lblFounder_1_1_2_1 = new JLabel("For");
		lblFounder_1_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblFounder_1_1_2_1.setBounds(10, 417, 26, 16);
		barangaybasketnallleaguePNL_1_1.add(lblFounder_1_1_2_1);
		
		JLabel lblFounder_1_1_1_1_1 = new JLabel("Years");
		lblFounder_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblFounder_1_1_1_1_1.setBounds(10, 472, 38, 16);
		barangaybasketnallleaguePNL_1_1.add(lblFounder_1_1_1_1_1);
		
		JLabel lblFeb = new JLabel("Feb 15, 2017");
		lblFeb.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblFeb.setBounds(128, 359, 82, 16);
		barangaybasketnallleaguePNL_1_1.add(lblFeb);
		
		JLabel lblSeniorCitizen = new JLabel("Senior Citizen");
		lblSeniorCitizen.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSeniorCitizen.setBounds(116, 417, 82, 16);
		barangaybasketnallleaguePNL_1_1.add(lblSeniorCitizen);
		
		JLabel lblBendoyJomar_3_1_1 = new JLabel("13");
		lblBendoyJomar_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblBendoyJomar_3_1_1.setBounds(178, 472, 21, 16);
		barangaybasketnallleaguePNL_1_1.add(lblBendoyJomar_3_1_1);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("New label");
		lblNewLabel_4_1_1.setIcon(new ImageIcon("C:\\Users\\lemonstar\\Downloads\\Untitled design (8).png"));
		lblNewLabel_4_1_1.setBounds(20, 56, 177, 106);
		barangaybasketnallleaguePNL_1_1.add(lblNewLabel_4_1_1);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBackground(new Color(255, 127, 80));
		separator_1_1.setAlignmentY(1.0f);
		separator_1_1.setBounds(20, 191, 171, 16);
		barangaybasketnallleaguePNL_1_1.add(separator_1_1);
		
		JSeparator separator_2_2_2 = new JSeparator();
		separator_2_2_2.setBackground(new Color(255, 127, 80));
		separator_2_2_2.setAlignmentY(1.0f);
		separator_2_2_2.setBounds(10, 331, 189, 16);
		barangaybasketnallleaguePNL_1_1.add(separator_2_2_2);
		
		JSeparator separator_2_2_2_1 = new JSeparator();
		separator_2_2_2_1.setBackground(new Color(255, 127, 80));
		separator_2_2_2_1.setAlignmentY(1.0f);
		separator_2_2_2_1.setBounds(10, 386, 189, 16);
		barangaybasketnallleaguePNL_1_1.add(separator_2_2_2_1);
		
		JSeparator separator_2_2_2_1_1 = new JSeparator();
		separator_2_2_2_1_1.setBackground(new Color(255, 127, 80));
		separator_2_2_2_1_1.setAlignmentY(1.0f);
		separator_2_2_2_1_1.setBounds(10, 445, 189, 16);
		barangaybasketnallleaguePNL_1_1.add(separator_2_2_2_1_1);
		
		JSeparator separator_2_2_2_1_1_1 = new JSeparator();
		separator_2_2_2_1_1_1.setBackground(new Color(255, 127, 80));
		separator_2_2_2_1_1_1.setAlignmentY(1.0f);
		separator_2_2_2_1_1_1.setBounds(10, 499, 189, 16);
		barangaybasketnallleaguePNL_1_1.add(separator_2_2_2_1_1_1);
		
		JPanel barangaybasketnallleaguePNL_1_1_1 = new JPanel();
		barangaybasketnallleaguePNL_1_1_1.setLayout(null);
		barangaybasketnallleaguePNL_1_1_1.setBorder(new LineBorder(Color.RED, 2));
		barangaybasketnallleaguePNL_1_1_1.setBounds(796, 22, 220, 675);
		organizationsPNL.add(barangaybasketnallleaguePNL_1_1_1);
		
		JLabel lblBarangayEducationAnd = new JLabel("Barangay Education and");
		lblBarangayEducationAnd.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBarangayEducationAnd.setBounds(20, 11, 190, 16);
		barangaybasketnallleaguePNL_1_1_1.add(lblBarangayEducationAnd);
		
		JLabel lblFounder_1_2_1 = new JLabel("Founder");
		lblFounder_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblFounder_1_2_1.setBounds(10, 304, 57, 16);
		barangaybasketnallleaguePNL_1_1_1.add(lblFounder_1_2_1);
		
		JLabel lblSerranoHeartJanelle = new JLabel("Seranno, Hearth Janelle");
		lblSerranoHeartJanelle.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSerranoHeartJanelle.setBounds(62, 304, 137, 16);
		barangaybasketnallleaguePNL_1_1_1.add(lblSerranoHeartJanelle);
		
		JLabel lblDateIssue_1_1_1 = new JLabel("Date issued");
		lblDateIssue_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDateIssue_1_1_1.setBounds(10, 359, 82, 16);
		barangaybasketnallleaguePNL_1_1_1.add(lblDateIssue_1_1_1);
		
		JLabel lblFounder_1_1_2_1_1 = new JLabel("For");
		lblFounder_1_1_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblFounder_1_1_2_1_1.setBounds(10, 417, 26, 16);
		barangaybasketnallleaguePNL_1_1_1.add(lblFounder_1_1_2_1_1);
		
		JLabel lblFounder_1_1_1_1_1_1 = new JLabel("Years");
		lblFounder_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblFounder_1_1_1_1_1_1.setBounds(10, 472, 38, 16);
		barangaybasketnallleaguePNL_1_1_1.add(lblFounder_1_1_1_1_1_1);
		
		JLabel lblApril = new JLabel("April 20, 2020");
		lblApril.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblApril.setBounds(117, 359, 82, 16);
		barangaybasketnallleaguePNL_1_1_1.add(lblApril);
		
		JLabel lblChildren = new JLabel("Children");
		lblChildren.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblChildren.setBounds(151, 417, 47, 16);
		barangaybasketnallleaguePNL_1_1_1.add(lblChildren);
		
		JLabel lblBendoyJomar_3_1_1_1 = new JLabel("5");
		lblBendoyJomar_3_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblBendoyJomar_3_1_1_1.setBounds(178, 472, 21, 16);
		barangaybasketnallleaguePNL_1_1_1.add(lblBendoyJomar_3_1_1_1);
		
		JLabel lblLiteracyComittee = new JLabel("Literacy Committee");
		lblLiteracyComittee.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblLiteracyComittee.setBounds(46, 31, 137, 16);
		barangaybasketnallleaguePNL_1_1_1.add(lblLiteracyComittee);
		
		JLabel lblNewLabel_4_1_1_1 = new JLabel("New label");
		lblNewLabel_4_1_1_1.setIcon(new ImageIcon("C:\\Users\\lemonstar\\Downloads\\Untitled design (9).png"));
		lblNewLabel_4_1_1_1.setBounds(21, 58, 177, 106);
		barangaybasketnallleaguePNL_1_1_1.add(lblNewLabel_4_1_1_1);
		
		JSeparator separator_1_1_1 = new JSeparator();
		separator_1_1_1.setBackground(new Color(255, 127, 80));
		separator_1_1_1.setAlignmentY(1.0f);
		separator_1_1_1.setBounds(20, 193, 171, 16);
		barangaybasketnallleaguePNL_1_1_1.add(separator_1_1_1);
		
		JSeparator separator_2_2_2_2 = new JSeparator();
		separator_2_2_2_2.setBackground(new Color(255, 127, 80));
		separator_2_2_2_2.setAlignmentY(1.0f);
		separator_2_2_2_2.setBounds(10, 332, 189, 16);
		barangaybasketnallleaguePNL_1_1_1.add(separator_2_2_2_2);
		
		JSeparator separator_2_2_2_1_2 = new JSeparator();
		separator_2_2_2_1_2.setBackground(new Color(255, 127, 80));
		separator_2_2_2_1_2.setAlignmentY(1.0f);
		separator_2_2_2_1_2.setBounds(10, 386, 189, 16);
		barangaybasketnallleaguePNL_1_1_1.add(separator_2_2_2_1_2);
		
		JSeparator separator_2_2_2_1_2_1 = new JSeparator();
		separator_2_2_2_1_2_1.setBackground(new Color(255, 127, 80));
		separator_2_2_2_1_2_1.setAlignmentY(1.0f);
		separator_2_2_2_1_2_1.setBounds(10, 445, 189, 16);
		barangaybasketnallleaguePNL_1_1_1.add(separator_2_2_2_1_2_1);
		
		JSeparator separator_2_2_2_1_2_1_1 = new JSeparator();
		separator_2_2_2_1_2_1_1.setBackground(new Color(255, 127, 80));
		separator_2_2_2_1_2_1_1.setAlignmentY(1.0f);
		separator_2_2_2_1_2_1_1.setBounds(10, 500, 189, 16);
		barangaybasketnallleaguePNL_1_1_1.add(separator_2_2_2_1_2_1_1);
		
		JPanel barangaybasketnallleaguePNL_1_2 = new JPanel();
		barangaybasketnallleaguePNL_1_2.setLayout(null);
		barangaybasketnallleaguePNL_1_2.setBorder(new LineBorder(new Color(255, 140, 0), 2));
		barangaybasketnallleaguePNL_1_2.setBounds(38, 22, 220, 675);
		organizationsPNL.add(barangaybasketnallleaguePNL_1_2);
		
		JLabel lblBarangay = new JLabel("Barangay Basketball League");
		lblBarangay.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBarangay.setBounds(10, 11, 200, 16);
		barangaybasketnallleaguePNL_1_2.add(lblBarangay);
		
		JLabel lblFounder_1_1 = new JLabel("Founder");
		lblFounder_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblFounder_1_1.setBounds(10, 304, 57, 16);
		barangaybasketnallleaguePNL_1_2.add(lblFounder_1_1);
		
		JLabel lblBendoyJomar = new JLabel("Bendoy, Jomar");
		lblBendoyJomar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblBendoyJomar.setBounds(115, 304, 95, 16);
		barangaybasketnallleaguePNL_1_2.add(lblBendoyJomar);
		
		JLabel lblDateIssue_1_2 = new JLabel("Date issued");
		lblDateIssue_1_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDateIssue_1_2.setBounds(10, 359, 82, 16);
		barangaybasketnallleaguePNL_1_2.add(lblDateIssue_1_2);
		
		JLabel lblFounder_1_1_2_2 = new JLabel("For");
		lblFounder_1_1_2_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblFounder_1_1_2_2.setBounds(10, 417, 26, 16);
		barangaybasketnallleaguePNL_1_2.add(lblFounder_1_1_2_2);
		
		JLabel lblFounder_1_1_1_1_2 = new JLabel("Years");
		lblFounder_1_1_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblFounder_1_1_1_1_2.setBounds(10, 472, 38, 16);
		barangaybasketnallleaguePNL_1_2.add(lblFounder_1_1_1_1_2);
		
		JLabel lblMay = new JLabel("May 10, 2015");
		lblMay.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblMay.setBounds(128, 359, 82, 16);
		barangaybasketnallleaguePNL_1_2.add(lblMay);
		
		JLabel lblAdultteenagaer = new JLabel("Adult/Teenager");
		lblAdultteenagaer.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblAdultteenagaer.setBounds(104, 417, 95, 16);
		barangaybasketnallleaguePNL_1_2.add(lblAdultteenagaer);
		
		JLabel lblBendoyJomar_3_1_2 = new JLabel("10");
		lblBendoyJomar_3_1_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblBendoyJomar_3_1_2.setBounds(178, 472, 21, 16);
		barangaybasketnallleaguePNL_1_2.add(lblBendoyJomar_3_1_2);
		
		JLabel lblNewLabel_4_1_2 = new JLabel("New label");
		lblNewLabel_4_1_2.setIcon(new ImageIcon("C:\\Users\\lemonstar\\Downloads\\Untitled design (6).png"));
		lblNewLabel_4_1_2.setBounds(21, 52, 171, 106);
		barangaybasketnallleaguePNL_1_2.add(lblNewLabel_4_1_2);
		
		JSeparator separator = new JSeparator();
		separator.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		separator.setBackground(new Color(255, 127, 80));
		separator.setBounds(21, 191, 171, 16);
		barangaybasketnallleaguePNL_1_2.add(separator);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBackground(new Color(255, 127, 80));
		separator_2.setAlignmentY(1.0f);
		separator_2.setBounds(10, 331, 189, 16);
		barangaybasketnallleaguePNL_1_2.add(separator_2);
		
		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setBackground(new Color(255, 127, 80));
		separator_2_1.setAlignmentY(1.0f);
		separator_2_1.setBounds(10, 390, 189, 16);
		barangaybasketnallleaguePNL_1_2.add(separator_2_1);
		
		JSeparator separator_2_1_1 = new JSeparator();
		separator_2_1_1.setBackground(new Color(255, 127, 80));
		separator_2_1_1.setAlignmentY(1.0f);
		separator_2_1_1.setBounds(10, 454, 189, 16);
		barangaybasketnallleaguePNL_1_2.add(separator_2_1_1);
		
		JSeparator separator_2_1_1_1 = new JSeparator();
		separator_2_1_1_1.setBackground(new Color(255, 127, 80));
		separator_2_1_1_1.setAlignmentY(1.0f);
		separator_2_1_1_1.setBounds(10, 500, 189, 16);
		barangaybasketnallleaguePNL_1_2.add(separator_2_1_1_1);
		
	}	
}
