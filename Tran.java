public class Tran
{
	//反转字符串；
	public static String reverse(String s)
	{
		int length = s.length();
		String r ="";
		for(int i=length-1;i>=0;i--)
		{
			r+=s.charAt(i);
		}
		return r;
	}
	//10进制转16进制；
	public static String DectoHex(int n)
	{
		String r="";
		while(n>16)
		{
			int remd = n%16;
			int cons = n/16;
			if(remd>9)
			{
				char c = (char)((remd-10)+'A');
				r+=c;
			}else
			{
				r+=remd;
			}
			n=cons;
		}
		if (n>9)
		{
			char c = (char)((n-10)+'A');
			r+=c;
		}
		else
		{
			r+=n;
		}
		return reverse(r);
	}
	public static void main(String[] args)
	{
		System.out.println(DectoHex(1958));
	}
}
	
				
			
			
	
		
		
			
				
				 
				