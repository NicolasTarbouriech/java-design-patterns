package fr.diginamic.tp_grasps.factory;

import java.time.LocalDateTime;

import fr.diginamic.tp_grasps.beans.Client;
import fr.diginamic.tp_grasps.beans.Reservation;
import fr.diginamic.tp_grasps.beans.TypeReservation;
import fr.diginamic.tp_grasps.service.IReservationService;
import fr.diginamic.tp_grasps.service.ReservationService;
import fr.diginamic.tp_grasps.utils.DateUtils;

public class ReservationFactory {

	private static IReservationService reservationService = new ReservationService();

	public static Reservation getInstance(Client client, TypeReservation type, String dateReservationStr,
			int nbPlaces) {

		LocalDateTime dateReservation = DateUtils.toDate(dateReservationStr);

		Reservation reservation = new Reservation(dateReservation);
		reservation.setNbPlaces(nbPlaces);
		reservation.setClient(client);
		double total = reservationService.calculMontant(type, nbPlaces, client.isPremium());
		reservation.setTotal(total);

		return reservation;

	}

}
