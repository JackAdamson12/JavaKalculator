package kalkulator;

public class Calculator {
	private int state = 0;

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public void add(int value){
		state += value;
	}

	public void mult(int value){
		state *= value;
	}
	public void minus(int value)
	{
		state -= value;
	}

     public void dele(int value)
	{
		state /= value;
	}

}
