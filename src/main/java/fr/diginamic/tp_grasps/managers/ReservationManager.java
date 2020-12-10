package fr.diginamic.tp_grasps.managers;

import fr.diginamic.tp_grasps.beans.Client;
import fr.diginamic.tp_grasps.beans.Reservation;
import fr.diginamic.tp_grasps.beans.TypeReservation;
import fr.diginamic.tp_grasps.daos.ClientDao;
import fr.diginamic.tp_grasps.daos.IClientDao;
import fr.diginamic.tp_grasps.daos.ITypeReservationDao;
import fr.diginamic.tp_grasps.daos.TypeReservationDao;
import fr.diginamic.tp_grasps.factory.ReservationFactory;


 
/**
 * @author Nicolas : Classe qui execute tous les cas d'utilisation de l'application li�s aux r�servations
 *
 */
public class ReservationManager implements IReservationManager {

	/** DAO permettant d'accéder à la table des clients */
	private IClientDao clientDao = new ClientDao();

	/** DAO permettant d'accéder à la table des types de réservation */
	private ITypeReservationDao typeReservationDao = new TypeReservationDao();
	
	public Reservation CreerReservation(String identifiantClient,String typeReservation, String dateReservationStr, int nbPlaces) {

		// 3) Extraction de la base de données des informations client
		Client client = clientDao.extraireClient(identifiantClient);

		// 4) Extraction de la base de données des infos concernant le type de la
		// réservation
		TypeReservation type = typeReservationDao.extraireTypeReservation(typeReservation);

		// 5) Création de la réservation
		Reservation reservation = ReservationFactory.getInstance(client, type, dateReservationStr, nbPlaces);

		// 6) Ajout de la réservation au client
		client.addReservation(reservation);

		return reservation;
	}
}
