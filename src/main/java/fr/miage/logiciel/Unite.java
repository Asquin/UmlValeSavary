package fr.miage.logiciel;

enum enum_typeUnite { monnaie, longeur, poid };

public class Unite {
	public Conversion conversion;
	private String type;
	private String nom;
	
	public Unite(String type, String nom) {
		super();
		this.type = type;
		this.nom = nom;
	}
        
	public void setConversion(Conversion conversion) {
            this.conversion = conversion;
        }
        
	public String getType() {
		return type;
	}
	public void setType(String type) {
                this.type = type;	
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
        public void printUnite(){
            System.out.println("Nom :"+this.nom);
            System.out.println("type :"+this.type);
            this.conversion.print();
        }
}
