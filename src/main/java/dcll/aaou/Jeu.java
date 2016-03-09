package dcll.aaou;

import java.util.List;
import java.util.Scanner;

/**
 * Created by AAnass on 09/03/2016.
 */
public class Jeu {
    static int Frame = 10;
    List<Joueur> listJoueur;

    Jeu(List<Joueur> listJoueur){
        this.listJoueur = listJoueur;
    }

    void Jouer(){
        for(int i = 0; i < Frame ; ++i){
            for(Joueur j : listJoueur) {
                String score = "A";
                do {
                    System.out.println("Donner score pour " + j.getNom());
                    Scanner in = new Scanner(System.in);
                    score = in.next();
                    j.addFrame(score);
                }
                while(!score.equals("X"));
            }
        }
    }
}
