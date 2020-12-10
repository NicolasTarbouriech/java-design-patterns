package fr.diginamic.factory;

public abstract class ObjetConnecte {

	private int limiteVolts;

	public ObjetConnecte(int limiteVolts) {
		super();
		this.limiteVolts = limiteVolts;
	}

	public int getLimiteVolts() {
		return limiteVolts;
	}

	public void setLimiteVolts(int limiteVolts) {
		this.limiteVolts = limiteVolts;
	}

}
