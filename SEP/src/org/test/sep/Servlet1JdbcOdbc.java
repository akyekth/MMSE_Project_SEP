package org.test.sep;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 
public class Servlet1JdbcOdbc{
    public static void main(String[] args) {
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        ResultSet rs1=null;
  
       String name1,pwd;
        
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:testuser/testpass@localhost");
            stmt = con.createStatement();
            rs = stmt.executeQuery("insert into student values('china',20)");
            rs1= stmt.executeQuery("select * from student");
            
            //name1 = (String)req.getAttribute(name1);
            while(rs1.next()) {
                System.out.print(rs1.getInt(2) + "\t");
                System.out.println(rs1.getString(1));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                rs1.close();
                stmt.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

