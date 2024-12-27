package gestion_compte;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    static Scanner scanner=new Scanner(System.in);
    static ArrayList<utilisateur> utilisateur = new ArrayList<utilisateur>();
    static ArrayList<role> role = new ArrayList<role>();// Create an ArrayList object
public static void adduser(){
    utilisateur user= new utilisateur();
    role newrole= new role();
    System.out.println("Entrez le nom d'utilisateur");
    user.nom= scanner.nextLine();
    System.out.println("Entrez le age");
    user.age= scanner.nextInt();
    System.out.println("Entrez l'email");
    user.email= scanner.next();
    System.out.println("Entrez le mot de passe");
    user.password= scanner.next();
    System.out.println("Entrez le role d'utilisateur");
    System.out.println("1-Admin   2-Employee   3-Client");
    int choix = scanner.nextInt();
    if(choix == 1){
        newrole.role="Admin";
    }else if (choix == 2){
        newrole.role="Employee";
    }else if (choix == 3){
        newrole.role="Client";
    }
    role.add(newrole);
    utilisateur.add(user);
    System.out.println("Utilisateur ajouté avec succes");
}


public static void afficher() {
        if (utilisateur.isEmpty()) {
            System.out.println("Liste des utilisateurs est vide !!");
        } else {
            for (int i = 0; i < utilisateur.size(); i++) {
                utilisateur user = utilisateur.get(i);
                System.out.println("Nom utilisateur: " + user.nom);
                System.out.println("Age utilisateur: " + user.age);
                System.out.println("Email utilisateur: " + user.email);
                System.out.println("Mot de passe utilisateur: " + user.password);
                System.out.println("Mot de passe utilisateur: " + role.get(i).role);
            }
        }
    }


    public static void rechercher(){
        System.out.println("Entrez le nom d'utilisateur:");
        String nom = scanner.nextLine();
        for (int i = 0; i < utilisateur.size(); i++) {
            if (utilisateur.get(i).nom.equals(nom)) {
                System.out.println(" -name :" + utilisateur.get(i).nom);
                System.out.println(" -age  :" + utilisateur.get(i).age);
                System.out.println(" -email:" + utilisateur.get(i).email);
                System.out.println(" -password:" + utilisateur.get(i).password);
                System.out.println(" -role:" + role.get(i).role);
            }
            else{
                System.out.println("Aucun utilisateur est trouvé ");
            }
        }
    }


    public static void supprimer(){
            System.out.println("Entrez le nom d'utilisateur:");
            String nom = scanner.nextLine();
            for (int i = 0; i < utilisateur.size(); i++) {
                if (utilisateur.get(i).nom.equals(nom)) {
                    utilisateur.remove(i);                }
            }
            System.out.println("Utilisateur supprimé avec succée ");
        }


        public static void modifier() {
        utilisateur user = new utilisateur();
        role newrole = new role();
    System.out.println("Entrez le nom d'utilisateur:");
    String nom = scanner.next();
    for (int i = 0; i < utilisateur.size(); i++) {
        if (utilisateur.get(i).nom.equals(nom)) {
            System.out.println("Nouveau nom d'utilisateur");
            user.nom= scanner.next();
            System.out.println("Nouveau age");
            user.age= scanner.nextInt();
            System.out.println("Nouveau email");
            user.email= scanner.next();
            System.out.println("Nouveau mot de passe");
            user.password= scanner.next();
            System.out.println("Nouveau role d'utilisateur");
            System.out.println("1-Admin   2-Employee   3-Client");
            int choix = scanner.nextInt();
            if(choix == 1){
                newrole.role="Admin";
            }else if (choix == 2){
                newrole.role="Employee";
            }else if (choix == 3){
                newrole.role="Client";
            }
            utilisateur.set(i, user);
            role.set(i, newrole);
            System.out.println("Utilisateur modifié avec succes");
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
                    supprimer();
                    break;
                case 4:
                    modifier();
                    break;
                case 5:
                    rechercher();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Choix invalide");
            }
            System.out.println("Choisir une option");
            choix = scanner.nextInt();
            scanner.nextLine();
        } while (choix != 6);
    }
}

