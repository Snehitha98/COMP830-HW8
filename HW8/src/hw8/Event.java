package hw8;

public class Event {

	private int EventSequenceNum;
	private static int EventDataValue;
	
	public Event(int eventN, int eventD) {
		
		EventSequenceNum = eventN;
		EventDataValue = eventD;
		
    }
	
	public int getEventSeqNum(){
		
		return EventSequenceNum;
		
	}
	
	public static int getEventDataValue() {
		return EventDataValue;
		
	}
}
