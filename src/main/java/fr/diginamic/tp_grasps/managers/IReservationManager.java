package fr.diginamic.tp_grasps.managers;

import fr.diginamic.tp_grasps.beans.Reservation;

public interface IReservationManager {

	public Reservation CreerReservation(String identifiantClient,String typeReservation, String dateReservationStr, int nbPlaces);
}
