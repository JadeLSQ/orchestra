package model;

import java.util.ArrayList;
import java.util.Calendar;

public class Event {
	private static int count = 0; 
	private int myId = 0;
	
	//Remarque: on doit creer new ici car sinon OutOfBound exception, car a chaque fois on appelle le constructeur un new ArrayList se lance
	
	private static ArrayList<Event> instances = new ArrayList<Event>();

	private String name;
	private Calendar cal; //choose a type
	private String details;
	
	public Event(String name, Calendar cal, String details) {
		
		this.name = name;
		this.cal = cal;
		this.details = details;
		instances.add(this);
		
		this.myId = Event.count;
		Event.count++;
	}
	
	
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Calendar getD() {
		return cal;
	}
	public void setD(Calendar cal) {
		this.cal = cal;
	}

	public static ArrayList<Event> getInstances() {
		return instances;
	}


	@Override
	public String toString() {
		return "Event [myId= " + myId + ", name= " + name + ", Date = " + cal.getTime() + ", details= " + details
				+ "]";
	}	
	
}