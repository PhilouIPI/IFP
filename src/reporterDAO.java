import Persistence.ConnectDB;
import java.sql.*;

public class reporterDAO {
    public static void  read (int id) throws SQLException, ClassNotFoundException {
        ConnectDB connectDB = new ConnectDB();
        Connection cx = connectDB.connection();

        //Statement stmt =cx.createStatement();
        //ResultSet rs = stmt.executeQuery("Select pseudo from reporter where id= 1");

        PreparedStatement stmt = cx.prepareStatement("Select * From reporter Where id= ?");
        stmt.setInt(1,id);
        ResultSet rs = stmt.executeQuery();
        //System.out.println(rs.next());
        while (rs.next()) {
            int idReporter = rs.getInt(1);
            String pseudo = rs.getString(2);
            int credit = rs.getInt(3);
            System.out.println("Pseudo:" + pseudo);
            System.out.println("Credit:" + credit);
            //test
        }
        cx.close();
    }
}




