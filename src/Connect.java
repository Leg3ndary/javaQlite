import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.SQLException;
import java.io.File;
   
public class Connect {

    public static void connect() {
        Connection conn = null;  
        try {
            
            String url = "jdbc:sqlite:" + System.getProperty("user.dir") + "/databases/test.db";
            createFile(url);
            // create a connection to the database
            conn = DriverManager.getConnection(url);
              
            System.out.println("Connection to SQLite has been established.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public static void createFile(String fileName) {
        String directoryName = System.getProperty("user.dir") + "/databases/";
    
        File directory = new File(directoryName);
        if (!directory.exists()){
            directory.mkdir();
        }
    }

    public static void main(String[] args) {
        connect();
        System.out.println(System.getProperty("user.dir"));
    }  
}  