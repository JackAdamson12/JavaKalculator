package kalkulator;

public class Calculator {
	private int state = 0;

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public int add(int value) 
	{
    long temp = (long) state + value;
    return MinMax(temp);
    }

	public int mult(int value) 
	{
    long temp = (long) state * value;
    return MinMax(temp);
    }
	
	public int minus(int value) 
	{
    long temp = (long) state - value;
    return MinMax(temp);
    }

    public int dele(int value)
	{ 
		if(value == 0)
		{
			System.out.println("Nie można dzielić przez zero!");
			state = 0;
			return state;
		}
		state /= value;
		return state;
	}
	public void clear(int value)
	{
		
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
