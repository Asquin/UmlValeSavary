package fr.miage.logiciel;

public class Addition extends Operation {
	private double valeur;

	public Addition(double valeur) {
		super();
		this.valeur = valeur;
	}

	public double getValeur() {
		return valeur;
	}

	public void setValeur(double valeur) {
		this.valeur = valeur;
	}
	@Override
	public double calculate(double val_dep){
		double result=this.valeur+val_dep;
		return result;
	}
	
        @Override
	public double calculateInverse(double val_dep){
		double result=val_dep-this.valeur;
		return result;
	}
        @Override
        public void print(){
             System.out.print("+"+this.valeur);
        }

}
