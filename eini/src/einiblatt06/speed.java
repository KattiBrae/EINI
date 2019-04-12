package einiblatt06;

public class speed {
	public static void main(String[] args)
	{
		double xm=50.0, ts=1.0, vms;
		vms=xm/ts;
		System.out.println("v in m/s: " + vms );
		System.out.println("v in km/h: " + velocity(xm,ts) );
		System.out.println("Bremsweg in m: " + breaking(xm,ts));
	}
	public static double velocity(double xm, double ts)
	{
		double vms=xm/ts*3.6;
		return(vms);
	}
	public static double breaking(double xm, double ts)
	{
		double xbreak=0.5*(velocity(xm,ts)/10)*(velocity(xm,ts)/100);
		return(xbreak);
	}
}
