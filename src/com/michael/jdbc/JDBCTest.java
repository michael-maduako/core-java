package com.michael.jdbc;


import java.sql.*;

public class JDBCTest {

	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","c##batch45","Codent123");
		Statement st= con.createStatement();
		st.execute("create table emp_jdbc(eno number(10),ename varchar(50),esal number(5))");
		st.execute("insert into emp_jdbc values(100,'Abdul',12345)");
		st.execute("insert into emp_jdbc values(101,'Edson',12345)");
		st.execute("insert into emp_jdbc values(102,'Mobusher',12345)");
		st.execute("insert into emp_jdbc values(103,'dummy',12345)");
		st.execute("insert into emp_jdbc values(104,'dummy',12345)");
		st.execute("update emp_jdbc set ename='Michael' where eno=103" );
		st.execute("delete from emp_jdbc where eno=104");
		ResultSet res=st.executeQuery("select * from emp_jdbc");
		
		while(res.next()) {
			System.out.println("Emp Number "+ res.getInt(1));
			System.out.println("Emp Name "+ res.getString("ename"));
			System.out.println("Emp Number "+ res.getInt(3));
		}
	}

}
