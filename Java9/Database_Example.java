package Java9;

import java.sql.*;
// TO run this code you have to install the mysql jar file and also make sure to set it manually and make sure tht the database name and the table name is the same
public class Database_Example {
    public static void main(String[] args) {
        try{
             Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:musql://localhost:3306/demo-db?useSSL=false", "root", "root@123");
            Statement stmt =con.createStatement();
            int sd = stmt.executeUpdate("INSERT INTO student (rollnumber, name,age)"+"values(104,'suk',40)");
            ResultSet rs = stmt.executeQuery("SELECT * from 'demo-db'.student;");
            while(rs.next())
                System.out.println(rs.getInt(1)+""+rs.getString(2)+""+ rs.getInt(3));
            con.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
