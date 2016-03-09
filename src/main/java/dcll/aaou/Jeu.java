package dcll.aaou;

import java.util.List;

/**
 * Created by HP on 09/03/2016.
 */
public class Jeu {
    static int frame = 10;
    List<Joueur> J;
    int nbj;
    int score;


    public void jouer(String nom) {

     for(int i=0;i<frame;i++)
        for (int k = 0; k < nbj; k++) {
            System.out.println("Entrer le ième joueur"+i);
            Joueur j=null;
            j.setNom(nom);
            J.add(j);









        }


    }

}
