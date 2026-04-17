package TP4;

public class CompteCourant extends Compte {

     

    private double decouvrtAutorise;
    //protected double decouvrt=500;

    public CompteCourant(String numero, String titulaire, double solde ,double decouvrtAutorise){
       super(numero, titulaire, solde);
       this.decouvrtAutorise=decouvrtAutorise;
    }

    @Override
    public void retrait(double montant){
        if (solde - montant >= -decouvrtAutorise) {
            solde -= montant;
        } else {
            System.out.println("Dépassement du découvert !");
        }
    }
        @Override
        public void afficher(){
           super.afficher();
            System.out.println("Découvert autorisé : " + decouvrtAutorise);
        }
}
