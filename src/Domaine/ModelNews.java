package Domaine;

import java.util.Date;

public class ModelNews {
    private String pseudo;
    private String tag;
    private String titre;
    private String contenu;
    private Date date_post;

    public ModelNews(String pseudo, String tag, String titre, String contenu, Date date_post){
        this.pseudo = pseudo;
        this.tag = tag;
        this.titre = titre;
        this.contenu = contenu;
        this.date_post = date_post;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public Date getDate_post() {
        return date_post;
    }

    public void setDate_post(Date date_post) {
        this.date_post = date_post;
    }
}
