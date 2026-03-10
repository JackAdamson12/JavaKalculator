package kalkulator;

public class Calculator {
	private int state = 0;

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public void add(int value) 
	{
    long temp = (long) state + value;
    state = MinMax(temp);
    }

	public void mult(int value) 
	{
    long temp = (long) state * value;
    state = MinMax(temp);
    }
	
	public void minus(int value) 
	{
    long temp = (long) state - value;
    state = MinMax(temp);
    }

    public void dele(int value)
	{ 
		if(value == 0)
		{
			System.out.println("Nie można dzielić przez zero!");
			return;
		}
		state /= value;
	}
	public void clear()
	{
		state = 0;
	}

	private int MinMax(long temp)
	{
    	if(temp > Integer.MAX_VALUE || temp < Integer.MIN_VALUE) 
		{
       		System.out.println("Przekroczono zakres!");
       		state = 0;
    	}
		else 
		{
        	state = (int) temp;
    	}
    	return state;
    }	

}
