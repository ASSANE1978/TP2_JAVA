package sn.isi.entities;

import java.util.Scanner;

public class Etudiant extends Personne {
    private int mat;
    //les constructeurs
    public Etudiant(){
        super();
    }
    public Etudiant(String nom,String prenom,int mat){
        super(nom,prenom);
        this.mat = mat;
    }
    //Les getters et setters
    public int getMat(){
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }
    //Methode pour  Saisir un etudiant
    public void saisirEtud(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrer le matricule de l'etudian. ");
        int mat = Integer.parseInt(scan.nextLine());
        this.setMat(mat);
        super.saisir();

    }
//methodes de Affichage de l'etudiant
    public void affichageEtud(Etudiant etud){
        System.out.println("matricule : " + " " + etud.getMat());
       super.affichage();
    }

}
