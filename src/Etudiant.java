public class Etudiant {

    private String nom;
    private String prenom;
    private int age;
    private int niveau;
    private String lieuNaissance;
    private double moyBac;
    private boolean permis;
    private String telephone;

    public Etudiant(String nom, String prenom, int age, int niveau,
                    String lieuNaissance, double moyBac,
                    boolean permis, String telephone) {

        if (age <= 18) {
            System.out.println("Age invalide");
            return;
        }

        if (moyBac < 0 || moyBac > 20) {
            System.out.println("Moyenne invalide");
            return;
        }

        if (telephone.length() != 10) {
            System.out.println("Telephone invalide");
            return;
        }

        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.niveau = niveau;
        this.lieuNaissance = lieuNaissance;
        this.moyBac = moyBac;
        this.permis = permis;
        this.telephone = telephone;

        System.out.println("Etudiant " + nom + " cree");
    }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public int getAge() { return age; }
    public void setAge(int age) {
        if (age > 18)
            this.age = age;
    }

    public double getMoyBac() { return moyBac; }
    public void setMoyBac(double moyBac) {
        if (moyBac >= 0 && moyBac <= 20)
            this.moyBac = moyBac;
    }

    public int getNiveau() { return niveau; }
    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public void afficher() {
        System.out.println("Nom: " + nom);
        System.out.println("Prenom: " + prenom);
        System.out.println("Age: " + age);
        System.out.println("Niveau: " + niveau);
        System.out.println("Lieu: " + lieuNaissance);
        System.out.println("Moy Bac: " + moyBac);
        System.out.println("Permis: " + permis);
        System.out.println("Telephone: " + telephone);
    }
}