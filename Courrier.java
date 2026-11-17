package courrier;

public class Courrier {
	 protected boolean express;
	    protected String adresse;
	    protected static final double TARIF_BASE = 0.5;

	    public Courrier(boolean express, String adresse) {
	        this.express = express;
	        this.adresse = adresse;
	    }

	    public boolean estValide() {
	        return adresse != null;
	    }

	    public void decrire() {
	        System.out.println("Mode d'expédition : " + (express ? "express" : "normal"));
	        System.out.println("Adresse de destination : " + adresse);
	        System.out.println("Valide : " + (estValide() ? "oui" : "non"));
	    }

	    public double affranchir() {
	        if (!estValide()) {
	            return 0;
	        }
	        return express ? 2 * TARIF_BASE : TARIF_BASE;
	    }

}
