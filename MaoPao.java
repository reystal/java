import java.util.Arrays;
public class MaoPao
{
	//冒泡排序 
	/*public static void bubbleSort(int []a)
	{
		int n=a.length;
		for (int i=0;i<n;i++)
		{
			//无序[0，a.length -i]
			//有序[ a.length-i,a.length]
			//冒泡过程
			for(int j=1;j<n-i;j++)
			{
			  if (a[j-1]>a[j])
			  {
				swap(a,j-1,j);
			  }
			}
		}
	}*/
	//倒着排序
	/*public static void bubbleSort1(int []a)
	{
		for (int i=0;i<a.length;i++)
		{
			//无序[i，a.length）
			//有序[0，i）
		    for(int j= a.length -1; j>i;j--)
				if (a[j]<a[j-1])
				{
					swap(a,j,j-1);
				}
		}
	}*/
	//数组交换 
	public static void swap(int []a,int n,int m)
	{
		int t=a[n];
		a[n]=a[m];
		a[m]=t;
	}
	
	/*public static void testbubbleSort(int []a)
	{
		System.out .println("排序前");
		System.out.println(Arrays.toString(a));
		//bubbleSort(a);
		bubbleSort1(a);
		System.out .println("排序后");
		System.out.println(Arrays.toString(a));
	}*/
	
	
	
	//去掉一个最大值和最小值的平均值
	public static void average(int [] a)
	{ 
	     int sum =0;
		 int max = a[0];
		 int min = a[0];
		 for(int i=0;i<a.length;i++)
		{
		  sum+=a[i];
		  if(a[i]>max)
		  {
			 max=a[i];
		  }
		  if(a[i]<min)
		  {
			 min=a[i];
		  }
		}
		double ave =(double)(sum-max-min)/(a.length-2);
		System.out.println("最大值为:" +max);
        System.out.println("最小值为:"+min);
        System.out.println("总和为："+sum);
        System.out.println("平均值为:"+ave);
	}	
	
	
	//数组右旋转
	/*public static int [] rotate(int []nums,int k)
	{
		k= k%nums.length;
		int [] rightPart= Arrays.copyOfRange(nums,nums.length-k,nums.length);
		//System.out.println(Arrays.toString(rightPart));
		System.arraycopy(nums, 0, nums, k, nums.length-k);
		//System.out.prntln(Arrays.toString(nums));
		System.arraycopy(rightPart,0,nums,0,k);
		return nums;
	}*/
	
	
	//使得一个数组，偶数在前，奇数在后 
	//方法一：
	/*public static int [] partition1(int [] nums)
	{
		//[begin,end] 区间内的数是未判断的数
		//[0，begin)偶数
		//[end,nums.length）奇数 
		int begin =0;
		int end = nums.length-1;
		while(begin<end)
		{
			while (begin<end&&nums[begin]%2==0)
			{
				begin ++;
			}
			while(begin<end&&nums[end]%2!=0)
			{
				end --;
			}
			swap(nums, begin,end);
		}
		return nums;
	}*/
	//方法二:
	/*public static int[] partition2(int []nums)
	{
      int d=0;
      for(int i=0;i<nums.length;i++)
	  {
		  if(nums[i]%2==0)
		  {
			  swap(nums,i,d);
			  d++;
		  }
	  }
	  return nums;
	}*/
				
	
	public static void main(String [] args)
	{
		//冒泡排序
	 /*	int [] a = {1,2,3,4,5,6,7};
		int [] b ={7,6,5,4,3,2,1};
        int [] c ={3,5,2,4,1,7,6};
        int [] d ={3,3,3,3,3,3,3};
        testbubbleSort(a);
        testbubbleSort(b);
        testbubbleSort(c);
        testbubbleSort(d);
		*/
		
		//去掉一个最大值和最小值的平均值 
		 int []a = {1,2,3,4,5};
		 average(a);
      
	   
      	//数组右旋转   
        //int [] nums ={1,2,3,4,5};
		//System.out .println(Arrays.toString(rotate(nums,3)));
		
		//整一个数组，偶数在前，奇数在后
		//int [] nums = {1,2,3,4,5,6,7,8,9,10};
		//System.out.println(Arrays.toString(partition2(nums)));
       	  
	}
}
	
	