package Sorting_package;

public class BubbleSort {

	public static void main(String[] args) {
		
		int a[] = {5,10,7,6,2,1,3,8,4,9};
		
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<9;j++) {
				
				if(a[j]>a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					
				}
				
			}
		}
		
		for(int i=0;i<10;i++) {
			
			System.out.print(a[i]+" ");
			
		}

	}

}
