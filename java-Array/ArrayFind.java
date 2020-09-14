public class Solution 
{
    public boolean Find(int target, int [][] array) 
    {
        if(array==null)
        {
            return false;
        }
        int i=0;
        int j=array[0].length-1;
        while(i<array.length&&j>=0)
        {
            if(target<array[i][j])//当前行最大的，当前列最小的
            {
                j--;//排除当前列
            }
            else if(target>array[i][j])
            {
                i++;//排除当前行
            }
            else
            {
                return true;
            }
        }
        return false;
    }
}
