package hw8;

public class HWMain {

	
	public static void main(String[] args) {
		
		
		PublisherImpl pub = new PublisherImpl();
		
		Subscriber odds = new SubscriberOdds();
		Subscriber evens = new SubscriberEven();
		Subscriber threes = new SubscriberThrees();

		pub.registerSubscriber(odds);
        pub.registerSubscriber(evens);
        pub.registerSubscriber(threes);
        
        
        
        
        pub.runSimulation();
	}
}