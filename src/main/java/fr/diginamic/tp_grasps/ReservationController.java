package fr.diginamic.tp_grasps;

import fr.diginamic.tp_grasps.beans.Reservation;
import fr.diginamic.tp_grasps.managers.IReservationManager;
import fr.diginamic.tp_grasps.managers.ReservationManager;

/**
 * Controlleur qui prend en charge la gestion des réservations client
 * 
 * @author RichardBONNAMY
 *
 */
public class ReservationController {

	private IReservationManager reservationManager = new ReservationManager();

	/**
	 * Méthode qui créée une réservation pour un client à partir des
	 * informations transmises
	 * 
	 * @param params contient toutes les infos permettant de créer une réservation
	 * @return Reservation
	 */

	public Reservation creerReservation(Params params) {

		// 1) Récupération des infos provenant de la classe appelante
		String identifiantClient = params.getIdentifiantClient();
		String dateReservationStr = params.getDateReservation();
		String typeReservation = params.getTypeReservation();
		int nbPlaces = params.getNbPlaces();

		return reservationManager.CreerReservation(identifiantClient, typeReservation, dateReservationStr, nbPlaces);
	}

}
