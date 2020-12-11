package fr.diginamic.composite;


public class TestComposant {

	public static void main(String[] args) {
		Departement dsin = new Departement("DSIN");
		
		dsin.add(new Employe("ceccile", "raspey", 1000)).add(new Employe("rachel", "rigolo", 7500));
		dsin.add(new Departement("big data").add(new Employe("jb", "rmnay", 7500)));
		
		System.out.println(dsin.calculerSalaire());
	}

}
