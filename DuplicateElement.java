public class DuplicateElement
{
	public static void main(String[] args) 
	{
		int[] ar = {22,54,6,11,22,7,54,11};
		
		for(int i=0; i<ar.length; i++)
		{
			for(int j=i+1; j<ar.length; j++)
			{
				if(ar[i] == ar[j])
				{
					System.out.println("Duplicate element "+ ar[j] +" found at index position " + j);
				}
			}
		}
	}
}