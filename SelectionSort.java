public class SelectionSort 
{
	public static void main(String[] args) 
	{
		int[] ar = {65,21,98,56,45,76};
		
		for(int i=0; i<ar.length; i++)
		{
			int min = i;
			for(int j = i+1; j<ar.length; j++)
			{
				if(ar[j] < ar[min])
				{
					min = j;
				}
			}
			int temp = ar[i];
			ar[i] = ar[min];
			ar[min] = temp; 
		}
		

		for(int elem : ar)
		{
			System.out.print(elem + " ");
		}
	}
}
