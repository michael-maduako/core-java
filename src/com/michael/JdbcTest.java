package com.michael;
import java.sql.*;
public class JdbcTest {
    public static void main(String[] args) throws ClassNotFoundException ,SQLException{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("awsdb.cijjm9scjbhj.us-east-1.rds.amazonaws.com",
                "awsdb","Cogent123");
        Statement st=con.createStatement();
    st.execute("create table oct17batch(sno number(10),sname varchar2(50),saddress "
            + "varchar2(200),primary key(sno))");
        st.execute("insert into oct17batch values(1000,'venkat','1126 HighField Ct')");
        st.execute("insert into oct17batch values(1001,'vinay','1126 HighField Ct')");
        st.execute("insert into oct17batch values(1002,'chetan','1126 HighField Ct')");
        st.execute("insert into oct17batch values(1003,'saran','1126 HighField Ct')");
        st.execute("insert into oct17batch values(1004,'saran','1126 HighField Ct')");
        st.execute("update oct17batch set sname='shyam' where sno=1003");
        st.execute("delete from oct17batch where sno=1004");
        ResultSet rs=st.executeQuery("select * from oct17batch");
        while(rs.next()) {
            System.out.println(rs.getInt(1));
            System.out.println(rs.getString(2));
            System.out.println(rs.getString(3));            
        }
        rs.close();st.close();con.close();
        
        
        
    }
}