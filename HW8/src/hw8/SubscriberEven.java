package hw8;


public class SubscriberEven implements Subscriber{
	
	private int eventsHandled;
	private int turnOffThreshold;
	public int threshold=14;
	private int count =0;
	public boolean x;
	
	public SubscriberEven() {}
	 public boolean notifysubscriber(Event e) {
		 
		
		 
		 if (Event.getEventDataValue() %2 == 0) {

	        count =count++;  
	         if(count<=threshold) {
	        	 System.out.println("SubscriberEvens Event " + e.getEventSeqNum() + " is even: " + Event.getEventDataValue());
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
	
	private void setEventsHandled(Boolean b) {}
	
	private boolean getEventsHandled() {
		
		return false;
	}
}