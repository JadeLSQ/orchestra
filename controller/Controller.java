package controller;
import java.util.ArrayList;


import model.Event;
import view.View;

public class Controller {
	private ArrayList<Event> events = new ArrayList<Event>();
	private View view = null;
	
		public Controller (ArrayList<Event> events, View view) {
		
		this.events = events;
		this.view = view;
		}
		
		//
		public ArrayList<Event> getEvents() {
			return Event.getInstances();
		}


		
		public void updateView() {
			view.displayEvents(Event.getInstances());
			/*
			view.createEvent();
			view.deleteEvent();
			view.chooseMusicianToAdd();
			*/
		}
		
		
}
