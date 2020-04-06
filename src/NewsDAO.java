import Persistence.ConnectDB;
import java.sql.*;

public class NewsDAO {
    public void read(int id) throws SQLException, ClassNotFoundException {
        ConnectDB connectDB = new ConnectDB();
        Connection cx = connectDB.connection();
        PreparedStatement stmt = cx.prepareStatement("Select * from news where news.id_reporter = reporter.id  and news.id = news_tags.id_news and tags.id = news_tags.id_tag and news.id = " + id);
        stmt.setInt(1, id);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            String titre = rs.getString(2);
            String contenu = rs.getString(3);
            Date date_post = rs.getDate(4);
            String tags = rs.getString(1);
        }
    }
}