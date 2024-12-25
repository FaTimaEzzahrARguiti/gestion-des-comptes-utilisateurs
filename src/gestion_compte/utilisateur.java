package gestion_compte;

public class utilisateur extends personne{
    String email;
    String password;

    public utilisateur(String nom, int age, String email, String password) {
        super(nom, age);
        this.email = email;
        this.password = password;
    }

    public utilisateur() {
        super();

    }
}
