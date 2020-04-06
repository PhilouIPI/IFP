import java.sql.Date;

public class News {
    private int id;
    private String titre;
    private String contenu;
    private Date date_post;
    private int id_reporter;

    public News(String titre, String contenu, Date date_post, int id_reporter) {
        this.titre = titre;
        this.contenu = contenu;
        this.date_post = date_post;
        this.id_reporter = id_reporter;
    }
}
