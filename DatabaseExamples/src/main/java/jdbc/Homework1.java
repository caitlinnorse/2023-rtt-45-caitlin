package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Homework1 {

	// make this in a new Homework1 class
	// I want to see a list of all customers that have made a payment larger than
	// <amount> in a particular <state>
	// Print the checkNumber, amount (formatted to $#.00 ), and the customer name
	// ordred by the largest amount first
	// input variables for the scanner are 1) the amount and 2) 2 digit state code.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		String dburl = "jdbc:mysql://localhost:3306/classicmodels";
		String user = "root";
		String password = "Th0r@ndl0k1";
		System.out.println("-------- MySQL JDBC Connection Demo ------------");

		try {
			// create a new scanner and read the first name into the variable
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter a state : ");
			String state = scan.nextLine();
			System.out.println("Enter an amount : ");
			int amountMin = scan.nextInt();

			// Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection(dburl, user, password);

			String SelectSQL = 	"select p.checkNumber, p.amount, c.customerName\r\n"
				+ "from payments p, customers c \r\n"
					+ "where c.customerNumber = p.customerNumber \r\n"
					+ "and c.state = ? and amount > ? \r\n"
					+ "order by p.amount desc;";
			



			// this is a JDBC class that creates the statement which will in turn run the
			// SQL
			// using a prepared statement protects and preventsSQL Injection attacks
			PreparedStatement stmt = connection.prepareStatement(SelectSQL);

			// this is 1 based so the first ? is #1
			stmt.setString(1, state);
			stmt.setInt(2, amountMin);


			// using the statement to execute a query and put the result into the ResultSet
			// object
			ResultSet result = stmt.executeQuery();

			// loop over the result set
			while (result.next()) {
				String checkNumber = result.getString("checkNumber");
				String amount = result.getString("amount");
				String customerName = result.getString("customerName");

				System.out.println(checkNumber + " | " + amount + " | " + customerName);
			}
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
