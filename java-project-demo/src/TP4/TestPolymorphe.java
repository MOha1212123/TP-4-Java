package TP4;

public class TestPolymorphe {
    public static void main(String[] args){
        Compte[] c = new Compte[4];

        c[0] = new CompteCourant("AAA", "Ahmed", 100 ,34.8);
        c[1] = new CompteEpargne("BBB", "Salma", 200, 0.05);
        c[2]= new ComptePremium("CCC", "Rachid", 300 ,80);
        c[3] = new CompteCourant("DDD", "Mohamed", 400 ,35.8);

         for (int i = 0; i < c.length; i++) {
            c[i].ajoute(100);
            c[i].retrait(50);
            c[i].afficher();
            System.out.println("---------------"); 
        }
        System.out.println("=== Comptes Epargne ===");

        for (int i = 0; i < c.length; i++) {
            if (c[i] instanceof CompteEpargne) {
                c[i].afficher();
            }
        }
        for (int i = 0; i < c.length; i++) {
            if (c[i] instanceof CompteEpargne) {
                ((CompteEpargne) c[i]).calculerIntert(10.2);
            }
        }
    }
}
