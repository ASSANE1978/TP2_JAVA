package sn.isi.entities;

import java.util.Scanner;

public class Professeur extends Personne {
    private String matricule;

    //Les constructeurs
    public Professeur(){
        super();
    }
    public Professeur(String nom,String prenom,String matricule){
        super(nom,prenom);
        this.matricule = matricule;
    }

    //Les getters et setters
    public String getMat(){
        return matricule;
    }
    public void setMat(String matricule) {
        this.matricule = matricule;
    }
    //methodes de saisir
    public void saisirProf(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrer le matricule du professeur. ");
        String matricule = (scan.nextLine());
        this.setMat(matricule);
        super.saisir();
    }
//methodes d'Affichage
    public void affichageProf(Professeur prof){
        System.out.println("matricule : " + " " + prof.getMat());
        super.affichage();
    }

}
