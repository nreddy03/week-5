package state;

public class Blanket {
	State dryState;
	State wetState;
	State foldedState;
	State laidState;
	State state;
	public Blanket() {
		dryState = new DryState(this);
		wetState = new WetState(this);
		foldedState = new FoldedState(this);
		laidState = new LaidState(this);
		state = foldedState;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public State getDryState() {
		return dryState;
	}
	public State getWetState() {
		return wetState;
	}
	public State getLaidState() {
		return laidState;
	}
	public State getFoldedState() {
		return foldedState;
	}
	public void fold() {
		state.fold();
	}
	public void makeBed() {
		state.makeBed();
	}
	public void makeDry() {
		state.makeDry();
	}
	public void makeWet() {
		state.makeWet();
	}
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("\n-------WisCousin Laundry---------\n");
		result.append("Blanket " + state + "\n");
		return result.toString();
	}
}
