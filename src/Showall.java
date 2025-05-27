import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public class Showall extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTable table;

	public static void main(String[] args) {
		try {
			Showall dialog = new Showall();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Showall() {
		setBounds(100, 100, 1433, 851);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(255, 69, 0), 4));
		panel.setBackground(new Color(255, 240, 245));
		panel.setBounds(0, 0, 1417, 825);
		contentPanel.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Residents Information");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(74, 11, 1397, 20);
		panel.add(lblNewLabel);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 36, 1397, 769);
		panel.add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);

		loadTableData();
	}

	private void loadTableData() {
		DefaultTableModel model = new DefaultTableModel();
		model.setColumnIdentifiers(new String[] {
			"ID", "Full Name", "Suffix", "Birthday", "Age", "Gender", "Contact", "Status", "Occupation", "Address"
		});

		try {
			Connection con = DBConnection.getConnection();
			String query = "SELECT * FROM addresident";
			PreparedStatement pst = con.prepareStatement(query); 
			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				model.addRow(new Object[] {
					rs.getInt("id"),
					rs.getString("fullname"),
					rs.getString("suffix"),
					rs.getString("birthday"),
					rs.getInt("age"),
					rs.getString("gender"),
					rs.getString("contact"),
					rs.getString("status"),
					rs.getString("occupation"),
					rs.getString("address")
				});
			}

			table.setModel(model);

			rs.close();
			pst.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
