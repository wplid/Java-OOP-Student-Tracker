public class Main {
    public static void main(String[] args) {

        Etudiant[] tab = new Etudiant[5];

        tab[0] = new Etudiant("walid", "mohamed", 20, 1, "sidi bel abbes", 14.5, true, "0123456789");
        tab[1] = new Etudiant("ahmed", "djamel", 21, 2, "Oran", 15.0, false, "1234567890");
        tab[2] = new Etudiant("kader", "Karim", 22, 3, "Alger", 13.5, true, "1111111111");
        tab[3] = new Etudiant("miloud", "loudi", 19, 1, "Setif", 16.0, false, "2222222222");
        tab[4] = new Etudiant("Mehdi", "Samir", 23, 4, "Annaba", 12.0, true, "3333333333");

      
        for (int i = 0; i < tab.length; i++) {
            tab[i].afficher();
        }

        
        for (int i = 0; i < tab.length; i++) {
            tab[i].setNiveau(tab[i].getNiveau() + 1);
        }

       
        for (int i = 0; i < tab.length; i++) {
            tab[i].afficher();
        }
    }
}