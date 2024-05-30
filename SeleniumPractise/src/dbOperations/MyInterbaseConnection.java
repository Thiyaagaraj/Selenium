package dbOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyInterbaseConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Class.forName("interbase.interclient.Driver");
		
		Connection connection= DriverManager.getConnection("jdbc:interbase://192.168.2.165:3051/C:/DB/DIM3.0/DIMENSION.IB","TEXDBA","texdba");

        Statement statement= connection.createStatement();

        ResultSet result = statement.executeQuery("select * FROM ORDER_HEAD oh WHERE OH.sys_id ='1' AND OH.order_no = '25702' AND OH.sub_order_no = 0");

        //System.out.println(result);
		
		while(result.next()) { 
			System.out.println(result.getString(3)); 
		}
	}
}
