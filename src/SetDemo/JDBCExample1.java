package SetDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample1 {

	public static void main(String[] args) throws SQLException {
		//Create a connection
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","123456");

				Statement stmt=con.createStatement();  
				ResultSet rs=stmt.executeQuery("select * from tcs.employee;");
				
				while(rs.next())  
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3) + "   " +rs.getString(4) 
				
				+ "   "+rs.getInt(5));  
				
				//Create a query/Statement
				//String s = "INSERT INTO 'tcs'.'employee' (idEmployee, Emp_Name, Emp_Address,Emp_designation, Emp_Salary) VALUES ('21', 'Johan', 'US', 'SE', '80000')";
				//String s = "INSERT INTO 'tcs'.'employee' VALUES (21, 'Johan', 'US', 'SE', 80000)";
				//String s = "insert into 'tcs'.'employee' values(22, 'Papu', 'Noida','HR',36000)";
				PreparedStatement ps = con.prepareStatement("INSERT INTO 'tcs'.'employee' (idEmployee, Emp_Name, Emp_Address,Emp_designation, Emp_Salary) VALUES ('22', 'Johan', 'US', 'SE', '80000')");				
				ps.executeUpdate();
				con.close();  
				
				System.out.println("Completed...");
				} 
                 
	}


