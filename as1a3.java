import java.util.Arrays;
public class as1A3
{
	public static void main(String args[])
	{
		int [] arr={9,7,4,2,5,12,1};
	int sum=0;
	for(int i:arr)
	{
		sum += i;
	}
	System.out.println("sum of array of element:" + sum);
	Arrays.sort(arr);
	System.out.println("array elements in ascending order");
	for(int i: arr)
	{
		System.out.println(i + " ");
	}
}

}