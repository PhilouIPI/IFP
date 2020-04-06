import java.sql.SQLException;

public class Main {
    public static  void main(String[] args) throws SQLException, ClassNotFoundException {
        reporterDAO reporterDAO = new reporterDAO();
        reporterDAO.read(1);
        }
}
