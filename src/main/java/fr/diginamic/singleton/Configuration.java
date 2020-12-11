package fr.diginamic.singleton;

import java.util.ResourceBundle;

public class Configuration {

	
	/** instance : SINGLETON construit une seule fois au chargement de la classe 
	 * C'est la manière dont sont construits les attributs static */
	public static Configuration instance = new Configuration();
	
	/** url */
	private String url;
	/** user */
	private String user;
	/** password */
	private String password;
	
	/** Constructeur privé: impératif pour que le pattern
	 * singleton fonctionne.
	 */
	private Configuration() {
		ResourceBundle bundle = ResourceBundle.getBundle("configuration");
		url = bundle.getString("db.url");
		user = bundle.getString("db.user");
		password = bundle.getString("db.password");
	}

	public static Configuration getInstance() {
		return instance;
	}

	/** Getter
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/** Getter
	 * @return the user
	 */
	public String getUser() {
		return user;
	}

	/** Getter
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

}
