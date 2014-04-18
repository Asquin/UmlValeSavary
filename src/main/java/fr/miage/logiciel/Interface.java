package fr.miage.logiciel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Interface {
    public static ArrayList<Unite> listeUnite = new ArrayList<Unite>();
	
	public static void main (String[] args) throws IOException{
            initialisation();
            boolean stop=false;
            
            do {
                System.out.println("Que voulez vous faire ?\n");
                System.out.println("1 : Entrer une nouvelle unité\n");
                System.out.println("2 : Convertir une unité\n");
                System.out.println("3 : Voir les unités enregistré\n");
                System.out.println("0 : Quitter\n");

                Scanner scan = new Scanner(System.in);
                String reponse = scan.nextLine();
                
                if (isInteger(reponse)){
                    switch(Integer.parseInt(reponse)){
                        case 0 :
                            stop=true; 
                            break;
                        case 1 :
                            menuNouvelleUnite();
                            break;
                        case 2 :
                            menuConversion();
                            break;
                        case 3: 
                            printAllUnit();
                            break;
                        default :
                            saisieIncorrecte();
                    }
                }else{
                    saisieIncorrecte(); 
                }
            }while(!stop);
	}
        
        public static void menuNouvelleUnite(){
            
            String typeStr="";
            boolean ok1=false;
            do{
                System.out.println("== Nouvelle Unité ==\n");

                System.out.println("Type de l'unité ?\n");
                System.out.println("1 : longeur\n");
                System.out.println("2 : poid \n");
                System.out.println("3 : température\n");

                Scanner sc = new Scanner(System.in);
                String type = sc.nextLine();

                if(isInteger(type)){
                    switch(Integer.parseInt(type)){
                        case 1:
                            typeStr="longeur";
                            ok1=true;
                            break;
                        case 2 :
                            typeStr="poid";
                            ok1=true;
                            break;
                        case 3 :
                            typeStr="temperature";
                            ok1=true;
                            break;
                        default :
                               saisieIncorrecte();
                    }
                }else{
                    saisieIncorrecte();
                }
            }while(!ok1);
            
            System.out.println("Nom de l'unité ?\n");
            Scanner scan = new Scanner(System.in);
            String nom = scan.nextLine();
            nom=nom.toLowerCase();
            
            Unite unite = new Unite(typeStr,nom);
            
            // instanciation de l'attribut conversion de la classe unité
            Conversion conversion;
            conversion=menuCreerConversion();
            unite.setConversion(conversion);
            
            System.out.println("Nouvelle unité enregistrée !\n");
            unite.printUnite();
            
            // On ajoute l'unité et sa conversion à la liste des unités
            listeUnite.add(unite);

        }
        
        public static Conversion menuCreerConversion(){
            ArrayList<Operation> operations = new ArrayList<Operation>();
            boolean fin=false;
            do{
                System.out.println("Opération(s) qui permettent de passer à l'étalon (mètre pour les longeurs, kilogrames pour les poids et degrés Celsius pourles températures");
                System.out.println("1 : Addition\n");
                System.out.println("2 : Multiplication \n");
                System.out.println("0 : Aucune, saisie terminée\n");
                
                Scanner scan = new Scanner(System.in);
                String saisie = scan.nextLine();
                if(isInteger(saisie)&&Integer.parseInt(saisie)<=2&&Integer.parseInt(saisie)>=0){
                    if (Integer.parseInt(saisie) == 0){
                        fin=true;                           
                    }else{
                        System.out.println("Valeur associée à l'opération");
                        float valeur = scan.nextFloat(); 
                        switch(Integer.parseInt(saisie)){
                            case 1:
                                Addition addition = new Addition(valeur);
                                System.out.println("nouvelle addition");
                                operations.add(addition);
                                break;
                            case 2 :
                                Multiplication multiplication = new Multiplication(valeur);
                                System.out.println("nouvelle multiplication");
                                operations.add(multiplication);
                                break;
                            default :
                                saisieIncorrecte();
                        }
                    }
                }else{
                    saisieIncorrecte();
                }
                
            }while(!fin);
            
            // On passe l'arrayList ainsi créée en simple tableau et on instancie conversion
            Operation [] formule = operations.toArray(new Operation[operations.size()]);
            Conversion conversion = new Conversion(formule);
           
            return conversion;
        }

        public static void menuConversion() throws IOException{
            Scanner scan = new Scanner(System.in);
            int choice;
            boolean verif1,verif2;
            
            do {
		System.out.println("Bienvenue dans le menu de conversion, vous pouvez convertir une unité de même type en une autre!");
                System.out.println("1 : Convertir\n");
                System.out.println("2 : Retour au menu principal \n");
                System.out.println("0 : Quitter le programme\n");
                
                choice= scan.nextInt();
				
            } while (choice !=0 && choice!=1 && choice!=2);
			
            switch(choice){
                case 1 :
                        if (listeUnite.isEmpty()){
                            System.out.println("Aucune unité disponible! Vous allez être redirigé dans le menu de création d'unité!");
                            System.out.println("Appuyez sur entrée pour continuer.");
                            System.in.read();
                            menuNouvelleUnite();
                        }
                        else {
                        System.out.println ("Voici les unités disponibles:");
                        
                            printAllUnit();
                            Scanner sc1 = new Scanner(System.in);
                            System.out.println("Veuillez saisir la valeur à convertir");
                            double valDep=sc1.nextDouble();
                            
                            Scanner sc2 = new Scanner(System.in);
                            System.out.println("Veuillez entrer l'unité de départ.");
                            String  nomStartUnit = sc2.nextLine();
                            
                            nomStartUnit=nomStartUnit.toLowerCase();
                            verif1=verifUnitExistence(nomStartUnit);
                            
                            Scanner sc3 = new Scanner(System.in);
                            System.out.println("Veuillez entrer l'unité d'arrivée.");
                            String nomFinalUnit = sc3.nextLine();
                            nomFinalUnit=nomFinalUnit.toLowerCase();
                            verif2=verifUnitExistence(nomFinalUnit);
                            
                            if (verif1==true && verif2==true){
                                //On récupère les unités correspondantes
                                Unite startUnit=getUnitByName(nomStartUnit);
                                Unite finalUnit=getUnitByName(nomFinalUnit);
				
                                
                                if(startUnit.getType().equals(finalUnit.getType())){
                                    //On fait la conversion
                                    double btwVal=startUnit.conversion.calculateToEtalon(valDep);
                                    double finalVal=finalUnit.conversion.calculateFromEtalon(btwVal);
                                    System.out.println("Le résultat est de "+finalVal+" "+finalUnit.getNom());
                                    
                                }
                                else{
                                    System.out.println("Les unité ne sont pas compatibles ! \n vous allez être redirigé sur le menu principal.");
                                    
                                }
                            }
                            else{
                                System.out.println("Les unités demandées n'existent pas! \n vous allez être redirigé sur la page de création d'unité.");
                                System.in.read();
                                menuNouvelleUnite();
                            }
                        }
                        break;
    
                case 2 :
                        System.out.println ("Vous allez être redirigé vers le menu principal!\n Appuyer sur entrée pour continuer.");
                        System.in.read();
                        break;
                case 0:
                        System.out.println ("Vous allez quitter le programme, appuyer sur entrée pour continuer!");
			System.in.read();
                        System.exit(0);
                        break;
                default :
                       System.out.println("Erreur, saisie incorrecte, appuyez sur Entrée pour continuer");
                       scan.nextLine();
					   
                }
        }
        
        
        private static boolean isInteger (String string){
        try {
            Integer.parseInt (string);
            return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }
        public static void saisieIncorrecte(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Erreur, saisie incorrecte, appuyez sur Entrée pour continuer");
            sc.nextLine();
        }
        
        public static void printAllUnit(){
            for(int i=0 ;i<listeUnite.size() ; i++){
                 listeUnite.get(i).printUnite();
            }
        }
        
        public static boolean verifUnitExistence (String value){
           boolean ok=false;
        int i=0;
        while (!ok){
            if(value.equals(listeUnite.get(i).getNom())){
                ok=true;
            }
            else {
                ok=false;
            }
            i++;
        }
         return ok;  
      }
       
      public static Unite getUnitByName (String value){
          Unite unit=null;
          for(int i = 0; i < listeUnite.size(); i++){
            if(value.equals(listeUnite.get(i).getNom())){
                unit=listeUnite.get(i);
            }
          } 
       return unit;
      }
      
      public static void initialisation(){
          // initialisation des cm
          double val=0.01;
          Multiplication mult= new Multiplication(val);
          Operation formule[]= new Operation[1];
          formule[0]=mult;
          Conversion conv = new Conversion(formule);
          
          Unite unite = new Unite("longueur","cm");
          unite.setConversion(conv);
          listeUnite.add(unite);
          
          // initialisation des dm
          val=0.1;
          Multiplication mult1= new Multiplication(val);
          Operation formule1[]= new Operation[1];
          formule1[0]=mult1;
          Conversion conv1 = new Conversion(formule1);
          
          Unite unite1 = new Unite("longueur","dm");
          unite1.setConversion(conv1);
          listeUnite.add(unite1);
      }
}

