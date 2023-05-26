public class BubbleSort
{
	public static void main(String[] args) 
	{
		int[] ar = {22,44,11,77,66,99,67};
		
		for(int i=0; i<ar.length; i++)
		{
			for(int j=1; j<ar.length-i; j++)
			{
				if(ar[j] <ar[j-1])
				{
					int temp = ar[j];
					ar[j] = ar[j-1];
					ar[j-1] = temp;
				}
			}
		}
		
		for(int elem : ar)
		{
			System.out.print(elem + " ");
		}
	}
}