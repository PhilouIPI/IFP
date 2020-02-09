import Persistence.ConnectDB;
import java.sql.SQLException;
//import Domaine.News;
//import Persistence.NewsDAO;

import java.sql.Date;
import java.sql.SQLException;

public class Main {

    public static  void main(String[] args) throws SQLException, ClassNotFoundException {
        reporterDAO reporterDAO = new reporterDAO();
        reporterDAO.read(1);
        //System.out.println(reporterDAO.read(1));
        }
}
