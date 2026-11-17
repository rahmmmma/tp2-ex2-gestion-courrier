package courrier;

public class Lettre extends Courrier {
	private double poids;   
    private String format;  

    public Lettre(boolean express, String adresse, double poids, String format) {
        super(express, adresse);
        this.poids = poids;
        this.format = format;
    }

    
    public void decrire() {
        super.decrire();
        System.out.println("Type : Lettre");
        System.out.println("Poids : " + poids + " g");
        System.out.println("Format : " + format);
    }

    
    public double affranchir() {
        if (!estValide()) {
            return 0;
        }
        double tarifFormat = format.equalsIgnoreCase("A3") ? 3.5 : 2.5;
        double montant = tarifFormat + 0.5 * (poids / 1000.0);
        return express ? 2 * montant : montant;
    }

}
