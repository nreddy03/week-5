package state;

public class WetState implements State {
	Blanket blanket;
	public WetState(Blanket blanket) {
		this.blanket = blanket;
	}

	@Override
	public void fold() {
		
		System.out.println("Blanket still wet cannot be folded");
	}

	@Override
	public void makeBed() {
		System.out.println("Blanket wet cannot make bed");	

	}

	@Override
	public void makeWet() {
		System.out.println("Blanket already wet");		

	}

	@Override
	public void makeDry() {
		System.out.println("Drying the blanket");		
		blanket.setState(blanket.getDryState());
	}
	public String toString() {
		return " wet state";
	}
}
