public class CalPi
{
	public static double calcpi(int n)
	{
		double pi4=0;
		for (int i=0;i<n;i++)
		{
			int deno = 2*i+1;
			double item = 1.0/deno;
			if(i%2==0)
			{
				pi4+=item;
			}else
			{
				pi4-= item;
			}
		}
		return 4*pi4;
	}
	public static void main(String [] args)
	{
		System.out.printf("pi  =  %f%n",calcpi(1000));
	}
}

			