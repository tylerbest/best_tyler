import java.util.Random;
public class GMC implements Location
{
	private double x, y;
	private int ID;
	private double [] location;
	public GMC()
	{
		x = 0;
		y = 0;
	}
	public GMC(double X, double Y)
	{
		x = X;
		y = Y;
	}	
	public void move(double X, double Y)
	{
		x += X;
		y += Y;
	}
	public int getID()
	{
		if(ID == 0)
		{
			ID = (int)(Math.random()*9999999) + 1;
		}
		return ID;
	}
	public double[] getLoc()
	{
		double location = x, y;
		return location;
	}
}