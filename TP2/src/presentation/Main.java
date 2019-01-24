package presentation;

import sn.isi.entities.Etudiant;
import sn.isi.entities.Personne;
import sn.isi.entities.Professeur;

public class Main {
    public static void main(String[] args){
       Etudiant etud = new Etudiant();
       etud.saisirEtud();
        System.out.println("*****Affichage de l'etudiant*****");
       etud.affichageEtud(etud);

        Professeur prof = new Professeur();
        prof.saisirProf();
         System.out.println("*****Affichage du professeur*****");
        prof.affichageProf(prof);


    }
}
