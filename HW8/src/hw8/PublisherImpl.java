package hw8;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class PublisherImpl implements Publisher{

	private ArrayList<Subscriber> subscribers= new ArrayList<Subscriber>();
	
	public PublisherImpl() {}
	public void registerSubscriber(Subscriber s) {
		
		subscribers.add(s);
		
	}
	public void unregisterSubscriber(Subscriber s) {
		subscribers.remove(s);
		
	}
	public void notifySubscribers(Event e) {
		for (Subscriber s: subscribers) {
			s.notifysubscriber(e);
		}
			
	}
	 private Event generateEvent(int eNum, int eData) {
		 Event e = new Event(eNum, eData);
	     return e;
	       
	    }
	
	 public void runSimulation() {
		 
		 for(int i=1;i<=200;i++) {
			 Random rand = new Random();
	         int randInt = rand.nextInt(200);
	         Event e = generateEvent(i, randInt);
	         notifySubscribers(e);
	         
		 }

	 }
	 
}
