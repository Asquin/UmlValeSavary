package fr.miage.logiciel;

enum enum_typeOperation { multiplication, addition, complexe }

public class Conversion {
	public Conversion(Operation[] formule) {
		super();
		this.formule = formule;
	}

	private Operation [] formule;
	
	public double calculateToEtalon(double val_dep){
            double result=val_dep;
            for(int i=0; i < this.formule.length; i++){
                Operation ope = formule[i];
		result=ope.calculate(result);
            }	
            return result;
	}
        public double calculateFromEtalon(double val_dep){
            double result=val_dep;
            for(int i=0; i < this.formule.length; i++){
                Operation ope = formule[i];
		result=ope.calculateInverse(result);
            }	
            return result;
	}
        public void print(){
            System.out.print("Formule de conversion vers l'étalon : ");
            for(int i=0; i < this.formule.length; i++){
		Operation ope = formule[i];
		ope.print();
            }
            System.out.println("\n");
             
        }
}
