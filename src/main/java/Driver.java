// import Counter; // Removed as it is not valid

public class Driver {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		System.out.println("Count:" + counter.getCount());
		
		counter.increment();
		
		System.out.println("Count:" + counter.getCount());
		
		counter.decrement();
		
		System.out.println("Count:" + counter.getCount());

		counter.increaseBy(5);
		
		System.out.println("Count:" + counter.getCount());
		
		counter.decreaseBy(2);
		
		System.out.println("Count:" + counter.getCount());	
		
		counter.multiplyBy(6);
		
		System.out.println("Count:" + counter.getCount());	

		
	}

}
