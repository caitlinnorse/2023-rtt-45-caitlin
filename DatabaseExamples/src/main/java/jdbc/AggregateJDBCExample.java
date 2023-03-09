package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;



public class AggregateJDBCExample {
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		String dburl = "jdbc:mysql://localhost:3306/classicmodels";
		String user = "root";
		String password = "Th0r@ndl0k1";
		System.out.println("-------- MySQL JDBC Connection Demo ------------");
		
		try {
			// create a new scanner and read the first name into the variable
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter an amount : ");
			int amount = scan.nextInt();
			
			// Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection(dburl, user, password);
			
			String SelectSQL = "select c.customerNumber, c.customerName, avg((MSRP - buyPrice)*quantityOrdered) as avg_margin\r\n"
					+ "from orders o, orderdetails od, products p, customers c\r\n"
					+ "where o.orderNumber = od.orderNumber\r\n"
					+ "and od.productCode = p.productCode\r\n"
					+ "and o.customerNumber = c.customerNumber\r\n"
					+ "group by c.customerNumber\r\n"
					+ "having avg((MSRP - buyPrice)*quantityOrdered) > ?\r\n"
					+ "order by avg_margin desc;";
			
			// this is a JDBC class that creates the statement which will in turn run the SQL
			// using a prepared statement protects and preventsSQL Injection attacks
			PreparedStatement stmt = connection.prepareStatement(SelectSQL);
			
			// this is 1 based so the first ? is #1
			stmt.setInt(1, amount);
			
			//using the statement to execute a query and put the result into the ResultSet object
			ResultSet result = stmt.executeQuery();
			
			// loop over the result set
			while (result.next()) {
				String customerNumber = result.getString("customerNumber");
				String customerName = result.getString("customerName");
				String averageMargin = result.getString("avg_margin");
				System.out.println(customerNumber + " | " + customerName + "|" + averageMargin);
			}
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}



}
