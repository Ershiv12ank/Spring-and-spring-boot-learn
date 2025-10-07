package in.sp.dbcon;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/mvc_db", // ✅ your DB name
                "root",                               // ✅ your MySQL username
                "12345"                   // ✅ your MySQL password
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
