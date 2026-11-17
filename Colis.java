package courrier;

public class Colis extends Courrier {
	private double poids;   
    private double volume;  

    public Colis(boolean express, String adresse, double poids, double volume) {
        super(express, adresse);
        this.poids = poids;
        this.volume = volume;
    }

    
    public void decrire() {
        super.decrire();
        System.out.println("Type : Colis");
        System.out.println("Poids : " + poids + " g");
        System.out.println("Volume : " + volume + " L");
    }

    
    public double affranchir() {
        if (!estValide()) {
            return 0;
        }
        double montant = 0.25 * volume + (poids / 1000.0) * 1.0;
        return express ? 2 * montant : montant;
    }

}
