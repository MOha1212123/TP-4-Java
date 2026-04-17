package TP4;

public class Compte {
    protected String numero;
    protected String titulaire;
    protected double solde;

    public Compte(String numero, String titulaire, double solde){

        this.numero=numero;
        this.titulaire=titulaire;
        this.solde=solde;
    }
    
    public String getNumero() { 
        return numero; }
    public String getTitulaire() {
         return titulaire; }

    public double getSolde() { 
        return solde; }

        public void setNumero(String numero)   { 
        this.numero= numero; }
        public void setTitulaire(String titulaire)   { 
        this.titulaire= titulaire; }
        public void setSolde(double solde)   { 
        this.solde= solde; }

        public void ajoute(double S){
            if(S > 0){
               solde += S;
           }   }

        public void retrait(double S){
                if(solde>=S && S>0){
                     solde-=S;
                }else{
                    System.out.println("You can't do this oppertion");
                }

        }

        public void afficher(){
            System.out.println("numero : " +numero);
            System.out.println("titulaire : " +titulaire);
            System.out.println("solde : " +solde);

        }
}
