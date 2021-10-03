package state;

public class DryState implements State {
	Blanket blanket;
	public DryState(Blanket blanket) {
		this.blanket = blanket;
	}

	@Override
	public void fold() {
		System.out.println("Blanket has been folded");
		blanket.setState(blanket.getFoldedState());

	}

	@Override
	public void makeBed() {
		System.out.println("Blanket laid on bed");
		blanket.setState(blanket.getLaidState());
	}

	@Override
	public void makeWet() {
		System.out.println("Blanket is wet");
		blanket.setState(blanket.getWetState());

	}

	@Override
	public void makeDry() {
		System.out.println("Blanket dry");

	}
	public String toString() {
		return " dry state";
	}

}
