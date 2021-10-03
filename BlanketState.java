package state;

public class BlanketState {

	public static void main(String[] args) {
		Blanket blanket = new Blanket();
		
		System.out.println(blanket);

		blanket.makeBed();
		blanket.fold();
		blanket.makeWet();
		
		System.out.println(blanket);
		
		blanket.makeBed();
		blanket.fold();
		
		blanket.makeDry();
		
		System.out.println(blanket);
		
		blanket.fold();
		blanket.makeBed();
		
		System.out.println(blanket);

	}

}
