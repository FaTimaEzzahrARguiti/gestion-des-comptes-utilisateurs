package gestion_compte;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    static Scanner scanner=new Scanner(System.in);
    static ArrayList<utilisateur> utilisateur = new ArrayList<utilisateur>();
    static ArrayList<role> role = new ArrayList<role>();// Create an ArrayList object
public static void adduser(){
    utilisateur user= new utilisateur();
    System.out.println("Entrez le nom d'utilisateur");
    user.nom= scanner.nextLine();
    System.out.println("Entrez le age");
    user.age= scanner.nextInt();
    System.out.println("Entrez l'email");
    user.email= scanner.next();
    System.out.println("Entrez le mot de passe");
    user.password= scanner.next();
    utilisateur.add(user);
    System.out.println("Utilisateur ajouté avec succes");
}

    public static void afficher() {
        if (utilisateur.isEmpty()) {
            System.out.println("Aucun livre trouvé");
        } else {
            for (int i = 0; i < utilisateur.size(); i++) {
                utilisateur user = utilisateur.get(i);
                System.out.println("Nom utilisateur: " + user.nom);
                System.out.println("Age utilisateur: " + user.age);
                System.out.println("Email utilisateur: " + user.email);
                System.out.println("Mot de passe utilisateur: " + user.password);
            }
        }
    }


    public static void main(String[] args) {
        int choix;
        System.out.println("-_-_-_-_-_-_-MENU-_-_-_-_-_-_-_-_-");
        System.out.println("1- Ajouter utilisateur ");
        System.out.println("2- Afficher utilisateur  ");
        System.out.println("3- Supprimer utilisateur ");
        System.out.println("4- Modifier un utilisateur ");
        System.out.println("5- Rechercher les utilisateurs ");
        System.out.println("6- Quitter");
        System.out.println("Choisir une option");
        choix = scanner.nextInt();
        scanner.nextLine();

        do {
            switch (choix) {
                case 1:
                    adduser();
                    break;
                case 2:
                    afficher();
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Choix invalide");
            }
            System.out.println("Choisir une option");
            choix = scanner.nextInt();
            scanner.nextLine();  // Consume the leftover newline character
        } while (choix != 6);
    }
}

