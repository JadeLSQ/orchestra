package view;

import java.util.ArrayList;
import java.util.Iterator;


import model.Event;
import model.Musician;

public class View {
		
		//Use-case 1
		public void displayEvents(ArrayList<Event> events) {
			for (Iterator<Event> iter = events.iterator(); iter.hasNext();) {
				//String str = (String)iter;
				System.out.println("Element Events :" + iter.next().toString());
				
			}
		}
		
		//Use-case 2
		public void createEvent() {
			//TODO
			//Apporter les infos concretes de Main.retriveEventFromDatabase() ici
			System.out.println("Creation succeed " );
		}

		//Use-case 4

		public int deleteEvent() {
			//pour l'instant deleteEvents genere ID, a demander depuis UI
			//TODO
			int ID = 0;
			System.out.println("Element ID : " + ID + " deleted !");
			return ID;
		}
		
		public Musician chooseMusicianToAdd() {
			//pour l'instant chooseMusicianToAdd genere Musician, a demander depuis UI
			//TODO
			Musician musician1 = new Musician("Jack Fan");
			return musician1;
			
		}
		

}
