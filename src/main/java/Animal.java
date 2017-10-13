import java.util.ArrayList;


public class Animal {

	private int vie;
	private int poids;
	private ArrayList<COULEUR> couleurs;
	private int vitesse;
	private boolean solitaire;
	private String cri;
	
	public Animal() {
		super();
	}

	/*Un   animal   a   une   vie,   un   poids   et   une   ou   plusieurs   couleurs.   
	 * Il   peut   se   déplacer   à   une certaine   vitesse.   
	 * Il   est   solitaire   ou   en   troupeau.   Il   peut   pousser   un   cri.*/
	public Animal(int vie, int poids, ArrayList<COULEUR> couleurs, int vitesse,
			boolean solitaire, String cri) {
		super();
		this.vie = vie;
		this.poids = poids;
		this.couleurs = couleurs;
		this.vitesse = vitesse;
		this.solitaire = solitaire;
		this.cri = cri;
	}

	/*Toutes les fonctions ci-dessous sont des getters/setters */
	public int getVie() {
		return vie;
	}


	public void setVie(int vie) {
		this.vie = vie;
	}


	public int getPoids() {
		return poids;
	}


	public void setPoids(int poids) {
		this.poids = poids;
	}


	public ArrayList<COULEUR> getCouleurs() {
		return couleurs;
	}


	public void setCouleurs(ArrayList<COULEUR> couleurs) {
		this.couleurs = couleurs;
	}


	public int getVitesse() {
		return vitesse;
	}


	public void setVitesse(int vitesse) {
		this.vitesse = vitesse;
	}


	public boolean isSolitaire() {
		return solitaire;
	}


	public void setSolitaire(boolean solitaire) {
		this.solitaire = solitaire;
	}


	public String getCri() {
		return cri;
	}


	public void setCri(String cri) {
		this.cri = cri;
	}

	
	
}
