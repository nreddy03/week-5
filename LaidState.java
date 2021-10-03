package state;

public class LaidState implements State {
	Blanket blanket;
	public LaidState(Blanket blanket) {
		this.blanket = blanket;
	}

	@Override
	public void fold() {
		System.out.println("Blanket is folded");
		blanket.setState(blanket.getFoldedState());
	}

	@Override
	public void makeBed() {
		System.out.println("Blanket already laid on bed");
		
	}

	@Override
	public void makeWet() {
		System.out.println("Blanket is wet");
		blanket.setState(blanket.getWetState());
	}

	@Override
	public void makeDry() {
		System.out.println("Blanket already dry");

	}
	public String toString() {
		return " laid state";
	}
}
