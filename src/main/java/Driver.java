import src.main.java.Counter;

public class Driver {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		System.out.println("Hasil Perhitungan release:" + counter.getCount());
		
		counter.increment();
		
		System.out.println("Hasil Perhitungan :" + counter.getCount());
		
		counter.decrement();
		
		System.out.println("Hasil Perhitungan 2:" + counter.getCount());
		
	}

}
