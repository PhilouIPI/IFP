package Persistence;
import java.sql.*;

public class ConnectDB {
    public static Connection connection() throws  ClassNotFoundException, SQLException {
        Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
        var cx = DriverManager.getConnection("jdbc:derby:db/test_ip");
        return cx;
    }
    public static void deconnect (Connection cx) throws  SQLException {
        cx.close();
    }
}
