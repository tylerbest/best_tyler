import java.util.Scanner;
public class subwoof_04
{
	public static void main(String[]args)
	{
		subwoof_04 form = new subwoof_04();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Height:");
		double h = keyboard.nextDouble();
		System.out.println("Length");
		double l = keyboard.nextDouble();
		System.out.println("Width");
		double w = keyboard.nextDouble();
		double volume = form.calcVol(l,w,h);
		
		System.out.println("The volume is:" + volume);
	}
	 public double calcVol(double l, double w, double h)
	{
		return (l*w*h)/1728;
	}
}