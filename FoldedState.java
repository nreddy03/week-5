package state;

public class FoldedState implements State {
	Blanket blanket;
	public FoldedState(Blanket blanket) {
		this.blanket = blanket;
	}

	@Override
	public void fold() {
		System.out.println("Blanket is folded");
	}

	@Override
	public void makeBed() {
		System.out.println("Blanket laid on bed");
		blanket.setState(blanket.getLaidState());
	}

	@Override
	public void makeWet() {
		System.out.println("Blanket made wet");
		blanket.setState(blanket.getWetState());
	}

	@Override
	public void makeDry() {
		System.out.println("Blanket already dry");

	}
	public String toString() {
		return " folded state" ;
	}
}
