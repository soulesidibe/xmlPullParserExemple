package sn.soulesidibe.example.xml;

public class Personne {

    private String nom;
    private String prenom;
    private int age;
    private String genre;

    public Personne(String nom, String prenom, int age, String genre) {
	super();
	this.nom = nom;
	this.prenom = prenom;
	this.age = age;
	this.genre = genre;
    }

    public Personne() {
	super();
    }

    public String getNom() {
	return nom;
    }

    public void setNom(String nom) {
	this.nom = nom;
    }

    public String getPrenom() {
	return prenom;
    }

    public void setPrenom(String prenom) {
	this.prenom = prenom;
    }

    public int getAge() {
	return age;
    }

    public void setAge(int age) {
	this.age = age;
    }

    public String getGenre() {
	return genre;
    }

    public void setGenre(String genre) {
	this.genre = genre;
    }

    @Override
    public String toString() {
	return "Personne [nom=" + nom + ", prenom=" + prenom + ", age=" + age
		+ ", genre=" + genre + "]";
    }

}
