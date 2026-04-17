package TP4;

public class CompteEpargne extends Compte {
    private double tauxInteret=0.5;

    public CompteEpargne(String numero, String titulaire, double solde, double tauxInteret){
        super(numero, titulaire, solde);
        this.tauxInteret = tauxInteret;
    }

    public void calculerIntert(double solde){
    solde += solde * tauxInteret;
       setSolde(solde);
    }
    /*@Override
    public void retrait(double solde){
        super.retrait(solde);
    }*/
   @Override
     public void retrait(double montant){
        if (solde >= montant) {
        solde -= montant;
    } else {
        System.out.println("Retrait interdit: solde insuffisant");
    }
}
}
