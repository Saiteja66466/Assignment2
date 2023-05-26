public class QuickSort
{
	int partition(int[] a, int low, int high) 
	{
		int pivot = a[high];
		int i = (low - 1);
		
		for(int j=low; j<=high-1; j++)
		{
			if(a[j]<pivot)
			{
				i++;
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		int t = a[i+1];
		a[i+1] = a[high];
		a[high] = t;
		return(i+1);
		
	}
	void quick(int[] a, int low, int high)
	{
		if(low < high)
		{
			int p = partition(a,low, high);
			quick(a,low,p-1);
			quick(a,p+1,high);
		}
		
	}
	
	void print(int[] a)
	{
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) 
	{
		int[] ar = {76,23,96,14,75,32,65,99};
		int n = ar.length;
		
		QuickSort q1 = new QuickSort();
		System.out.println("Array before sorting");
		q1.print(ar);
		q1.quick(ar,0,n-1);
		System.out.println("Array after sorting");
		q1.print(ar);
		
	}
}