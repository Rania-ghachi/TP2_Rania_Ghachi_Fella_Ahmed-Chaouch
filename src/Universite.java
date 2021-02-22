
public class Universite {

 private int i_univ; //identifiant unique de l'université
 private String nom;
 private TypePackage pack;
 
	public Universite(int i_univ, String nom, TypePackage pack) {
	super();
	this.i_univ = i_univ;
	this.nom = nom;
	this.pack = pack;
}
	public int getI_univ() {
		return i_univ;
	}
	public void setI_univ(int i_univ) {
		this.i_univ = i_univ;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public TypePackage getPack() {
		return pack;
	}
	public void setPack(TypePackage pack) {
		this.pack = pack;
	}
	 
 

 
 
}
