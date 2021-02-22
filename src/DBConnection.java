import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	   
		String BDD = "nomBD";
		String url = "jdbc:mysql://localhost:3306/" + BDD;
		String user = "root";
		String passwd = "";
	    private static DBConnection conn;

	   
	   private DBConnection() throws SQLException {
			conn=(DBConnection) DriverManager.getConnection(url, user,passwd);
		}

	    
	    public static Connection getConn() throws SQLException {
	    	if(conn == null) {
	    		conn = new DBConnection();
		}
	    	return (Connection) conn;
	    }
		
	
}
