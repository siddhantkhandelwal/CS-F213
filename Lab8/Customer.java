import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

class Customer {
	JFrame f;
	JPanel p1, p2, p3;
	JTabbedPane tp;
	ImageIcon btnimg1, btnimg2;
	JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10;
	JTextField tf1, tf2, tf4, tf5, tf6, tf7, tf8, tf10, tf11;
	JScrollPane sp1;
	JButton savebtn, resetbtn, editbtn1, editbtn2, deletebtn;
	JComboBox tf3, tf9;

	Customer() {
		f = new JFrame("Customer Form");
		p1 = new JPanel(new GridLayout(5, 2));
		p2 = new JPanel(new GridLayout(6, 2));
		p3 = new JPanel(new GridLayout(2, 2));
		tp = new JTabbedPane();

		l1 = new JLabel("Customer Name:");
		l2 = new JLabel("Customer email:");
		l3 = new JLabel("Customer Country:");
		l4 = new JLabel("Customer Gender:");
		l5 = new JLabel("Enter Customer ID to delete record:");
		l6 = new JLabel("Customer ID:");
		l7 = new JLabel("Customer Name:");
		l8 = new JLabel("Customer email:");
		l9 = new JLabel("Customer Country:");
		l10 = new JLabel("Customer Gender:");

		tf1 = new JTextField(12);
		tf2 = new JTextField(12);
		tf4 = new JTextField(12);
		tf5 = new JTextField(12);
		tf6 = new JTextField(12);
		tf7 = new JTextField(12);
		tf8 = new JTextField(12);
		tf10 = new JTextField(12);
		tf11 = new JTextField(12);

		tf3 = new JComboBox();
		tf3.addItem("INDIA");
		tf3.addItem("AMERICA");
		tf3.addItem("AUSTRALIA");
		tf3.addItem("PHILLIPHINES");
		tf3.addItem("SPAIN");

		tf9 = new JComboBox();
		tf9.addItem("INDIA");
		tf9.addItem("AMERICA");
		tf9.addItem("AUSTRALIA");
		tf9.addItem("PHILLIPHINES");
		tf9.addItem("SPAIN");

		savebtn = new JButton(" Add ");
		resetbtn = new JButton(" Reset");
		editbtn1 = new JButton(" Edit ");
		editbtn2 = new JButton(" Save");
		deletebtn = new JButton("Delete");

		p1.add(l1);
		p1.add(tf1);
		p1.add(l2);
		p1.add(tf2);
		p1.add(l3);
		p1.add(tf3);
		p1.add(l4);
		p1.add(tf4);
		p1.add(savebtn);
		p1.add(resetbtn);

		p2.add(l6);
		p2.add(tf11);
		p2.add(l7);
		p2.add(tf7);
		p2.add(l8);
		p2.add(tf8);
		p2.add(l9);
		p2.add(tf9);
		p2.add(l10);
		p2.add(tf10);
		p2.add(editbtn1);
		p2.add(editbtn2);

		p3.add(l5);
		p3.add(tf5);
		p3.add(deletebtn);

		resetbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				tf1.setText("");
				tf2.setText("");
				tf3.setSelectedIndex(0);
				tf4.setText("");
			}
		});

