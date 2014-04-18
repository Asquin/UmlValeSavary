package fr.miage.logiciel;

public class Multiplication extends Operation {

    public Multiplication(double valeur) {
        this.valeur = valeur;
    }
    private double valeur;
    
    @Override
    public double calculate(double val_dep){
        // Pour aller vers l'étalon
	double result=this.valeur*val_dep;
	return result;
    }
    @Override
    public double calculateInverse(double val_dep){
        // Depuis l'étalon
    	double result=val_dep/this.valeur;
	return result;
    }
    
    @Override
    public void print(){
        System.out.print("*"+this.valeur);
        }

}
