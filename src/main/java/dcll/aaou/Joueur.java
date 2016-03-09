package dcll.aaou;

import java.util.List;

/**
 * Created by HP on 09/03/2016.
 */
public class Joueur {
    List<String> liste;
    private int nb_q;
    String nom;

    public String getNom() {
        return nom;
    }

    public Joueur(){

    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNb_q() {
        return nb_q;
    }

    public void setListe(List<String> liste) {
        this.liste = liste;
    }


    public List<String> getListe() {

        return liste;
    }

    public void setNb_q(int nb_q) {
        this.nb_q = nb_q;
    }






}
