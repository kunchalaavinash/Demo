package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Connection con=null;
		Statement sta=null;

		try {

			Class.forName("com.mysql.jdbc.Driver");

			System.out.println("driver loaded");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/useSSL=false/mysql", "root", "Avinash@12");

			sta = con.createStatement();
		} catch (Exception e) {
		}
	

	String create_table = "create table testing(id int,name varchar(100)";

	int a = sta.executeUpdate(create_table);

	System.out.println(a);

	String insert = "insert into testing values(1,'avinash')";

	int b = sta.executeUpdate(insert);

	System.out.println(b);

	String check = "select * from testing";

	ResultSet c=sta.executeQuery(check);

	while(c.next())
	{

		int d = c.getInt(1);
		String e = c.getString(2);
		System.out.println(d + "=======" + e);
	}

	sta.close();con.close();
	}
}
