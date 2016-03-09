package dcll.aaou;

import java.util.List;

/**
 * Created by AAnass on 09/03/2016.
 */
public class Joueur {
    String nom;
    List<String> listFrame;
    int score;


    public Joueur(int score, String nom) {
        this.score = score;
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public List<String> getListFrame() {
        return listFrame;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    void addFrame(String s){
        listFrame.add(s);
    }
}