// Uncomment the following lines when you execute the code for the first time to //create the database and comment it after the first time
//	try {
//		createDatabase();              
//	} catch (Exception e1) {      
//		e1.printStackTrace();
//	}

		savebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				String value1 = tf1.getText();
				String value2 = tf2.getText();
				String value3 = (String) tf3.getSelectedItem();
				String value4 = tf4.getText();
				System.out.println(value1 + value2 + value3 + value4);
				try {
					Connection con = getConnection();
					int customerid = getCustomerID(con);

					PreparedStatement st = con.prepareStatement(
							"insert into CUSTOMER_INFO(CUSTOMER_ID,CUSTOMER_NAME,CUSTOMER_EMAIL,CUSTOMER_COUNTRY,CUSTOMER_GENDER) values(?,?,?,?,?)");
					st.setInt(1, customerid);
					st.setString(2, value1);
					st.setString(3, value2);
					st.setString(4, value3);
					st.setString(5, value4);
					st.executeUpdate();
					JOptionPane.showMessageDialog(p1, "Data is successfully inserted into database.");
				} catch (ClassNotFoundException e) {
					JOptionPane.showMessageDialog(p1, "Error in submitting data!");
				} catch (SQLException ex) {
					Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
				}
			}
		});


		editbtn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {

				int value = Integer.parseInt(tf11.getText());
				try {
					Connection con = getConnection();
					PreparedStatement st = con.prepareStatement("select * from CUSTOMER_INFO where CUSTOMER_ID=?");
					st.setInt(1, value);
					ResultSet res = st.executeQuery();
					res.next();
					tf11.setText(Integer.toString(res.getInt(1)));
					tf7.setText(res.getString(2));
					tf8.setText(res.getString(3));
					tf9.setSelectedItem(res.getString(4));
					tf10.setText(res.getString(5));
					con.close();
				} catch (ClassNotFoundException e) {
					JOptionPane.showMessageDialog(p2, "Can not edit data");
				} catch (SQLException ex) {
					Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
				}
			}
		});

		editbtn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				int x = JOptionPane.showConfirmDialog(p2, "Confirm edit? All data will be replaced");
				if (x == 0) {
					try {
						int value1 = Integer.parseInt(tf11.getText());
						String value2 = tf7.getText();
						String value3 = tf8.getText();
						String value4 = (String) tf9.getSelectedItem();
						String value5 = tf10.getText();
						Connection con = getConnection();
						Statement st = con.createStatement();
						st.executeUpdate("update CUSTOMER_INFO set CUSTOMER_NAME='" + value2 + "', CUSTOMER_EMAIL='"
								+ value3 + "',CUSTOMER_COUNTRY='" + value4 + "',CUSTOMER_GENDER='" + value5
								+ "' where CUSTOMER_ID=" + value1 + "");
						JOptionPane.showMessageDialog(p2, "Updated successfully");
						con.close();
					} catch (ClassNotFoundException ex) {
						JOptionPane.showMessageDialog(p2, "Error in updating edit fields");
					} catch (SQLException ex) {
						Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
					}
				}
			}
		});
	}

	deletebtn.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
			String delete_id = tf5.getText();
			try {
				Connection con = getConnection();
				PreparedStatement st = con.prepareStatement(
					"delete from CUSTOMER_INFO where CUSTOMER_ID = ?");
				st.setInt(1, Integer.parseInt(delete_id));
				st.executeUpdate();
				JOptionPane.showMessageDialog(p3, "Data was successfully deleted from the database.");
			} catch (ClassNotFoundException e) {
				JOptionPane.showMessageDialog(p3, "Error in deleting data!");	
			} catch (SQLException ex) {
				Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
	});

	void dis() {
		f.getContentPane().add(tp);
		tp.addTab("Add Record", p1);
		tp.addTab("Edit Record", p2);
		tp.addTab("Delete Record", p3);

		f.setSize(400, 200);
		f.setVisible(true);
		f.setResizable(true);
	}

	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		Connection con = DriverManager.getConnection("jdbc:derby:cust;create=true;user=app;password=app");
		return con;
	}

	public void closeConnection(Connection con) throws SQLException {
		con.close();
	}

	public int getCustomerID(Connection con) throws SQLException {
		int value = 0;
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("Select Max(CUSTOMER_ID) from CUSTOMER_INFO");
		if (rs.next())
			value = rs.getInt(1);
		return value + 1;
	}

	public static void main(String z[]) {
		Customer pro = new Customer();
		pro.dis();
	}

	public void createDatabase() throws ClassNotFoundException, SQLException {

		Class.forName("org.apache.derby.jdbc.EmbeddedDriver");

		Connection con = DriverManager.getConnection("jdbc:derby:cust;create=true;user=app;password=app");

		String createString = "create table CUSTOMER_INFO(CUSTOMER_ID INTEGER PRIMARY KEY,\r\n"
				+ "CUSTOMER_NAME VARCHAR(20),\r\n" + "CUSTOMER_EMAIL VARCHAR(50),\r\n"
				+ "CUSTOMER_COUNTRY VARCHAR(20),\r\n" + "CUSTOMER_GENDER VARCHAR(20))";

		Statement stmt = con.createStatement();
		stmt.executeUpdate(createString);
	}
}
