package fr.diginamic.singleton;

import java.util.ResourceBundle;

public class Configuration {

	private static Configuration configuration = new Configuration();

	private static ResourceBundle fichier = null;

	private Configuration() {

	}

	public static Configuration getInstance() {
		return Configuration.configuration;
	}

	public static ResourceBundle getFichier() {
		if (fichier == null) {
			fichier = ResourceBundle.getBundle("configuration");
		}
		return fichier;
	}

}
