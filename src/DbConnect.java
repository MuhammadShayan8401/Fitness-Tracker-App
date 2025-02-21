import java.sql.*;
import javax.swing.JOptionPane;

public class DbConnect {
    Connection conn;
    
    public static Connection Connecrfb() {
        try {
            Class.forName("org.sqlite.JDBC");

            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\PC Mart\\Desktop\\Fitness Tracker App\\FTSdb.db");

            if (conn != null && !conn.isClosed()) {
                System.out.println("Connection successful.");
            } else {
                System.out.println("Connection failed.");
            }

            return conn;
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Connection Error: " + e.getMessage());
            return null;
        }
    }
}
