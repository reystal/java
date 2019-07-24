public class Binsearch{
	//有序数组的二分查找；
	public static int binarySearch (int [] a,int v)
	{
		int left=0;
		int right = a.length -1;
		while(left<=right)
		{
			int mid = (left+right)/2;
			if (v==a[mid])
			{
				return mid;
			}else if (v<a[mid])
			{
				right=mid-1;
			}
			else
			{
				left = mid+1;
			}
		}
		return -1;
	}	
	/*public static int binarySearch 2(int [] a,int v)
	{
		int left=0;
		int right = a.length ;
		while(left<right)
		{
			int mid = (left+right)/2;
			if (v==a[mid])
			{
				return mid;
			}else if (v<a[mid])
			{
				right=mid;
			}
			else
			{
				left = mid+1;
			}
		}
		return -1;
	}*/	
	public static void main(String[] args)
	{
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(binarySearch(a,3));
	}
}
		
		
		
		
			
			