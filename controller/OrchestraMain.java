package controller;
import model.*;
import view.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.ArrayList;


public class OrchestraMain {

	public static void main(String[] args) {

		ArrayList<Event> EventsModel = new ArrayList<Event>();
		EventsModel= retriveEventFromDatabase();
		
		view.View view = new View();
		Controller cont = new Controller(EventsModel,view);
		deleteEvents(view.deleteEvent(),"Spring festival",EventsModel);
		Musician chef1 = new Musician("Fan Fan");
		Musician chef2 = new Musician("Zhu Ren");
		General general1 = new General("OpSaturday Orchestra", Calendar.getInstance(), 
				"Everyone of the Orchestra is here", chef1);
		addMusicianToGeneral (Musician.getInstances(), general1);
		cont.updateView();
	
	}
	
	private static ArrayList<Event> retriveEventFromDatabase() {
		//Create general events
		Calendar cal1 = Calendar.getInstance();
		cal1.set(2018, 0, 1, 18, 0, 0);
		Musician conductor1 = new Musician("Jack Fan");

		General gen1 = new General("Spring festival", cal1, " First concert of the year !", conductor1);
		
		//Create general events
		Calendar cal2 = Calendar.getInstance();
		cal2.set(2018, 5, 1, 20, 0, 0);
		Competition comp1 = new Competition("Quatuor of 2018 summer", cal2, " Classical music");
		
		
		return Event.getInstances();
	}
	
	
	private static boolean deleteEvents(int ID, String name, ArrayList<Event> events) {
		//TODO
		if (events.get(ID).getName().equals(name)) {
		events.remove(ID);
		System.out.println("Events ID " + ID + " deleted in Main");
		return true;
		}
		else return false;
	}
    
	private static void addMusicianToGeneral (ArrayList<Musician> musicians, General general) {
		general.setMusicians(musicians);
		System.out.println("addMusicianToGeneral executed in OrchestraMain");
		System.out.println("Now the list has musicians : " + general.getMusicians().toString());
		
	}
	
	private static void addMusicianToCompetition (ArrayList<ArrayList<Musician>> teams, Competition competition) {
		competition.setTeams(teams);
	}
	
}
