package sn.isi.entities;
import java.util.Scanner;
public class Personne {

        protected String nom;
        protected String prenom;
        //Les constructeur
        public Personne(){}
        public Personne(String nom,String prenom){
            this.nom = nom;
            this.prenom = prenom;
        }
        //Les getters.
        public String getPrenom() {
            return prenom;
        }

        public String getNom(){
            return nom;
        }
        //Les setters
        public void setPrenom(String prenom) {
            this.prenom = prenom;
        }

        public void setNom(String nom){
            this.nom = nom;
        }
        //La saisie.
        public void saisir(){
            //le scanner
            Scanner scan = new Scanner(System.in);
            //La saisie des attributs
            System.out.println("Entrer le nom. ");
            String nom = scan.nextLine();
            this.setNom(nom);

            System.out.println("Entrer le prenom. ");
            String prenom = scan.nextLine();
            this.setPrenom(prenom);
        }
        public void affichage(){
            System.out.println("Nom : " + " " + this.getNom());
            System.out.println("Prenom : " + " " + this.getPrenom());
        }

    }



