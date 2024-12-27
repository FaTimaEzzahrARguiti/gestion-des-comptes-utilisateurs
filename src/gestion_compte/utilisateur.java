package gestion_compte;

public class utilisateur extends personne{
    String email;
    String password;
    role role;

    public utilisateur(String nom, int age, String email, String password, gestion_compte.role role) {
        super(nom, age);
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public utilisateur() {
        super();

    }

}
