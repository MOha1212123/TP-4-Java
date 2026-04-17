package TP4;

public class ComptePremium extends Compte{
    private double plafondRetrait;

    public ComptePremium(String numero, String titulaire, double solde ,double plafondRetrait){
       super(numero, titulaire, solde);
       this.plafondRetrait=plafondRetrait;
    }
    @Override
    /*public void retrait(double solde){
        super.retrait(solde);
    }*/

    public void retrait(double montant){

        if (montant <= 0) {
        System.out.println("Montant invalide !");
    }

        else if (montant > plafondRetrait) {
            System.out.println("Montant dépasse le plafond !");
        } 
        else if (solde >= montant) {
            solde -= montant;
        } 
        else {
            System.out.println("Solde insuffisant !");
        }
    }
}
