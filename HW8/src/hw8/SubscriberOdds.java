package hw8;


public class SubscriberOdds implements Subscriber{
	
	private int eventsHandled;
	private int turnOffThreshold;
	public int threshold=21;
	public int count=0;

	public SubscriberOdds() {}
	
	public boolean notifysubscriber(Event e) {
		
		
		if (Event.getEventDataValue() %2 != 0) {

	         count = count++;	         
	         if(count<=threshold) {
	        	 System.out.println("SubscriberOdds Event " + e.getEventSeqNum() + " is odd: " + Event.getEventDataValue());
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

	private void setEventsHandled(Event e) {
		
	}
	
	private boolean getEventsHandled() {
		return false;
	}

}
