package fr.diginamic.tp_grasps.service;

import fr.diginamic.tp_grasps.beans.TypeReservation;

public class ReservationService implements IReservationService {

	@Override
	public double calculMontant(TypeReservation type, int nbPlaces, boolean premium) {

		double total = type.getMontant() * nbPlaces;
		if (premium) {
			return total * (1 - type.getReductionPourcent() / 100.0);
		}
		return total;
	}
}
