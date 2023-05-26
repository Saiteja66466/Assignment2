public class MergeSortAlgorithm
{
	void mergeSort(int[] ar) {
		int length = ar.length;
		if(length <= 1)
			return;
		
		int middle = length/2;
		int[] leftArray = new int[middle];
		int[] rightArray = new int[length-middle];
		
		int i = 0;
		int j = 0;
		
		for(; i<length; i++)
		{
			if(i < middle)
			{
				leftArray[i] = ar[i];
			}
			else
			{
				rightArray[j] = ar[i];
				j++;
			}
		}
		
		mergeSort(leftArray);
		mergeSort(rightArray);
		merge(leftArray, rightArray, ar);
		
	}
	
	void merge(int[] leftArray, int[] rightArray, int[] ar) 
	{
		int leftSize = ar.length/2;
		int rightSize = ar.length - leftSize;
		int i =0, j = 0, k = 0;
		
		while(j < leftSize && k < rightSize)
		{
			if(leftArray[j] < rightArray[k]) 
			{
				ar[i] = leftArray[j];
				i++;
				j++;
			}
			else
			{
				ar[i] = rightArray[k];
				i++;
				k++;
			}
		}
		
		while(j < leftSize)
		{
			ar[i] = leftArray[j];
			i++;
			j++;
		}
		
		while(k < rightSize)
		{
			ar[i] = rightArray[k];
			i++;
			k++;
		}
	}

	public static void main(String[] args) 
	{
		int[] ar = {22,42,64,11,88,23,99,65};
		MergeSortAlgorithm m = new MergeSortAlgorithm();
		m.mergeSort(ar);
		System.out.println("The arrays after sorting are");
		for(int elem : ar)
		{
			System.out.print(elem + " ");
		}
	}

}