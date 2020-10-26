package hw8;

import java.util.ArrayList;

public class SubscriberThrees implements Subscriber {
	
	private int eventsHandled;
	private int turnOffThreshold;
	public int threshold=10;
	public int count=0;
	
	public SubscriberThrees() {}
	
	 public boolean notifysubscriber(Event e) {
		 
		 
		 if (Event.getEventDataValue() %3 == 0) {

	         count = count++;	         
	         if(count<=threshold) {
	        	 System.out.println("SubscriberThrees Event " + e.getEventSeqNum() + " is divisible by 3: " + Event.getEventDataValue());
	        	 return true; 
	         }	        
	        if(count>threshold) {
	        	if(count%40==0) {
	        		count = 0;	
	        		return false;
	        	}
	        	
	        }      
			 
		 }
		 return false;
	        
	    }
	
	private void setEventsHandled(Boolean b) {
		
	}

	private boolean getEventsHandled() {
		return false;
		
	}



	
	

}
